package org.example;

import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageUpdatetest {
    @Test
    public void verifylogintest(){
        WebDriver driver=FactoryBrowser.setupBrowser("chrome","https://www.saucedemo.com");

        loginPageUpdate login= PageFactory.initElements(driver,loginPageUpdate.class);

// LoginPageUpdate login=new LoginPageUpdate(driver);
        login.loginWebsite("standard_user","secret_sauce");
    }
}
