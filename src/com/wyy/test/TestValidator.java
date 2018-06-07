package com.wyy.test;

import com.wyy.entity.UserBean;
import com.wyy.validator.BeanValidator;

public class TestValidator {
	public static void main(String[] args) {
		 UserBean userBean = new UserBean();
	     userBean.setAge(12);
	     userBean.setName("张三");
	     userBean.setAddress("124444444112");
	     userBean.setEmail("123");

	     BeanValidator.validate(userBean);
	}
}
