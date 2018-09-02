package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {

	public EditLead Typecompany(String data) {
		WebElement elecompany = locateElement("xpath", "//input[@id='updateLeadForm_companyName']");
		type(elecompany, data);
		return this;
	}

	public EditLead clickupdate() {
		WebElement eleupdate = locateElement("name", "submitButton");
		click(eleupdate);
		return this;
	}

}
