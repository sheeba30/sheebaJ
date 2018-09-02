package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC002_EditLead";
		testCaseDescription ="Edit a lead";
		category = "Smoke";
		author= "sheeba";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public  void createLead(String cname, String fname)   {
		
		System.out.println(cname+" "+fname);
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.TypeFirstName(fname)
		.ClicksearchLeads()
		.clickresultname()
		.ClickEdit()
		.Typecompany(cname)
		.clickupdate();
		
		
		
	}
	

}
