package stepDefinitions;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commons.PageGeneratorManager;
import cucumber.api.java.en.And;
//import commons.PageGeneratorManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import interactUI.pageObjects.ComponentPO;

public class ComponentPageSteps {
	private WebDriver driver;
	private ComponentPO componentPage;
	
	public static String valueRandom = "quynh" + Hooks.randomNumber() + "@gmail.com";
	
	public ComponentPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		System.out.println("Driver ID at ComponentPageSteps = " + driver.toString());
		componentPage = PageGeneratorManager.getComponentPage(driver);
	}
	
	@Given("^I open application$")
	public void i_open_application() {
		driver = new FirefoxDriver();
		driver.get("https://notifun.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("^I click to dynamic \"([^\"]*)\" button$")
	public void iClickToDynamicButton(String buttonValue) {
		componentPage.clickToDynamicButton(buttonValue);
	}
	
	@And("^I click to dynamic \"([^\"]*)\" api google button$")
	public void iClickToDynamicApiGoogleButton(String buttonValue) {
		componentPage.clickToDynamicApiGoogleButton(buttonValue);
	}
	
	
	@And("^Click to dynamic \"([^\"]*)\" page link$")
	public void clickToDynamicPageLink(String pageName) {
		componentPage.clickToDynamicPageLink(pageName);
	}
	
	@And("^Click to dynamic \"([^\"]*)\" subpage link$")
	public void clickToDynamicSubpageLink(String subpageName) {
		componentPage.clickToDynamicSubpageLink(subpageName);
	}
	
	@And("^Click to dynamic \"([^\"]*)\" first button link$")
	public void clickToDynamicFirstButtonLink(String nameButtonLink) {
		componentPage.clickToDynamicFirstButtonLink(nameButtonLink);
	}
	
	@And("^Click to dynamic \"([^\"]*)\" post button link$")
	public void clickToDynamicPostButtonLink(String nameButtonLink) {
		componentPage.clickToDynamicPostButtonLink(nameButtonLink);
	}
	
	
	@When("^I select in dynamic dropdown \"([^\"]*)\" with item \"([^\"]*)\"$")
	public void iSelectInDynamicDropdownWithItem(String dropdownID, String valueItem) {
		componentPage.selectInDynamicDropdownWithItem(dropdownID, valueItem);
	}
	
	@When("^Input to dymanic textbox \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void inputToDymanicTextboxWithValue(String nameID, String value) {
		componentPage.inputToDynamicTextbox(nameID, value);
	}
	
	@When("^Input to dymanic textbox api google \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void inputToDymanicApiGoogleTextboxWithValue(String nameID, String value) {
		componentPage.inputToDynamicApiGoogleTextbox(nameID, value);
	}
	
	@When("^I check to dynamic \"([^\"]*)\" checkbox$")
	public void iCheckToDynamicCheckbox(String checkboxValue) {
		componentPage.checkToDynamicCheckbox(checkboxValue);
	}
	
	@When("^Input to dymanic textbox \"([^\"]*)\" with value random$")
	public void inputToDymanicTextboxWithValueRandom(String nameID) {
		componentPage.inputToDynamicTextboxWithValueRandom(nameID, valueRandom);
		
	}
//	@When("^I input \"([^\"]*)\" into customer name field$")
//	public void i_input_something_into_customer_name_field(String name, String strArg1) throws Throwable {
//		customer.inputUserName(name);
//	}
	
	@When("^Input to dynamic textarea \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void inputToDynamicTextareaWithValue(String nameID, String value) {
		componentPage.inputToDynamicTextarea(nameID, value);
	}

	@When("^Click to dynamic \"([^\"]*)\" radio or checkbox$")
	public void clickToDynamicRadioOrCheckbox(String radioOrCheckboxID) {
		componentPage.clickToDynamicRadioOrCheckbox(radioOrCheckboxID);
	}

	@Then("^Get text in dynamic \"([^\"]*)\" noti$")
	public void getTextInDynamicNoti(String mesageValue) {
		componentPage.getTextInDynamicNoti(mesageValue);

	}
	
	@Then("^Verify text noti \"([^\"]*)\" is displayed in noti \"([^\"]*)\"$")
	public void verifyNotiMessageIsDisplayed(String textNoti, String mesageValue) {
		assertEquals(textNoti, componentPage.getTextInDynamicNoti(mesageValue));
		
	}
	
	@Then("^Verify dynamic text \"([^\"]*)\" is displayed in table \"([^\"]*)\"$")
	public void verifyDynamicTextInTableIsDisplayed(String textTable, String textValue ) {
		assertEquals(textTable, componentPage.getTextInDynamicTable(textValue));
		
	}
	
	@Then("^Verify \"([^\"]*)\" text is displayed$")
	public void verifyTextIsDisplayed(String textMesageValue) {
		assertTrue(componentPage.isTextMessageDisplayed(textMesageValue));
		
	}
	
	@Then("^Verify dynamic text \"([^\"]*)\" is displayed in table$")
	public void verifyTextInTableIsDisplayed(String textTableValue) {
		assertTrue(componentPage.isTextInTableDisplayed(textTableValue));
		
	}
	
	
	@And("^Get text dynamic in alert \"([^\"]*)\"$")
	public void getTextDynamicAlert(String textAlert) {
		assertEquals(textAlert, componentPage.getTextAlert());
	}
	
	@And("^Accept dynamic in alert$")
	public void acceptDynamicAlert() {
		componentPage.acceptAlert();
	}
	

}
