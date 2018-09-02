package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{

	public FindLeads() {
		
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath = "((//input[@name='firstName'])[3])")
	WebElement eleFirstName;
	
	
	public FindLeads TypeFirstName(String data) {
	//	WebElement eleFirstName = locateElement("xpath", "((//input[@name='firstName'])[3])");
		type(eleFirstName, data);
				return this;
		
	}
	
	
	public FindLeads ClicksearchLeads() {
		
		WebElement eleearchLeads = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleearchLeads);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return this;
		
	}
	
	
	public ViewLead clickresultname() {
		
		WebElement eleresult = locateElement("xpath", "((//a[@class='linktext'])[4])");
		click(eleresult);
		return new ViewLead();
	}
	
}









