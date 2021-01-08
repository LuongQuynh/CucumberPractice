package interactUI.pageObjects;

import commons.AbstractPage;
import interactUI.pageUIs.NewCustomerUI;
import org.openqa.selenium.WebDriver;

public class NewCustomerPO extends AbstractPage {
    public NewCustomerPO(WebDriver driverLocal) {
        super(driverLocal);
    }
    public void clickToNewCustomerSection(){
        waitToElementVisible(NewCustomerUI.CREATE_NEW_CUSTOMER);
        clickToElement(NewCustomerUI.CREATE_NEW_CUSTOMER);
    }
    public void inputUserName(String username){
        waitToElementVisible(NewCustomerUI.CUSTOMER_NAME);
        sendkeyToElement(NewCustomerUI.CUSTOMER_NAME,username);
    }
    public void chooseGender(){
        checkToCheckbox(NewCustomerUI.GENDER);
    }





}
