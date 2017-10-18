package com.kangda.appiumkangda.pageshelper;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.kangda.appiumkangda.pages.CommonPage;
import com.kangda.appiumkangda.pages.MessagePage;
import com.kangda.appiumkangda.utils.AppiumUtil;

/**
 * @author jone
 * @description 消息帮助�?
 * 
 */

public class MessagePageHelper {

	public static Logger logger = Logger.getLogger(MessagePageHelper.class);

	/**
	 * @author Jone
	 * @description 消息-搜索操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void searchDoctor(AppiumUtil appiumUtil, String doctor) {
		logger.info("消息-搜索");
		// 点击消息icon
		appiumUtil.click(MessagePage.MP_TEXTVIEW_MESSAGEICON);
		// 点击搜索输入�?
		appiumUtil.click(MessagePage.MP_TEXTVIEW_SEARCH);
		// 输入医生名字搜索医生
		appiumUtil.typeContent(MessagePage.MP_TEXTVIEW_SEARCH, doctor);
		// 点击医生名字�?始问�? 这里有个问题�?要点击两�?
		appiumUtil.click(MessagePage.MP_TEXTVIEW_NAME);
		appiumUtil.click(MessagePage.MP_TEXTVIEW_NAME);
		// 点击�?始问�?
		appiumUtil.click(MessagePage.MP_TEXTVIEW_START);
		// 点击确定
		appiumUtil.click(CommonPage.CP_TEXTVIEW_CONFIRM);
	}
	
	/**
	 * @author Jone
	 * @description 平台小助手发送消�?,语音操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void sendMessage(AppiumUtil appiumUtil, String message) {
		logger.info("平台小助�?");
		// 点击消息icon
		appiumUtil.click(MessagePage.MP_TEXTVIEW_MESSAGEICON);
		//点击进入平台小助�?
		appiumUtil.click(MessagePage.MP_TEXTVIEW_LITTLEHELPER);
		//输入消息
		appiumUtil.typeContent(MessagePage.MP_EDITTEXT_MESSAGE, message);
		//点击发�??
		appiumUtil.click(MessagePage.MP_TEXTVIEW_SEND);
		//点击语音icon 倒数第二个ImageView
		List<WebElement> lists = appiumUtil.findElements(MessagePage.MP_IMAGEVIEW_VOICE);
		appiumUtil.click(lists.get(lists.size()-2));
		//按住说话
		appiumUtil.longPress(MessagePage.MP_TEXTVIEW_TALK);
	}

	/**
	 * @author Jone
	 * @description 消息-通讯录筛选操作封�?  获取页面问诊，预约挂号集合不稳定，暂时不做这个方�?
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void filterDoctor(AppiumUtil appiumUtil) {
		logger.info("消息-通讯录筛�?");
		// 点击消息icon
		appiumUtil.click(MessagePage.MP_TEXTVIEW_MESSAGEICON);
		// 点击通讯录icon
		List<WebElement> lists = appiumUtil.findElements(MessagePage.MP_IMAGEVIEW_ADDRESSBOOK);
		appiumUtil.click(lists.get(0));
		// 点击筛�??
		appiumUtil.click(MessagePage.MP_TEXTVIEW_FILTER);
		appiumUtil.pause(3);
		// 获得页面问诊的集�?
		List<WebElement> inquirys = appiumUtil.findElements(MessagePage.MP_TEXTVIEW_INQUIRY);
		System.out.println("+++++++++++++++++++++++++++++++++"+inquirys.size());
		// 点击问诊筛�?�条�?
		appiumUtil.click(inquirys.get(inquirys.size()-1));
		// �?查问诊元素是否存�?
		if (appiumUtil.doesElementsExist(MessagePage.MP_TEXTVIEW_INQUIRY) == true) {
			logger.info(MessagePage.MP_TEXTVIEW_INQUIRY + "元素存在");
		} else {
			logger.warn(MessagePage.MP_TEXTVIEW_INQUIRY + "元素不存�?");
		}
		// 点击筛�??
		appiumUtil.click(MessagePage.MP_TEXTVIEW_FILTER);
		// 获得页面预约挂号的集�?
		List<WebElement> registrations = appiumUtil.findElements(MessagePage.MP_TEXTVIEW_REGISTRATION);
		System.out.println("__________________________________________"+registrations.size());
		// 点击预约挂号筛�?�条�?
		appiumUtil.click(registrations.get(registrations.size()-1));
		appiumUtil.pause(3);
		// �?查问诊元素是否存�?
		if (appiumUtil.doesElementsExist(MessagePage.MP_TEXTVIEW_REGISTRATION) == true) {
			logger.info(MessagePage.MP_TEXTVIEW_REGISTRATION + "元素存在");
		} else {
			logger.warn(MessagePage.MP_TEXTVIEW_REGISTRATION + "元素不存�?");
		}
	}
}
