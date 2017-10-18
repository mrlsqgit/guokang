package com.kangda.appiumkangda.pageshelper;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.kangda.appiumkangda.pages.CommonPage;
import com.kangda.appiumkangda.pages.InquiryPage;
import com.kangda.appiumkangda.pages.MePage;
import com.kangda.appiumkangda.utils.AppiumUtil;

/**
 * @author jone
 * @description 我的问诊帮助�?
 * 
 */
public class InquiryPageHelper {

	public static Logger logger = Logger.getLogger(InquiryPageHelper.class);

	/**
	 * @author Jone
	 * @description 在线问诊操作封装
	 * @param AppiumUtil appium api封装引用对象
	 */
	public static void onlineVisits(AppiumUtil appiumUtil) {
		logger.info("在线问诊");
		// 点击在线问诊
		appiumUtil.click(InquiryPage.IP_TEXTVIEW_ONLINEVISITS);
		// 点击确定
		appiumUtil.click(CommonPage.CP_TEXTVIEW_CONFIRM);
		// 点击去付�?
		//appiumUtil.click(CommonPage.CP_TEXTVIEW_PAYMENT);
		// 选择支付宝支付方�?
		//appiumUtil.click(CommonPage.CP_TEXTVIEW_ALIPAY);
		// 确认支付
		//appiumUtil.click(CommonPage.CP_TEXTVIEW_CONFIRMPAYMENT);
		//暂停2s
//		appiumUtil.pause(2);
	}
	
	/**
	 * @author Jone
	 * @description 我的问诊-待支�?-立即支付 操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void PayNow(AppiumUtil appiumUtil) {
		logger.info("在线问诊-待支�?-立即支付");
		appiumUtil.click(MePage.MP_TEXTVIEW_INQUIRY);
		List<WebElement> lists = appiumUtil.findElements(CommonPage.CP_TEXTVIEW_PAYNOW);
		if (lists.size() > 0) {
			appiumUtil.click(CommonPage.CP_TEXTVIEW_PAYNOW);
		} else {
			return;
		}
	}
	

	/**
	 * @author Jone
	 * @description 我的问诊-待使�?-�?始问�? 操作封装
	 * @param AppiumUtil appium api封装引用对象
	 */
	public static void beginInterrogation(AppiumUtil appiumUtil,String message) {
		logger.info("我的问诊-待使�?-�?始问�?");
		appiumUtil.click(MePage.MP_TEXTVIEW_INQUIRY);
		appiumUtil.click(CommonPage.CP_TEXTVIEW_TOBEUSED);
		List<WebElement> lists = appiumUtil.findElements(InquiryPage.IP_TEXTVIEW_BEGININTERROGATION);
		if (lists.size() > 0) {
			appiumUtil.click(InquiryPage.IP_TEXTVIEW_BEGININTERROGATION);
			appiumUtil.click(InquiryPage.IP_TEXTVIEW_BEGININTERROGATION);
			appiumUtil.click(CommonPage.CP_TEXTVIEW_CONFIRM);
			//输入问诊内容
			appiumUtil.typeContent(InquiryPage.IP_INPUT_MESSAGE, message);
			//点击发�??
			appiumUtil.click(InquiryPage.IP_TEXTVIEW_SEND);
		} else {
			return;
		}
	}


	/**
	 * @author Jone
	 * @description 预约挂号操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void registration(AppiumUtil appiumUtil) {
		logger.info("预约挂号-立即预约");
		appiumUtil.click(MePage.MP_TEXTVIEW_INQUIRY);
		appiumUtil.click(CommonPage.CP_TEXTVIEW_ALL);
		List<WebElement> lists = appiumUtil.findElements(InquiryPage.IP_TEXTVIEW_PLACEANORDER);
		if (lists.size() > 0) {
			appiumUtil.click(InquiryPage.IP_TEXTVIEW_PLACEANORDER);
		} else {
			return;
		}
		// 点击预约挂号
		appiumUtil.click(InquiryPage.IP_TEXTVIEW_REGISTRATION);
		// 选择预约时间
		List<WebElement> elements = appiumUtil.findElements(InquiryPage.IP_TEXTVIEW_APPOINTMANTTIME);
		if (elements.size() > 0) {
			// 选择第一个预约时�?
			appiumUtil.click(elements.get(1));
		} else {
			return;
		}
		appiumUtil.click(InquiryPage.IP_TEXTVIEW_NEXT);
		// 点击去付�?
//		appiumUtil.click(CommonPage.CP_TEXTVIEW_PAYMENT);
		// 选择支付宝支付方�?
//		appiumUtil.click(CommonPage.CP_TEXTVIEW_ALIPAY);
		// 确认支付
//		appiumUtil.click(CommonPage.CP_TEXTVIEW_CONFIRMPAYMENT);
		//暂停2s
		appiumUtil.pause(2);
	}
}
