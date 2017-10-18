package com.kangda.appiumkangda.pageshelper;

import org.apache.log4j.Logger;

import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.utils.AppiumUtil;

/**
 * @author jone
 * @description 首页帮助�?
 * 
 */

public class HomePageHelper {

	public static Logger logger = Logger.getLogger(HomePageHelper.class);

	/**
	 * @author Jone
	 * @description 首页-在线预约操作封装
	 * @param AppiumUtil appium api封装引用对象
	 */
	public static void searchDoctor(AppiumUtil appiumUtil, String doctor) {
		logger.info("在线预约");
		// 点击在线预约
		appiumUtil.click(HomePage.HP_TEXTVIEW_YIMIAO);
		appiumUtil.click(HomePage.HP_TEXTVIEW_SEARCH);
		// 输入医生名字搜索医生
		appiumUtil.typeContent(HomePage.HP_EDITTEXT_SEARCH, doctor);
		appiumUtil.click(HomePage.HP_TEXTVIEW_DOCTORNAME);
		appiumUtil.click(HomePage.HP_TEXTVIEW_DOCTORNAME);
	}
}
