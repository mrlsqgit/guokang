package com.kangda.appiumkangda.testcase.home;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pageshelper.HomePageHelper;
import com.kangda.appiumkangda.pageshelper.ReservationPageHelper;

/**
 * @author Jone
 * @description 我的预约挂号-预约挂号下单
 * */
public class HomePage_001_Registration_Test extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void onlineVisits(Map<String, String> data){
//		LoginPageHelper.typeloginPageInfo(appiumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		//搜索医生
        HomePageHelper.searchDoctor(appiumUtil, data.get("DOCTORNAME"));
		ReservationPageHelper.registration(appiumUtil);
	}
}
