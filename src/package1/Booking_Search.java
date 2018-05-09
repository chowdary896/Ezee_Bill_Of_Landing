package package1;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import automationFramework.Demo;

public class Booking_Search {
	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void Screen() throws InterruptedException {

	//public static void main(String[] args) throws InterruptedException {
				
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		Booking_Search.captureScreenShot(driver);
				driver.manage().window().maximize();
				Booking_Search.captureScreenShot(driver);
				//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
				driver.get("http://10.13.45.100:8015/"); 
				Booking_Search.captureScreenShot(driver);
				String Title = driver.getTitle();
				System.out.println("Tile is: "+Title);
				//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.findElement(By.id("UserName")).sendKeys("ext.cvelakaturichowd");
				Booking_Search.captureScreenShot(driver);
				driver.findElement(By.id("Password")).sendKeys("welcome@123");
				Booking_Search.captureScreenShot(driver);
				driver.findElement(By.xpath("//*[@id=\"form0\"]//tbody/tr[11]/td[2]/input")).submit();
				Booking_Search.captureScreenShot(driver);
				//driver.findElement(By.xpath("//*[@id=\"BookNo\"]")).sendKeys("CNCL050222");
				driver.findElement(By.xpath("//*[@id=\"BookNo\"]")).sendKeys("CNCL050222");
				driver.findElement(By.xpath("//*[@id=\"body\"]//table/tbody/tr/td[3]/span/span/span[1]")).click();
				Thread.sleep(1000);
				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SIType_listbox\"]/li[2]"))).click();
				Thread.sleep(1000);
				Booking_Search.captureScreenShot(driver);
				driver.findElement(By.xpath("//*[@id=\"body\"]//table/tbody/tr/td[4]/span/span/span[1]")).click();
				Booking_Search.captureScreenShot(driver);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ProcessRole_listbox\"]/li[2]"))).click();
				Booking_Search.captureScreenShot(driver);
				driver.findElement(By.xpath("//*[@id=\"btnFind\"]")).click();
				Booking_Search.captureScreenShot(driver);
				Thread.sleep(35000);
				WebElement webElement = driver.findElement(By.xpath("//*[@id=\"NUM_ORIGINAL_BILLS\"]"));
				Booking_Search.captureScreenShot(driver);
				webElement.clear();
				Booking_Search.captureScreenShot(driver);
				webElement.sendKeys("6");
				Booking_Search.captureScreenShot(driver);
				// Down casting driver to JavascriptExecutor
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				// This element is down of the web page
				WebElement submitlink = driver.findElement(By.xpath("//*[@id=\"btnFooter\"]"));

				// This command will bring element in to view but will not align with top of browser and further scroll down is not possible.
				js.executeScript("arguments[0].scrollIntoView(true);", submitlink);
				Booking_Search.captureScreenShot(driver);
				submitlink.click();
				Booking_Search.captureScreenShot(driver);
				//driver.switchTo().alert().accept();
			     driver.close();
				//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
				//driver.findElement(By.linkText("driver.get(\"chrome://downloads/\");")).sendKeys(selectLinkOpeninNewTab);
				//driver.get("chrome://downloads/"); 
	}
				 public static void captureScreenShot(WebDriver ldriver){
						// Take screenshot and store as a file format             
						File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
						try 
						{
						// now copy the  screenshot to desired location using copyFile method

						FileUtils.copyFile(src, new File("C:/Automation/Booking_Search/"+System.currentTimeMillis()+".png")); 
						}
					  
					
						catch (IOException e)

						{
						System.out.println(e.getMessage());
						}
					  }
				
				
				
          
	
	}



