package com.carina.runner;

import com.carina.base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:features", tags= "@WebViewPage",
        glue = {"com.carina.steps"}, plugin = {"pretty", "html:target/cucumber-html-report.html"})
public class TestRunner extends TestBase {
}

// features = "classpath:features/WebViewPage.feature"
// tags = "@InitialPage, @SignUp, @WebViewPage"