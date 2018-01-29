package com.fuyoujiankang.test.pages;

import org.openqa.selenium.By;

/**
 * @author Jone
 * @description 登录页元素定位声明
 */
public class LoginPage {
	/** 用户名 */
	public static final By LP_INPUT_USERNAME = By.id("username");
	/** 密码 */
	public static final By LP_INPUT_PASSWORD = By.id("password");
	/** 登录按钮 */
	public static final By LP_BUTTON_LOGIN = By.xpath("//span[contains(.,'登 录')]");
}
