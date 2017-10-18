package com.kangda.appiumkangda.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

/**
 * @author Jone
 * @description: 读取Excel数据<br>
 *               说明：<br>
 *               Excel放在Data文件夹下<br>
 *               Excel命名方式：测试类名.xlsx<br>
 *               Excel的sheet命名方式：测试方法名<br>
 *               Excel第一行为Map键值<br>
 */
public class ExcelDataProvider implements Iterator<Object[]> {
	private XSSFWorkbook xssfWorkbook = null; // 得到Excel工作簿对象
	private XSSFSheet xssfSheet = null; // 得到Excel工作表对象
	private XSSFRow xssfRow = null;
	private XSSFCell xssfCell = null;
	private int rowNum = 0;
	private int cellNum = 0;
	private int currentRowNo = 0;
	private int columnNum = 0;
	private String[] columnnName;
	private String path = null;
	private InputStream inputStream = null;
	public static Logger logger = Logger.getLogger(ExcelDataProvider.class.getName());

	/*
	 * @description 2个参数：<br> moduleName - 模块的名称 caseNum - 测试用例编号
	 */
	public ExcelDataProvider(String moduleName, String caseNum) {
		try {
			// 文件路径
			path = "data/" + moduleName + ".xlsx";
			File file = new File(path);
			inputStream = new FileInputStream(file);
			xssfWorkbook = new XSSFWorkbook(inputStream);
			xssfSheet = xssfWorkbook.getSheet(caseNum); // 根据名称读取对应的sheet
			rowNum = xssfSheet.getPhysicalNumberOfRows(); // 获得该sheet的 所有行
			xssfRow = xssfSheet.getRow(0); // 取得第一行对象
			int cells = xssfRow.getPhysicalNumberOfCells(); // 获取单元格个数
			columnNum = cells; // 单元格的个数 值 赋给 列数
			columnnName = new String[columnNum]; // 开辟列名的大小
			// 读取所有列
			for (cellNum = 0; cellNum < cells; cellNum++) {
				xssfCell = xssfRow.getCell(cellNum);
				columnnName[cellNum] = xssfCell.getStringCellValue();// 第一行的值被赋予为列名
			}
			this.currentRowNo++;
		} catch (FileNotFoundException e) {
			logger.error("没有找到指定的文件：" + "[" + path + "]");
			Assert.fail("没有找到指定的文件：" + "[" + path + "]");
		} catch (Exception e) {
			logger.error("不能读取文件： [" + path + "]", e);
			Assert.fail("不能读取文件： [" + path + "]");
		}
	}

	/** 是否还有下个内容 */
	public boolean hasNext() {
		if (this.rowNum == 0 || this.currentRowNo >= this.rowNum) {
			try {
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		} else {
			// sheet下一行内容为空判定结束
			if (xssfSheet.getRow(currentRowNo).getCell(0).equals(""))
				return false;
			return true;
		}
	}

	/** 返回内容 */
	public Object[] next() {
		xssfRow = xssfSheet.getRow(currentRowNo);
		Map<String, String> data = new HashMap<String, String>();
		for (int i = 0; i < this.columnNum; i++) {
			String temp = "";
			try {
				temp = xssfRow.getCell(i).getStringCellValue();
			} catch (ArrayIndexOutOfBoundsException ex) {
				temp = "";
			}
			data.put(this.columnnName[i], temp);
		}
		Object object[] = new Object[1];
		object[0] = data;
		this.currentRowNo++;
		return object;
	}

	public void remove() {
		throw new UnsupportedOperationException("remove unsupported.");
	}
}
