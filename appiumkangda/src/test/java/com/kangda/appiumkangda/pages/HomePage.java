package com.kangda.appiumkangda.pages;

import org.openqa.selenium.By;

/**@author jone
 * @description APP首页元素
 * */

public class HomePage {
	/**我按钮*/
	 public static final By HP_ICON_ME = By.name("我");
	 
	 /**引导页-立即体验*/
	 public static final By HP_IMAGEVIEW_EXPERIENCE = By.className("android.widget.ImageView");
	 /**在线预约-疫苗接种*/
	 public static final By HP_TEXTVIEW_YIMIAO = By.name("在线预约");
	 /**在线预约-疫苗接种*/
	 public static final By HP_TEXTVIEW_JIANYANKE = By.name("检验科");
	 /**在线预约-围产中心*/
	 public static final By HP_TEXTVIEW_WEICHAN= By.name("围产中心");
	 /**搜索医生文本框*/
	 public static final By HP_TEXTVIEW_SEARCH= By.name("搜索医生");
	 /**搜索医生文本框*/
	 public static final By HP_EDITTEXT_SEARCH= By.name("输入医生姓名搜索医生");
	 /**搜索结果医生姓名*/
	 public static final By HP_TEXTVIEW_DOCTORNAME= By.name("jone麻醉科室负责人");
	 /**更多*/
	 public static final By HP_TEXTVIEW_MORE= By.name("更多");
}
