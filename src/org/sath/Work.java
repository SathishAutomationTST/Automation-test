package org.sath;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Work {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\djsat\\eclipse-workspace\\sathish\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		Robot r =new Robot();

		driver.manage().window().maximize();

		driver.get("https://demo.dealsdray.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("prexo.mis@dealsdray.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("prexo.mis@dealsdray.com");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement c = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/button\r\n"));
		act.click(c).perform();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement orders = driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-j58bcj'])[1]"));
		act.click(orders).perform();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement bulkorder = driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-vwfva9']"));
		act.click(bulkorder).perform();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
		file.sendKeys("C:\\Users\\djsat\\eclipse-workspace\\sathish\\file\\demo-data.xlsx");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement impo = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		act.click(impo).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		TakesScreenshot ts =(TakesScreenshot)driver;
		File ss= ts.getScreenshotAs(OutputType.FILE); 
		File scs=new File("C:\\Users\\djsat\\eclipse-workspace\\sathish\\ScreenShot\\Screenshot.png");
		FileUtils.copyFile(ss, scs);	
		
		driver.close();

	}
}
