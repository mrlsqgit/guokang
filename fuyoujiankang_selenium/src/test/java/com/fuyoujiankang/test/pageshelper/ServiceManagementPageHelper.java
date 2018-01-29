package com.fuyoujiankang.test.pageshelper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;

import com.fuyoujiankang.test.entity.ComboEntity;
import com.fuyoujiankang.test.entity.ServiceManagementEntity;
import com.fuyoujiankang.test.pages.ComboPage;
import com.fuyoujiankang.test.pages.ServiceManagementPage;
import com.fuyoujiankang.test.utils.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Jone
 * @description 新增服务页面帮助类：提供在这个页面上做的操作的方法封装
 */
public class ServiceManagementPageHelper {
	// 提供本类中日志输出对象
	public static Logger logger = Logger.getLogger(ServiceManagementPageHelper.class);

    /**
	 * @author Jone
	 * @description 新增服务页面操作封装
	 * @param seleniumUtil selenium api封装引用对象
	 */
	public static void addService(SeleniumUtil seleniumUtil, ServiceManagementEntity service){
		logger.info("开始输入新增服务信息");
		//获取项目路径
        String courseFile = seleniumUtil.getCanonicalPath();
		// 生成0-10000的随机数
		Random r = new Random();
		int i = r.nextInt(10001);
		// 取得当前日期+10天后的日期
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //
		// 设置日期格式
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 20); // 当前日期加20天
		String failureTime = df.format(c.getTime());
		// 点击新增服务按钮
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_ADD);
		// 输入测试服务名称
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_TITLE, service.getServiceName() + i);
        //点击服务地点
        seleniumUtil.click(ServiceManagementPage.SP_SELECT_SERVICELOCATION);
        //暂停1s
        seleniumUtil.implicitlyWait(1);
        //获取服务地点的集合
        List<WebElement> serviceLocations = seleniumUtil.findElementsBy(ServiceManagementPage.SP_CHECKBOX_SERVICELOCATION);
        //暂停2s
        seleniumUtil.implicitlyWait(2);
        seleniumUtil.click(serviceLocations.get(0));
		// 点击标签文本框
		seleniumUtil.click(ServiceManagementPage.SP_INPUT_TAGNAMES);
		// 输入标签
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_TAGNAMES, service.getTagNames());
		// 点击选择联想的标签
		seleniumUtil.click(ServiceManagementPage.SP_LI_TAGNAMES);
		// 点击后台类目
		seleniumUtil.click(ServiceManagementPage.SP_SELECT_TYPE);
		//获取后台类目checkbox的总数
		List<WebElement> types = seleniumUtil.findElementsBy(ServiceManagementPage.SP_CHECKBOX_TYPE);
		// 选择后台类目
		seleniumUtil.click(types.get(4));
        // 点击受众人群label
        seleniumUtil.click(ServiceManagementPage.SP_LABEL_TARGETUSER);
        //等待1s
        seleniumUtil.implicitlyWait(1);
		// 点击受众人群
		seleniumUtil.click(ServiceManagementPage.SP_SELECT_TARGETUSER);
		//暂停1s
        seleniumUtil.implicitlyWait(1);
		//获取受众人群checkbox的总数
		List<WebElement> targetusers  = seleniumUtil.findElementsBy(ServiceManagementPage.SP_CHECKBOX_TARGETUSER);
		// 选择受众人群
		seleniumUtil.click(targetusers.get(targetusers.size()-1));
        //输入服务提供时间
        seleniumUtil.type(ServiceManagementPage.SP_INPUT_SERVICEPROVIDETIME, service.getServiceProvideTime());
        // 点击学科关闭选择受众人群弹层
		seleniumUtil.click(ServiceManagementPage.SP_LABEL_SUBJECT);
		// 点击学科
		seleniumUtil.click(ServiceManagementPage.SP_SELECT_SUBJECT);
        //暂停1s
        seleniumUtil.implicitlyWait(1);
        //获取学科checkbox的总数
        List<WebElement> subjects  = seleniumUtil.findElementsBy(ServiceManagementPage.SP_CHECKBOX_SUBJECT);
        //暂停1s
        seleniumUtil.implicitlyWait(2);
        // 选择学科
        seleniumUtil.click(subjects.get(subjects.size()-1));
        //暂停1s
        seleniumUtil.implicitlyWait(1);
		//点击部门科室label,关闭学科弹层
        seleniumUtil.click(ServiceManagementPage.SP_LABEL_DEPARTMENT);
		//暂停1s
        seleniumUtil.implicitlyWait(1);
		// 选择部门一级科室
		seleniumUtil.click(ServiceManagementPage.SP_LI_DEPARTMENT1);
        //点击失效时间关闭部门科室弹层
        seleniumUtil.click(ServiceManagementPage.SP_LABEL_FAILURETIME);
		// 点击商品总数量关闭科室选择层
		seleniumUtil.click(ServiceManagementPage.SP_LABEL_GOODSNUM);
		// 是否立即发布-点击是
		seleniumUtil.click(ServiceManagementPage.SP_INPUT_YES);
		// 点击失效时间控件
		seleniumUtil.click(ServiceManagementPage.SP_INPUT_FAILURETIME1);
		// 输入失效时间
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_FAILURETIME2, failureTime);
		//滚动页面查找下一页按钮元素
        seleniumUtil.scrollFindElement(ServiceManagementPage.SP_BUTTON_NEXTSTEP);
		// 输入服务初始购买基数
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_BUYBASENUM, service.getBuyBaseNum());
		//获取列表图在本地的路径
        String listImage = courseFile + service.getListImage();
		// 上传列表图
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_LISTIMAGE, listImage);
		// 点击下一页
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_NEXTSTEP);
        //获取banner图在本地的路径
        String bannerImage = courseFile + service.getBannerImage();
		// 上传商品banner图
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_BANNERIMAGE, bannerImage);
		// 点击新增规格
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_NEWSPECIFICATION);
		// 点击新增属性
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_NEWPROPERTY);
		// 输入新增属性
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_PROPERTY, service.getProperty());
		// 点击sku配置文字使属性文本框失去焦点
		seleniumUtil.click(ServiceManagementPage.SP_LABEL_SKUCONFIGUATION);
		// 选中新增属性
		seleniumUtil.click(ServiceManagementPage.SP_CHECKBOX_PROPERTY);
		// 输入规格名
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_SPECIFICATIONNAME, service.getSpecificationName());
		// 输入市场指导价
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_MARKETGUIDEPRICE, service.getMarketGuidePrice());
        //获取缩略图在本地的路径
        String Thumbnail = courseFile + service.getThumbnail();
		// 上传缩略图
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_THUMBNAIL, Thumbnail);
	   //选择sku标签
        seleniumUtil.click(ServiceManagementPage.SP_DIV_SKUTAG);
        seleniumUtil.click(ServiceManagementPage.SP_LI_SKUTAG);
        // 输入库存
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_INVENTORY, service.getInventory());
		// 输入推介价
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_PROMOTIONPRICE, service.getPromotionPrice());
		// 输入用户购买须知
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_BUYNOTES, service.getBuyNotes());
		// 滚动查找医生推荐要点
		seleniumUtil.scrollFindElement(ServiceManagementPage.SP_TEXTAREA_POINT);
		// 输入医生推荐要点
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_POINT, service.getPoint());
		// 输入内容详情
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_CONTENTDETAIL, service.getContentDetail());
		// 输入图文详情配置
		seleniumUtil.type(ServiceManagementPage.SP_DIV_CONFIGURATION, service.getConfiguration());
		// 点击商品总数量文本框使部门科室弹层消失
		// seleniumUtil.click(ServiceManagementPage.SP_INPUT_TOTALQUANTITY);
		// 清空商品总数量默认值
		// seleniumUtil.clear(ServiceManagementPage.SP_INPUT_TOTALQUANTITY);
		// 输入商品总数量
		// seleniumUtil.type(ServiceManagementPage.SP_INPUT_TOTALQUANTITY,
		// service.getTotalQuantity());
		// 是否在首页显示点击是
		// seleniumUtil.click(ServiceManagementPage.SP_LI_HOMEPAGEYSE);
		// 输入备注
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_REMARK, service.getRemark());
		// 点击添加内容
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_ADDCONTENT);
        //获取分享/消息小图在本地项目的路径
        String smallImage = courseFile + service.getSmallImage();
		// 上传分享/消息小图
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_SMALLIMAGE, smallImage);
		// 输入分享标题
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_SHARETITLE, service.getShareTitle());
		// 输入分享内容
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_SHARECONTENT, service.getShareContent());
		// 滚动页面查找创建服务按钮
		seleniumUtil.scrollFindElement(ServiceManagementPage.SP_BUTTON_SAVE2);
        //添加指导建议
        seleniumUtil.click(ServiceManagementPage.SP_BUTTON_ADD2);
        //点击类型
        seleniumUtil.click(ServiceManagementPage.SP_DIV_TYPE2);
        //暂停1s
        seleniumUtil.implicitlyWait(1);
        //选择类型
        seleniumUtil.click(ServiceManagementPage.SP_LI_TYPE2);
        //输入建议
        seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_ADVICE,service.getSuggest());
        //点击确定
        seleniumUtil.click(ServiceManagementPage.SP_BUTTON_OK);
		// 点击创建服务
