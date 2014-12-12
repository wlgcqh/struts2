package com.qiheng.interceptor;

import java.util.Date;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TheInterceptor1 extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {

		System.out.println("before"+new Date());
		String str=invocation.invoke();
		System.out.println(str);
		System.out.println("after"+new Date());
		return str;
	}

}
