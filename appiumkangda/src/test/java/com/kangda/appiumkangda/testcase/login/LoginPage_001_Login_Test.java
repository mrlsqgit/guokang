package com.kangda.appiumkangda.testcase.login;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.pageshelper.LoginPageHelper;
import com.kangda.appiumkangda.base.BasePrepare;

public class LoginPage_001_Login_Test extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void login(Map<String, String> data){
		LoginPageHelper.typeloginPageInfo(appiumUtil,data.get("USERNAME"), data.get("PASSWORD"));
	}
}
