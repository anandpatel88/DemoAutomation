package seleniumEasy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadAutoIt {

	public static void main(String[] args) throws Exception
	{ 
		Runtime.getRuntime().exec("C:\\Users\\anand.mohan.patel\\Desktop\\autoIT.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
		driver.findElement(By.id("file-upload")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Nav-clothing')]")).click();
		

	}

}
