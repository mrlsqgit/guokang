package com.kangda.appiumkangda.testcase.message;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pageshelper.MessagePageHelper;

/**
 * @author Jone
 * @description 消息页面搜索
 */
public class MessagePage_001_Search_Test extends BasePrepare {

	@Test(dataProvider = "testData")
	public void feedback(Map<String, String> data) {
//		LoginPageHelper.typeloginPageInfo(appiumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//搜索医生
		MessagePageHelper.searchDoctor(appiumUtil, data.get("DOCTORNAME"));
	}
}
