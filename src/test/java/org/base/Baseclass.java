package org.base;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static Actions a;
	public static  Robot r;
	public static TakesScreenshot v;
	public static Alert b;
	public static Select s;
	
	public static void launchBrowser() {
		
		WebDriverManager.edgedriver().setup();
		 driver =new EdgeDriver();
		}
	
	public static void loadUrl(String url) {
	driver.get(url);
	
	}
  
	public static void maximize() {
		 driver.manage().window().maximize();
}

	public static void toTitle() {
	 String title =driver.getTitle();
	 System.out.println(title);
}
	public static void toCurrentUrl() {
	   String currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);	
}
	
	public static void fill(WebElement element,String usertext) {
	element.sendKeys(usertext);
}

	public static void toClick(WebElement element) {
  element.click();

}
	public static void toQuit() {
	driver.quit();
	
}
 
	public static void toPerformMoveToElement(WebElement element) {
  a=new Actions(driver);
a.moveToElement(element).perform();
 }

	public static void toPerformDragAndDrop(WebElement src,WebElement dest) {
	a.dragAndDrop(src, dest).perform();
	
}

	public static void toPerformDoubleClick(WebElement element) {
a.doubleClick(element).perform();
  }
 
	public static void toPerformContextClick(WebElement element) {
	a.contextClick(element).perform();

}
 
	public static void toPerformEnter() throws AWTException {
	 r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
}
 
	public static void toPerformControl() {
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_CONTROL);
}
 
	public static void toPerformSpace() {
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_SPACE);
}
 
	public static void screenShot() {
	v=(TakesScreenshot)driver;
 }

	public static void toPerformAccept() {
	b=driver.switchTo().alert();
	System.out.println(b.getText());
b.accept();
}
	public static void toPerformdismiss() {
	System.out.println(b.getText());
	b.dismiss();

}
 
	public static void toSelectedByIndex(WebElement element) {
   s=new Select(element);
  s.selectByIndex(9);

}
 
	public static void toSelectByVisibleText() {
	s.selectByVisibleText(null);

}
	public static void toSelectByValue() {
	s.selectByValue(null);
}
	public static void toGetOptions() {
	s.getOptions();	
}

   public static String excelRead(int rowNo, int cellNo) throws IOException  {
    File s=new File("C:\\Users\\ELCOT\\eclipse-workspace\\maven\\excelsheet\\Book1.xlsx");
	
		FileInputStream fin= new FileInputStream(s);
		
    Workbook book =new XSSFWorkbook(fin);
	Sheet v=	book.getSheet("sheet1");
	
		Row a=	v.getRow(rowNo);
		
		Cell b=	a.getCell(cellNo);
	
   int cellType=b.getCellType();
   String value="";
   if (cellType == 1) {
 value =b.getStringCellValue();
   }
 else if (DateUtil.isCellDateFormatted(b)) {
	
	Date d= b.getDateCellValue();
	 
	SimpleDateFormat sim=new SimpleDateFormat("MM-DD-yyyy");
 value =sim.format(d);
 
}else {
	double vv=b.getNumericCellValue();
  long n= (long) vv;
	value= String.valueOf(n);
	
}
	return value; 
   }


} 










 
   
