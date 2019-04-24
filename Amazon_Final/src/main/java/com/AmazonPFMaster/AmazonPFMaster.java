package com.AmazonPFMaster;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPFMaster {

	
	
	@FindBy(xpath=("//*[@id=\"nav-link-accountList\"]/span[1]"))
	private WebElement SignInBox;

	
	@FindBy(xpath=("//*[contains(@id,'ap_email')]"))
	private WebElement EmailAdd ;
	
	@FindBy(xpath=("//*[contains(@name,'password')]"))
	private WebElement PassBox;
	
	@FindBy(xpath=("//*[contains(@id,'signInSubmit')]"))
	private WebElement SignInTab;

	@FindBy(xpath=("//*[contains(text(),'Hi, Akija')]"))
	private WebElement TextValedation;

	
	
private String URL ="http://www.amazon.com";
private String UserName ="akijamukit@gmail.com";
private String PassWord="Akija123";
public WebElement getSignInBox() {
	return SignInBox;
}
public void setSignInBox(WebElement signInBox) {
	SignInBox = signInBox;
}
public WebElement getEmailAdd() {
	return EmailAdd;
}
public void setEmailAdd(WebElement emailAdd) {
	EmailAdd = emailAdd;
}
public WebElement getPassBox() {
	return PassBox;
}
public void setPassBox(WebElement passBox) {
	PassBox = passBox;
}
public WebElement getSignInTab() {
	return SignInTab;
}
public void setSignInTab(WebElement signInTab) {
	SignInTab = signInTab;
}
public String getURL() {
	return URL;
}
public void setURL(String uRL) {
	URL = uRL;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassWord() {
	return PassWord;
}
public void setPassWord(String passWord) {
	PassWord = passWord;
}
public WebElement getTextValedation() {
	return TextValedation;
}




}
