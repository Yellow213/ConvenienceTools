package com.util.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest {

	/**
	 * @author hh
	 * @remark (详情查看源码) Map的key是区分大小写的，hash值不同
	 * “a”是string类的，所以是string的hashcode方法
	 * 所以“a”和“A”的hashcode是不同的，所以区分大小写
	 * 所以说，一个类重写了equal方法，必须重写hashcode方法，不然两个对象equal结果为true，而放在hashmap里面却取不出来
	 * */
	@Test
	public void test() {
	    Map<String ,String > map = new HashMap<String,String>();
	    map.put("a", "a");
	    map.put("A", "A");
	    System.out.println(map.get("a"));
	}

}
