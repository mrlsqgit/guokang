package com.kangda.appiumkangda.testcase.service;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pageshelper.CouponActivityPageHelper;

/**
 * @author Jone
 * @description 优惠活动加入购物�?
 */
public class CouponActivityPage_001_BuyNow_Test extends BasePrepare {

	@Test(dataProvider = "testData")
	public void buyNow(Map<String, String> data) {
		//优惠活动进入服务详情立即购买
		CouponActivityPageHelper.CoupinActivityBuyNow(appiumUtil);
	}
}
