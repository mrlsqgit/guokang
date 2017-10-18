package com.kangda.appiumkangda.pages;

import org.openqa.selenium.By;

/**
 * @author jone
 * @description 我的问诊页面元素
 */

public class InquiryPage {
	/** 再来�?�? */
	public static final By IP_TEXTVIEW_PLACEANORDER = By.name("再次问诊");
	/** 在线问诊 */
	public static final By IP_TEXTVIEW_ONLINEVISITS = By.name("在线问诊");  
	/** 问诊输入�? */
	public static final By IP_INPUT_MESSAGE = By.className("android.widget.EditText");  
	/** 发�?�问诊消�? */
	public static final By IP_TEXTVIEW_SEND = By.name("发�??");  
	/** �?始问�? */
	public static final By IP_TEXTVIEW_BEGININTERROGATION = By.name("�?始问�?"); 
	/** 预约挂号*/
	public static final By IP_TEXTVIEW_REGISTRATION = By.name("预约挂号");  
	/** 预约时间*/
	public static final By IP_TEXTVIEW_APPOINTMANTTIME = By.className("android.widget.ImageView");  
	/** 选择预约时间-下一�?*/
	public static final By IP_TEXTVIEW_NEXT = By.name("下一�?");
}
