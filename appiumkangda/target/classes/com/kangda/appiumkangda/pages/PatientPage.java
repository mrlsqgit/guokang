package com.kangda.appiumkangda.pages;

import org.openqa.selenium.By;

/**
 * @author jone
 * @description 就诊人管理页面元�?
 */

public class PatientPage {
	/** 添加亲友按钮 */
	public static final By PP_BUTTON_ADDFRIENDS = By.name("添加就诊�?");
	/** 编辑 */
	public static final By PP_TEXTVIEW_UPDATE = By.name("编辑");
	/** 输入�? */
	public static final By PP_INPUT_EDITTEXST = By.className("android.widget.EditText");
	/** 身份证输入框 */
	public static final By PP_INPUT_ID = By.name("请填写身份证�?");
	/** 性别选择 */
	public static final String PP_TEXTVIEW_SELECT = "请�?�择";
	/** 性别，关系，居住地classname */
	public static final By PP_TEXTVIEW_OTHERINFO = By.className("android.widget.TextView");
	/** 完成按钮 */
	public static final By PP_TEXTVIEW_SAVE = By.name("完成");
	/** 删除 */
	public static final By PP_TEXTVIEW_DELETE = By.className("android.widget.TextView");
}
