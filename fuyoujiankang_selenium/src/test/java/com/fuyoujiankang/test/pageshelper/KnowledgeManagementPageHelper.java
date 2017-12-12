package com.fuyoujiankang.test.pageshelper;

import com.fuyoujiankang.test.entity.KnowledgeManagementEntity;
import com.fuyoujiankang.test.pages.KnowledgeManagementPage;
import com.fuyoujiankang.test.utils.SeleniumUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

/**
 * @author Jone
 * @description 新增知识页面帮助类：提供在这个页面上做的操作的方法封装
 */
public class KnowledgeManagementPageHelper {
	// 提供本类中日志输出对象
	public static Logger logger = Logger.getLogger(KnowledgeManagementPageHelper.class);

	/**
	 * @author Jone
	 * @description 新增知识页面操作封装
	 * @param seleniumUtil
	 *            selenium api封装引用对象
	 */
	public static void addKnowledge(SeleniumUtil seleniumUtil, KnowledgeManagementEntity knowledge) {
		logger.info("开始输入新增知识信息");
		// 生成0-10000的随机数
		Random r = new Random();
		int i = r.nextInt(10001);
		// 取得当前日期+10天后的日期
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //
		// 设置日期格式
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 20); // 当前日期加20天
		String failureTime = df.format(c.getTime());
		// 点击新增知识按钮
		seleniumUtil.click(KnowledgeManagementPage.KP_BUTTON_ADD);
		// 输入知识标题
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_TITLE, knowledge.getTitle() + i);
		// 点击标签文本框
		seleniumUtil.click(KnowledgeManagementPage.KP_DIV_TAG);
		// 输入标签
		seleniumUtil.type(KnowledgeManagementPage.KP_DIV_TAG, knowledge.getTagName());
		// 点击选择联想的标签
		seleniumUtil.click(KnowledgeManagementPage.KP_LI_TAG);
		// 输入知识副标题
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_SUBTITLE, knowledge.getSubtitle());
		// 点击后台类目
		seleniumUtil.click(KnowledgeManagementPage.KP_SELECT_TYPE);
		//获取后台类目checkbox的总数
		List<WebElement> types = seleniumUtil.findElementsBy(KnowledgeManagementPage.KP_CHECKBOX_TYPE);
		// 选择后台类目
		seleniumUtil.click(types.get(types.size()-1));
		// 点击受众人群
		seleniumUtil.click(KnowledgeManagementPage.KP_SELECT_TARGETUSER);
		//获取受众人群checkbox的总数
		List<WebElement> targetusers  = seleniumUtil.findElementsBy(KnowledgeManagementPage.KP_CHECKBOX_TARGETUSER);
		// 选择受众人群
		seleniumUtil.click(targetusers.get(targetusers.size()-1));
		//点击学科
		seleniumUtil.click(KnowledgeManagementPage.KP_UL_SUBJECT);
		//获取学科checkbox的总数
		List<WebElement> subjects  = seleniumUtil.findElementsBy(KnowledgeManagementPage.KP_CHECKBOX_SUBJECT);
		// 选择学科
		seleniumUtil.click(targetusers.get(subjects.size()-1));
		// 上传列表图
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_LISTIMAGE, knowledge.getListImage());
        // 上传分享图
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_SHAREIMAGE, knowledge.getShareImage());
        // 上传头图
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_HEADIMAGE, knowledge.getHeadImage());
 		// 内容详情
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_CONTENTDETAIL, knowledge.getContentDetail());
		// 图文详情
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_GRAPHICDETAILS, knowledge.getGraphicDetail());
		// 分享标题
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_SHARETITLE, knowledge.getShareTitle());
		// 分享内容
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_SHARECONTENT, knowledge.getShareContent());
		// 分享量
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_SHAREBASENUM, knowledge.getShareNum());
		// 收藏量
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_FAVORITEBASENUM, knowledge.getFavoriteBaseNum());
        // 浏览量
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_PV, knowledge.getPv());
		// 来源
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_SOURCE, knowledge.getSource());
		// 来源链接
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_SOURCELINK, knowledge.getSourceLink());
		// 作者
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_SOURCEAUTHOR, knowledge.getAuthor());
		// 排序
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_SORT, knowledge.getSort());
		// 点击状态
		seleniumUtil.click(KnowledgeManagementPage.KP_SELECT_STATUS);
		// 选择发布
		seleniumUtil.click(KnowledgeManagementPage.KP_LI_STATUS);
		// 是否立即发布--选择是
		seleniumUtil.click(KnowledgeManagementPage.KP_INPUT_YES);
		// 初始点赞数
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_BASENUM,knowledge.getInitialNum());
        //相关推荐
		seleniumUtil.click(KnowledgeManagementPage.KP_DIV_HEALTHHUI);
		seleniumUtil.click(KnowledgeManagementPage.KP_LI_HEALTHHUI);   //选择健康汇
		seleniumUtil.click(KnowledgeManagementPage.KP_DIV_HEALTHHUI2);
		seleniumUtil.click(KnowledgeManagementPage.KP_LI_HEALTHHUI2);
		//上传推荐banner图
		seleniumUtil.type(KnowledgeManagementPage.KP_INPUT_BANNER, knowledge.getBannerImage());
		// 输入备注
		seleniumUtil.type(KnowledgeManagementPage.KP_TEXTAREA_REMARK, knowledge.getRemark());
		//点击保存
		// seleniumUtil.click(KnowledgeManagementPage.KP_BUTTON_SAVE);
		logger.info("输入新增知识完毕");
	}
}

