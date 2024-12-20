package testNGPackage;
import org.testng.annotations.Test;

public class Part4HandleDependencies {

	@Test(enabled = true)
	public void highSchool()
	{
		System.out.println("Completed high school");
	}
	@Test(dependsOnMethods = "highSchool",enabled = true)
	public void higherSecondary()
	{
		System.out.println("Completed Higher Secondary");
	}
	@Test(dependsOnMethods = "higherSecondary",enabled = true)
	public void College()
	{
		System.out.println("Eligible for college");
	}
	
}
