package com.example.automationpracticeclarov2.stepdefinitions;

import com.example.automationpracticeclarov2.pages.LandingPage;
import com.example.automationpracticeclarov2.pages.LoginPage;
import com.example.automationpracticeclarov2.utility.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LandingPageStep {

    private WebDriver driver;
    private LandingPage landingPage;
    private LoginPage loginPage;

    public LandingPageStep(){
        driver = Base.driver;
        landingPage = new LandingPage(driver);
    }

    @Given("the new user access the landing page")
    public void accessLandingPage(){
        Base.openURL(landingPage.URL);
        landingPage = new LandingPage(driver);
    }

    @And("the user clicks to sign in")
    public void goToSignUp(){
        landingPage.signInButton.click();

        loginPage = new LoginPage(Base.driver);
        Assert.assertEquals(true, loginPage.authenticationText.isDisplayed());
    }
}
