package com.fuyoujiankang.test.testcases.knowledgeManagement;

import com.fuyoujiankang.test.base.BasePrepare;
import com.fuyoujiankang.test.entity.KnowledgeManagementEntity;
import com.fuyoujiankang.test.entity.ServiceManagementEntity;
import com.fuyoujiankang.test.pageshelper.KnowledgeManagementPageHelper;
import com.fuyoujiankang.test.pageshelper.LoginPageHelper;
import com.fuyoujiankang.test.pageshelper.ServiceManagementPageHelper;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @author Jone
 * @description 新增知识
 */
public class KnowledgeManagementPage_001_AddSuccessFunction_Test extends BasePrepare {

	/**
	 * 新赠服务
	 */
	@Test(dataProvider = "testData")
	public void addSuccessFunction(Map<String, String> data) {
		KnowledgeManagementEntity knowledge = getKnowledge(data);
		// 输入登录信息
		LoginPageHelper.typeHospitalLoginInfo(seleniumUtil, knowledge.getUserName(), knowledge.getPassWord());
		// 等待1s
		seleniumUtil.pause(1500);
		// 打开服务管理url
		if (website == str[0]){
			seleniumUtil.get(uat_serviceManagerUrl);
		}else if (website == str[1]){
			seleniumUtil.get(pre_serviceManagerUrl);
		}
		KnowledgeManagementPageHelper.addKnowledge(seleniumUtil,getKnowledge(data));
	}

	/**
	 * 获取知识每个字段值
	 * @param data
	 * @return
	 */
	public KnowledgeManagementEntity getKnowledge(Map<String, String> data) {
		// 把新增知识页面字段封装到一个实体
		KnowledgeManagementEntity knowledge = new KnowledgeManagementEntity();
        if (website == str[0]){
            knowledge.setUserName(data.get("UATUSERNAME"));
            knowledge.setPassWord(data.get("UATPASSWORD"));
		}else if (website == str[1]){
            knowledge.setUserName(data.get("PREUSERNAME"));
            knowledge.setPassWord(data.get("PREPASSWORD"));
		}
        knowledge.setTitle(data.get("TITLE"));
        knowledge.setTagName(data.get("TAGNAME"));
        knowledge.setSubtitle(data.get("SUBTITLE"));
        knowledge.setListImage(data.get("LISTIMAGE"));
        knowledge.setShareImage(data.get("SHAREIMAGE"));
        knowledge.setContentDetail(data.get("CONTENTDETAIL"));
        knowledge.setGraphicDetail(data.get("GRAPHICDETAILS"));
        knowledge.setShareTitle(data.get("SHARETITLE"));
        knowledge.setShareContent(data.get("SHARECONTENT"));
        knowledge.setShareNum(data.get("SHARENUM"));
        knowledge.setCollectionNum(data.get("COLLECTIONNUM"));
        knowledge.setPv(data.get("PV"));
        knowledge.setSource(data.get("SOURCE"));
        knowledge.setSourceLink(data.get("SOURCELINK"));
        knowledge.setAuthor(data.get("AUTHOR"));
        knowledge.setSort(data.get("SORT"));
        knowledge.setInitialNum(data.get("INITIALNUM"));
        knowledge.setBannerImage(data.get("BANNERIMAGE"));
        knowledge.setRemark(data.get("REMARK"));
		return knowledge;
	}
}
