package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004MergeLeadUsingPOM extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004MergeLeadUsingPOM";
		testDescription="Merging 2 existing lead";
		testNodes="Leads";
		category="Smoke";
		authors="Dino";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String fName, String sFname) throws InterruptedException {
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
		.clickMergeLead()
		.clickFirstMergeLeadimage()
		.enterFirstName(fName)
		.clickSearchFindLeads()
		.clickFirstSearchResult()
		.clickSecondMergeLeadimage()
		.enterFirstName(sFname)
		.clickSearchFindLeads()
		.clickFirstSearchResult()
		.clickMergeButton()
		.handleAlerts();
		
		
		
	}

}
