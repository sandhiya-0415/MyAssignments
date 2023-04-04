package week6.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningAnnotations {
	@BeforeSuite
	public void bs()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("AfterSuite");
	}
@BeforeTest
public void bt()
{
	System.out.println("Beforetest");
}

@AfterTest
public void at()
{
	System.out.println("Aftertest");
}

@BeforeClass
public void Bc()
{
	System.out.println("BeforeClass");
}
@AfterClass
public void AC()
{
	System.out.println("AfterClass");
}
@BeforeMethod
public void BM1()
{
	System.out.println("BeforeMethod1");
}
@BeforeMethod
public void BM2()
{
	System.out.println("BeforeMethod2");
}
@Test
public void test1() {
	System.out.println("Test 1");
}
}
