package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadSubWindow extends ProjectMethods{
	
	public FindLeadSubWindow() {
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.XPATH,using="//input[@name=\"firstName\"]")
	private WebElement elefirstName;
	
	public FindLeadSubWindow enterFirstName(String Data) throws InterruptedException {
		switchToWindow(1);
		Thread.sleep(3000);
		type(elefirstName,Data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	
	public FindLeadSubWindow clickSearchFindLeads() throws InterruptedException {
		
		click(eleFindLeads);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a[1])[1]")
	private WebElement eleFirstRow;
	
	public MergeLeadPage clickFirstSearchResult() throws InterruptedException  {
		Thread.sleep(5000);
		click(eleFirstRow);
		switchToWindow(0);
		return new MergeLeadPage();		
	}

}
