package com.fuyoujiankang.test.pages;

import org.openqa.selenium.By;

/**
 * @author Jone
 * @description 新增知识页元素定位声明
 */
public class KnowledgeManagementPage {
    /**
     * 新增知识按钮
     */
    public static final By KP_BUTTON_ADD = By.xpath("//span[contains(.,'新 增')]");
    /**
     * 知识标题
     */
    public static final By KP_INPUT_TITLE = By.id("title");
    /**
     * 标签输入框
     */
    public static final By KP_DIV_TAG = By.xpath("//*[@id='area']/div[1]/div/div[2]/div[1]/div[2]/div/div/div/div");
    /**
     * 选择标签
     */
    public static final By KP_LI_TAG = By.xpath("//*[@id='area']/div[5]/div/div/div/ul/li");
    /**
     * 知识副标题
     */
    public static final By KP_INPUT_SUBTITLE = By.id("summary");
    /**
     * 选择后台类目
     */
    public static final By KP_SELECT_TYPE = By
            .xpath("//*[@id='area']/div[1]/div/div[2]/div[2]/div[2]/div/span/span/ul");
    public static final By KP_CHECKBOX_TYPE = By.xpath("//*[@id='area']/div[5]/div/div/div/ul/li[8]/span[2]/span");
    /**
     * 学科
     */
    public static final By KP_SELECT_SUBJECT = By
            .xpath("//*[@id='area']/div[1]/div/div[3]/div[2]/div[2]/div/span/span/ul");
    public static final By KP_CHECKBOX_SUBJECT = By.xpath("//*[@id='area']/div[7]/div/div/div/ul/li[2]/span[2]/span");
    /**
     * 选择受众人群
     */
    public static final By KP_SELECT_TARGETUSER = By
            .xpath("//*[@id='area']/div[1]/div/div[3]/div[1]/div[2]/div/span/span/ul");
    public static final By KP_CHECKBOX_TARGETUSER = By
            .xpath("//*[@id='area']/div[6]/div/div/div/ul/li[11]/span[2]/span");
    /**
     * 选择学科
     */
    public static final By KP_UL_SUBJECT = By
            .xpath("//*[@id=\"area\"]/div[1]/div/div[3]/div[2]/div[2]/div/span/span/ul");
    public static final By KP_SPAN_SUBJECT = By.className("ant-select-tree-checkbox-inner");
    /**
     * 列表图
     */
    public static final By KP_INPUT_LISTIMAGE = By.xpath("//*[@id='img']/span/div[2]/span/input");
    /**
     * 分享图
     */
    public static final By KP_INPUT_SHAREIMAGE = By.xpath("//*[@id=\"sharePic\"]/span/div[2]/span/input");
    /**
     * 头图
     */
    public static final By KP_INPUT_HEADIMAGE = By.xpath("//*[@id=\"titleImg\"]/span/div[2]/span/input");
    /**
     * 内容详情
     */
    public static final By KP_INPUT_CONTENTDETAIL = By.id("contentDetail");
    /**
     * 图文详情
     */
    public static final By KP_INPUT_GRAPHICDETAILS = By.id("editor-trigger");
    /**
     * 分享标题
     */
    public static final By KP_INPUT_SHARETITLE = By.id("shareTitle");
    /**
     * 分享内容
     */
    public static final By KP_INPUT_SHARECONTENT = By.id("shareContent");
    /**
     * 分享量
     */
    public static final By KP_INPUT_SHAREBASENUM = By.id("shareBaseNum");
    /**
     * 收藏量
     */
    public static final By KP_INPUT_FAVORITEBASENUM = By.id("favoriteBaseNum");  /**
     * 浏览量
     */
    public static final By KP_INPUT_PV = By.id("browseBaseNum");
    /**
     * 来源
     */
    public static final By KP_INPUT_SOURCE = By.id("source");
    /**
     * 来源链接
     */
    public static final By KP_INPUT_SOURCELINK = By.id("sourceLink");
    /**
     * 作者
     */
    public static final By KP_INPUT_SOURCEAUTHOR = By.id("sourceAuthor");
    /**
     * 排序
     */
    public static final By KP_INPUT_SORT = By.id("sort");
    /**
     * 状态
     */
    public static final By KP_SELECT_STATUS = By.xpath("//*[@id=\"area\"]/div[3]/div[2]/div[2]/div/div/div/div");
    public static final By KP_LI_STATUS = By.xpath("//li[contains(.,'发布')]");
    /**
     * 是否立即发布-选择是
     */
    public static final By KP_INPUT_YES = By.xpath("//*[@id=\"area\"]/div[3]/div[3]/div[2]/div/div/label[1]/span[1]/input");
    /**
     * 初始点赞数
     */
    public static final By KP_INPUT_BASENUM = By.id("likeBaseNum");
    /**
     * 相关推荐 - 选择健康汇
     */
    public static final By KP_DIV_HEALTHHUI = By.xpath("//*[@id=\"area\"]/div[3]/div[6]/div[2]/div/div[2]/div/div");
    public static final By KP_LI_HEALTHHUI = By.xpath("//li[contains(.,'健康汇')]");
    public static final By KP_DIV_HEALTHHUI2 = By.xpath("//*[@id=\"area\"]/div[3]/div[6]/div[2]/div/div[3]/div/div");
    public static final By KP_LI_HEALTHHUI2 = By.xpath("/html/body/div[3]/div/div/div/ul/li[1]");
    /**
     * 推荐banner图
     */
    public static final By KP_INPUT_BANNER = By.xpath("/html/body/div[3]/div/div/div/ul/li[1]");
    /**
     * 备注
     */
    public static final By KP_TEXTAREA_REMARK = By.id("memo");
    /**
     * 保存
     */
    public static final By KP_BUTTON_SAVE = By.xpath("//*[@id=\"area\"]/div[4]/div/div/button[1]");
}
