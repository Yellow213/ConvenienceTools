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
	* ��1����ȡ��ǰ����ʱ��
	* ��2������ʱ���ȡָ����ʱ���ʽ
	* ��3��������ǰnСʱ��ʱ��
	*/
	@Test
	public void test() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		//��1����ȡ��ǰ����ʱ��
		Date now = new Date();
		//��2������ʱ���ȡָ����ʱ���ʽ
		String startTime = sdf.format(now);
		System.out.println("����ʱ�䣺"+startTime); 

		Calendar calendar = Calendar.getInstance();
		//��3��������ǰnСʱ��ʱ�䣬16Ϊ��ǰ16Сʱ
		calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 16);
		String endTime = sdf.format(calendar.getTime());
		System.out.println("��ǰ3Сʱ��"+ endTime);
		
		//��3�������Ƴ�nСʱ��ʱ��
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(Calendar.HOUR_OF_DAY, calendar2.get(Calendar.HOUR_OF_DAY)+ 16);
		String endTime2 = sdf.format(calendar2.getTime());
		System.out.println("��ǰ3Сʱ��"+ endTime2);
	}

}
