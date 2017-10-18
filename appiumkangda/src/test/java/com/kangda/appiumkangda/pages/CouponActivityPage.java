package com.kangda.appiumkangda.pages;

import org.openqa.selenium.By;

/**
 * @author jone
 * @description 优惠活动页面元素
 */

public class CouponActivityPage {
	
	/**
	 * 优惠活动banner 左滑动一个 
	 * 右上角购物车icon 第2个imageView 
	 * 优惠活动详情页加入购物车icon 第4个imageView
	 * 返回icon 第1个imageView 最后一个购物车icon
	 * 第一个服务的logo  第4个imageView
	 */
	public static final By CP_IMAGEVIEW_COMMON = By.className("android.widget.ImageView");
	/** 加入购物车 */
	public static final By CP_TEXTVIEW_VIEWDETAILS = By.name("查看详情");
	/** 了解详情 */
	public static final By CP_TEXTVIEW_SEEDETAILS = By.name("了解详情");
}
