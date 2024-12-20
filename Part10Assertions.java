package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Part10Assertions {

	String name="Agni";
	boolean value=false;
	
	@Test
	public void assertCheck()
	{
	Assert.assertNotEquals(name, "agni");
	Assert.assertFalse(value, "This is true");
	}
}
