package com.leaftaps.ui.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ParentClass;
import com.leaftaps.ui.pages.Loginpage;
import com.leaftaps.ui.pages.clickFindleads;

public class TC03_EditLead extends ParentClass {
	@BeforeTest
	public void inputdata()
	{
		datasource="dataforeditlead";
	}
	@Test(dataProvider="file")
	public void createleadtc(String pnumber,String newcname) throws InterruptedException
	{
		Loginpage pg=new Loginpage(driver,prop);
		pg.giveusername().givepassword().submitbutton().clickcrmsfa()
		.clickLeads();
		new clickFindleads(driver).findleads(pnumber).getfirstleadid().editlead(newcname);
		
		
		
	}

}
