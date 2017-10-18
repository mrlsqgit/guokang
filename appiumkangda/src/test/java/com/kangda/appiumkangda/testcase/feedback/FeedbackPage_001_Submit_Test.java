package com.kangda.appiumkangda.testcase.feedback;

import java.util.Map;

import org.testng.annotations.Test;

import com.kangda.appiumkangda.base.BasePrepare;
import com.kangda.appiumkangda.pages.FeedbackPage;
import com.kangda.appiumkangda.pages.HomePage;
import com.kangda.appiumkangda.pages.MePage;
import com.kangda.appiumkangda.pageshelper.FeedbackPageHelper;

/**
 * @author Jone
 * @description 意见反馈
 */
public class FeedbackPage_001_Submit_Test extends BasePrepare {

	@Test(dataProvider = "testData")
	public void feedback(Map<String, String> data) {
//		LoginPageHelper.typeloginPageInfo(appiumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		appiumUtil.click(HomePage.HP_ICON_ME);
		//点击设置
		appiumUtil.click(MePage.MP_TEXTVIEW_SET);
		// 进入意见反馈页面
		appiumUtil.click(FeedbackPage.FP_TEXTVIEW_FEEDBACK);
		// 提交意见反馈
		FeedbackPageHelper.submitFeedback(appiumUtil, data.get("FEEDBACK"));
	}
}
