package com.fuyoujiankang.test.entity;

import java.io.Serializable;

/**
 * @author Jone
 * @description 新增服务——实体
 */
public class ServiceManagementEntity implements Serializable{
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = -3865376370813760583L;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 服务名称
	 */
	private String serviceName;
	
	/**
	 * 密码
	 */
	private String passWord;
	/**
	 * 标签
	 */
	private String tagNames;
	/**
	 * 服务提供时间
	 */
	private String serviceProvideTime;
	/**
	 * 属性
	 */
	private String property;
	/**
	 * 规格名
	 */
	private String specificationName;
	/**
	 * 市场指导价
	 */
	private String marketGuidePrice;
	/**
	 * 缩略图
	 */
	private String thumbnail;
	/**
	 * 库存
	 */
	private String inventory;
	/**
	 * 推介价
	 */
	private String promotionPrice;

	/**
	 * 列表图
	 */
	private String listImage;
	/**
	 * 商品banner图
	 */
	private String bannerImage;
	/**
	 * 分享/消息小图
	 */
	private String smallImage;
	/**
	 * 用户购买须知
	 */
	private String buyNotes;
	/**
	 * 医生推荐要点
	 */
	private String point;
	/**
	 * 服务初始购买基数
	 */
	private String buyBaseNum;
	/**
	 * 内容详情
	 */
	private String contentDetail;
	/**
	 * 图文详情配置
	 */
	private String configuration;
	/**
	 * 分享标题
	 */
	private String shareTitle;
	/**
	 * 分享内容
	 */
	private String shareContent;
	/**
	 * 商品总数量
	 */
	private String totalQuantity;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 建议
	 */
	private String suggest;

	public ServiceManagementEntity() {
		super();
	}

	public ServiceManagementEntity(String userName, String serviceName, String passWord, String tagNames, String serviceProvideTime, String property, String specificationName, String marketGuidePrice, String thumbnail, String inventory, String promotionPrice, String listImage, String bannerImage, String smallImage, String buyNotes, String point, String buyBaseNum, String contentDetail, String configuration, String shareTitle, String shareContent, String totalQuantity, String remark, String suggest) {
		this.userName = userName;
		this.serviceName = serviceName;
		this.passWord = passWord;
		this.tagNames = tagNames;
		this.serviceProvideTime = serviceProvideTime;
		this.property = property;
		this.specificationName = specificationName;
		this.marketGuidePrice = marketGuidePrice;
		this.thumbnail = thumbnail;
		this.inventory = inventory;
		this.promotionPrice = promotionPrice;
		this.listImage = listImage;
		this.bannerImage = bannerImage;
		this.smallImage = smallImage;
		this.buyNotes = buyNotes;
		this.point = point;
		this.buyBaseNum = buyBaseNum;
		this.contentDetail = contentDetail;
		this.configuration = configuration;
		this.shareTitle = shareTitle;
		this.shareContent = shareContent;
		this.totalQuantity = totalQuantity;
		this.remark = remark;
		this.suggest = suggest;
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

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getTagNames() {
		return tagNames;
	}

	public void setTagNames(String tagNames) {
		this.tagNames = tagNames;
	}

	public String getServiceProvideTime() {
		return serviceProvideTime;
	}

	public void setServiceProvideTime(String serviceProvideTime) {
		this.serviceProvideTime = serviceProvideTime;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getSpecificationName() {
		return specificationName;
	}

	public void setSpecificationName(String specificationName) {
		this.specificationName = specificationName;
	}

	public String getMarketGuidePrice() {
		return marketGuidePrice;
	}

	public void setMarketGuidePrice(String marketGuidePrice) {
		this.marketGuidePrice = marketGuidePrice;
	}

	public String getInventory() {
		return inventory;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getListImage() {
		return listImage;
	}

	public void setListImage(String listImage) {
		this.listImage = listImage;
	}

	public String getBannerImage() {
		return bannerImage;
	}

	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}

	public String getSmallImage() {
		return smallImage;
	}

	public void setSmallImage(String smallImage) {
		this.smallImage = smallImage;
	}

	public String getBuyNotes() {
		return buyNotes;
	}

	public void setBuyNotes(String buyNotes) {
		this.buyNotes = buyNotes;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getBuyBaseNum() {
		return buyBaseNum;
	}

	public void setBuyBaseNum(String buyBaseNum) {
		this.buyBaseNum = buyBaseNum;
	}

	public String getContentDetail() {
		return contentDetail;
	}

	public void setContentDetail(String contentDetail) {
		this.contentDetail = contentDetail;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
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

	public String getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}
}
