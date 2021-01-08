package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import interactUI.pageObjects.CustomerRegisterSuccessfullyPO;
import interactUI.pageObjects.LoginPO;
import interactUI.pageObjects.NewCustomerPO;
import interactUI.pageUIs.CustomerRegisterSuccessfullyPageUI;
import org.openqa.selenium.WebDriver;

public class NewCustomerSteps {
    WebDriver driver;
    LoginPO login;
    NewCustomerPO customer;
    CustomerRegisterSuccessfullyPO message;

    public NewCustomerSteps() {
        driver= Hooks.openAndQuitBrowser();
        this.login = new LoginPO(driver,"mngr302795","ybemAqe");
        this.customer = new NewCustomerPO(driver);
        this.message = new CustomerRegisterSuccessfullyPO(driver);
    }

    @Given("^I login with valid username and password$")
    public void i_login_with_valid_username_and_password() throws Throwable {
        login.loginToGuru99(login.getUsername(),login.getPassword());

    }

    @Given("^I click to create new customer section$")
    public void i_click_to_create_new_customer_section() throws Throwable {
        customer.clickToNewCustomerSection();


    }

    @When("^I input \"([^\"]*)\" into customer name field with$")
    public void i_input_something_into_customer_name_field_with(String name) throws Throwable {
        customer.inputUserName(name);
    }


    @And("^I choose gender$")
    public void i_choose_gender() throws Throwable {
        customer.chooseGender();
    }

    @And("^I input \"([^\"]*)\"$")
    public void i_input_something(String dateofbirth) throws Throwable {
        customer.selectDateOfBirth(dateofbirth);

    }

    @And("^I input \"([^\"]*)\" into address field$")
    public void i_input_something_into_address_field(String address) throws Throwable {
        customer.inputAdress(address);
    }
    @And("^I input \"([^\"]*)\" into city field$")
    public void i_input_something_into_city_field(String city) throws Throwable {
        customer.inputCity(city);
    }

    @And("^I input \"([^\"]*)\" into state field$")
    public void i_input_something_into_state_field(String state) throws Throwable {
        customer.inputState(state);

    }

    @And("^I input \"([^\"]*)\" into pin field$")
    public void i_input_something_into_pin_field(String pin) throws Throwable {
        customer.inputPin(pin);

    }

    @And("^I input \"([^\"]*)\" into mobile number field$")
    public void i_input_something_into_mobile_number_field(String mobilephone) throws Throwable {
        customer.inputMobileNumber(mobilephone);

    }

    @And("^I input \"([^\"]*)\" into email field$")
    public void i_input_something_into_email_field(String email) throws Throwable {
        customer.inputEmail(email);

    }

    @And("^I input \"([^\"]*)\" into password field$")
    public void i_input_something_into_password_field(String password) throws Throwable {
        customer.inputPassword(password);

    }

    @And("^I click to submit button$")
    public void i_click_to_submit_button() throws Throwable {
        customer.clickToSubmitBtn();

    }

    @Then("^I should see message successful display$")
    public void i_should_see_message_successful_display() throws Throwable {

        message.verifyMessage();

    }


}
