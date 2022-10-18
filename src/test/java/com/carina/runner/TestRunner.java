package com.carina.runner;

import com.carina.base.TestBase;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features/WebViewPage.feature",
        glue = {"com.carina.steps"}, plugin = {"pretty", "html:target/cucumber-html-report.html"})
public class TestRunner extends TestBase {
}

// tags = "@InitialPage, @SignUp"