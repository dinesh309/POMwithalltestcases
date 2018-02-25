package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVFname;
	
	public ViewLeadPage verifyFirstName(String data) {
		verifyPartialText(eleVFname, data);
		return this;		
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditButton;
	
	public EditLeadOpenTapsCRM clickEditButton() {
		click(eleEditButton);
		return new EditLeadOpenTapsCRM();		
	}	
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleComname;
	
	public ViewLeadPage verifyCompanyName(String data) {
		verifyPartialText(eleComname, data);
		return this;		
	}	
	
}
