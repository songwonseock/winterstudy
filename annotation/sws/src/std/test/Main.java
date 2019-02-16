package std.test;

import std.com.Util;

public class Main {
	public static void main(String[] args) throws Exception{
		TestVO testVO = (TestVO) Util.getObj(TestVO.class);
		System.out.println(testVO.toString());
	}
}
