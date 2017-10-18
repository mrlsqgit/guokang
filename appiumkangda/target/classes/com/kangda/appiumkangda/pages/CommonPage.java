package com.kangda.appiumkangda.pages;

import org.openqa.selenium.By;

/**@author jone
 * @description 公共元素
 * */
public class CommonPage {
	/** 待支�?*/
	public static final By CP_TEXTVIEW_UNPAID = By.name("待支�?");
	/** 待使�?*/
	public static final By CP_TEXTVIEW_TOBEUSED = By.name("待使�?");
	/** 全部*/
	public static final By CP_TEXTVIEW_ALL = By.name("全部");
	/** 立即支付*/
	public static final By CP_TEXTVIEW_PAYNOW = By.name("立即支付");
	/** 去付�? */
	public static final By CP_TEXTVIEW_PAYMENT = By.name("去付�?");
	/** 在线问诊-确定 */
	public static final By CP_TEXTVIEW_CONFIRM = By.name("确定");
	/** 支付宝支�? */
	public static final By CP_TEXTVIEW_ALIPAY = By.name("支付宝支�?");
	/** 微信支付 */
	public static final By CP_TEXTVIEW_WECHAT = By.name("微信支付");
	/** 确认支付 */
	public static final By CP_TEXTVIEW_CONFIRMPAYMENT = By.xpath("//android.widget.TextView[contains(@text,'确认支付')]");
}
