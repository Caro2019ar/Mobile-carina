package com.carina;

import com.carina.base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebViewPage extends PageBase {
    public WebViewPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    private static By leftHambMenu = MobileBy.AccessibilityId("Navigate up");
    //WebElement rightHambMenu = driver.findElementByCssSelector("android.view.View");

}
