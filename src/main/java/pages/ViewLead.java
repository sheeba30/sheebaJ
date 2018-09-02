package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	
	
	
	public EditLead ClickEdit() {
		
		WebElement eleedit = locateElement("linktext", "Edit");
		click(eleedit);
		return new EditLead();
		
	}
	
	
	

	
}









