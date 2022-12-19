package com.leaftaps.ui.testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ParentClass;
import com.leaftaps.ui.pages.Loginpage;

public class TC01_CreateLead extends ParentClass {
	@BeforeTest
	public void inputdata()
	{
		datasource="dataforcreatelead";
	}
	@Test(dataProvider="file")
	public void createleadtc(String cname,String fname,String lname)
	{
		Loginpage pg=new Loginpage(driver,prop);
		pg.giveusername().givepassword().submitbutton().clickcrmsfa()
		.clickLeads().clickcreatelead().givecompanyname(cname).givefirstname(fname)
		.givelastname(lname).submitbutton1().lastviewpage();
		
		
		
	}

}
