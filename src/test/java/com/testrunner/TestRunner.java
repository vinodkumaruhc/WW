package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature", glue = "com.stepdefinition")
// tags="@tags)have to give a tag name in feature file ( @tage1 ) if there is
// multiple feature files in feature folder
// tags = "@tag2"(like that)

public class TestRunner extends AbstractTestNGCucumberTests {

}
