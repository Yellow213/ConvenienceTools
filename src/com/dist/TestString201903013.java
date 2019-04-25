package com.dist;

import org.junit.Test;

public class TestString201903013 {
	/**
	 * @author hh
	 * @date 2019/02/28
	 * @
	 */
	@Test
	public void test1() {
		char index=64;
		String str="5520520";
		for(int i=1;i<4;i++){
			System.out.println(str+index);
			index++;
		}
	}
	/**
	 * @author hh
	 * @date 2019/02/28
	 * @ ±éÀú£¬Ñ­»·Æ´½Ó×ÖÄ¸
	 */
	@Test
	public void test2() {
		char index=64;
		String str="5520520";
		for(int i=1;i<4;i++){
			index++;
			System.out.println(str+index);
		}
	}
}
