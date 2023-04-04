package com.leaftaps.ui.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ParentClass;
import com.leaftaps.ui.pages.Loginpage;
import com.leaftaps.ui.pages.MergeLead;


public class TC05_MergeLead extends ParentClass{
	@BeforeTest
	public void inputdata()
	{
		datasource="dataformergelead";
	}
	@Test(dataProvider="file")
	public void createleadtc(String lname,String lname2) throws InterruptedException
	{
		Loginpage pg=new Loginpage(driver,prop);
		pg.giveusername().givepassword().submitbutton().clickcrmsfa()
		.clickLeads();
		new MergeLead(driver).ClickMergeContacts().getfirstlead(lname).getsecondlead(lname2).verifyMergelead();
		
		
		
	}

}
