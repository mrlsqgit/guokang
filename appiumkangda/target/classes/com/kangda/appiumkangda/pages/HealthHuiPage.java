package com.kangda.appiumkangda.pages;

import org.openqa.selenium.By;

/**@author jone
 * @description 健康汇页面元�?
 * */

public class HealthHuiPage {
	/**健康汇名�?*/
	public static final String HP_TEXTVIEW_HEALTHHUI = "健康�?";
	/**取第二个服务image*/
	public static final By HP_IMAGEVIEW_LOGO = By.className("android.widget.ImageView");
	/**加入购物�?*/
	public static final By HP_TEXTVIEW_ADDCART = By.name("加入购物�?");
	/**立即购买*/
	public static final By HP_TEXTVIEW_BUYNOW = By.name("立即购买");
	/**优惠�?*/
	public static final By HP_TEXTVIEW_COUPON = By.name("优惠�?");
	/**不使�? */
	public static final By HP_TEXTVIEW_NONUSE = By.name("不使�?");
	/**立即使用*/
	public static final By HP_TEXTVIEW_USENOW = By.name("立即使用");
	/**确定*/
	public static final By HP_TEXTVIEW_CONFIRM = By.name("确定");  
	/**购物车icon,第二个imageView*/
	public static final By HP_IMAGEVIEW_CARTICON = By.className("android.widget.ImageView");
	/**全�??*/
	public static final By HP_TEXTVIEW_CHECKALL = By.name("全�??");
	/**结算*/
	public static final By HP_TEXTVIEW_BALANCE = By.xpath("//android.widget.TextView[contains(@text,'结算')]");
}
