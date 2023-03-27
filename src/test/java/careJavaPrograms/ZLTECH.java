package careJavaPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZLTECH
{
	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\webDrivers\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement enterData = driver.findElement(By.xpath("//input[@name='q']"));
		enterData.sendKeys("ZL TECHNOLOGIES");
		enterData.submit();
		
		driver.findElement(By.xpath("//h3[text()='ZL Technologies - Wikipedia']")).click();
		System.out.println("DONE");
	}
}