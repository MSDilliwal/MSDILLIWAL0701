package testNg_Examples_Test;

import org.testng.annotations.Test;

public class Example1_Test {

	@Test
	public void showow()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void run()
	{
		System.out.println("Hii");
		System.out.println("Good morning");
	}
	
	@Test	public void display()
	{
		System.out.println("Hey");
		String url =	System.getProperty("url");
		String browser =System.getProperty("browser");
		System.out.println("url ="+ url);
		System.out.println("browser ="+browser);
		System.out.println("Hi everyone ");
			
	}
	
}
