package org.stepdefinition;

import org.base.BaseClass;
import org.base.IciciPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IciciLogin extends BaseClass {
	public IciciPojo ip;
	@Given("To launch the browser and maximize the window")
	public void toLaunchTheBrowserAndMaximizeTheWindow() {
		launchBrowser();windowMaximize();}

	@When("To launch the url")
	public void toLaunchTheUrl() {
		launchUrl("https:www.icicibank.com/");}
	@When("To click the loggin button")
	public void toClickTheLogginButton() {
	   ip=new IciciPojo();
	   clickBtn(ip.getLogin());}
	@When("To pass the user id")
	public void toPassTheUserId() throws InterruptedException {
	
	ip=new IciciPojo();
	Thread.sleep(3000);
     passText("300007689", ip.getUsid());   
  }
    @When("To pass the password")
	public void toPassThePassword() {
		ip=new IciciPojo(); passText("9344576803", ip.getPass());}

	@Then("To close the browser")
	public void toCloseTheBrowser() {
		closeBrowser();
	 
	}}
