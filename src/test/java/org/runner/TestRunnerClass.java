package org.runner;

import org.junit.AfterClass;   
import org.junit.runner.RunWith;

import org.reports.GenrateReportsClass1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\LoginPage.feature", glue = "org.step",
monochrome=true,
dryRun=false,
snippets=SnippetType.CAMELCASE,
plugin= {"html:target\\HTMLReport",
		"junit:target\\xmlReport.xml",
		"json:target\\jsonReport.json"
})
public class TestRunnerClass{
	@AfterClass
 public static void tc01() { 
		GenrateReportsClass1.genrate("target\\jsonReport.json");
	}

}
