package com.qiheng.converter;

import java.util.Map;
import java.util.StringTokenizer;

import com.qiheng.bean.User;

import ognl.DefaultTypeConverter;

public class UserConverter extends DefaultTypeConverter {
	@Override
	public Object convertValue(Map context, Object value, Class toType) {

		if (User.class == toType) {

			String[] strs = (String[]) value;

			String str = strs[0];

			StringTokenizer st = new StringTokenizer(str, ";");

			String username = st.nextToken();

			int age = Integer.parseInt(st.nextToken());

			User user = new User();

			user.setUsername(username);

			user.setAge(age);

			return user;

		}
		else if(String.class == toType){
			User user=(User)value;
			
			String info=user.getUsername()+","+user.getAge();
			
			return info;
		}
		return null;

	}
}
