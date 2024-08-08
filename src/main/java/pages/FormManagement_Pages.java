package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class FormManagement_Pages extends StartupPage 
{
	public SoftAssert softAssert;
	/*
	 * WebElemet Declaration
	 */	
	By pageTitleText = By.xpath(""); 
	By switchToNavigationMenu = By.xpath(""); 
	By alertPopup = By.xpath("");  
	By buttonToDisplayAnAlertBox = By.xpath("");  
	By registerNavigationMenu = By.xpath(""); 
	By firstNameTextbox = By.xpath("");  
	By lastNameTextbox = By.xpath("");  
	By addressInputAreabox = By.xpath(""); 
	By emailAddressTextbox = By.xpath(""); 
	By phoneNumberTextbox =By.xpath(""); 
	By maleRadioButton = By.xpath(""); 
	By feMaleRadioButton = By.xpath(""); 
	By cricketCheckBox = By.xpath(""); 
	By moviesCheckBox = By.xpath(""); 
	By hockeyCheckBox =By.xpath(""); 
	By languageDropdown = By.xpath(""); 
	By selectEnglish = By.xpath(""); 
	By selectHindi = By.xpath(""); 
	By skillsDropdown = By.xpath(""); 
	By countryDropdown = By.xpath(""); 
	By clickOnCountryDropdown = By.xpath(""); 
	By selectCountryAustralia = By.xpath(""); 
	By selectCountryBangladesh = By.xpath(""); 
	By selectCountryDenmark = By.xpath(""); 
	By selectCountryHongKong = By.xpath(""); 
	By selectCountryIndia = By.xpath(""); 
	By selectCountryJapan = By.xpath(""); 
	By selectCountryNetherlands = By.xpath(""); 
	By selectCountryNewZealand = By.xpath(""); 
	By selectCountrySouthAfrica = By.xpath(""); 
	By selectCountryUnitedStatesOfAmerica =By.xpath(""); 
	By selectYear = By.xpath(""); 
	By selectMonth = By.xpath(""); 
	By selectDate = By.xpath(""); 
	By password =By.xpath(""); 
	By confirmPassword = By.xpath(""); 
	By submitButton = By.xpath(""); 
	By refreshButton = By.xpath(""); 
	By chooseFile = By.xpath(""); 
	By uploadImageFileName =By.xpath(""); 
	
	By radioButton = By.xpath("");
	
	By window = By.xpath("");
	By clickLink = By.xpath("");
	By openNewSeparateWindowLink = By.xpath("");
	By newWindowclickLink = By.xpath("");
	By openMultipleSeparateWindowLink = By.xpath("");
	By newMultipleWindowclickLink = By.xpath("");
	By skipSignInButton = By.xpath("");
	By widgetsMenu = By.xpath("");
	By accordionList = By.xpath("");
	By accordionListToggle = By.xpath("");
	By accordionListTogglePannel2Text = By.xpath("");
	By autoCompleteLink = By.xpath("");
	By autoCompleteTextBox =By.xpath("");
	By signInButton = By.xpath("");
	By homeIcon = By.xpath("");
	
	By interactioNavigationMenu = By.xpath("");
	By dragAndDrop = By.xpath("");
	By staticButton = By.xpath("");
	By sourceLocationseleniumLogo = By.xpath("");
	By targetLocationseleniumLogo = By.xpath("");
	By seleniumWebDriver = By.xpath("");
	By seleniumDragAndDropImage = By.xpath("");
	By interactionNavigationBar = By.xpath("");
	By selectableOption = By.xpath("");
	By serializeOption = By.xpath("");
	By sakinaliumCrossBrowserTestingOption = By.xpath("");
	By messageAfterClickingSakinaliumCrossBrowserTestingOption = By.id("");




	/*
	 * Getting the page name
	 */	
	String pageName = this.getClass().getSimpleName();


	/*
	 * constructor Initialization
	 */	
	public FormManagement_Pages(WebDriver driver) 
	{
		super(driver);
	}	


	/**@Test1
	 * about this method validateTitleOfHomePage() 
	 * @param : null
	 * @description : get the title of the home page and validate
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateTitleOfHomePage() throws Exception {
		return null;
	}
	/**@Test2
	 * about this method clickOnSwitchToAlertandValidateTitlePage() 
	 * @param : null
	 * @description : click on the switch to alert and validate the title of this page
	 * @return : String
	 * @author : Yaksha
	 */
	public String  clickOnSwitchToAlertandValidateTitlePage() throws Exception {
		return null;
	}

	/**@Test3
	 * about this method handleAlertsPopupValidateAnAlertsPopup() 
	 * @param : null
	 * @description : click on the ButtonToDisplayAnAlertBox then control switch in to alert popup and get the alert message and validate
	 * @return : String
	 * @author : Yaksha
	 */

	public String handleAlertsPopupValidateAnAlertsPopup() throws Exception {
		return null;
	}

	/**@Test4
	 * about this method clickOnRegisterLinkandFillTheForms() 
	 * @param : Map<String, String>
	 * @description : Click on the register and fill data in all fields
	 * @return : boolean
	 * @author : Yaksha
	 */

	public boolean clickOnRegisterLinkandFillTheForms(Map<String, String> expectedData) throws Exception {
		return false;
	}
	/**@Test5
	 * about this method clickOnSelectCountryAndSelectEachCountry() 
	 * @param : null
	 * @description : refresh the page and click and country drop down and select all the country from the drop down
	 * @return : boolean
	 * @author : Yaksha
	 */

	public boolean clickOnSelectCountryAndSelectEachCountry() throws Exception {
		return false;
	}
	/**@Test6
	 * about this method selectEachCountryOneByOneFromCountryDrpdownAndValidate() 
	 * @param : null
	 * @description : refresh the page and click on country dropdown then select Australia and get the value and validate it 
	 * @return : String
	 * @author : Yaksha
	 */

	public String selectAustraliaInCountryDrpdownAndValidate() throws Exception {
		return null;
	}
	/**@Test7
	 * about this method checkUncheckCheckBoxAndValidateThatCheckBox() 
	 * @param : null
	 * @description : check all the check boxes and validate hockey check box is selected or not
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean checkUncheckCheckBoxAndValidateThatCheckBox() throws Exception {
		return false;
	}

	/**@Test8
	 * about this method selecteachRadioButtonvalidateEachRadioButtonoptionShouldBeSelectableAttime() 
	 * @param : null
	 * @description :  select each Radio Button validate Each Radio Button option Should Be selectable At time
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean selectRadioButtonvalidateRadioButtonOptionIsSelectable() throws Exception {
		return false;
	}

	/**@Test9
	 * about this method selectYearMonthDate() 
	 * @param : null
	 * @description : select year,month and date in the dropdown using select class
	 * @return : return true if select year dropdown is present, else false
	 * @author : Yaksha
	 */

	public boolean selectYearMonthDate() throws Exception {
		return false;
	}

	/**@Test10
	 * about this method filltheDetailsAndClickOnTheSubmitButton() 
	 * @param : Map<String, String>
	 * @description :click on the register and fill first name text field,lastNameTextbox,,emailAddressTextbox and then click on submit button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean filltheDetailsAndClickOnTheSubmitButton(Map<String, String> expectedData) throws Exception {
		return false;
	}

	/**@Test11
	 * about this method afterClickOnSakinaliumCrossBrowserTestingDisplayTheText() 
	 * @param : null
	 * @description : click on Interaction Navigation Menu bar, then click on selectable option, then click on Serialize tab, then click on Sakinalium - Cross Browser Testing option. after click on Sakinalium - Cross Browser Testing some text value will display . Fetch that text value
	 * @return : String
	 * @author : Yaksha
	 */
	public String afterClickOnSakinaliumCrossBrowserTestingDisplayTheText() throws Exception {
		return null;
	}

	/**@Test12
	 * about this method goTohomeThenClickOnSignInButtOnValidateTitleOfTheSignInPage() 
	 * @param : null
	 * @description : Click on the home and click on the sign in button then validate the title of the page 
	 * @return : String
	 * @author : yaksha
	 */
	public String goTohomeThenClickOnSignInButtOnValidateTitleOfTheSignInPage() throws Exception {
		return null;
		
	}
	
	
	/**@Test13
	 * about this method goBackToIndexPageclickonSkipSignInButtonAndValidateTheRegisterPageTitle() 
	 * @param : null
	 * @description :Going back to the index page then click on the signIn button and validate the page title.
	 * @return : String
	 * @author : yaksha
	 */
	public String goBackToIndexPageclickonSkipSignInButtonAndValidateTheRegisterPageTitle() throws Exception {
		return null;
	}

	
	/**@Test14
	 * about this method thenFillTheRegisterFormAndClickOnRefreshButton() 
	 * @param : Map<String, String>
	 * @description :Fill all the fields and click on refresh button
	 * @return : boolean
	 * @author : yaksha
	 */
		public boolean thenFillTheRegisterFormAndClickOnRefreshButton(Map<String, String> expectedData) throws Exception {
			return false;	
	}

	/**@Test15
	 * about this method fillTheForms() 
	 * @param : Map<String, String>
	 * @description : fill emailAddsPhoneNumberTextbox then enter data in passwordTextbox and click on login button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean fillTheForms(Map<String, String> expectedData) throws Exception {
		return false;
	}



	/**@Test16
	 * about this method VerifyThatClickingOnRefreshButtonItsRefreshingAllTheEnteredDataInAllTheFields() 
	 * @param : null
	 * @description : it will click on refresh button after fill the form then check each fields is empty or not
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean VerifyThatClickingOnRefreshButtonItsRefreshingAllTheEnteredDataInAllTheFields() throws Exception {
		return null;
	}

	/** @test17
	 * about this method verifyTitleOfNewTab() 
	 * @param : null
	 * @description : here control go to the new Tab and get the title  of the new tab page,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTitleOfNewTab() throws Exception {
		return null;
	}

	/** @test18
	 * about this method verifyTitleOfNewWindows() 
	 * @param : null
	 * @description : here control goes to the new window and get the title  of the new window page,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTitleOfNewWindows() throws Exception {
		return null;
	}

	/** @test19
	 * about this method verifyTitleOfMultipleWindows() 
	 * @param : null
	 * @description : here control goes to the new window and get the title  of the new window page,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTitleOfMultipleWindows() throws Exception {
		return null;
	}
	
	/**@Test20
	 * about this method gotoInteractionTabclickOnDragandDropThenClickOnStaticThenValidateTitleOfThePage() 
	 * @param :null
	 * @description :go to Interaction Tab click On Drag and Drop Then Click On Static Then Validate Title Of The Page
	 * @return : String
	 * @author : yaksha
	 */	
	
	public String gotoInteractionTabclickOnDragandDropThenClickOnStaticThenValidateTitleOfThePage() throws Exception {
		return null;
	}
	
	

	/**@Test21
	 * about this method selecttheSeleniumLogoAndPerformDragAndDropOperation() 
	 * @param :null
	 * @description :Select the selenium logo and perform drag and drop operation
	 * @return : boolean
	 * @author : yaksha
	 */	
	
	public boolean selecttheSeleniumLogoAndPerformDragAndDropOperation() throws Exception {
		return false;
	}

	/** @test22
	 * about this method verifyTextofAnyToggleActionInsideOfAccordionListMenu() 
	 * @param : null
	 * @description : here get the text from CollapsibleGroup pannnel body of Widget Menu of Accordion list ,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTextofAnyToggleActionInsideOfAccordionListMenu() throws Exception {
		return null;
	}

	/** @test23
	 * about this method verifyAutoCompleteTextBoxIsPresentOrNotAndPassThevalue() 
	 * @param : Map<String, String> expectedData
	 * @description : here get the text from CollapsibleGroup pannnel body of Widget Menu of Accordion list ,
	 * @return : true
	 * @author : Yaksha
	 */
	public boolean verifyAutoCompleteTextBoxIsPresentOrNotAndPassThevalue(Map<String, String> expectedData) throws Exception {
		return false;
	}


}
