package org.sath;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autst1 {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\djsat\\eclipse-workspace\\sathish\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https://www.getcalley.com/page-sitemap.xml");
		WebElement firstlink = driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]/a"));
		act.click(firstlink).perform();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File ss= ts.getScreenshotAs(OutputType.FILE); 
		File scs=new File("C:\\Users\\djsat\\eclipse-workspace\\sathish\\ScreenShot\\Screenshot 01.png");
		FileUtils.copyFile(ss, scs);
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement seclink = driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]/a"));
	    act.click(seclink).perform();
	    Thread.sleep(3000);
	    
		File ss2= ts.getScreenshotAs(OutputType.FILE); 
	    File scs2=new  File("C:\\Users\\djsat\\eclipse-workspace\\sathish\\ScreenShot\\Screenshot 02.png");
		FileUtils.copyFile(ss2, scs2);
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement threelink = driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[3]/td[1]/a"));
		act.click(threelink).perform();
		Thread.sleep(3000);
		
		File ss3= ts.getScreenshotAs(OutputType.FILE); 
	    File scs3=new  File("C:\\Users\\djsat\\eclipse-workspace\\sathish\\ScreenShot\\Screenshot 03.png");
		FileUtils.copyFile(ss3, scs3);
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement forthlink = driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a"));
		act.click(forthlink).perform();
		Thread.sleep(3000);
		
		File ss4= ts.getScreenshotAs(OutputType.FILE); 
	    File scs4=new  File("C:\\Users\\djsat\\eclipse-workspace\\sathish\\ScreenShot\\Screenshot 04.png");
		FileUtils.copyFile(ss4, scs4);
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement fifthlink = driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[5]/td[1]/a"));
		act.click(fifthlink).perform();
		Thread.sleep(3000);
		
		File ss5= ts.getScreenshotAs(OutputType.FILE); 
	    File scs5=new  File("C:\\Users\\djsat\\eclipse-workspace\\sathish\\ScreenShot\\Screenshot 05.png");
		FileUtils.copyFile(ss5, scs5);
		
		driver.close();

	}

}
