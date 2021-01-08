package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import interactUI.pageObjects.LoginPO;
import interactUI.pageObjects.NewCustomerPO;
import org.openqa.selenium.WebDriver;

public class NewCustomerSteps {
    WebDriver driver;
    LoginPO login;
    NewCustomerPO customer;

    public NewCustomerSteps() {
        driver= Hooks.openAndQuitBrowser();
        this.login = new LoginPO(driver,"mngr302795","ybemAqe");
        this.customer = new NewCustomerPO(driver);
    }

//    @Given("^I login with valid username and password$")
//    public void i_login_with_valid_username_and_password() throws Throwable {
//        login.loginToGuru99(login.getUsername(),login.getPassword());
//
//    }

//    @Given("^I click to create new customer section$")
//    public void i_click_to_create_new_customer_section() throws Throwable {
//        customer.clickToNewCustomerSection();
//    }
//    @When("^I input \"([^\"]*)\" into customer name field with $")
//    public void i_input_something_into_customer_name_field_with(String name, String strArg1) throws Throwable {
//        customer.inputUserName(name);
//    }
//
////
//
//    @Then("^I should see message successful display$")
//    public void i_should_see_message_successful_display() throws Throwable {
//    }
//
//    @And("^I choose gender$")
//    public void i_choose_gender() throws Throwable {
//        customer.chooseGender();
//
//    }

    @Given("^I login with valid username and password$")
    public void i_login_with_valid_username_and_password() throws Throwable {
        login.loginToGuru99(login.getUsername(),login.getPassword());
    }

    @Given("^I click to create new customer section$")
    public void i_click_to_create_new_customer_section() throws Throwable {
        customer.clickToNewCustomerSection();


    }

    @When("^I input \"([^\"]*)\" into customer name field with$")
    public void i_input_something_into_customer_name_field_with(String name, String strArg1) throws Throwable {
        customer.inputUserName(name);
    }

    @Then("^I should see message successful display$")
    public void i_should_see_message_successful_display() throws Throwable {

    }

    @And("^I choose gender$")
    public void i_choose_gender() throws Throwable {
        customer.chooseGender();
    }

    @And("^I input \"([^\"]*)\"$")
    public void i_input_something(String dateofbirth, String strArg1) throws Throwable {

    }

    @And("^I input \"([^\"]*)\" into address field$")
    public void i_input_something_into_address_field(String address, String strArg1) throws Throwable {

    }

    @And("^I input \"([^\"]*)\" into state field$")
    public void i_input_something_into_state_field(String state, String strArg1) throws Throwable {

    }

    @And("^I input \"([^\"]*)\" into pin field$")
    public void i_input_something_into_pin_field(String pin, String strArg1) throws Throwable {

    }

    @And("^I input \"([^\"]*)\" into mobile number field$")
    public void i_input_something_into_mobile_number_field(String mobilephone, String strArg1) throws Throwable {

    }

    @And("^I input \"([^\"]*)\" into email field$")
    public void i_input_something_into_email_field(String email, String strArg1) throws Throwable {

    }

    @And("^I input \"([^\"]*)\" into password field$")
    public void i_input_something_into_password_field(String password, String strArg1) throws Throwable {

    }

    @And("^I click to submit button$")
    public void i_click_to_submit_button() throws Throwable {

    }


}
