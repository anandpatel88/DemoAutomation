package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Photo 

{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.naveenautomationlabs.com/");
	WebElement image=driver.findElement(By.xpath("//*[@id='Profile1']/div/a[1]/img"));
	String imageLink=image.getAttribute("src");
	System.out.println(imageLink);
	driver.get(imageLink);
}
}
