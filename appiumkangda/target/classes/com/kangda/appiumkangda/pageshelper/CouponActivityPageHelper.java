package com.kangda.appiumkangda.pageshelper;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.kangda.appiumkangda.pages.CouponActivityPage;
import com.kangda.appiumkangda.pages.HealthHuiPage;
import com.kangda.appiumkangda.utils.AppiumUtil;

/**
 * @author jone
 * @description 购买健康汇服务帮助类
 * 
 */

public class CouponActivityPageHelper {

	public static Logger logger = Logger.getLogger(CouponActivityPageHelper.class);
	
	static List<WebElement> list2s;

	/**
	 * 进入优惠活动详情
	 */
	public static void IntoCoupinActivity(AppiumUtil appiumUtil) {
		// 获取页面imageview列表
		List<WebElement> lists = appiumUtil.findElements(CouponActivityPage.CP_IMAGEVIEW_COMMON);
		// 暂停6s
		appiumUtil.pause(6);
		// 点击优惠活动banner�?
		appiumUtil.click(lists.get(1));
		// 点击查看详情进入优惠活动详情
		appiumUtil.click(CouponActivityPage.CP_TEXTVIEW_VIEWDETAILS);
		// 点击了解详情进入活动说明�?
		appiumUtil.click(CouponActivityPage.CP_TEXTVIEW_SEEDETAILS);
		// 点击返回icon进入优惠活动�?
		appiumUtil.click(CouponActivityPage.CP_IMAGEVIEW_COMMON);
		// 获取页面imageview列表
		list2s = appiumUtil.findElements(CouponActivityPage.CP_IMAGEVIEW_COMMON);
	}

	/**
	 * @author Jone
	 * @description 优惠活动加入购物车下单操作封�?
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void CoupinActivityAddCart(AppiumUtil appiumUtil) {
		logger.info("优惠活动-服务-加入购物车下�?");
		IntoCoupinActivity(appiumUtil);
		// 点击�?后一个购物车icon
		appiumUtil.click(list2s.get(list2s.size() - 1));
		// 点击右上角购物车icon
		appiumUtil.click(list2s.get(1));
		// 点击全�??
		appiumUtil.click(HealthHuiPage.HP_TEXTVIEW_CHECKALL);
		// 点击结算
		appiumUtil.click(HealthHuiPage.HP_TEXTVIEW_BALANCE);
		// 点击立即支付
		// appiumUtil.click(CommonPage.CP_TEXTVIEW_PAYNOW);
	}

	/**
	 * @author Jone
	 * @description 优惠活动立即购买操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void CoupinActivityBuyNow(AppiumUtil appiumUtil) {
		logger.info("优惠活动-服务-立即购买");
		IntoCoupinActivity(appiumUtil);
		//点击第一个服务logo
		appiumUtil.click(list2s.get(5));
		// 点击立即购买
		appiumUtil.click(HealthHuiPage.HP_TEXTVIEW_BUYNOW);
	}
}
