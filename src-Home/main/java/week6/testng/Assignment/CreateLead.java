package week6.testng.Assignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {

	@Test(dataProvider = "file")

	public void runCreateLead(String username, String password, String companyname,String fname,String lname) {

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();

	}
	/*
	 * @DataProvider(name="Testdata") public String[][] senddata() { String[][]
	 * data=new String[2][3]; data[0][0]="DemoSalesManager"; data[0][1]="crmsfa";
	 * data[0][2]="TestLeaf"; data[0][0]="DemoSalesManager"; data[0][1]="crmsfa";
	 * data[0][2]="Wipro"; return data; }
	 */

	@BeforeTest
	public void setdata() {
		ExcelFilename = "createlead";
	}

}
