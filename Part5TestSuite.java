package testNGPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class Part5TestSuite {

	WebDriver driver;
	long StartTime;
	long EndTime;
	@BeforeSuite
	public void OpenChrome()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Downloads\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		StartTime=System.currentTimeMillis();
	}
	@Test(priority = 0)
	public void GoogleOpen()
	{

		System.out.println("Crome opened");
		driver.get("https://www.google.co.in/");
		System.out.println("Crome closed");

	}
	@Test(priority = 1)
	public void BingOpen()
	{

		System.out.println("bing opened");
		driver.get("https://www.bing.com/");
		System.out.println("bing closed");

	}
	@Test(priority = 2)
	public void YahooOpen()
	{

		System.out.println("Yahoo opened");
		driver.get("https://www.yahoo.com/");
		System.out.println("Yahoo closed");

	}
	@AfterSuite
	public void CloseChrome()
	{
		driver.quit();	
		EndTime=System.currentTimeMillis();
		System.out.println("Chrome Time: "+(EndTime-StartTime));
	}
}
