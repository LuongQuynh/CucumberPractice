package interactUI.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interactUI.pageUIs.ComponentPageUI;

public class ComponentPO extends AbstractPage {
	WebDriver driver;

	public ComponentPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

	public void clickToDynamicPageLink(String pageName) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_PAGE_LINK, pageName);
		clickToElement(ComponentPageUI.DYNAMIC_PAGE_LINK, pageName);
	}
	
	public void clickToDynamicSubpageLink(String subpageName) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_SUBPAGE_LINK, subpageName);
		clickToElement(ComponentPageUI.DYNAMIC_SUBPAGE_LINK, subpageName);
	}
	
	public void clickToDynamicFirstButtonLink(String nameButtonLink) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_FIRST_BUTTON_LINK, nameButtonLink);
		clickToElement(ComponentPageUI.DYNAMIC_FIRST_BUTTON_LINK, nameButtonLink);
	}
	
	public void clickToDynamicPostButtonLink(String nameButtonLink) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_POST_BUTTON_LINK, nameButtonLink);
		clickToElement(ComponentPageUI.DYNAMIC_POST_BUTTON_LINK, nameButtonLink);
	}
	
	
	public void clickToDynamicButton(String buttonValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_BUTTON, buttonValue);
		clickToElement(ComponentPageUI.DYNAMIC_BUTTON, buttonValue);
		
	}
	
	public void clickToDynamicApiGoogleButton(String buttonValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_API_GOOGLE_BUTTON, buttonValue);
		clickToElement(ComponentPageUI.DYNAMIC_API_GOOGLE_BUTTON, buttonValue);
		
	}
	
	public void selectInDynamicDropdownWithItem(String nameID, String value) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_ITEM_IN_DROPDOWN, nameID);
		selectItemInDropdown(ComponentPageUI.DYNAMIC_ITEM_IN_DROPDOWN, value, nameID);
	}
	
	public void clickToDynamicRadioOrCheckbox(String radioOrCheckboxID) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_RADIO_OR_CHECKBOX, radioOrCheckboxID);
		clickToElement(ComponentPageUI.DYNAMIC_RADIO_OR_CHECKBOX, radioOrCheckboxID);
	}
	
	public void inputToDynamicTextbox(String nameID, String value) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXTBOX, nameID);
		sendkeyToElement(ComponentPageUI.DYNAMIC_TEXTBOX, value, nameID);
	}
	
	public void inputToDynamicApiGoogleTextbox(String nameID, String value) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_API_GOOGLE_TEXTBOX, nameID);
		sendkeyToElement(ComponentPageUI.DYNAMIC_API_GOOGLE_TEXTBOX, value, nameID);
	}
	
	
	public void inputToDynamicTextboxWithValueRandom(String nameID, String valueRandom) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXTBOX, nameID);
		sendkeyToElement(ComponentPageUI.DYNAMIC_TEXTBOX, valueRandom, nameID);
		
	}
	
	public void inputToDynamicTextarea(String nameID, String value) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXTAREA, nameID);
		sendkeyToElement(ComponentPageUI.DYNAMIC_TEXTAREA, value, nameID);
	}
	
	
	public String getTextInDynamicNoti(String mesageValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_NOTI, mesageValue);
		return getTextElement(ComponentPageUI.DYNAMIC_TEXT_NOTI, mesageValue);
	}
	
	public String getTextInDynamicTable(String mesageValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_TABLE, mesageValue);
		return getTextElement(ComponentPageUI.DYNAMIC_TEXT_TABLE, mesageValue);
	}
	
	
	public boolean isNotiMessageDisplayed(String mesageValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_NOTI, mesageValue);
		return isElementDisplayed(ComponentPageUI.DYNAMIC_TEXT_NOTI, mesageValue);
	}
	
	public boolean isTextMessageDisplayed(String textMesageValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_MESSAGE, textMesageValue);
		return isElementDisplayed(ComponentPageUI.DYNAMIC_TEXT_MESSAGE, textMesageValue);
	}
	
	public boolean isTextInTableDisplayed(String textTableValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_TABLE, textTableValue);
		return isElementDisplayed(ComponentPageUI.DYNAMIC_TEXT_TABLE, textTableValue);
	}

	public void checkToDynamicCheckbox(String checkboxValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_CHECKBOX, checkboxValue);
		checkToCheckbox(ComponentPageUI.DYNAMIC_CHECKBOX, checkboxValue);
		
	}

	
	
	
	
	
		
	
}
