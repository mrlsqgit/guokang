package com.fuyoujiankang.test.testcases.serviceManagement;

import java.io.IOException;
import java.util.Map;
import org.testng.annotations.Test;
import com.fuyoujiankang.test.base.BasePrepare;
import com.fuyoujiankang.test.entity.ServiceManagementEntity;
import com.fuyoujiankang.test.pageshelper.LoginPageHelper;
import com.fuyoujiankang.test.pageshelper.ServiceManagementPageHelper;

/**
 * @author Jone
 * @description 新增服务
 */
public class ServiceManagementPage_001_AddSuccessFunction_Test extends BasePrepare {

	/**
	 * 新赠服务
	 */
	@Test(dataProvider = "testData")
	public void addSuccessFunction(Map<String, String> data) throws IOException {
		
		ServiceManagementEntity service = getService(data);
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
		ServiceManagementPageHelper.addService(seleniumUtil,getService(data));
	}

	/**
	 * 获取服务每个字段值
	 * @param data
	 * @return
	 */
	public ServiceManagementEntity getService(Map<String, String> data) {
		// 把新增服务页面字段封装到一个实体
		ServiceManagementEntity service = new ServiceManagementEntity();
        if (website == str[0]){
			service.setUserName(data.get("UATUSERNAME"));
			service.setPassWord(data.get("UATPASSWORD"));
		}else if (website == str[1]){
			service.setUserName(data.get("PREUSERNAME"));
			service.setPassWord(data.get("PREPASSWORD"));
		}
		service.setServiceName(data.get("SERVICENAME"));
		service.setTagNames(data.get("TAGNAME"));
		service.setServiceProvideTime(data.get("SERVICEPROVIDETIME"));
		service.setProperty(data.get("PROPERTY"));
		service.setSpecificationName(data.get("SPECIFICATIONNAME"));
		service.setMarketGuidePrice(data.get("MARKETGUIDEPRICE"));
		service.setThumbnail(data.get("THUMBNAIL"));
		service.setInventory(data.get("INVENTORY"));
		service.setPromotionPrice(data.get("PROMOTIONPRICE"));
		service.setListImage(data.get("LISTIMAGE"));
		service.setBannerImage(data.get("BANNERIMAGE"));
		service.setSmallImage(data.get("SMALLIMAGE"));
		service.setBuyNotes(data.get("BUYNOTES"));
		service.setPoint(data.get("POINT"));
		service.setBuyBaseNum(data.get("BUYBASENUM"));
		service.setContentDetail(data.get("CONTENTDETAIL"));
		service.setConfiguration(data.get("CONFIGURATION"));
		service.setShareTitle(data.get("SHARETITLE"));
		service.setShareContent(data.get("SHARECONTENT"));
		service.setTotalQuantity(data.get("TOTALQUANTITY"));
		service.setRemark(data.get("REMARK"));
		service.setSuggest(data.get("SUGGEST"));
		return service;
	}
}