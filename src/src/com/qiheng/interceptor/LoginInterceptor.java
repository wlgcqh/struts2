package com.qiheng.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> map = invocation.getInvocationContext().getSession();
		
		if(null == map.get("userinfo")){
			return Action.LOGIN;
			
		}
		return invocation.invoke();
	}

}
