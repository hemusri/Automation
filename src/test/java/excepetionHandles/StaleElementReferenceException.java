package excepetionHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceException {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Online Training']"));
		
		link.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		link.click();   //StaleElementReferenceException
		
//		try
//		{
//			link.click();
//		}
//		catch (Exception e)
//		{
//			link = driver.findElement(By.xpath("//a[text()='Online Training']"));
//			
//			link.click();
//		}
		
		
	}

}
