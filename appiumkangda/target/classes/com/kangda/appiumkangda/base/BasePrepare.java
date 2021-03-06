package com.kangda.appiumkangda.base;

import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.kangda.appiumkangda.utils.AppiumUtil;
import com.kangda.appiumkangda.utils.ExcelDataProvider;
import com.kangda.appiumkangda.utils.LogConfiguration;
import com.kangda.appiumkangda.utils.PropertiesDataProvider;
import com.kangda.appiumkangda.utils.SelectDriver;

import io.appium.java_client.AppiumDriver;

/**
 * @author jone
 * @description 启动和结束测试，以及数据提供者，提供测试数据
 */
public class BasePrepare {
	//添加成员变量来获取beforeClass传入的context参数
	protected ITestContext testContext = null;
	protected AppiumDriver<WebElement> driver;
	protected AppiumUtil appiumUtil;
	public static Logger logger = Logger.getLogger(BasePrepare.class);
	protected String platformName;
	protected String appFilePath;
	protected String appPackage;
	protected int elementTimeOut;

	@BeforeClass
	public void initTest(ITestContext context) {
		// 使log4j的配置生效，以便输出日志
		LogConfiguration.initLog(this.getClass().getSimpleName());
		// 获取platform、appFilePath、appPackage的�?�，这个值是从testng的配置文件获取的
		platformName = context.getCurrentXmlTest().getParameter("platformName");
		appFilePath = context.getCurrentXmlTest().getParameter("appFilePath");
		appPackage = context.getCurrentXmlTest().getParameter("appPackage");
		elementTimeOut = Integer.valueOf(context.getCurrentXmlTest().getParameter("elementTimeOut"));
		appiumUtil = new AppiumUtil();
		// 调用SelectDriver类的selectDriver方法，生成driver对象
		driver = new SelectDriver().selectDriver(context, appiumUtil);
	}

	@AfterClass
	public void clenTest() {
		if (driver != null) {
			appiumUtil.closeApp(PropertiesDataProvider.getTestData(appFilePath, appPackage));// appium模式
			// driver.quit(); //selendroid 模式
		} else {
			Assert.fail("driver没有获得对象,�?出操作失�?");

		}
	}

	/**
	 * 测试数据提供�? - 方法
	 */
	@DataProvider(name = "testData")
	public Iterator<Object[]> dataFortestMethod() throws IOException {
		String moduleName = null; // 模块的名�?
		String caseNum = null; // 用例编号
		String className = this.getClass().getName();
		int dotIndexNum = className.indexOf("."); // 取得第一�?.的index
		int underlineIndexNum = className.indexOf("_"); // 取得第一个_的index

		if (dotIndexNum > 0) {
			/**
			 * 这里的calssName原始值大概是这样的：com.kangda.appiumkangda.testcases.login.LoginPage_001_login_Test
			 * 那么下面这段代码className.substring(33,
			 * className.lastIndexOf("."))是什么意思？substring方法参数有两�?
			 * �?个开始位置，�?个结束位置，33表示这个字符串的�?33个位置，这个位置当前字符是l,className.lastIndexOf(".")表示返回这字符串�?后一�?.�?�?
			 * 的位置，它是38，那么className.substring(33,
			 * className.lastIndexOf("."))可以转换成：className.substring(33,
			 * 38)，最终取得的值是login�? 也就是moduleName的�??
			 * 
			 * 
			 */
			moduleName = className.substring(33, className.lastIndexOf(".")); // 取到模块的名�?
		}

		if (underlineIndexNum > 0) {
			// 这个分析方法和moduleName的分析方法一�?
			caseNum = className.substring(underlineIndexNum + 1, underlineIndexNum + 4); // 取到用例编号
		}
		// 将模块名称和用例的编号传�? ExcelDataProvider ，然后进行读取excel数据
		return new ExcelDataProvider(moduleName, caseNum);
	}
}
