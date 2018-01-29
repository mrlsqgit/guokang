package com.fuyoujiankang.test.pageshelper;

import org.apache.log4j.Logger;

import com.fuyoujiankang.test.pages.LoginPage;
import com.fuyoujiankang.test.utils.SeleniumUtil;

/**
 * @author Jone
 * @description 登录页面帮助类：提供在这个页面上做的操作的方法封装
 * */
public class LoginPageHelper {
	// 提供本类中日志输出对象
	public static Logger logger = Logger.getLogger(LoginPageHelper.class);
	/**
	 * @author Jone
	 * @description 医院后台登录操作封装
	 * @param seleniumUtil selenium api封装引用对象
	 * @param username 用户名值
	 * @param password 用户密码值
	 * */
	public static void typeHospitalLoginInfo(SeleniumUtil seleniumUtil,
			String username, String password) {
		logger.info("开始输入登录信息");
		// 输入用户名到用户名输入框
		seleniumUtil.type(LoginPage.LP_INPUT_USERNAME, username);
		// 输入密码到密码输入框
		seleniumUtil.type(LoginPage.LP_INPUT_PASSWORD, password);
		logger.info("输入登录信息完毕");
		// 点击登录按钮
		seleniumUtil.click(LoginPage.LP_BUTTON_LOGIN);
	}

	/**
	 * @author Jone
	 * @description 验证登录错误信息
	 * @param seleniumUtil  selenium api封装引用对象
	 * @param error 错误文本
	 * */
//	public static void checkLoginErrorInfo(SeleniumUtil seleniumUtil,
//			String error) {
//		seleniumUtil.isTextCorrect(seleniumUtil.getText(LoginPage.LP_TEXT_ERROR), error);
//	}
}
