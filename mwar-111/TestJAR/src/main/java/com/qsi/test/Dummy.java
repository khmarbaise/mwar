package com.qsi.test;

import org.apache.commons.lang.StringUtils;

public class Dummy {
	public static String doSomething(String in) {
		return StringUtils.abbreviate(in, 10);
	}
}
