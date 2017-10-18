package com.kangda.appiumkangda.testcase.patient;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.pageshelper.PatientPageHelper;

public class PatientPage_003_Delete_Test extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void deletePatient(Map<String, String> data){
		appiumUtil.click(HomePage.HP_ICON_ME);
		PatientPageHelper.deletePatient(appiumUtil, data.get("NAME"), data.get("ID"));
	}
}
