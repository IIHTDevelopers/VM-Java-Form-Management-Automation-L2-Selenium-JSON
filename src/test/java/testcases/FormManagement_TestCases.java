

package testcases;

import java.util.Map;
import java.io.File;
import java.util.Map;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import coreUtilities.testutils.ApiHelper;
import coreUtilities.utils.FileOperations;
import pages.FormManagement_Pages;
import pages.StartupPage;
import testBase.AppTestBase;
import testdata.LocatorsFactory;

public class FormManagement_TestCases extends AppTestBase {
	
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	FormManagement_Pages RegisterPageInstance;
	String numberToBeEntered="nayaksurya50@gmail.com";
	String ExpectedErrorMessage="The phone number you're trying to verify was recently used to verify a different account.  Please try a different number.";
	LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
	
	@Parameters({"browser", "environment"})
	@BeforeClass(alwaysRun = true)
	public void initBrowser(String browser, String environment) throws Exception {
		configData = new FileOperations().readJson(config_filePath, environment);
		configData.put("url", configData.get("url").replaceAll("[\\\\]", ""));
		configData.put("browser", browser);
		
		boolean isValidUrl = new ApiHelper().isValidUrl(configData.get("url"));
		Assert.assertTrue(isValidUrl, configData.get("url")+" might be Server down at this moment. Please try after sometime.");
		initialize(configData);
		startupPage = new StartupPage(driver);
	}
	