//		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_SAVE2);
		logger.info("输入新增服务完毕");
	}

	/**
	 * @author Jone
	 * @description 编辑服务页面操作封装
	 * @param seleniumUtil selenium api封装引用对象
	 */
	public static void editService(SeleniumUtil seleniumUtil, ServiceManagementEntity service) {
		logger.info("开始输入编辑服务信息");
        //获取项目路径
        String courseFile = seleniumUtil.getCanonicalPath();
		// 生成0-10000的随机数
		Random r = new Random();
		int i = r.nextInt(10001);
		// 取得当前日期+10天后的日期
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //
		// 设置日期格式
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 20); // 当前日期加20天
		String failureTime = df.format(c.getTime());
		//点击未发布服务tab
        seleniumUtil.click(ServiceManagementPage.SP_DIV_UNPUBLISHED);
        //筛选类别：服务，状态：已失效
        seleniumUtil.click(ServiceManagementPage.SP_DIV_TYPE);
        seleniumUtil.click(ServiceManagementPage.SP_LI_SERVICE);
        seleniumUtil.click(ServiceManagementPage.SP_DIV_STAUTS);
        seleniumUtil.click(ServiceManagementPage.SP_LI_INVALID);
        //点击搜索
        seleniumUtil.click(ServiceManagementPage.SP_BUTTON_SEARCH);
        //点击列表第一个 编辑
        seleniumUtil.click(ServiceManagementPage.SP_BUTTON_EDIT);
		//清除服务名称输入框内容
		seleniumUtil.clear(ServiceManagementPage.SP_INPUT_TITLE);
		// 输入测试服务名称
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_TITLE, service.getServiceName() + i);
		//点击服务地点
		seleniumUtil.click(ServiceManagementPage.SP_SELECT_SERVICELOCATION);
        //等待1s
        seleniumUtil.implicitlyWait(2);
		//获取服务地点的集合
		List<WebElement> serviceLocations = seleniumUtil.findElementsBy(ServiceManagementPage.SP_CHECKBOX_SERVICELOCATION);
		seleniumUtil.click(serviceLocations.get(serviceLocations.size()-1));
		//等待1s
		seleniumUtil.implicitlyWait(2);
        // 点击标签文本框
        seleniumUtil.click(ServiceManagementPage.SP_INPUT_TAGNAMES);
        // 输入标签
        seleniumUtil.type(ServiceManagementPage.SP_INPUT_TAGNAMES, service.getTagNames());
        // 点击选择联想的标签
        seleniumUtil.click(ServiceManagementPage.SP_LI_TAGNAMES);
		//滚动页面找到下一页按钮
        seleniumUtil.scrollFindElement(ServiceManagementPage.SP_BUTTON_NEXTSTEP);
        // 点击后台类目
        seleniumUtil.click(ServiceManagementPage.SP_SELECT_TYPE);
        //获取后台类目checkbox的总数
        List<WebElement> types = seleniumUtil.findElementsBy(ServiceManagementPage.SP_CHECKBOX_TYPE);
        //等待1s
        seleniumUtil.implicitlyWait(2);
        // 选择后台类目
        seleniumUtil.click(types.get(4));
        // 点击受众人群label
        seleniumUtil.click(ServiceManagementPage.SP_LABEL_TARGETUSER);
        //等待1s
        seleniumUtil.implicitlyWait(1);
		// 点击受众人群
		seleniumUtil.click(ServiceManagementPage.SP_SELECT_TARGETUSER);
        //等待1s
        seleniumUtil.implicitlyWait(1);
		//获取受众人群checkbox的总数
		List<WebElement> targetusers  = seleniumUtil.findElementsBy(ServiceManagementPage.SP_CHECKBOX_TARGETUSER);
		// 选择受众人群
		seleniumUtil.click(targetusers.get(targetusers.size()-1));
        // 点击学科
        seleniumUtil.click(ServiceManagementPage.SP_LABEL_SUBJECT);
        //seleniumUtil.click(ServiceManagementPage.SP_SELECT_SUBJECT);
        //等待1s
        seleniumUtil.implicitlyWait(1);
        //获取学科checkbox的总数
        //List<WebElement> subjects  = seleniumUtil.findElementsBy(ServiceManagementPage.SP_CHECKBOX_SUBJECT);
        // 选择学科
        //seleniumUtil.click(subjects.get(subjects.size()-1));
		//清空服务提供时间输入框
		seleniumUtil.clear(ServiceManagementPage.SP_INPUT_SERVICEPROVIDETIME);
		//输入服务提供时间
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_SERVICEPROVIDETIME, service.getServiceProvideTime());
		// 点击部门科室
		seleniumUtil.click(ServiceManagementPage.SP_SELECT_DEPARTMENT);
		// 选择部门一级科室
		seleniumUtil.click(ServiceManagementPage.SP_LI_DEPARTMENT1);
		// 点击商品总数量关闭科室选择层
		seleniumUtil.click(ServiceManagementPage.SP_LABEL_GOODSNUM);
		// 是否立即发布-点击是
		seleniumUtil.click(ServiceManagementPage.SP_INPUT_YES);
		// 点击失效时间控件
		seleniumUtil.click(ServiceManagementPage.SP_INPUT_FAILURETIME1);
		// 输入失效时间
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_FAILURETIME2, failureTime);
		//清空初始购买基数
        seleniumUtil.clear(ServiceManagementPage.SP_INPUT_BUYBASENUM);
		// 输入服务初始购买基数
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_BUYBASENUM, service.getBuyBaseNum());
        //获取列表图在本地的路径
        String listImage = courseFile + service.getListImage();
		// 上传列表图
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_LISTIMAGE, listImage);
		// 滚动页面找到下一页按钮
		seleniumUtil.scrollFindElement(ServiceManagementPage.SP_BUTTON_NEXTSTEP);
		// 点击下一页
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_NEXTSTEP);
        //获取banner图在本地的路径
        String bannerImage = courseFile + service.getBannerImage();
		// 上传商品banner图
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_BANNERIMAGE, bannerImage);
		// 点击新增规格
		/*seleniumUtil.click(ServiceManagementPage.SP_BUTTON_NEWSPECIFICATION);
		// 点击新增属性
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_NEWPROPERTY);
		// 输入新增属性
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_PROPERTY, service.getProperty());
		// 点击sku配置文字使属性文本框失去焦点
		seleniumUtil.click(ServiceManagementPage.SP_LABEL_SKUCONFIGUATION);
		// 选中新增属性
		seleniumUtil.click(ServiceManagementPage.SP_CHECKBOX_PROPERTY);
		// 输入规格名
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_SPECIFICATIONNAME, service.getSpecificationName());
		// 输入市场指导价
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_MARKETGUIDEPRICE, service.getMarketGuidePrice());
		//获取缩略图在本地的路径
        String Thumbnail = courseFile + service.getThumbnail();
		// 上传缩略图
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_THUMBNAIL, Thumbnail);
		// 输入库存
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_INVENTORY, service.getInventory());
		// 输入推介价
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_PROMOTIONPRICE, service.getPromotionPrice());*/
		// 输入用户购买须知
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_BUYNOTES, service.getBuyNotes());
		// 滚动查找医生推荐要点
		seleniumUtil.scrollFindElement(ServiceManagementPage.SP_TEXTAREA_POINT);
		// 输入医生推荐要点
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_POINT, service.getPoint());
		// 输入内容详情
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_CONTENTDETAIL, service.getContentDetail());
		// 输入图文详情配置
		seleniumUtil.type(ServiceManagementPage.SP_DIV_CONFIGURATION, service.getConfiguration());
		// 点击商品总数量文本框使部门科室弹层消失
		// seleniumUtil.click(ServiceManagementPage.SP_INPUT_TOTALQUANTITY);
		// 清空商品总数量默认值
		// seleniumUtil.clear(ServiceManagementPage.SP_INPUT_TOTALQUANTITY);
		// 输入商品总数量
		// seleniumUtil.type(ServiceManagementPage.SP_INPUT_TOTALQUANTITY,
		// service.getTotalQuantity());
		// 是否在首页显示点击是
		// seleniumUtil.click(ServiceManagementPage.SP_LI_HOMEPAGEYSE);
		// 输入备注
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_REMARK, service.getRemark());
		// 点击添加内容
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_ADDCONTENT);
        //获取分享/消息小图在本地项目的路径
        String smallImage = courseFile + service.getSmallImage();
		// 上传分享/消息小图
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_SMALLIMAGE, smallImage);
		// 输入分享标题
		seleniumUtil.type(ServiceManagementPage.SP_INPUT_SHARETITLE, service.getShareTitle());
		// 输入分享内容
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_SHARECONTENT, service.getShareContent());
		//添加指导建议
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_ADD2);
		//点击类型
		seleniumUtil.click(ServiceManagementPage.SP_DIV_TYPE2);
		//选择类型
		seleniumUtil.click(ServiceManagementPage.SP_LI_TYPE2);
		//输入建议
		seleniumUtil.type(ServiceManagementPage.SP_TEXTAREA_ADVICE,service.getSuggest());
		//点击确定
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_OK);
		// 点击保存
		seleniumUtil.click(ServiceManagementPage.SP_BUTTON_SAVE);
		logger.info("输入编辑服务完毕");
	}

	/**
	 * @author Jone
	 * @description 新增套餐页面操作封装
	 * @param seleniumUtil
	 *            selenium api封装引用对象
	 */
	public static void addCombo(SeleniumUtil seleniumUtil, ComboEntity combo) {
		logger.info("开始输入套餐信息");
        //获取项目路径
        String courseFile = seleniumUtil.getCanonicalPath();
		// 生成0-10000的随机数
		Random r = new Random();
		int i = r.nextInt(10001);
		// 取得当前日期+10天后的日期
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 设置日期格式
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 20); // 当前日期加20天
		String failureTime = df.format(c.getTime());
		// 点击新增套餐按钮
		seleniumUtil.click(ComboPage.CP_BUTTON_ADD);
		// 输入套餐名称
		seleniumUtil.type(ComboPage.CP_INPUT_TITLE, combo.getTitle() + i);
		// 输入套餐副标题
		seleniumUtil.type(ComboPage.CP_INPUT_SUBTITLE, combo.getSubTitle());
		// 点击后台类目
		seleniumUtil.click(ComboPage.CP_SELECT_TYPE);
		// 选择后台类目
		seleniumUtil.click(ComboPage.CP_CHECKBOX_TYPE);
		// 点击学科
		seleniumUtil.click(ComboPage.CP_SELECT_SUBJECT);
		// 选择学科
		seleniumUtil.click(ComboPage.CP_CHECKBOX_SUBJECT);
		// 点击受众人群
		seleniumUtil.click(ComboPage.CP_SELECT_TARGETUSER);
		// 选择受众人群
		seleniumUtil.click(ComboPage.CP_CHECKBOX_TARGETUSER);
		// 点击部门科室
		seleniumUtil.click(ComboPage.CP_INPUT_DEPARTMENT);
		// 选择部门科室
		seleniumUtil.click(ComboPage.CP_LI_DEPARTMENT);
		// 是否立即发布-点击是
		seleniumUtil.click(ComboPage.CP_INPUT_YES);
		// 点击失效时间控件
		seleniumUtil.click(ComboPage.CP_INPUT_FAILURETIME);
		// 输入失效时间
		seleniumUtil.type(ComboPage.CP_INPUT_FAILURETIME, failureTime);
        //获取列表图在本地项目的路径
        String listImage = courseFile + combo.getListImage();
		// 上传列表图
		seleniumUtil.type(ComboPage.CP_INPUT_LISTIMAGE, listImage);
		// 点击下一步
		seleniumUtil.click(ComboPage.CP_BUTTON_NEXTSTEP);
        //获取banner图在本地项目的路径
        String bannerImage = courseFile + combo.getBannerImage();
		// 上传商品banner图
		seleniumUtil.type(ComboPage.CP_INPUT_BANNERIMAGE, bannerImage);
		// 点击套餐优惠配置
		seleniumUtil.click(ComboPage.CP_DIV_TYPE);
		// 选择促销优惠
		seleniumUtil.click(ComboPage.CP_LI_PROMOTION);
		// 点击+添加服务
		seleniumUtil.click(ComboPage.CP_SPAN_ADDSERVICE);
		// 选择绑定的服务
		seleniumUtil.click(ComboPage.CP_INPUT_CHOOSE);
		//弹层往下滑动找到添加按钮元素
		seleniumUtil.scrollDivFindElement();
		// 点击添加
		seleniumUtil.click(ComboPage.CP_SPAN_ADD);
		// 输入套餐价
		seleniumUtil.type(ComboPage.CP_INPUT_COMBOPRICE, combo.getComboPrice());
		// 输入数量
		seleniumUtil.type(ComboPage.CP_INPUT_NUM, combo.getNum());
		// 输入用户购买须知
		seleniumUtil.type(ComboPage.CP_TEXTAREA_BUYNOTES, combo.getBuyNotes());
		// 是否可以优惠券-选择是
		seleniumUtil.click(ComboPage.CP_RADIO_YES);
		//滚动页面查找"下一步"按钮
		seleniumUtil.scrollFindElement(ComboPage.CP_SPAN_NEXTSTEP);
		// 输入图文详情配置
		seleniumUtil.type(ComboPage.CP_DIV_CONFIGURATION, combo.getConfiguration());
		// 输入备注
		seleniumUtil.type(ComboPage.CP_TEXTAREA_REMARK, combo.getRemark());
		// 点击下一步
		seleniumUtil.click(ComboPage.CP_SPAN_NEXTSTEP);
        //获取分享/消息小图在本地项目的路径
        String smallImage = courseFile + combo.getSmallImage();
		// 上传分享/消息小图
		seleniumUtil.type(ComboPage.CP_INPUT_SMALLIMAGE, smallImage);
		// 分享内容
		seleniumUtil.type(ComboPage.CP_TEXTAREA_SHARECONTENT, combo.getShareContent());
		// 点击创建套餐
		seleniumUtil.click(ComboPage.CP_BUTTON_SAVE);
		logger.info("输入套餐信息完毕");
	}
}

