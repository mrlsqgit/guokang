package com.kangda.appiumkangda.pages;

import org.openqa.selenium.By;

/**@author jone
 * @description 消息页面元素
 * */

public class MessagePage {
	/**消息*/
	 public static final By MP_TEXTVIEW_MESSAGEICON = By.name("消息");
	 /**消息搜索�?*/
	 public static final By MP_TEXTVIEW_SEARCH = By.name("搜索医生/医院");
	 /**医生名字*/
	 public static final By MP_TEXTVIEW_NAME = By.name("jone麻醉科室负责�?");
	 /**筛�??*/
	 public static final By MP_TEXTVIEW_FILTER = By.name("筛�??");
	 /**问诊*/
	 public static final By MP_TEXTVIEW_INQUIRY = By.name("问诊");
	 /**预约挂号*/
	 public static final By MP_TEXTVIEW_REGISTRATION = By.name("预约挂号");
	 /**�?始问�?*/
	 public static final By MP_TEXTVIEW_START = By.name("�?始问�?");
	 /**通讯录icon 第一个imageview*/
	 public static final By MP_IMAGEVIEW_ADDRESSBOOK = By.className("android.widget.ImageView");
	 /**平台小助�?*/
	 public static final By MP_TEXTVIEW_LITTLEHELPER = By.name("平台小助�?");
	 /**平台小助�?-消息输入�?*/
	 public static final By MP_EDITTEXT_MESSAGE = By.className("android.widget.EditText");
	 /**平台小助�?-发�??*/
	 public static final By MP_TEXTVIEW_SEND = By.name("发�??");
	 /**平台小助�?-语音icon 倒数第二个ImageView*/
	 public static final By MP_IMAGEVIEW_VOICE = By.className("android.widget.ImageView"); 
	 /**平台小助�?-按住说话*/
	 public static final By MP_TEXTVIEW_TALK = By.name("按住说话"); 
}
