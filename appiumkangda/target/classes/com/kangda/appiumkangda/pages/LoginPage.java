package com.kangda.appiumkangda.pages;

import org.openqa.selenium.By;

/**
 * @author jone
 * @description APP首页元素
 */

public class LoginPage {
	/** 用户名输入框 */
	public static final By LP_INPUT_USERNAME = By.name("请输入手机号");
	/** 密码输入�? */ 
	public static final By LP_INPUT_PASSWORD = By.className("android.widget.EditText");
	/** 登录按钮 */
	public static final By LP_BUTTON_LOGIN = By.name("登录");
	/** 立即注册 */
	public static final By LP_TEXTVIEW_REGISTER = By.name("立即注册");
	/** 登录textView */
	public static final By LP_TEXTVIEW_LOGIN = By.className("android.widget.TextView");
	
	/**登录文本*/
	public static final String LP_TEXT_LOGIN = "登录";
}
