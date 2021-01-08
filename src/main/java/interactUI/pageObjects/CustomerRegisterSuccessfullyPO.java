package interactUI.pageObjects;

import commons.AbstractPage;
import interactUI.pageUIs.CustomerRegisterSuccessfullyPageUI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomerRegisterSuccessfullyPO extends AbstractPage {

    public CustomerRegisterSuccessfullyPO(WebDriver driver) {
        super(driver);
    }
    public void verifyMessage(){
        sleepInSecond(3000);
        String message = getTextElement(CustomerRegisterSuccessfullyPageUI.MESSAGE_SUCCESSFULLY);
        Assert.assertEquals(message,"Customer Registered Successfully!!!");
    }
    public void getCustomerID(){
       String  id = getTextElement(CustomerRegisterSuccessfullyPageUI.CUSTOMER_ID);
       Assert.assertEquals(id,"41866");
    }
}
