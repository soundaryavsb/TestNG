package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCheck {

	public static void main(String[] args) {
		System.out.println("Started");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.quit();
		System.out.println("Ended");
	}

}
