package com.leaftaps.ui.cases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificmethods;
import com.leaftaps.ui.pages.LoginPage;

public class Createleadtest extends ProjectSpecificmethods {
	@BeforeTest
	public void setdata() {
		ExcelFilename="testdata";
		}
@Test(dataProvider="file")
	
	public  void runCreateLead(String companyname) {
		
		LoginPage pg=new LoginPage();
		pg.enterusername()
		.enterpassword()
		.clickLoginbutton_Positive()
		.ClickLink()
		.clickLeads()
		.Clickcreatelead()
		.entercompanyname(companyname)
		.enterfirstname()
		.enterlastname()
		.clicksubmitbutton();
		
		
}

}
