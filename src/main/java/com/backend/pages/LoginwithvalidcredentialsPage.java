
package com.backend.pages;

import com.default_project.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginwithvalidcredentialsPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "homeScreen")
    private WebElement homeScreen;

    @FindBy(id = "googleMap")
    private WebElement googleMap;

    @FindBy(id = "menuBar")
    private WebElement menuBar;

    @FindBy(id = "recenterIcon")
    private WebElement recenterIcon;

    public LoginwithvalidcredentialsPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        driver.get("http://localhost/login"); // Example URL, adjust as needed
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isHomeScreenLoaded() {
        try {
            Assert.assertTrue("Home screen is not loaded!", elementUtils.isElementDisplayed(homeScreen));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUserNavigatedToHomeScreen() {
        isHomeScreenLoaded(); // Reusing the previous check
    }

    public void isGoogleMapDisplayed() {
        try {
            Assert.assertTrue("Google Map is not displayed!", elementUtils.isElementDisplayed(googleMap));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isMenuBarVisible() {
        try {
            Assert.assertTrue("Menu bar is not visible!", elementUtils.isElementDisplayed(menuBar));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRecenterIconVisible() {
        try {
            Assert.assertTrue("Recenter icon is not visible!", elementUtils.isElementDisplayed(recenterIcon));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}