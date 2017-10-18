package com.kangda.appiumkangda.pageshelper;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.kangda.appiumkangda.pages.CommonPage;
import com.kangda.appiumkangda.pages.MePage;
import com.kangda.appiumkangda.pages.PatientPage;
import com.kangda.appiumkangda.utils.AppiumUtil;

/**
 * @author jone
 * @description 添加就诊人帮助类
 * 
 */

public class PatientPageHelper {

	public static Logger logger = Logger.getLogger(PatientPageHelper.class);

	/**
	 * @author Jone
	 * @description 添加就诊人操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void addPatient(AppiumUtil appiumUtil, String name, String id) {
		// 生成0-100的随机数
//		Random r = new Random();
//		int i = r.nextInt(101);
		logger.info("添加就诊人");
		appiumUtil.click(MePage.MP_TEXTVIEW_PATIENT);
		appiumUtil.click(PatientPage.PP_BUTTON_ADDFRIENDS);
		List<WebElement> lists = appiumUtil.findElements(PatientPage.PP_INPUT_EDITTEXST);
		appiumUtil.typeContent(lists.get(1), name);
		appiumUtil.typeContent(lists.get(2), id);
		// appiumUtil.click(elements.get(0));
		// appiumUtil.click(elements.get(0));
		// appiumUtil.click(elements.get(1));
		// appiumUtil.click(elements.get(2));
		// 点击完成
		appiumUtil.click(PatientPage.PP_TEXTVIEW_SAVE);
	}

	/**
	 * @author Jone
	 * @description 编辑就诊人操作封装
	 * @param AppiumUtil
	 *            appium api封装引用对象
	 */
	public static void updatePatient(AppiumUtil appiumUtil, String name, String id) {
		// 生成0-100的随机数
		Random r = new Random();
		int i = r.nextInt(101);
		logger.info("编辑就诊人");
		appiumUtil.click(MePage.MP_TEXTVIEW_PATIENT);
		List<WebElement> elements = appiumUtil.findElements(PatientPage.PP_TEXTVIEW_UPDATE);
		appiumUtil.click(elements.get(0));
		List<WebElement> edittexts = appiumUtil.findElements(PatientPage.PP_INPUT_EDITTEXST);
		appiumUtil.clear(edittexts.get(1));
		appiumUtil.typeContent(edittexts.get(1), name + i);
		appiumUtil.clear(edittexts.get(2));
		appiumUtil.typeContent(edittexts.get(2), id);
		// 点击完成
		appiumUtil.click(PatientPage.PP_TEXTVIEW_SAVE);
	}

	/**
	 * @author Jone
	 * @description 删除第一个就诊人操作封装
	 * @param AppiumUtil appium api封装引用对象
	 */
	public static void deletePatient(AppiumUtil appiumUtil, String name, String id) {
		logger.info("删除就诊人");
		appiumUtil.click(MePage.MP_TEXTVIEW_PATIENT);
		List<WebElement> elements = appiumUtil.findElements(PatientPage.PP_TEXTVIEW_DELETE);
		//删除第一个就诊人
		appiumUtil.click(elements.get(4));
		appiumUtil.click(CommonPage.CP_TEXTVIEW_CONFIRM);
	}
}
