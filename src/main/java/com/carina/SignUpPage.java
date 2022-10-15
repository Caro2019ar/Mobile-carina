package com.carina;


import com.carina.base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpPage extends PageBase {
    public SignUpPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "name")
    MobileElement nameSignUp;

    @AndroidFindBy(id = "password")
    MobileElement password;
    @AndroidFindBy(id = "radio_male")
    MobileElement radioMale;
    @AndroidFindBy(id = "radio_female")
    MobileElement radioFemale;
    @AndroidFindBy(id = "checkbox")
    MobileElement agreeCheck;
    @AndroidFindBy(id = "login_button")
    MobileElement signUpBtn;

    public void enterName(String nameTxt) {
        clear(nameSignUp);
        sendText(nameSignUp, nameTxt);
    }

    public void clickSignBtn(){
        click(signUpBtn);
    }
}
