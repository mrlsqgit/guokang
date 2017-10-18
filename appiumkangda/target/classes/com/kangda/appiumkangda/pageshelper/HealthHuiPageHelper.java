package com.kangda.appiumkangda.pageshelper;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.kangda.appiumkangda.pages.HealthHuiPage;
import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.utils.AppiumUtil;

/**
 * @author jone
 * @description 购买健康汇服务帮助类
 * 
 */

public class HealthHuiPageHelper {

	public static Logger logger = Logger.getLogger(HealthHuiPageHelper.class);

	/**
	 * @author Jone
	 * @description 加入购物车下单操作封�?
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void addCart(AppiumUtil appiumUtil) {
		logger.info("健康汇服�?-加入购物车下�?");
		// 点击加入购物�?
		appiumUtil.click(HealthHuiPage.HP_TEXTVIEW_ADDCART);
		
		// 判断是否弹出sku弹窗
		if (appiumUtil.doesElementsExist(HealthHuiPage.HP_TEXTVIEW_CONFIRM) == true) {
			// 点击确定
			appiumUtil.click(HealthHuiPage.HP_TEXTVIEW_CONFIRM);
			// 暂停1s
			appiumUtil.pause(1);
		} 
		List<WebElement> imageViews = appiumUtil.findElements(HealthHuiPage.HP_IMAGEVIEW_CARTICON);
		// 点击购物车icon
		appiumUtil.click(imageViews.get(1));
		// 点击全�??
		appiumUtil.click(HealthHuiPage.HP_TEXTVIEW_CHECKALL);
		// 点击结算
		appiumUtil.click(HealthHuiPage.HP_TEXTVIEW_BALANCE);
		// 选择优惠�?
		chooseCoupon(appiumUtil);
		// 点击立即支付
		// appiumUtil.click(CommonPage.CP_TEXTVIEW_PAYNOW);
	}

	/**
	 * @author Jone
	 * @description 立即购买操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void buyNow(AppiumUtil appiumUtil) {
		logger.info("健康汇服�?-立即购买");
		// 点击立即购买
		appiumUtil.click(HealthHuiPage.HP_TEXTVIEW_BUYNOW);
		// 选择优惠�?
		chooseCoupon(appiumUtil);
		// 点击立即支付
//		appiumUtil.click(CommonPage.CP_TEXTVIEW_PAYNOW);
	}

	/**
	 * @author Jone
	 * @description 从首页进入服务详情页操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void inDetailsPage(AppiumUtil appiumUtil) {
		logger.info("进入服务详情�?");
		// 滚动匹配健康�?
		appiumUtil.scrollExact(HealthHuiPage.HP_TEXTVIEW_HEALTHHUI);
		// 首页点击更多进入健康汇列�?
		List<WebElement> lists = appiumUtil.findElements(HomePage.HP_TEXTVIEW_MORE);
		appiumUtil.click(lists.get(1));
		// 获取imageview集合
		List<WebElement> imageViews = appiumUtil.findElements(HealthHuiPage.HP_IMAGEVIEW_LOGO);
		// 点击第二个服务图片进入服务详�?
		appiumUtil.click(imageViews.get(2));
	}

	/**
	 * @author Jone
	 * @description 选择优惠券操作封�?
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void chooseCoupon(AppiumUtil appiumUtil) {
		logger.info("选择优惠�?");
		// 点击优惠券�?�择�?
		appiumUtil.click(HealthHuiPage.HP_TEXTVIEW_COUPON);
		// �?查�?�立即使用�?�元素是否存�?
		if (appiumUtil.doesElementsExist(HealthHuiPage.HP_TEXTVIEW_USENOW) == true) {
			List<WebElement> uses = appiumUtil.findElements(HealthHuiPage.HP_TEXTVIEW_USENOW);
			// 点击第一个优惠券
			appiumUtil.click(uses.get(0));
		} else{
			return;
		}
	}
}
