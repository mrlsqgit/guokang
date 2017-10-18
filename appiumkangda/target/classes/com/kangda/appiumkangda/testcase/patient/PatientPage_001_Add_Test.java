package com.kangda.appiumkangda.testcase.patient;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.pageshelper.PatientPageHelper;

public class PatientPage_001_Add_Test extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void addPatient(Map<String, String> data){
//		LoginPageHelper.typeloginPageInfo(appiumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		appiumUtil.click(HomePage.HP_ICON_ME);
		PatientPageHelper.addPatient(appiumUtil, data.get("NAME"), data.get("ID"));
	}
}
