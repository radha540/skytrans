package org.utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static WebDriver browserlanuch(String browsername) {
		// TODO Auto-generated method stub
		
	
		if(browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;
}
	public static void  UrlLanuch(String url)
	{
		driver.get(url);
	}
	public static void  maximize()
	{
		driver.manage().window().maximize();
	}
	public static void implicitwait(long secs)
	{
		driver.manage().timeouts().implicitlyWait(secs,TimeUnit.SECONDS);
		
	}

		
	
	
	
	public static void sendkeys(WebElement e,String value)
	{
		e.sendKeys(value);
	}
	 
	
	public static void bottonclick(WebElement bottonclick)
	{
		bottonclick.click();
	}
	public static void quit()
	{
	driver.quit();
	}
	public static String currentUrl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static String title()
	{
		String title = driver.getTitle();
		return title;
	}
	public static String getAttribute(WebElement e)
	{
		String att = e.getAttribute("value");
		return att;
	}
	public static void JavascriptExecutor(WebElement e)
			{
JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()",e);

	
			}
	public static String jsGetAttribute(WebElement e) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		return ((String)js.executeScript("return arguments[0], getAttribute('value')",e));
		
		
	}
	public static boolean isSelected(WebElement e)
	{

		return e.isSelected();
		
				}
	public static boolean isEnabled(WebElement e)
	{

		return e.isEnabled();
		
				}
	public static boolean currentUrlContains(String urlContainText)
	{

		return driver.getCurrentUrl().contains(urlContainText);
		
				}
	public static String getFirstSelectedOption(WebElement e)
	{
   Select s=new Select(e);
		return s.getFirstSelectedOption().getText();
		
				}

	public static String getText(WebElement e)
	{
		String text = e.getText();
		return text;
	}
	//public static Sheet getSheet(String location,String sheetname) throws IOException 
	////{
		//File loc=new File(location);
		//FileInputStream ip=new FileInputStream(loc);
		//Workbook w = new XSSFWorkbook(ip);
		////return w.getSheet(sheetname);
	//}
	//public static void setSheet(String location,String sheetname,int rowno,int cellno,WebElement e) throws IOException, InterruptedException 
	//{
		//File loc=new File(location);
	//	FileInputStream ip=new FileInputStream(loc);
	//	Workbook w = new XSSFWorkbook(ip);
		//Sheet s = w.getSheet(sheetname);
		//s.getRow(rowno).createCell(cellno).setCellValue(jsGetAttribute(e));
		//FileOutputStream op = new FileOutputStream(loc);
		//w.write(op);
//
	//}
	
	public static void screenShot(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir"));
		FileUtils.copyFile(source,des);
	
	}
	public static void select(WebElement e,int i)
	{
        Select s=new Select(e);
		 
  	 List <WebElement> e1 = s.getOptions();
	((Select) e1).selectByIndex(i);
	
}

	public static void select1( WebElement e,int i) {
		Select  s1 = new Select(e);
	s1.selectByIndex(i);
		
	}







}
