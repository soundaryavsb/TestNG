package testNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Part8Parameterization {

	@Test
	@Parameters("Name")
	public void ParameterName(String PersonName)
	{
		System.out.println("You are "+ PersonName);
	}
}
