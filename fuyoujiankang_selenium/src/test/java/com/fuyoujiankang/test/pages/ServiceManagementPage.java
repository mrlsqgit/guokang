package com.fuyoujiankang.test.pages;

import org.openqa.selenium.By;

/**
 * @author Jone
 * @description 新增,编辑服务页元素定位声明
 */
public class ServiceManagementPage {
	/** 未发布服务tab */
	public static final By SP_DIV_UNPUBLISHED = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div/div/div/div/div[3]");
    /** 类别 */
    public static final By SP_DIV_TYPE = By.xpath("//*[@id=\"area\"]/div[1]/div[2]/div/div[2]/div/div/div/div");
    /** 服务 */
    public static final By SP_LI_SERVICE = By.xpath("//*[@id=\"area\"]/div[3]/div/div/div/ul/li[1]");
    /** 状态 */
    public static final By SP_DIV_STAUTS = By.xpath("//*[@id=\"area\"]/div[1]/div[3]/div/div[2]/div/div/div/div");
    /** 已失效 */
    public static final By SP_LI_INVALID = By.xpath("//*[@id=\"area\"]/div[4]/div/div/div/ul/li[1]");
    /** 搜索 */
    public static final By SP_BUTTON_SEARCH = By.xpath("//span[contains(.,'搜 索')]");
	/** 新增服务按钮 */
	public static final By SP_BUTTON_ADD = By.xpath("//span[contains(.,'新增服务')]");
	/** 列表第一个编辑服务按钮 */
	public static final By SP_BUTTON_EDIT = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td/div/a[2]/span");
	/** 下一页 */
	public static final By SP_BUTTON_NEXTSTEP = By.xpath("//span[contains(.,'下一页')]");
	/** 添加内容 */
	public static final By SP_BUTTON_ADDCONTENT = By.xpath("//span[contains(.,'添加内容')]");
	/** 创建服务 */
	public static final By SP_BUTTON_CREATESERVICE = By.xpath("//span[contains(.,'创建服务')]");
	/** 服务名称 */
	public static final By SP_INPUT_TITLE = By.id("title");
	/** 服务地点 */
	public static final By SP_SELECT_SERVICELOCATION = By.xpath("//*[@id=\"area\"]/div[1]/div[2]/div[1]/div[2]/div/span/span/ul");
	public static final By SP_CHECKBOX_SERVICELOCATION = By.className("ant-select-tree-checkbox-inner");
	/** 选择后台类目 */
	public static final By SP_SELECT_TYPE = By.xpath("//*[@id=\"area\"]/div[1]/div[1]/div[3]/div[2]/div/span/span/ul");
	public static final By SP_CHECKBOX_TYPE = By.className("ant-select-tree-checkbox");
	/** 标签 */
	public static final By SP_INPUT_TAGNAMES = By.id("tagNames");
	/** 点击选择联想标签 */
	public static final By SP_LI_TAGNAMES = By.xpath("/html/body/div[2]/div/div");
	//受众人群label
	public static final By SP_LABEL_TARGETUSER = By.xpath("//*[@id=\"area\"]/div[1]/div[1]/div[4]/div[1]/label");
	/** 受众人群 */
	public static final By SP_SELECT_TARGETUSER = By.xpath("//*[@id=\"area\"]/div[1]/div[1]/div[4]/div[2]/div/span/span/ul");
	public static final By SP_CHECKBOX_TARGETUSER = By.className("ant-select-tree-checkbox");
	/** 学科 */
	public static final By SP_LABEL_SUBJECT = By.xpath("//*[@id=\"area\"]/div[1]/div[1]/div[5]/div[1]/label");
	public static final By SP_SELECT_SUBJECT = By.xpath("//*[@id=\"area\"]/div[1]/div[1]/div[5]/div[2]/div/span/span/ul");
	public static final By SP_CHECKBOX_SUBJECT = By.className("ant-select-tree-checkbox-inner");
	/** 服务提供时间 */
	public static final By SP_INPUT_SERVICEPROVIDETIME = By.id("serviceProvideTime");
	/**部门科室label*/
	public static final By SP_LABEL_DEPARTMENT = By.xpath("//*[@id=\"area\"]/div[1]/div[1]/div[6]/div[1]/label");
	/** 部门科室 */
	public static final By SP_SELECT_DEPARTMENT = By.id("departmentId");
	/** 选择部门一级科室 */
	public static final By SP_LI_DEPARTMENT1 = By.cssSelector("body > div:nth-child(6) > div > div > div > ul > li:nth-child(1)");
	/** 失效时间 */
	public static final By SP_LABEL_FAILURETIME = By.xpath("//*[@id=\"area\"]/div[2]/div[2]/div/div[1]/label");
	/** 商品总数量label */
	public static final By SP_LABEL_GOODSNUM = By.xpath("//*[@id=\"area\"]/div[1]/div[2]/div[5]/div[1]/label");
	/** 新增规格 */
	public static final By SP_BUTTON_NEWSPECIFICATION = By.xpath("//span[contains(.,'新增规格')]");
	/** 新增属性 */
	public static final By SP_BUTTON_NEWPROPERTY = By.xpath("//span[contains(.,'新增属性')]");
	/** 属性文本框 */
	public static final By SP_INPUT_PROPERTY = By.xpath("//*[@id='root']/div/div/div/div[3]/div/div/form/div[3]/div[2]/div/div[2]/div/div/div[1]/input");
	/** SKU配置 */
	public static final By SP_LABEL_SKUCONFIGUATION = By.xpath("//label[contains(.,'SKU配置')]");
	/** 属性选择框 */
	public static final By SP_CHECKBOX_PROPERTY = By.xpath("//*[@id='root']/div/div/div/div[3]/div/div/form/div[3]/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div[1]/label/span/input");
	/** 规格名文本框 */
	public static final By SP_INPUT_SPECIFICATIONNAME = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/form/div[3]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[2]/div/input");
	/** 市场指导价 */
	public static final By SP_INPUT_MARKETGUIDEPRICE= By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/form/div[3]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[4]/div/div/div[2]/input");
	/** 缩略图 */
	public static final By SP_INPUT_THUMBNAIL= By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/form/div[3]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[5]/div/span/div[2]/span/input");
	/** sku标签 */
	public static final By SP_DIV_SKUTAG= By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/form/div[3]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[6]/div/div/div/div/div");
    public static final By SP_LI_SKUTAG= By.xpath("/html/body/div[6]/div/div/div/ul/li[1]");
	/** 库存 */
	public static final By SP_INPUT_INVENTORY= By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/form/div[3]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[7]/div/div/div[2]/input");
	/** 推介价 */
	public static final By SP_INPUT_PROMOTIONPRICE= By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/form/div[3]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[8]/div/div/div[2]/input");
	/** 列表图 */
	public static final By SP_INPUT_LISTIMAGE= By.xpath("//*[@id='majorImage']/span/div[2]/span/input");
	/** 商品banner图 */
	public static final By SP_INPUT_BANNERIMAGE= By.xpath("//*[@id='images']/span/div[2]/span/input");
	/** 分享/消息小图 */
	public static final By SP_INPUT_SMALLIMAGE= By.xpath("//*[@id='avatar']/span/div[2]/span/input");
	/** 用户购买须知*/
	public static final By SP_TEXTAREA_BUYNOTES= By.id("purchaseNote");
	/** 医生推荐要点*/
	public static final By SP_TEXTAREA_POINT= By.id("referralNote");
	/** 服务初始购买基数*/
	public static final By SP_INPUT_BUYBASENUM= By.id("buyBaseNum");
	/**内容详情*/
	public static final By SP_TEXTAREA_CONTENTDETAIL= By.id("contentDetail");
	/**图文详情配置*/
	public static final By SP_DIV_CONFIGURATION= By.id("editor-trigger");
	/**分享标题*/
	public static final By SP_INPUT_SHARETITLE= By.id("shareTitle");
	/**分享内容*/
	public static final By SP_TEXTAREA_SHARECONTENT= By.id("shareContent");
	/**是否立即发布-是*/
	public static final By SP_INPUT_YES= By.xpath("//*[@id=\"area\"]/div[2]/div[1]/div/div[2]/div/div/label[1]/span[1]/input");
	/**选择日期*/
	public static final By SP_INPUT_DATA= By.xpath("/html/body/div[3]/div/div/div/div/div[1]/div/input");
	/**部门科室*/
	public static final By SP_INPUT_DEPARTMENT= By.id("departmentId");
	/**选择孕检*/
	public static final By SP_LI_PREGNANCY = By.xpath("/html/body/div[6]/div/div/div/ul/li[1]");
	/**商品总数量*/
	public static final By SP_INPUT_TOTALQUANTITY= By.id("quantity");
	/**是否立即发布_选择是*/
	public static final By SP_LI_HOMEPAGEYSE= By.xpath("//*[@id='area']/div[2]/div[1]/div/div[2]/div/div/label[1]/span[1]/input");	
	/**点击失效时间*/
	public static final By SP_INPUT_FAILURETIME1 = By.xpath("//*[@id='area']/div[2]/div[2]/div/div[2]/div/span/div/input");
	/**失效时间*/  
	public static final By SP_INPUT_FAILURETIME2 = By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/input");
	/**备注*/ 
	public static final By SP_TEXTAREA_REMARK= By.id("remark");
	/**结算比例*/
	public static final By SP_INPUT_SETTLEMENTNUMBER = By.id("settlementNumber");
	/**结算周期*/
	public static final By SP_SELECT_SETTLEMENT= By.xpath("//*[@id='area']/div/div[2]/div/div[2]/div/div/div/div/div");
	/**选择结算周期*/
	public static final By SP_LI_SETTLEMENT= By.xpath("/html/body/div[4]/div/div/div/ul/li[2]");
	/**是否默认-否*/
	public static final By SP_INPUT_NO = By.xpath("//*[@id='area']/div/div[4]/div/div[2]/div/div/label[2]/span[1]/input");
	/**添加指导建议*/
	public static final By SP_BUTTON_ADD2 = By.xpath("//span[contains(.,' 添加')]");
    /**类型*/
    public static final By SP_DIV_TYPE2 = By.xpath("/html/body/div[7]/div/div[2]/div/div[1]/div[2]/form/div/div[1]/div/div[2]");
    public static final By SP_LI_TYPE2 = By.xpath("/html/body/div[8]/div/div/div/ul/li[1]");
    /**建议*/
    public static final By SP_TEXTAREA_ADVICE = By.id("advice");
	/**确定*/
	public static final By SP_BUTTON_OK = By.xpath("//span[contains(.,'确 定')]");
	/**保存*/
	public static final By SP_BUTTON_SAVE= By.xpath("//span[contains(.,'保 存')]");
    /**创建服务*/
    public static final By SP_BUTTON_SAVE2= By.xpath("//span[contains(.,'创建服务')]");
}
