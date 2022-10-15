package com.carina.steps;


import com.carina.InitialPage;
import com.carina.base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

public class StartToNext extends TestBase {

    InitialPage initialPage;

    @Given("Click on next")
    public void clickOnNext() throws MalformedURLException {
    android_setUp();
    initialPage = new InitialPage(driver);
    initialPage.clickNextBtn();
    }

    @Then("Go to signup page")
    public void goToSignupPage() {
        tearDown();
    }
}
