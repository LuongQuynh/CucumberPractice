package interactUI.pageObjects;

import commons.AbstractPage;
import interactUI.pageUIs.LoginUI;
import org.openqa.selenium.WebDriver;

public class LoginPO extends AbstractPage {
    private String username;
    private String password;


    public LoginPO(WebDriver driver,String username) {
        super(driver);
        this.username = username;
    }

    public LoginPO(WebDriver driver,String username, String password) {
        super(driver);
        this.password = password;
        this.username = username;
    }

    public void loginToGuru99(String username, String password){
//        waitToElementVisible(LoginUI.USER_NAME);
        sendkeyToElement(LoginUI.USER_NAME,username);
        sendkeyToElement(LoginUI.PASSWORD,password);
        clickToElement(LoginUI.LOGIN_BUTTON);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
