package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadOpenTapsCRM extends ProjectMethods{
	
	public EditLeadOpenTapsCRM() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleEditCompanyName;
	
	public EditLeadOpenTapsCRM editCompanyName(String data) {
		type(eleEditCompanyName, data);
		return this;		
	}	
	
	////input[@value=\"Update\"]
	
	@FindBy(how=How.XPATH,using="//input[@value=\"Update\"]")
	private WebElement eleUpdateLead;
	
	public ViewLeadPage clickUpdateLeadButton() {
		click(eleUpdateLead);
		return new ViewLeadPage();		
	}	
	
	
}
