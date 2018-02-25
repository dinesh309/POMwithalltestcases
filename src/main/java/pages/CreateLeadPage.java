package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecName;
	
	public CreateLeadPage enterCompanyName(String data) {
		
		type(elecName,data);
		return this;		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefName;
		
	public CreateLeadPage enterFirstName(String data) {
		
		type(elefName,data);
		return this;		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelName;
		
	public CreateLeadPage enterLastName(String data) {
		
		type(elelName,data);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubButton;
		
	public ViewLeadPage clickCreateLeadButton() {
		
		click(eleSubButton);
		return new ViewLeadPage();		
	}
	
	
}
