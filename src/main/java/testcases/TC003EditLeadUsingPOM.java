package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003EditLeadUsingPOM extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003EditLeadUsingPOM";
		testDescription="Editing the company name of existing lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String cName,String uCName,String fName) throws InterruptedException {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLeadsLink()
		.clickFindLead()
		.enterFirstName(fName)
		.clickSearchFindLeads()
		.clickFirstSearchResult()
		.clickEditButton()
		.editCompanyName(uCName)
		.clickUpdateLeadButton()
		.verifyCompanyName(uCName);
		
		
		
	}

}
