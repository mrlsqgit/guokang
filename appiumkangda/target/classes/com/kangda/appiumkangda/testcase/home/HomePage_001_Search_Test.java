package com.kangda.appiumkangda.testcase.home;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pageshelper.HomePageHelper;

/**
 * @author Jone
 * @description 首页搜索
 */
public class HomePage_001_Search_Test extends BasePrepare {

	@Test(dataProvider = "testData")
	public void feedback(Map<String, String> data) {
//		LoginPageHelper.typeloginPageInfo(appiumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//搜索医生
		HomePageHelper.searchDoctor(appiumUtil, data.get("DOCTORNAME"));
	}
}
