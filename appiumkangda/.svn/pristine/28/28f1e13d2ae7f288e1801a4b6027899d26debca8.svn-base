package com.kangda.appiumkangda.pageshelper;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.pages.LoginPage;
import com.kangda.appiumkangda.pages.MePage;
import com.kangda.appiumkangda.utils.AppiumUtil;

/**
 * @author jone
 * @description 登录帮助类
 * 
 * */

public class LoginPageHelper {
	
	
	
	public static Logger logger = Logger.getLogger(LoginPageHelper.class);
	
	/**
	 * @author Jone
	 * @description 登录操作封装
	 * @param AppiumUtil appium api封装引用对象
	 * @param username 用户名值
	 * @param password 用户密码值
	 * */
	public static void typeloginPageInfo(AppiumUtil appiumUtil,String username, String password){
		//暂停5秒
//		appiumUtil.pause(5);
		//向左滑动引导页 
//		appiumUtil.swipeToLeft(appiumUtil.driver, 800, 3);
		//获取引导页ImageView集合
//		List<WebElement> imageViews = appiumUtil.findElements(HomePage.HP_IMAGEVIEW_EXPERIENCE);
		//点击立即体验
//		appiumUtil.click(imageViews.get(2));
//		appiumUtil.waitForElementToLoad(20,HomePage.HP_ICON_ME);
		appiumUtil.click(HomePage.HP_ICON_ME);
		appiumUtil.click(MePage.MP_BUTTON_LOGIN);
		logger.info("进入登录页面");
		logger.info("开始输入登录信息");
		List<WebElement> lists = appiumUtil.findElements(LoginPage.LP_INPUT_PASSWORD);
		// 输入用户名到用户名输入框
		appiumUtil.typeContent(LoginPage.LP_INPUT_USERNAME, username);
		// 输入密码到密码输入框
		appiumUtil.typeContent(lists.get(1), password);
		logger.info("输入登录信息完毕");
//		WebElement element =  appiumUtil.findElement("AndroidUIAutomator","new UiSelector().text("+"\"" + LoginPage.LP_TEXT_LOGIN +"\")");
//		// 点击登录按钮
//		appiumUtil.click(element);
		appiumUtil.click(LoginPage.LP_BUTTON_LOGIN);
	}
}
