package com.example.automationpracticeclarov2.stepdefinitions;

import com.example.automationpracticeclarov2.pages.DashboardPage;
import com.example.automationpracticeclarov2.pages.LoginPage;
import com.example.automationpracticeclarov2.pages.SignUpPage;
import com.example.automationpracticeclarov2.utility.Base;
import com.example.automationpracticeclarov2.utility.Factory;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class LoginStep {

    private WebDriver driver;
    private LoginPage loginPage;


    public LoginStep(){
        driver = Base.driver;
        loginPage = new LoginPage(driver);
    }

    @And("^the user fills the email field with a valid to create a new account$")
    public void insertValidEmailToCreateNewAccount(){
        String email = Factory.emailFactory();
        loginPage.createAccountEmailInput.sendKeys(email);
        loginPage.createAnAccountButton.click();

        System.out.println(email);
        Assert.assertEquals(true, new SignUpPage(driver).createAccountForm.isDisplayed());
    }

    @And("^the user fills the (.*) field with a valid to login$")
    public void theUserFillsTheEmailFieldWithAValidToLogin(String email) {
        loginPage.loginEmailInput.sendKeys(email);
        loginPage.loginPasswordInput.sendKeys("k5bb22");

        loginPage.loginButton.click();
        Assert.assertEquals(true, new DashboardPage(driver).myAccount.isDisplayed());
    }
}
