package com.kangda.appiumkangda.pageshelper;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.kangda.appiumkangda.pages.QuestionnairePage;
import com.kangda.appiumkangda.utils.AppiumUtil;

/**
 * @author jone
 * @description 提交问卷帮助�?
 * 
 */
public class QuestionnairePageHelper {

	public static Logger logger = Logger.getLogger(QuestionnairePageHelper.class);

	/**
	 * @author Jone
	 * @description 我的问卷操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void submit(AppiumUtil appiumUtil, String content) {
		logger.info("我的问卷-提交问卷");
		//点击进入我的问卷页面
		appiumUtil.click(QuestionnairePage.QP_TEXTVIEW_QUESTIONNAIRE);
		// 获取�?有副标题接口测试的集�?
		List<WebElement> lists = appiumUtil.findElements(QuestionnairePage.QP_TEXT_SUBTITLE);
		// 获取�?有imageview的集�?
		List<WebElement> imageviews = appiumUtil.findElements(QuestionnairePage.QP_IMAGEVIEW_CLICK);
		//暂停2s
		appiumUtil.pause(2);
		// 点击第一个副标题为接口测试的调查问卷
		appiumUtil.click(lists.get(0));
		// 点击单�?? �?4个imageview
		appiumUtil.click(imageviews.get(3));
		// 点击多�?? 选择 "点我�?"
		appiumUtil.click(QuestionnairePage.QP_TEXTVIEW_CLICK);
		// 页面�?下滚动查�?"我的问卷"元素
		appiumUtil.scrollExact(QuestionnairePage.TEXTVIEW_SUBMIT);
		// 输入问卷文本
		appiumUtil.typeContent(QuestionnairePage.QP_EDITTEXT_CONTENT, content);
		//点击两次才能提交
		appiumUtil.click(QuestionnairePage.QP_TEXTVIEW_SUBMIT);
		appiumUtil.click(QuestionnairePage.QP_TEXTVIEW_SUBMIT);
	}
}
