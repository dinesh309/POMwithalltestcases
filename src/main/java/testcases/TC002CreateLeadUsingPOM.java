package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002CreateLeadUsingPOM extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002CreateLeadUsingPOM";
		testDescription="Creating a new lead using mandatory fields";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String cName,String fName,String lName) {
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
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.verifyFirstName(fName);	
		
		
	}

}
