package com.carina.steps;

import com.carina.InitialPage;
import com.carina.SignUpPage;
import com.carina.base.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.net.MalformedURLException;

public class SignUpWithExample extends TestBase {
    SignUpPage signUpPage;
    InitialPage initialPage;

    @Before
    public void setUpSignUp() throws MalformedURLException {
        android_setUp();

    }

    @Given("I enter my {string}")
    public void enterYourName(String nameTxt) {
        initialPage = new InitialPage(driver);
        signUpPage = new SignUpPage(driver);
        initialPage.clickNextBtn();
        signUpPage.enterName(nameTxt);
    }

    @And("Enter {string}")
    public void enterPassword(String passwordTxt) {
        signUpPage.enterPassword(passwordTxt);
    }

    @And("Select {string}")
    public void selectGender(String gender) {
        if (gender.contains("female")) {
            signUpPage.clickFemale();
        } else {
            signUpPage.clickMale();
        }
    }

    @When("Click on agree")
    public void clickOnAgree() {
        signUpPage.clickCheckBtn();
    }

    @And("Click on signup")
    public void clickOnSignup() {
        signUpPage.clickSignBtn();
    }

    @Then("Sign up successfully")
    public void signUpSuccessfully() {
        //Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text='Lorem ipsum']")).getText(), "Lorem ipsum");
        tearDown();
    }
}
