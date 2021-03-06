package com.kangda.appiumkangda.testcase.inquiry;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pages.CommonPage;
import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.pages.InquiryPage;
import com.kangda.appiumkangda.pages.MePage;
import com.kangda.appiumkangda.pageshelper.InquiryPageHelper;

/**
 * @author Jone
 * @description 我的问诊-在线问诊下单
 * */
public class InquiryPage_001_OnlineVisits_Test extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void onlineVisits(Map<String, String> data){
        //LoginPageHelper.typeloginPageInfo(appiumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		appiumUtil.click(HomePage.HP_ICON_ME);
		//滚动查找我的问诊
		appiumUtil.scrollExact(MePage.INQUIRY);
		appiumUtil.click(MePage.MP_TEXTVIEW_INQUIRY);
		appiumUtil.click(CommonPage.CP_TEXTVIEW_ALL);
		List<WebElement> lists = appiumUtil.findElements(InquiryPage.IP_TEXTVIEW_PLACEANORDER);
		if (lists.size() > 0) {
			appiumUtil.click(InquiryPage.IP_TEXTVIEW_PLACEANORDER);
		} else {
			return;
		}
		InquiryPageHelper.onlineVisits(appiumUtil);
	}
}
