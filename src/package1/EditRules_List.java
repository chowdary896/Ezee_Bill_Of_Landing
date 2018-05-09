package package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EditRules_List {

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void Screen() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
				driver.get("http://10.13.45.100:8015/");
				EditRules_List.captureScreenShot(driver);
				//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.findElement(By.id("UserName")).sendKeys("ext.cvelakaturichowd");
				driver.findElement(By.id("Password")).sendKeys("welcome@123");
				EditRules_List.captureScreenShot(driver);
				driver.findElement(By.xpath("//*[@id=\"form0\"]//tbody/tr[11]/td[2]/input")).submit();
				Thread.sleep(1000);
				 WebElement element = driver.findElement(By.xpath("//*[@id=\"Menu\"]/li[3]/span"));
				 EditRules_List.captureScreenShot(driver);

			        Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			Thread.sleep(1000);
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"Menu\"]/li[3]/div/ul/li[1]/span"))).click().perform();
			EditRules_List.captureScreenShot(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"42245Edit\"]")).click();
			//Thread.sleep(500);
			//EditRules_List.captureScreenShot(driver);
			driver.switchTo().alert().accept();
			 WebElement element1 = driver.findElement(By.xpath("//*[@id=\"RuleName\"]"));
			 EditRules_List.captureScreenShot(driver);
			 element1.clear();
			 EditRules_List.captureScreenShot(driver);
			 element1.sendKeys("Rule133");
			 EditRules_List.captureScreenShot(driver);
			driver.findElement(By.xpath("//*[@id=\"btnFooter\"]")).click();
			//EditRules_List.captureScreenShot(driver);
			//Thread.sleep(1000);
			driver.switchTo().alert().accept();
		     driver.close();
	}
	
	
	 public static void captureScreenShot(WebDriver ldriver){
			// Take screenshot and store as a file format             
			File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
			try 
			{
			// now copy the  screenshot to desired location using copyFile method

			FileUtils.copyFile(src, new File("C:/Automation/EditRules_List/"+System.currentTimeMillis()+".png")); 
			}
		  
		
			catch (IOException e)

			{
			System.out.println(e.getMessage());
			}
		  }
	
}
