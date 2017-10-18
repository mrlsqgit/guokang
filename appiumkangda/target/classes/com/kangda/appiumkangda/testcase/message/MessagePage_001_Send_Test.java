package com.kangda.appiumkangda.testcase.message;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pageshelper.MessagePageHelper;

/**
 * @author Jone
 * @description 平台小助手发送消�?
 */
public class MessagePage_001_Send_Test extends BasePrepare {

	@Test(dataProvider = "testData")
	public void feedback(Map<String, String> data) {
		// LoginPageHelper.typeloginPageInfo(appiumUtil, data.get("USERNAME"),
		// data.get("PASSWORD"));
		// 平台小助手发送消�?
		MessagePageHelper.sendMessage(appiumUtil, data.get("MESSAGE"));
	}
}
