package demoAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSearch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		Thread.sleep(10000);
		//List<WebElement> links=driver.findElements(By.xpath("//div[contains(id,'sbse')]/div/b"));
		List<WebElement> links=driver.findElements(By.tagName("div/b"));
		
		System.out.println("Number of links are:"+links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(i+"th" +"link is "+links.get(i).getText());
		}
		driver.close();

	}

}
