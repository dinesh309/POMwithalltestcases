package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
	
	public FindLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//input[@name=\"firstName\"])[3]")
	private WebElement elefirstName;
	
	public FindLeadPage enterFirstName(String Data) throws InterruptedException {
		Thread.sleep(3000);
		type(elefirstName,Data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	
	public FindLeadPage clickSearchFindLeads() throws InterruptedException {
		
		click(eleFindLeads);
		Thread.sleep(5000);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a[1])[1]")
	private WebElement eleFirstRow;
	
	public ViewLeadPage clickFirstSearchResult() throws InterruptedException  {
		Thread.sleep(5000);
		click(eleFirstRow);
		return new ViewLeadPage();		
	}

}
