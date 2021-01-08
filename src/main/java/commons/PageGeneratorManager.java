package commons;

import interactUI.pageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	
	public static ComponentPO getComponentPage(WebDriver driver) {
		return new ComponentPO(driver);
	}
	


	public static NewCustomerPO getNewCustommerPage(WebDriver driver){
		return new NewCustomerPO(driver);
	}


}
