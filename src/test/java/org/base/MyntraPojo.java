package org.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPojo extends BaseClass {
	
	public MyntraPojo() {
PageFactory.initElements(driver, this);	}
	
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement profile;
	
	@FindBy(xpath="//a[text()='login / Signup']")
	private WebElement login;
	
	@FindBy(xpath="//input[@class='form-control mobileNumberInput']")
	private WebElement mobile ;
	
	@FindBy(xpath="//div[text()='CONTINUE']")
	private WebElement next;
	
   public WebElement getProfile() {
		return profile;}

	public WebElement getLogin() {
		return login;}

	public WebElement getMobile() {
		return mobile;}

	public WebElement getNext() {
		return next;
	}}
