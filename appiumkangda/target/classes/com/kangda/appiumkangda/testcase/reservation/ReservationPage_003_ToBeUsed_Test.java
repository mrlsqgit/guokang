package com.kangda.appiumkangda.testcase.reservation;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pages.CommonPage;
import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.pages.MePage;
import com.kangda.appiumkangda.pageshelper.ReservationPageHelper;

/**
 * @author Jone
 * @description 我的预约-待使用订�?
 * */
public class ReservationPage_003_ToBeUsed_Test extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void viewOrderDetails(Map<String, String> data){
//		LoginPageHelper.typeloginPageInfo(appiumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		appiumUtil.click(HomePage.HP_ICON_ME);
		//滚动查找我的预约挂号
		appiumUtil.scrollExact(MePage.RESERVATION);
		appiumUtil.click(MePage.MP_TEXTVIEW_RESERVATION);
		appiumUtil.click(CommonPage.CP_TEXTVIEW_TOBEUSED);
		ReservationPageHelper.viewOrderDetails(appiumUtil);
	}
}
