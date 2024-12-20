package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Part9ParallelFashion {

	@Test
	public void OpenGoogle()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Crome opened");
		driver.get("https://www.google.co.in/");
		System.out.println("Crome closed");
		driver.quit();
	}
	@Test
	public void OpenBing()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("bing opened");
		driver.get("https://www.bing.com/");
		System.out.println("bing closed");
		driver.quit();
	}
}
