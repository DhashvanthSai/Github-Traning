package org.stepdefinition;



import org.base.BaseClass;
import org.base.MyntraPojo;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CucumberTest extends BaseClass {
	public  MyntraPojo mp;
	
	@Given("User has to launch the browser and maximize the window")
	public void userHasToLaunchTheBrowserAndMaximizeTheWindow() {
		System.out.println("driver"+driver);
		launchBrowser();windowMaximize();}
    @When("User has to launch the url")
	public void userHasToLaunchTheUrl() {
    	driver.get("https://www.myntra.com/");}
     @When("User hit the profile button")
	public void userHitTheProfileButton() {
    	 mp=new MyntraPojo();clickBtn(mp.getProfile());}
   @When("To click the login button")
     public void toClickTheLoginButton() throws InterruptedException {
    	 Thread.sleep(3000);
    	 mp=new MyntraPojo();clickBtn(mp.getLogin());
   }
     @When("User has to pass the mobile number in mobile field")
	public void userHasToPassTheMobileNumberInMobileField() {
    	 mp=new MyntraPojo();
    	 passText("95976511", mp.getMobile());}
    @When("User has to click the continue button")
	public void userHasToClickTheContinueButton() {
    	mp=new MyntraPojo();clickBtn(mp.getNext());}
     @Then("Close the browser")
	public void closeTheBrowser() {
    	 closeBrowser();
    	 }}
