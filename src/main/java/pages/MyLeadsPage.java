package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeads;
	
	public CreateLeadPage clickCreateLead() {
		
		click(eleCreateLeads);
		return new CreateLeadPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
	
	public FindLeadPage clickFindLead() throws InterruptedException {
		
		click(eleFindLeads);
		Thread.sleep(3000);
		return new FindLeadPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeads;
	
	public MergeLeadPage clickMergeLead() throws InterruptedException {
		
		click(eleMergeLeads);
		return new MergeLeadPage();		
	}
}
