package com.kangda.appiumkangda.testcase.service;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pageshelper.HealthHuiPageHelper;

/**
 * @author Jone
 * @description 健康汇服务加入购物车下单
 */
public class HealthHuiPage_001_addCart_Test extends BasePrepare {

	@Test(dataProvider = "testData")
	public void addCart(Map<String, String> data) {
		// LoginPageHelper.typeloginPageInfo(appiumUtil,data.get("USERNAME"),
		// data.get("PASSWORD"));
		// 进入服务详情�?
		HealthHuiPageHelper.inDetailsPage(appiumUtil);
		// 加入购物车下�?
		HealthHuiPageHelper.addCart(appiumUtil);
	}
}
