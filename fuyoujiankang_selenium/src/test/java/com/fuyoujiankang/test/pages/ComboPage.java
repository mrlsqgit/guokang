package com.fuyoujiankang.test.pages;

import org.openqa.selenium.By;

/**
 * @author Jone
 * @description 新增套餐页元素定位声明
 */
public class ComboPage {
	/** 新增套餐按钮 */
	public static final By CP_BUTTON_ADD = By.xpath("//span[contains(.,'新增套餐')]");
	/** 套餐名称 */
	public static final By CP_INPUT_TITLE = By.id("title");
	/** 套餐副标题 */
	public static final By CP_INPUT_SUBTITLE = By.id("subTitle");
	/** 选择后台类目 */
	public static final By CP_SELECT_TYPE = By
			.xpath("//*[@id='combo']/div[2]/div[1]/div[3]/div/div[2]/div/span/span/ul");
	public static final By CP_CHECKBOX_TYPE = By.xpath("//*[@id='combo']/div[5]/div/div/div/ul/li[1]/span[2]/span");
	/** 学科 */
	public static final By CP_SELECT_SUBJECT = By
			.xpath("//*[@id='combo']/div[2]/div[1]/div[4]/div/div[2]/div/span/span/ul");
	public static final By CP_CHECKBOX_SUBJECT = By.xpath("//*[@id='combo']/div[6]/div/div/div/ul/li[1]/span[2]");
	/** 选择受众人群 */
	public static final By CP_SELECT_TARGETUSER = By
			.xpath("//*[@id='combo']/div[2]/div[1]/div[5]/div/div[2]/div/span/span/ul");
	public static final By CP_CHECKBOX_TARGETUSER = By
			.xpath("//*[@id='combo']/div[7]/div/div/div/ul/li[11]/span[2]");
	/** 选择部门科室 */
	public static final By CP_INPUT_DEPARTMENT = By.id("departmentId");
	public static final By CP_LI_DEPARTMENT = By.xpath("//*[@id='combo']/div[8]/div/div/div/ul[1]/li[1]");
	/** 是否立即发布-是 */
	public static final By CP_INPUT_YES = By
			.xpath("//*[@id='combo']/div[2]/div[1]/div[7]/div/div[2]/div/div/label[1]/span[1]/input");
	/** 失效时间 */
	public static final By CP_INPUT_FAILURETIME = By
			.xpath("//*[@id='combo']/div[2]/div[1]/div[8]/div/div[2]/div/span/div/input");
	/** 列表图 */
	public static final By CP_INPUT_LISTIMAGE = By.xpath("//*[@id='majorImage']/span/div[2]/span/input");
	/** 下一步 */
	public static final By CP_BUTTON_NEXTSTEP = By.xpath("//span[contains(.,'下一步')]");
	/** 下一步2 */
	public static final By CP_SPAN_NEXTSTEP = By.xpath("//*[@id='combo']/div[3]/div[8]/button[2]/span");
	/** 商品banner图 */
	public static final By CP_INPUT_BANNERIMAGE = By.xpath("//*[@id='images']/span/div[2]/span/input");
	/** 套餐优惠配置 */
	public static final By CP_DIV_TYPE = By.xpath("//*[@id='combo']/div[3]/div[2]/div[2]/div/div/div/div");
	/** 选择促销优惠 */
	public static final By CP_LI_PROMOTION = By.xpath("//li[contains(.,'促销优惠')]");
	/** +添加服务 */
	public static final By CP_SPAN_ADDSERVICE = By.xpath("//span[contains(.,'+添加服务')]");
	/** 选择绑定服务 */
	public static final By CP_INPUT_CHOOSE = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[2]/div/label/span[1]");
	/** 添加 */
	public static final By CP_SPAN_ADD = By.xpath("//span[contains(.,'添 加')]");
	/** 套餐价 */
	public static final By CP_INPUT_COMBOPRICE = By
			.xpath("//*[@id='combo']/div[3]/div[4]/div[2]/div/div/div/div/div/table/tbody/tr/td[4]/div/div[2]/input");
	/** 数量 */
	public static final By CP_INPUT_NUM = By
			.xpath("//*[@id='combo']/div[3]/div[4]/div[2]/div/div/div/div/div/table/tbody/tr/td[5]/div/div[2]/input");
	/** 用户购买须知 */
	public static final By CP_TEXTAREA_BUYNOTES = By.id("purchaseNote");
	/** 是否可以优惠券-是 */
	public static final By CP_RADIO_YES = By
			.xpath("//*[@id='combo']/div[3]/div[5]/div[4]/div/div[2]/div/div/label[1]/span[1]/input");
	/** 图文详情配置 */
	public static final By CP_DIV_CONFIGURATION = By.id("editor-trigger2");
	/** 备注 */
	public static final By CP_TEXTAREA_REMARK = By.id("remark");
	/** 分享/消息小图 */
	public static final By CP_INPUT_SMALLIMAGE = By.xpath("//*[@id='avatar']/span/div[2]/span/input");
	/** 分享内容 */
	public static final By CP_TEXTAREA_SHARECONTENT = By.id("shareContent");
	/** 创建套餐按钮 */
	public static final By CP_BUTTON_SAVE = By.xpath("//span[contains(.,'创建套餐')]");
}
