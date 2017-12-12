package com.fuyoujiankang.test.entity;

import java.io.Serializable;

/**
 * @author Jone
 * @description 新增知识——实体
 */
public class KnowledgeManagementEntity implements Serializable{
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = -3865376370813760583L;

	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String passWord;

	/**
	 * 知识标题
	 */
	private String title;
	/**
	 * 标签
	 */
	private String tagName;

	/**
	 * 知识副标题
	 */
	private String subtitle;

	/**
	 * 列表图
	 */
	private String listImage;

	/**
	 * 分享图
	 */
	private String shareImage;

	/**
	 * 头图
	 */
	private String headImage;
	/**
	 * 内容详情
	 */
	private String contentDetail;
	/**
	 * 图文详情
	 */
	private String graphicDetail;
	/**
	 * 分享标题
	 */
	private String shareTitle;
	/**
	 * 分享内容
	 */
	private String shareContent;
	/**
	 * 分享量
	 */
	private String shareNum;

	/**
	 * 收藏量
	 */
	private String favoriteBaseNum;
	/**
	 * 浏览量
	 */
	private String pv;

	/**
	 * 来源
	 */
	private String source;
   /**
	 * 来源链接
	 */
	private String sourceLink;
   /**
	 * 作者
	 */
	private String author;
	/**
	 * 排序
	 */
	private String sort;
	/**
	 * 初始点赞数
	 */
	private String initialNum;
	/**
	 * 推荐banner图
	 */
	private String bannerImage;

	/**
	 * 备注
	 */
	private String remark;

	public KnowledgeManagementEntity() {
		super();
	}

	public KnowledgeManagementEntity(String userName, String passWord, String title, String tagName, String subtitle, String listImage, String shareImage, String headImage, String contentDetail, String graphicDetail, String shareTitle, String shareContent, String shareNum, String favoriteBaseNum, String pv, String source, String sourceLink, String author, String sort, String initialNum, String bannerImage, String remark) {
		this.userName = userName;
		this.passWord = passWord;
		this.title = title;
		this.tagName = tagName;
		this.subtitle = subtitle;
		this.listImage = listImage;
		this.shareImage = shareImage;
		this.headImage = headImage;
		this.contentDetail = contentDetail;
		this.graphicDetail = graphicDetail;
		this.shareTitle = shareTitle;
		this.shareContent = shareContent;
		this.shareNum = shareNum;
		this.favoriteBaseNum = favoriteBaseNum;
		this.pv = pv;
		this.source = source;
		this.sourceLink = sourceLink;
		this.author = author;
		this.sort = sort;
		this.initialNum = initialNum;
		this.bannerImage = bannerImage;
		this.remark = remark;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getListImage() {
		return listImage;
	}

	public void setListImage(String listImage) {
		this.listImage = listImage;
	}

	public String getShareImage() {
		return shareImage;
	}

	public void setShareImage(String shareImage) {
		this.shareImage = shareImage;
	}

	public String getHeadImage() {
		return headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public String getContentDetail() {
		return contentDetail;
	}

	public void setContentDetail(String contentDetail) {
		this.contentDetail = contentDetail;
	}

	public String getGraphicDetail() {
		return graphicDetail;
	}

	public void setGraphicDetail(String graphicDetail) {
		this.graphicDetail = graphicDetail;
	}

	public String getShareTitle() {
		return shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getShareContent() {
		return shareContent;
	}

	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
	}

	public String getShareNum() {
		return shareNum;
	}

	public void setShareNum(String shareNum) {
		this.shareNum = shareNum;
	}

	public String getFavoriteBaseNum() {
		return favoriteBaseNum;
	}

	public void setFavoriteBaseNum(String favoriteBaseNum) {
		this.favoriteBaseNum = favoriteBaseNum;
	}

	public String getPv() {
		return pv;
	}

	public void setPv(String pv) {
		this.pv = pv;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceLink() {
		return sourceLink;
	}

	public void setSourceLink(String sourceLink) {
		this.sourceLink = sourceLink;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getInitialNum() {
		return initialNum;
	}

	public void setInitialNum(String initialNum) {
		this.initialNum = initialNum;
	}

	public String getBannerImage() {
		return bannerImage;
	}

	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
