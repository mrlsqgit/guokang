package com.fuyoujiankang.test.testcases.serviceManagement;

import com.fuyoujiankang.test.base.BasePrepare;
import com.fuyoujiankang.test.entity.ServiceManagementEntity;
import com.fuyoujiankang.test.pageshelper.LoginPageHelper;
import com.fuyoujiankang.test.pageshelper.ServiceManagementPageHelper;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @author Jone
 * @description 编辑服务
 */
public class ServiceManagementPage_001_EditSuccessFunction_Test extends BasePrepare {

	/**
	 * 新赠服务
	 */
	@Test(dataProvider = "testData")
	public void editSuccessFunction(Map<String, String> data) {
		ServiceManagementPage_001_AddSuccessFunction_Test smp = new ServiceManagementPage_001_AddSuccessFunction_Test();
		ServiceManagementEntity service = smp.getService(data);
		// 输入登录信息
		LoginPageHelper.typeHospitalLoginInfo(seleniumUtil, service.getUserName(), service.getPassWord());
		// 等待1s
		seleniumUtil.pause(1500);
		// 打开服务管理url
		if (website == str[0]){
			seleniumUtil.get(uat_serviceManagerUrl);
		}else if (website == str[1]){
			seleniumUtil.get(pre_serviceManagerUrl);
		}
		ServiceManagementPageHelper.editService(seleniumUtil, smp.getService(data));
	}

}