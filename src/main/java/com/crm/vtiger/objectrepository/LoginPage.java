package com.crm.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
		@FindBy(name="user_name") private WebElement usernameEdt;
		@FindBy(name="user_password")private WebElement passwordEdt;
		@FindBy(id="submitButton")private WebElement submitbtn;

	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	public void LoginToApp(String username,String password) {
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		submitbtn.click();
	}
	
}
