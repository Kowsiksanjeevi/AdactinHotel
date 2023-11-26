package org.base;

import java.io.File;  
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\CucumberMyProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
  
			break;
		case "Edge":
			System.setProperty("webdriver.edge. driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\MyProject\\chromedriver.exe");
			driver = new EdgeDriver();
		default:
			System.out.println("in valid Browser Type");
			break;
		}

	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void manager() {
	  	driver.manage().window().maximize();
	}

	public static void textSendBasedOnJS(String txtinput, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments [0].setAttribute('value','" + txtinput + "')", element);
	}

	public static void select(WebElement obj, String text) {

		Select s = new Select(obj);
		s.selectByVisibleText(text);
	}

	public static void selectby(WebElement obj, int index) {

		Select s = new Select(obj);
		s.selectByIndex(index);
	}


	public static String excelRead(int rownum, int cellnum) throws IOException {

		File file = new File("C:\\Users\\ELCOT\\Documents\\kowsik.xlsx");

		FileInputStream stream = new FileInputStream(file); // throws FileNotFoundException

		Workbook book = new XSSFWorkbook(stream); // throws IOException

		// To get Sheet from Workbook
		Sheet sheet = book.getSheet("Sheet1");

		// To get Row from Sheet
		Row row = sheet.getRow(rownum);

		// To get Cell from Row
		Cell cell = row.getCell(cellnum);

		// To find Cell Type.
		CellType cellType = cell.getCellType();
		String value = null;
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
				value = simple.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				BigDecimal valueOf = BigDecimal.valueOf(l);
				value = valueOf.toString();

			}
			break;

		default:

			break;
		}
		return value;

	}
}
