package com.fuyoujiankang.test.testcases.login;

import java.util.Map;

import org.testng.annotations.Test;

import com.fuyoujiankang.test.base.BasePrepare;
import com.fuyoujiankang.test.pageshelper.LoginPageHelper;

/**
* @author Jone
* @description 登录之后验证用户名是不是正确的
* */
public class LoginPage_001_LoginSuccessFunction_Test extends BasePrepare {
	
	@Test(dataProvider = "testData")
	public void loginSuccessFunction(Map<String, String> data) {
		// 等待登录页面加载
//		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
		// 输入登录信息
		LoginPageHelper.typeHospitalLoginInfo(seleniumUtil,data.get("USERNAME"), data.get("PASSWORD"));
	   
	}
}
