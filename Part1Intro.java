package testNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Part1Intro {
	
	@BeforeTest
	public void start()
	{
		System.out.println("start the car");
	}
	@Test(priority = 0)
	public void firstRun()
	{
		System.out.println("Run the first");
	}
	@Test(priority = -1)
	public void SecondRun()
	{
		System.out.println("Run the Second");
	}
	@Test(priority = 2, enabled = false)
	public void ThirdRun()
	{
		System.out.println("Run the Third");
	}
	@Test(priority = 3)
	public void ForthRun()
	{
		System.out.println("Run the Forth");
	}
	@AfterTest
	public void end()
	{
		System.out.println("Stop the car");
	}
}
