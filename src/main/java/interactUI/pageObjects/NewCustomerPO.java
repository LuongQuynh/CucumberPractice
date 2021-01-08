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

    public void selectDateOfBirth(String date){
        sendkeyToElement(NewCustomerUI.DATE_OF_BIRTH,date);
    }

    public void inputAdress(String address){
        waitToElementVisible(NewCustomerUI.ADDRESS);
        sendkeyToElement(NewCustomerUI.ADDRESS,address);
       // sleepInSecond(1000);
    }
    public void inputCity(String city){
        waitToElementVisible(NewCustomerUI.CITY);
        sendkeyToElement(NewCustomerUI.CITY,city);
       // sleepInSecond(1000);
    }

    public void inputState(String state){
        waitToElementVisible(NewCustomerUI.STATE);
        sendkeyToElement(NewCustomerUI.STATE,state);
       // sleepInSecond(1000);
    }

    public void inputPin(String pin){
        waitToElementVisible(NewCustomerUI.PIN);
        sendkeyToElement(NewCustomerUI.PIN,pin);
       // sleepInSecond(1000);
    }
    public void inputMobileNumber(String mobilePhone){
        waitToElementVisible(NewCustomerUI.MOBILE_NUMBER);
        sendkeyToElement(NewCustomerUI.MOBILE_NUMBER,mobilePhone);
     //   sleepInSecond(1000);
    }
    public void inputEmail(String email){
        waitToElementVisible(NewCustomerUI.EMAIL);
        sendkeyToElement(NewCustomerUI.EMAIL,email);
      //  sleepInSecond(1000);
    }

    public void inputPassword(String password){
        waitToElementVisible(NewCustomerUI.PASSWORD);
        sendkeyToElement(NewCustomerUI.PASSWORD,password);
     //   sleepInSecond(1000);
    }
    public void clickToSubmitBtn(){
        clickToElement(NewCustomerUI.SUBMIT_BTN);
        sleepInSecond(1000);
    }






}
