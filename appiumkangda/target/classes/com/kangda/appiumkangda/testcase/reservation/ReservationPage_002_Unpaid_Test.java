package com.kangda.appiumkangda.testcase.reservation;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.pages.MePage;
import com.kangda.appiumkangda.pageshelper.ReservationPageHelper;

/**
 * @author Jone
 * @description 我的预约-待支付订�?-立即支付
 * */
public class ReservationPage_002_Unpaid_Test extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void payNow(Map<String, String> data){
//		LoginPageHelper.typeloginPageInfo(appiumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		appiumUtil.click(HomePage.HP_ICON_ME);
		//滚动查找我的预约挂号
		appiumUtil.scrollExact(MePage.RESERVATION);
		appiumUtil.click(MePage.MP_TEXTVIEW_RESERVATION);
		ReservationPageHelper.payNow(appiumUtil);
	}
}
