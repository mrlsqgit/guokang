package com.fuyoujiankang.test.entity;

import java.io.Serializable;

/**
 * @author Jone
 * @description 新增套餐——实体
 */
public class ComboEntity implements Serializable{
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
	private String password;
	/**
	 * 套餐名称
	 */
	private String title;

	/**
	 * 套餐副标题
	 */
	private String subTitle;
	
	/**
	 * 套餐价
	 */
	private String comboPrice;
	
	/**
	 * 数量
	 */
	private String num;
	/**
	 * 用户购买须知
	 */
	private String buyNotes;
	
	/**
	 * 图文详情配置
	 */
	private String configuration;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 分享内容
	 */
	private String shareContent;
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

	public ComboEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComboEntity(String userName, String password, String title, String subTitle, String comboPrice, String num,
			String buyNotes, String configuration, String remark, String shareContent, String listImage,
			String bannerImage, String smallImage) {
		super();
		this.userName = userName;
		this.password = password;
		this.title = title;
		this.subTitle = subTitle;
		this.comboPrice = comboPrice;
		this.num = num;
		this.buyNotes = buyNotes;
		this.configuration = configuration;
		this.remark = remark;
		this.shareContent = shareContent;
		this.listImage = listImage;
		this.bannerImage = bannerImage;
		this.smallImage = smallImage;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getComboPrice() {
		return comboPrice;
	}
	public void setComboPrice(String string) {
		this.comboPrice = string;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getBuyNotes() {
		return buyNotes;
	}
	public void setBuyNotes(String BuyNotes) {
		this.buyNotes = BuyNotes;
	}
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getShareContent() {
		return shareContent;
	}
	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
