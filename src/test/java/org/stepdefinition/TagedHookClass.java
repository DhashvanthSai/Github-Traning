package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
public class TagedHookClass extends BaseClass {
	@Before (order=1)
	private void preCondition2() {
launchBrowser();}
	@Before(order=2)
	private void preCondition1() {
windowMaximize();}
	@Before(order=3 ,value="@smoke")
	private void preCondition() {
     System.out.println("preCondition");}
	@After(order=10,value="@smoke ")
	private void postCondition() {
    System.out.println("Take a screenshot");}
	@After(order=4)
	private void postCondition2() {
		System.out.println("post condition");
		closeBrowser();}}
