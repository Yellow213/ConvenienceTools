package com.util.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest {

	/**
	 * @author hh
	 * @remark (����鿴Դ��) Map��key�����ִ�Сд�ģ�hashֵ��ͬ
	 * ��a����string��ģ�������string��hashcode����
	 * ���ԡ�a���͡�A����hashcode�ǲ�ͬ�ģ��������ִ�Сд
	 * ����˵��һ������д��equal������������дhashcode��������Ȼ��������equal���Ϊtrue��������hashmap����ȴȡ������
	 * */
	@Test
	public void test() {
	    Map<String ,String > map = new HashMap<String,String>();
	    map.put("a", "a");
	    map.put("A", "A");
	    System.out.println(map.get("a"));
	}

}