	@Test(priority = 1, groups = {"sanity"}, description="Navigate to the URL and Validate the Home Page")
	public void DemoRegisterAutomation() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "HomePage_Title");
		Assert.assertEquals(RegisterPageInstance.validateTitleOfHomePage(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.registerNavigationMenu(driver).isDisplayed(), "switch to menu is not present in the current page, Please check manually");
	}	
	
	@Test(priority = 2, groups = {"sanity"}, description="Click SwitchTo  Alert Link. and Validate if control is navigated to new page")
	public void clickOnSwitchToAlertAndValidateTitlePage() throws Exception {
		
		softAssert = new SoftAssert();
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "alerts_Page");
		Assert.assertEquals(RegisterPageInstance.clickOnSwitchToAlertandValidateTitlePage(), expectedData.get("alertsTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.getswitchToNavigationMenu(driver).isDisplayed(), "switch to menu is not present in the current page, Please check manually");	
	}	
	
	@Test(priority = 3, groups = {"sanity"}, description="Click on button to display the alert box and Validate if alert popup is shown.")
	public void handleAlertsPopupAndValidateTheTextInsideAnAlertsPopup() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "alerts_message");
		Assert.assertEquals(RegisterPageInstance.handleAlertsPopupValidateAnAlertsPopup(), expectedData.get("alertsMessage"));
		Assert.assertTrue(LocatorsFactoryInstance.getAlertWithOkButton(driver).isDisplayed(), "switch to menu is not present in the current page, Please check manually");		
	}	
	
	@Test(priority = 4, groups = {"sanity"}, description="Click on Register menu option to navigate to Register page. and  Fill the form with data provided in excel sheet.")
	public void clickOnRegisterLinkAndFillTheForms() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "userdetails");
		Assert.assertTrue(RegisterPageInstance.clickOnRegisterLinkandFillTheForms(expectedData), "Register button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.firstNameTextboxIsPresent(driver).isDisplayed(), "First name text field is not present in the current page, Please check manually");
	}		
	
	@Test(priority = 5, groups = {"sanity"}, description="Click on the country dropdown and Select each country option one by one.")
	public void clickOnCountryDropDownAndSelectEachCountryOptionsOneByOne() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Assert.assertTrue(RegisterPageInstance.clickOnSelectCountryAndSelectEachCountry(), "Register button is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.countryDropdownIsPresent(driver).isDisplayed(), "Country dropdown menu is not present in the current page, Please check manually");
	}	
	
	@Test(priority = 6, groups = {"sanity"}, description="Click on the country dropdown and Validate if each country option is selectable from the dropdown.")
	public void clickOnCountryDropDownAndValidateEachCountryOptionsIsSelectableOneByOneFromDropdown() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "userdetails");
		Assert.assertEquals(RegisterPageInstance.selectAustraliaInCountryDrpdownAndValidate(), expectedData.get("CountryName"));
		Assert.assertTrue(LocatorsFactoryInstance.refreshButton(driver).isDisplayed(), "Country dropdown is not present in the current page, Please check manually");
	}	
	
	@Test(priority = 7, groups = {"sanity"}, description=" Check and uncheck each hobby checkbox and Validate that the checkboxes are responding correctly to user interaction, allowing selection and deselection.")
	public void checkAndUncheckEachCheckBoxAndValidateThatCheckBox() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Assert.assertTrue(RegisterPageInstance.checkUncheckCheckBoxAndValidateThatCheckBox(), "Hobbies check box is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.hockeyCheckBox(driver).isDisplayed(), "Country dropdown menu is not present in the current page, Please check manually");
	}	
	
	@Test(priority = 8, groups = {"sanity"}, description="Select each radio button option for gender and Validate that only one radio button option should be selectable at a time.")
	public void selectEachRadioOptionsForGenderValidateThatOnlyOneRadioButtonShouldBeSelect() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Assert.assertTrue(RegisterPageInstance.selectRadioButtonvalidateRadioButtonOptionIsSelectable(), "Radio buttons are  not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.maleradioButton(driver).isDisplayed(), "Country dropdown menu is not present in the current page, Please check manually");
	}	
	
	@Test(priority = 9, groups = {"sanity"}, description="Select different dates from the Date Of Birth fields")
	public void selectMonthYearDateInDropdown() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Assert.assertTrue(RegisterPageInstance.selectYearMonthDate(), "date,month and year dropdowns are  not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.selectYearDropdown(driver).isDisplayed(), "Country dropdown menu is not present in the current page, Please check manually");
	}
	
	@Test(priority = 10, groups = {"sanity"}, description="click On Register And Fill FirstNameTextbox lastNameTextbox addressInputAreabox emailAddress Textbox And submitButton")
	public void fillTheDetailsAndClickOnTheSubmitButton() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "userdetails");
		Assert.assertTrue(RegisterPageInstance.filltheDetailsAndClickOnTheSubmitButton(expectedData), "Register button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.countryDropdownIsPresent(driver).isDisplayed(), "Country dropdown menu is not present in the current page, Please check manually");
	}	


	@Test(priority = 11, groups = {"sanity"}, description="click on Interaction Navigation Menu bar, then click on selectable option, then click on Serialize tab, then click on Sakinalium - Cross Browser Testing option. after click on Sakinalium - Cross Browser Testing some text value will display . Fetch that text value")
	public void afterClickOnSakinaliumCrossBrowserTestingDisplayThatText() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Successfull_message");
		Assert.assertEquals(RegisterPageInstance.afterClickOnSakinaliumCrossBrowserTestingDisplayTheText(),expectedData.get("Message_After_ClickingSakinaliumCrossBrowserTestingOption") ,"Click On Sakinalium Cross Browser Testing option is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.messageAfterClickingSakinaliumCrossBrowserTestingOptionIsPresent(driver).isDisplayed(), "Message After Clicking on Sakinalium Cross Browser Testing Option Is not present in the current page, Please check manually");
	}
	

	@Test(priority = 12, groups = {"sanity"}, description="Go to home, then click on Sign-In button and validate the title of the Sign-In page")
	public void goTohomeThenClickOnSignInButtOnValidateTitleOfTheSignInPage() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "LoginPage_Title");
		Assert.assertEquals(RegisterPageInstance.goTohomeThenClickOnSignInButtOnValidateTitleOfTheSignInPage(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.emailTextFieldIsPresent(driver).isDisplayed(), "Email text field is not present in the current page, Please check manually");
	}	

	@Test(priority = 13, groups = {"sanity"}, description="go back to index page and click on Skip signIn button and validate the Register page title.")
	public void goBackToIndexPageclickonSkipSignInButtonAndValidateTheRegisterPageTitle() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "HomePage_Title");
		Assert.assertEquals(RegisterPageInstance.goBackToIndexPageclickonSkipSignInButtonAndValidateTheRegisterPageTitle(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.firstNameTextboxIsPresent(driver).isDisplayed(), "First name text field is not present in the current page, Please check manually");
	}	

	@Test(priority = 14, groups = {"sanity"}, description="Then fill the register form and click on Refresh button")
	public void thenFillTheRegisterFormAndClickOnRefreshButton() throws Exception {	
		RegisterPageInstance = new FormManagement_Pages(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "userdetails");
		Assert.assertTrue(RegisterPageInstance.thenFillTheRegisterFormAndClickOnRefreshButton(expectedData), "Register button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.lastNameTextboxIsPresent(driver).isDisplayed(), "first name text field is not present in the current page, Please check manually");
	}	 

	@Test(priority = 15, groups = {"sanity"}, description="Verify that clicking on refresh button its refreshing all the entered data in all the fields")
	public void VerifyThatClickingOnRefreshButtonItsRefreshingAllTheEnteredDataInAllTheFields() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData1 = new FileOperations().readJson(expectedDataFilePath, "userdetails");
//		RegisterPageInstance.fillTheForms(expectedData1);
		Assert.assertTrue(RegisterPageInstance.fillTheForms(expectedData1), "FirstName text box is not present, please check manually");
		Assert.assertTrue(RegisterPageInstance.VerifyThatClickingOnRefreshButtonItsRefreshingAllTheEnteredDataInAllTheFields(), "Any of the elememt is not empty, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.refreshButton(driver).isDisplayed(), "login button is not present in the current page, Please check manually");
	}  

	@Test(priority = 16, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Window and then click on \"Click\" and validate the title of new tab page")
	public void verifyTitleOfNewTab() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "newTab_Title");
		Assert.assertEquals(RegisterPageInstance.verifyTitleOfNewTab(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.seleniumlogoIcon(driver).isDisplayed(), "logo IconLink WebElement is not present in the current page, Please check manually");
	}

	@Test(priority = 17, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Window and then click on Open new separate window and click and validate the title of new windows page")
	public void verifyTitleOfNewWindows() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "newWindow_Title");
		Assert.assertEquals(RegisterPageInstance.verifyTitleOfNewWindows(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.seleniumlogoIcon(driver).isDisplayed(), "logo IconLink WebElement is not present in the current page, Please check manually");
	}

	@Test(priority = 18, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Window and then click on Open separate multiple window and click")
	public void verifyTitleOfMultipleWindows() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "newMultipleWindow_Title");
		Assert.assertEquals(RegisterPageInstance.verifyTitleOfMultipleWindows(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.seleniumlogoIcon(driver).isDisplayed(), "logo IconLink WebElement is not present in the current page, Please check manually");
	}

	@Test(priority = 19, groups = {"sanity"}, description="Go to Interaction clickOn Drag and Drop and click on static validate the title of the Drag and Drop page.")
	public void gotoInteractionTabclickOnDragandDropThenClickOnStaticThenValidateTitleOfThePage() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "DragAndDropPage_Title");
		Assert.assertEquals(RegisterPageInstance.gotoInteractionTabclickOnDragandDropThenClickOnStaticThenValidateTitleOfThePage(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.interactionNavigationMenu(driver).isDisplayed(), "Switch to navigate menu  is not present in the current page, Please check manually");
	}	
	@Test(priority = 20, groups = {"sanity"}, description="Select the selenium logo and perform Drag and Drop operation")
	public void selecttheSeleniumLogoAndPerformDragAndDropOperation() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Assert.assertTrue(RegisterPageInstance.selecttheSeleniumLogoAndPerformDragAndDropOperation(), "Drag and drop failed, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.seleniumDragAndDropImage(driver).isDisplayed(), "Switch to navigate menu is not present in the current page, Please check manually");
	}	

	@Test(priority = 21, groups = {"sanity"}, description="Go to Widget Tab clickOn Accordio and Select Any Groups And Fetch the Data")
	public void verifyTextofAnyToggleActionInsideOfAccordionListMenu() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "PannelMessage");
		Assert.assertTrue(RegisterPageInstance.verifyTextofAnyToggleActionInsideOfAccordionListMenu().contains(expectedData.get("PanneBodyTwoMessage")), "Error message is not matching, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.CollapsibleGroup3(driver).isDisplayed(), "CollapsibleGroup3 is not present in the current page, Please check manually");
	}

	@Test(priority = 22, groups = {"sanity"}, description="Go to Widget Tab clickOn Auto complete and verify the auto complete textbox is present or not then pass the value")
	public void verifyAutoCompleteTextBoxIsPresentOrNotAndPassThevalue() throws Exception {
		RegisterPageInstance = new FormManagement_Pages(driver);
		Map<String, String> expectedData1 = new FileOperations().readJson(expectedDataFilePath, "autoCompleteTextBox");
		Assert.assertTrue(RegisterPageInstance.verifyAutoCompleteTextBoxIsPresentOrNotAndPassThevalue(expectedData1), "Auto complet elememt is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.autoCompleteTextBox(driver).isDisplayed(), "autoCompleteTextBox is not present in the current page, Please check manually");
	}





	@AfterClass(alwaysRun = true)
	public void tearDown() {
		System.out.println("before closing the browser");
		browserTearDown();
	}
	
	@AfterMethod
	public void retryIfTestFails() throws Exception {
		startupPage.navigateToUrl(configData.get("url"));
	}
}
