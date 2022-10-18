package com.carina;

import com.carina.base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.appium.java_client.MobileBy.AccessibilityId;

public class WebViewPage extends PageBase {
    public WebViewPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(accessibility = "Navigate up")
    MobileElement leftHambMenu;

    @AndroidFindBy(id = "toolbar")
    MobileElement toolbar;

    @AndroidFindBy(id = "image_view")
    MobileElement imageView;


    public void clickImageView() {
        click(imageView);
    }

    public void clickLeftHambMenu() {
        click(leftHambMenu);

    }

}
