package com.carina.steps;

import com.carina.WebViewPage;
import com.carina.base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.net.MalformedURLException;
import java.util.Set;

public class WebViewSteps extends TestBase {
    WebViewPage webViewPage;


    @Given("I am logged in")
    public void iAmLoggedIn() throws MalformedURLException {
        webViewPage = new WebViewPage(driver);
    }

    @When("I open the left menu")
    public void iOpenTheLeftMenu() throws InterruptedException {

        webViewPage.clickLeftHambMenu();
        Thread.sleep(3000);

    }

    @Then("I successfully can see my profile")
    public void iSuccessfullyCanSeeMyProfile() {
        tearDown();
    }
}
