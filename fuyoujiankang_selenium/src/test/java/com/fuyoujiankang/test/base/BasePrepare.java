package com.fuyoujiankang.test.base;

/**
 * @author Jone
 * @Description 测试开始 和 测试结束 的操作
 * */
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.fuyoujiankang.test.utils.ExcelDataProvider;
import com.fuyoujiankang.test.utils.LogConfiguration;
import com.fuyoujiankang.test.utils.SeleniumUtil;

public class BasePrepare {
	// 输出本页面日志初始化
	static Logger logger = Logger.getLogger(BasePrepare.class.getName());
	protected SeleniumUtil seleniumUtil = null;
	// 添加成员变量来获取beforeClass传入的context参数
	protected ITestContext testContext = null;
	protected String uat_hospitalLoginUrl = "";
	protected String uat_serviceManagerUrl = "";
	protected String uat_knowledgeManagerUrl = "";
	protected String pre_hospitalLoginUrl = "";
	protected String pre_serviceManagerUrl = "";
	protected int timeOut = 0;
	protected int sleepTime = 0;
	protected int waitMillisecondsForAlert = 0;
	//定义环境标识数组
	protected String[] str = {"uat","pre","online"};
	protected static String website = "";


	@BeforeClass
	/** 启动浏览器并打开测试页面 */
	public void startTest(ITestContext context) {
		LogConfiguration.initLog(this.getClass().getSimpleName());
		seleniumUtil = new SeleniumUtil();
		// 这里得到了context值
		this.testContext = context;
		// 从testng.xml文件中获取浏览器的属性值
		String browserName = context.getCurrentXmlTest().getParameter("browserName");
		timeOut = Integer.valueOf(context.getCurrentXmlTest().getParameter("timeOut"));
		sleepTime = Integer.valueOf(context.getCurrentXmlTest().getParameter("sleepTime"));
		waitMillisecondsForAlert = Integer
				.valueOf(context.getCurrentXmlTest().getParameter("waitMillisecondsForAlert"));
		/** uat url */
		// uat登录
		uat_hospitalLoginUrl = context.getCurrentXmlTest().getParameter("uat_hospitalLoginUrl");

		// uat服务套餐管理url
		uat_serviceManagerUrl = context.getCurrentXmlTest().getParameter("uat_serviceManagerUrl");
		// uat知识管理url
		uat_knowledgeManagerUrl = context.getCurrentXmlTest().getParameter("uat_knowledgeManagerUrl");

		/** pre url */
		// pre登录
		pre_hospitalLoginUrl = context.getCurrentXmlTest().getParameter("pre_hospitalLoginUrl");
		// pre服务套餐管理url
		pre_serviceManagerUrl = context.getCurrentXmlTest().getParameter("pre_serviceManagerUrl");
		try {
			// 启动浏览器launchBrowser方法可以自己看看，主要是打开浏览器，输入测试地址，并最大化窗口
			seleniumUtil.launchBrowser(browserName, context, uat_hospitalLoginUrl, timeOut);
			website = str[0];
//			seleniumUtil.launchBrowser(browserName, context, pre_hospitalLoginUrl, timeOut);
//			website = str[1];

		} catch (Exception e) {
			logger.error("浏览器不能正常工作，请检查是不是被手动关闭或者其他原因", e);
		}
		// 设置一个testng上下文属性，将driver存起来，之后可以使用context随时取到，主要是提供arrow
		// 获取driver对象使用的，因为arrow截图方法需要一个driver对象
		testContext.setAttribute("SELENIUM_DRIVER", seleniumUtil.driver);
	}

	// @AfterClass
	// /**
	// * 结束测试关闭浏览器
	// * */
	// public void endTest() {
	// if (seleniumUtil.driver != null) {
	// // 退出浏览器
	// seleniumUtil.quit();
	// } else {
	// logger.error("浏览器driver没有获得对象,退出操作失败");
	// AssertJUnit.fail("浏览器driver没有获得对象,退出操作失败");
	// }
	// }

	/**
	 * 测试数据提供者 - 方法
	 */
	@DataProvider(name = "testData")
	public Iterator<Object[]> dataFortestMethod() throws IOException {
		String moduleName = null; // 模块的名字
		String caseNum = null; // 用例编号
		String className = this.getClass().getName();
		int dotIndexNum = className.indexOf("."); // 取得第一个.的index
		int underlineIndexNum = className.indexOf("_"); // 取得第一个_的index

		if (dotIndexNum > 0) {
			moduleName = className.substring(33, className.lastIndexOf("."));
		}
		if (underlineIndexNum > 0) {  
			caseNum = className.substring(underlineIndexNum + 1, underlineIndexNum + 4); // 取到用例编号
		}
		// 将模块名称和用例的编号传给 ExcelDataProvider ，然后进行读取excel数据
		return new ExcelDataProvider(moduleName, caseNum);
	}
}