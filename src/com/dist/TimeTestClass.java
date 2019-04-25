package com.dist;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class TimeTestClass {
	/**
	* @author hh
	* @date 2019/04/25
	* （1）获取当前日历时间
	* （2）根据时间获取指定的时间格式
	* （3）计算推前n小时的时间
	*/
	@Test
	public void test() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		//（1）获取当前日历时间
		Date now = new Date();
		//（2）根据时间获取指定的时间格式
		String startTime = sdf.format(now);
		System.out.println("现在时间："+startTime); 

		Calendar calendar = Calendar.getInstance();
		//（3）计算推前n小时的时间，16为推前16小时
		calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 16);
		String endTime = sdf.format(calendar.getTime());
		System.out.println("提前3小时："+ endTime);
		
		//（3）计算推迟n小时的时间
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(Calendar.HOUR_OF_DAY, calendar2.get(Calendar.HOUR_OF_DAY)+ 16);
		String endTime2 = sdf.format(calendar2.getTime());
		System.out.println("提前3小时："+ endTime2);
	}

}
