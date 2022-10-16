package com.carina.steps;

import com.carina.InitialPage;
import com.carina.SignUpPage;
import com.carina.base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

public class SignUpWithExample extends TestBase {
    SignUpPage signUpPage;
    InitialPage initialPage;

    @Given("Enter your {string}")
    public void enterYourName(String nameTxt) throws MalformedURLException {
        android_setUp();
        initialPage = new InitialPage(driver);
        initialPage.clickNextBtn();
        signUpPage = new SignUpPage(driver);
        signUpPage.enterName(nameTxt);
    }

    @Given("Enter {string}")
    public void enterPassword(String passwordTxt) {
        signUpPage.enterPassword(passwordTxt);
    }

    // Dúvida aqui String seria correto?
    @Given("Select {string}")
    public void selectGender(String gender) {
        if (gender.contains("female")) {
            signUpPage.clickFemale();
        } else {
            signUpPage.clickMale();
        }
    }

    @Given("Click on agree")
    public void clickOnAgree() {
        signUpPage.clickCheckBtn();
    }

    @Given("Click on signup")
    public void clickOnSignup() {
        signUpPage.clickSignBtn();
    }

    @Then("Sign up successfully")
    public void signUpSuccessfully() {
        tearDown();
    }
}
