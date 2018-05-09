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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Create_Rule {
	@Test
	public void Screen() throws InterruptedException {


	//public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				Create_Rule.captureScreenShot(driver);
				//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
				driver.get("http://10.13.45.100:8015/"); 
				Create_Rule.captureScreenShot(driver);
				//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.findElement(By.id("UserName")).sendKeys("ext.cvelakaturichowd");
				Create_Rule.captureScreenShot(driver);
				driver.findElement(By.id("Password")).sendKeys("welcome@123");
				Create_Rule.captureScreenShot(driver);
				driver.findElement(By.xpath("//*[@id=\"form0\"]//tbody/tr[11]/td[2]/input")).submit();
				Thread.sleep(1000);
				Create_Rule.captureScreenShot(driver);
				 WebElement element = driver.findElement(By.xpath("//*[@id=\"Menu\"]/li[3]/span"));

			        Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			Thread.sleep(1000);
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"Menu\"]/li[3]/div/ul/li[2]/span"))).click().perform();
			Thread.sleep(3000);
			Create_Rule.captureScreenShot(driver);
			
			 WebElement element1 = driver.findElement(By.xpath("//*[@id=\"body\"]//table/tbody/tr[1]/td[2]/span/span/span[1]"));
			 action.moveToElement(element1).click().build().perform();
			 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"Country_listbox\"]/li[16]"))).click().perform();
			 Create_Rule.captureScreenShot(driver);
			 
			 driver.findElement(By.xpath("//*[@id=\"RuleName\"]")).sendKeys("Rule9");
			 Create_Rule.captureScreenShot(driver);
			 
			 WebElement element2 = driver.findElement(By.xpath("//*[@id=\"body\"]//table/tbody/tr[1]/td[6]/span/span/span[1]"));
			 action.moveToElement(element2).click().build().perform();
			 Thread.sleep(1000);
			 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"RuleType_listbox\"]/li[4]"))).click().perform();
			 Create_Rule.captureScreenShot(driver);
			 
			// WebElement element3 = driver.findElement(By.xpath("//*[@id=\"FilterColumn_0\"]"));
			 //action.moveToElement(element3).click().build().perform();
			 //action.moveToElement(driver.findElement(By.xpath("//*[@id=\"RuleType_listbox\"]/li[4]"))).click().perform();
			 
			 Select filterField = new Select(driver.findElement(By.xpath("//*[@id=\"FilterColumn_0\"]")));
			 Thread.sleep(1000);
			 Create_Rule.captureScreenShot(driver);
			 filterField.selectByIndex(4);
			 Create_Rule.captureScreenShot(driver);
			 
			 Select filterOperation = new Select(driver.findElement(By.xpath("//*[@id=\"FilterOperator_0\"]")));
			 Thread.sleep(1000);
			 Create_Rule.captureScreenShot(driver);
			 filterOperation.selectByIndex(2);
			 Create_Rule.captureScreenShot(driver);
			 
			 driver.findElement(By.xpath("//*[@id=\"IsColumn_0\"]")).click();
			 Thread.sleep(1000);
			 Create_Rule.captureScreenShot(driver);
			 Select filterValue = new Select(driver.findElement(By.xpath("//*[@id=\"drpMatchingColumnFilterOperator_0\"]")));
			 Thread.sleep(1000);
			 filterValue.selectByIndex(1);
			 Create_Rule.captureScreenShot(driver);
			 
			 //Select filterCondition = new Select(driver.findElement(By.xpath("//*[@id=\"FilterCondition_0\"]")));
			 //filterCondition.selectByIndex(1);
			 
			 WebElement AppType = driver.findElement(By.xpath("//*[@id=\"body\"]//table/tbody/tr[4]/td[2]/span/span/span[1]"));
			 action.moveToElement(AppType).click().build().perform();
			 Thread.sleep(1000);
			 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ApplicableType_listbox\"]/li[2]"))).click().perform();
			 Create_Rule.captureScreenShot(driver);
			 
			 driver.findElement(By.xpath("//*[@id=\"ApplicableValue\"]")).sendKeys("30");
			 Thread.sleep(1000);
			 Create_Rule.captureScreenShot(driver);
			 
			 WebElement AppField = driver.findElement(By.xpath("//*[@id=\"body\"]//table/tbody/tr[2]/td[2]/span/span/span[1]"));
			 action.moveToElement(AppField).click().build().perform();
			 Thread.sleep(1000);
			 Create_Rule.captureScreenShot(driver);
			 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ApplicableField_listbox\"]/li[5]"))).click().perform();
			 Thread.sleep(1000);
			 Create_Rule.captureScreenShot(driver);
			 driver.findElement(By.xpath("//*[@id=\"btnFooter\"]")).click();
		     driver.close();
			// Create_Rule.captureScreenShot(driver);
	}
			 
			 public static void captureScreenShot(WebDriver ldriver){
					// Take screenshot and store as a file format             
					File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
					try 
					{
					// now copy the  screenshot to desired location using copyFile method

					FileUtils.copyFile(src, new File("C:/Automation/Capture_Rule/"+System.currentTimeMillis()+".png")); 
					}
				  
				
					catch (IOException e)

					{
					System.out.println(e.getMessage());
					}
				  }
	
			
			
	}


	


