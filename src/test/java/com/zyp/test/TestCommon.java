package com.zyp.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.zyp.common.utils.DateUtil;
@RunWith(JUnit4ClassRunner.class)
public class TestCommon {
	@SuppressWarnings("deprecation")
	@Test
	public void testDateUtil() throws ParseException { //测试日期类
		
		Date date = new Date("2009-12-12");
		Date initMonth = DateUtil.getDateByInitMonth(date);
		Date date2 = new Date("2010-11-11");
		Date fullMonth = DateUtil.getDateByFullMonth(date2);
		SimpleDateFormat format = new SimpleDateFormat();
		String format2 = format.format(initMonth);
		String format3 = format.format(fullMonth);
		String sql = "select * from t_order where create_time>='{"+format2+"}' "
				+ "and create_time<='{"+format3+"}' ";
		System.out.println(sql);
		
	}
}
