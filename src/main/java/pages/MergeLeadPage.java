package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//table[@class=\"twoColumnForm\"]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElement eleFirstMergeLeadImage;
	
	public FindLeadSubWindow clickFirstMergeLeadimage() {
		
		click(eleFirstMergeLeadImage);
		return new FindLeadSubWindow();		
	}
	
	@FindBy(how=How.XPATH,using="//table[@class=\"twoColumnForm\"]/tbody[1]/tr[2]/td[2]/a[1]")
	private WebElement eleSecondMergeLeadImage;
	
	public FindLeadSubWindow clickSecondMergeLeadimage() {
		
		click(eleSecondMergeLeadImage);
		return new FindLeadSubWindow();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergeButton;
	
	public MergeLeadPage clickMergeButton() {
		
		click(eleMergeButton);
		return this;		
	}
	
	
	public ViewLeadPage handleAlerts() {
		acceptAlert();
		return new ViewLeadPage();		
	}
	
}
