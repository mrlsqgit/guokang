package com.kangda.appiumkangda.testcase.inquiry;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.pages.MePage;
import com.kangda.appiumkangda.pageshelper.InquiryPageHelper;

/**
 * @author Jone
 * @description 我的问诊-待使用订单-开始问诊
 * */
public class InquiryPage_003_ToBeUsed_Test extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void onlineVisits(Map<String, String> data){
//		LoginPageHelper.typeloginPageInfo(appiumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		appiumUtil.click(HomePage.HP_ICON_ME);
		//滚动查找我的问诊
		appiumUtil.scrollExact(MePage.INQUIRY);
		appiumUtil.click(MePage.MP_TEXTVIEW_INQUIRY);
		InquiryPageHelper.beginInterrogation(appiumUtil,data.get("MESSAGE"));
	}
}
