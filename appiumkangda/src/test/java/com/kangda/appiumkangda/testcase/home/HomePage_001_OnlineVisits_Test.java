package com.kangda.appiumkangda.testcase.home;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pageshelper.HomePageHelper;
import com.kangda.appiumkangda.pageshelper.InquiryPageHelper;

/**
 * @author Jone
 * @description 首页搜索医生-在线问诊下单
 * */
public class HomePage_001_OnlineVisits_Test extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void onlineVisits(Map<String, String> data){
//		LoginPageHelper.typeloginPageInfo(appiumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		//搜索医生
        HomePageHelper.searchDoctor(appiumUtil, data.get("DOCTORNAME"));
		InquiryPageHelper.onlineVisits(appiumUtil);
	}
}
