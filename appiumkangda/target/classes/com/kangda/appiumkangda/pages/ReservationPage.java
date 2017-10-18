package com.kangda.appiumkangda.pages;

import org.openqa.selenium.By;

/**
 * @author jone
 * @descrRPtion 我的预约挂号页面元素
 */

public class ReservationPage {
	/** 立即预约*/
	public static final By RP_TEXTVIEW_RESERVATION = By.name("立即预约");
	/** 预约挂号*/
	public static final By RP_TEXTVIEW_REGISTRATION = By.name("预约挂号");  
	/** 预约时间*/
	public static final By RP_TEXTVIEW_APPOINTMANTTIME = By.className("android.widget.ImageView");  
	/** 选择预约时间-下一�?*/
	public static final By RP_TEXTVIEW_NEXT = By.name("下一�?");
	/** 我的预约查看订单详情-服务密钥验证 */
	public static final By RP_TEXTVIEW_SECRETKEY = By.name("服务密钥");
	/** 已付�?*/
	public static final By RP_TEXTVIEW_PAID = By.name("已付�?");
}
