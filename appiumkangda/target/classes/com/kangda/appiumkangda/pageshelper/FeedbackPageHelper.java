package com.kangda.appiumkangda.pageshelper;

import org.apache.log4j.Logger;

import com.kangda.appiumkangda.pages.FeedbackPage;
import com.kangda.appiumkangda.utils.AppiumUtil;

/**
 * @author jone
 * @description 意见反馈帮助�?
 * 
 */
public class FeedbackPageHelper {

	public static Logger logger = Logger.getLogger(FeedbackPageHelper.class);

	/**
	 * @author Jone
	 * @description 提交意见反馈操作封装
	 * @param AppiumUtil appium api封装引用对象
	 */
	public static void submitFeedback(AppiumUtil appiumUtil,String feedback) {
		logger.info("意见反馈");
		appiumUtil.typeContent(FeedbackPage.FP_EDITTEXT_FEEDBACK, feedback);
		//提交
		appiumUtil.click(FeedbackPage.FP_TEXTVIEW_SUBMIT);
	}
}
