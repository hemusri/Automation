package careJavaPrograms;
import java.util.Arrays;
import java.util.List;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Base 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String ProjectPath = System.getProperty("user.dir");
		System.out.println(ProjectPath);

		//	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"\\webDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.close();
	}

	public static  void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j=0;

		//		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));  //tagname.attributevalue
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for(int i=0;i<products.size();i++)
		{
			List itemsNeededList = Arrays.asList(itemsNeeded);

			//Brocolli - 1 Kg
			//Brocolli,    1 kg
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();

			//format it to get actual vegetable name
			//convert array into array list for easy search
			//  check whether name you extracted is present in arrayList or not-

			if(itemsNeededList.contains(formattedName))
			{
				j++;
				//click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		}
	}
}