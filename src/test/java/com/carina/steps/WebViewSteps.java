package com.carina.steps;


import com.carina.WebViewPage;
import com.carina.base.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;



public class WebViewSteps extends TestBase {
    WebViewPage webViewPage;


    @Given("I am logged in")
    public void iAmLoggedIn()  {
        webViewPage = new WebViewPage(driver);
    }

    @When("I open the left menu")
    public void iOpenTheLeftMenu() {
        webViewPage.clickLeftHambMenu();
    }

    @Then("I successfully can see my profile")
    public void iSuccessfullyCanSeeMyProfile() {
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text='Lorem ipsum']")).getText(), "Lorem ipsum");
        tearDown();
    }
}
