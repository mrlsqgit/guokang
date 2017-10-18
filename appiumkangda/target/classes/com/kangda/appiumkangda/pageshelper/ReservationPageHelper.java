package com.kangda.appiumkangda.pageshelper;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.kangda.appiumkangda.pages.CommonPage;
import com.kangda.appiumkangda.pages.InquiryPage;
import com.kangda.appiumkangda.pages.MePage;
import com.kangda.appiumkangda.pages.ReservationPage;
import com.kangda.appiumkangda.utils.AppiumUtil;

/**
 * @author jone
 * @description 我的预约挂号帮助�?
 * 
 */
public class ReservationPageHelper {

	public static Logger logger = Logger.getLogger(ReservationPageHelper.class);

	/**
	 * @author Jone
	 * @description 我的预约挂号-再来�?单操作封�?
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void onlineVisits(AppiumUtil appiumUtil) {
		logger.info("我的问诊-再来�?�?");
		appiumUtil.click(MePage.MP_TEXTVIEW_INQUIRY);
		appiumUtil.click(CommonPage.CP_TEXTVIEW_ALL);
		List<WebElement> lists = appiumUtil.findElements(InquiryPage.IP_TEXTVIEW_PLACEANORDER);
		if (lists.size() > 0) {
			appiumUtil.click(InquiryPage.IP_TEXTVIEW_PLACEANORDER);
		} else {
			return;
		}
		// 点击在线问诊
		appiumUtil.click(InquiryPage.IP_TEXTVIEW_ONLINEVISITS);
		// 点击确定
		appiumUtil.click(CommonPage.CP_TEXTVIEW_CONFIRM);
		// 点击去付�?
//		appiumUtil.click(CommonPage.CP_TEXTVIEW_PAYMENT);
		// 选择支付宝支付方�?
//		appiumUtil.click(CommonPage.CP_TEXTVIEW_ALIPAY);
		// 确认支付
//		appiumUtil.click(CommonPage.CP_TEXTVIEW_CONFIRMPAYMENT);
		// 暂停2s
		appiumUtil.pause(2);
	}

	/**
	 * @author Jone
	 * @description 我的预约挂号-待支�?-立即支付 操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void payNow(AppiumUtil appiumUtil) {
		logger.info("我的预约挂号-待支�?-立即支付");
		List<WebElement> lists = appiumUtil.findElements(CommonPage.CP_TEXTVIEW_PAYNOW);
		if (lists.size() > 0) {
			// 点击立即支付
			appiumUtil.click(CommonPage.CP_TEXTVIEW_PAYNOW);
			// 选择支付宝支�?
			appiumUtil.click(CommonPage.CP_TEXTVIEW_ALIPAY);
			// 点击确认支付进入支付�?
			appiumUtil.click(CommonPage.CP_TEXTVIEW_CONFIRMPAYMENT);
		} else {
			return;
		}
	}

	/**
	 * @author Jone
	 * @description 我的预约-待使�?-查看订单详情操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void viewOrderDetails(AppiumUtil appiumUtil) {
		logger.info("我的预约-待使�?-查看订单�?");
		// 获得待使用订单列�?"已付�?"字段集合
		List<WebElement> lists = appiumUtil.findElements(ReservationPage.RP_TEXTVIEW_PAID);
		if (lists.size() > 0) {
			appiumUtil.click(ReservationPage.RP_TEXTVIEW_PAID);
			try {
				String actualText = appiumUtil.getText(ReservationPage.RP_TEXTVIEW_SECRETKEY);
				logger.info(actualText);
				String expectText = "服务密钥";
				Assert.assertEquals(actualText, expectText);
			} catch (Exception e) {
				logger.warn("没有打开预约订单详情");
			}
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
		// 点击预约挂号
		appiumUtil.click(InquiryPage.IP_TEXTVIEW_REGISTRATION);
		// 选择预约时间
		List<WebElement> elements = appiumUtil.findElements(InquiryPage.IP_TEXTVIEW_APPOINTMANTTIME);
		if (elements.size() > 0) {
			// 选择第一个预约时�?
			appiumUtil.click(elements.get(1));
		}else{
			return;
		}
		appiumUtil.click(InquiryPage.IP_TEXTVIEW_NEXT);
		// 点击去付�?
//		appiumUtil.click(CommonPage.CP_TEXTVIEW_PAYMENT);
		// 选择支付宝支付方�?
//		appiumUtil.click(CommonPage.CP_TEXTVIEW_ALIPAY);
		// 点击确认支付
//		appiumUtil.click(CommonPage.CP_TEXTVIEW_CONFIRMPAYMENT);
		// 暂停2s
		appiumUtil.pause(2);
	}
}
