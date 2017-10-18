package com.kangda.appiumkangda.testcase.questionnaire;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.pages.QuestionnairePage;
import com.kangda.appiumkangda.pageshelper.QuestionnairePageHelper;

/**
 * @author Jone
 * @description 我的问卷
 * */
public class QuestionnairePage_001_Submit_Test extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void onlineVisits(Map<String, String> data){
//		LoginPageHelper.typeloginPageInfo(appiumUtil,data.get("USERNAME"), data.get("PASSWORD"));
		appiumUtil.click(HomePage.HP_ICON_ME);
		//滚动查找我的问卷
		appiumUtil.scrollExact(QuestionnairePage.QUESTIONNAIRE);
		appiumUtil.click(QuestionnairePage.QP_TEXTVIEW_QUESTIONNAIRE);
		//提交问卷
		QuestionnairePageHelper.submit(appiumUtil,data.get("CONTENT"));
	}
}
