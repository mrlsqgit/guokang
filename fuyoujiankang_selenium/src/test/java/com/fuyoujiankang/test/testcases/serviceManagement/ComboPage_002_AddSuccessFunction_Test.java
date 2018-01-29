package com.fuyoujiankang.test.testcases.serviceManagement;

import java.util.Map;

import org.testng.annotations.Test;

import com.fuyoujiankang.test.base.BasePrepare;
import com.fuyoujiankang.test.entity.ComboEntity;
import com.fuyoujiankang.test.pageshelper.LoginPageHelper;
import com.fuyoujiankang.test.pageshelper.ServiceManagementPageHelper;

/**
 * @author Jone
 * @description 新增套餐
 */
public class ComboPage_002_AddSuccessFunction_Test extends BasePrepare {
	/**
	 * 新增套餐
	 */
	@Test(dataProvider = "testData")
	public void addSuccessFunction(Map<String, String> data) {
		ComboEntity combo = getCombo(data);
		// 输入登录信息
		LoginPageHelper.typeHospitalLoginInfo(seleniumUtil, combo.getUserName(), combo.getPassword());
		// 等待1s
		seleniumUtil.pause(1500);
		// 打开预发布服务套餐管理url
		if (website == str[0]){
			seleniumUtil.get(uat_serviceManagerUrl);
		}else if (website == str[1]){
			seleniumUtil.get(pre_serviceManagerUrl);
		}
		ServiceManagementPageHelper.addCombo(seleniumUtil, getCombo(data));
	}

	/**
	 * 获取新增套餐每个字段值
	 * @param data
	 * @return
	 */
	public ComboEntity getCombo(Map<String, String> data) {
		// 把新增套餐页面字段封装到一个实体
		ComboEntity combo = new ComboEntity();
		if (website == str[0]){
			combo.setUserName(data.get("UATUSERNAME"));
			combo.setPassword(data.get("UATPASSWORD"));
		}else if (website == str[1]){
			combo.setUserName(data.get("PREUSERNAME"));
			combo.setPassword(data.get("PREPASSWORD"));
		}
		combo.setTitle(data.get("TITLE"));
		combo.setSubTitle(data.get("SUBTITLE"));
		combo.setListImage(data.get("LISTIMAGE"));
		combo.setBannerImage(data.get("BANNERIMAGE"));
		combo.setComboPrice(data.get("COMBOPRICE"));
		combo.setNum(data.get("NUM"));
		combo.setBuyNotes(data.get("BUYNOTES"));
		combo.setConfiguration(data.get("CONFIGURATION"));
		combo.setSmallImage(data.get("SMALLIMAGE"));
		combo.setShareContent(data.get("SHARECONTENT"));
		combo.setRemark(data.get("REMARK"));
		return combo;
	}
}
