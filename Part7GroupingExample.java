package testNGPackage;

import org.testng.annotations.Test;

public class Part7GroupingExample {

	@Test(groups= {"Apple"})
	public void Apple1()
	{
	System.out.println("Apple testing 1");	
	}
	@Test(groups= {"Apple"})
	public void Apple2()
	{
	System.out.println("Apple testing 2");	
	}
	@Test(groups= {"Vivo"})
	public void Vivo1()
	{
	System.out.println("Vivo testing 1");	
	}
	@Test(groups= {"Vivo"})
	public void Vivo2()
	{
	System.out.println("Vivo testing 2");	
	}
	@Test(groups= {"Moto"})
	public void Moto1()
	{
	System.out.println("Moto testing 1");	
	}
	@Test(groups= {"Moto"})
	public void Moto2()
	{
	System.out.println("Moto testing 2");	
	}
	@Test(groups= {"Lenovo"})
	public void Lenovo1()
	{
	System.out.println("Lenovo testing 1");	
	}
	@Test(groups= {"Lenovo"})
	public void Lenovo2()
	{
	System.out.println("Lenovo testing 2");	
	}
}
