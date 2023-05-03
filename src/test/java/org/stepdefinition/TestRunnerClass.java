package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.stepdefinition",monochrome = true,
dryRun = false,strict = false,
snippets = SnippetType.CAMELCASE,
plugin = {"html:myntrareport" , "junit:mytrareport\\junitreports.xml" ,
		"json:myntrareport\\jasonreport.json"})

public class TestRunnerClass {}
