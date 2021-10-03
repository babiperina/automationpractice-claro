package com.example.automationpracticeclarov2.stepdefinitions;

import com.example.automationpracticeclarov2.pages.DashboardPage;
import com.example.automationpracticeclarov2.pages.SignUpPage;
import com.example.automationpracticeclarov2.utility.Base;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpStep {

    public WebDriver driver;
    public SignUpPage signUpPage;

    public SignUpStep(){
        driver = Base.driver;
        signUpPage = new SignUpPage(driver);
    }

    @And("the (female|male) user fills all needed fields to create your account")
    public void createNewAccount(String gender){
        if (gender.equalsIgnoreCase("female")) {
            signUpPage.mrsTitle.click();
        } else if (gender.equalsIgnoreCase("male")){
            signUpPage.mrTitle.click();
        }

        signUpPage.firstNameInput.sendKeys("Bárbara");
        signUpPage.lastNameInput.sendKeys("Perina");
        signUpPage.password.sendKeys("k5bb22");
        signUpPage.selectDayOfBirth().selectByValue("7");
        signUpPage.selectMonthOfBirth().selectByValue("3");
        signUpPage.selectYearOfBirth().selectByValue("1996");
        signUpPage.addressInput.sendKeys("Rua dos Tabajaras");
        signUpPage.cityInput.sendKeys("Fortaleza");
        signUpPage.selectState().selectByValue("28");
        signUpPage.zipCodeInput.sendKeys("95129");
        signUpPage.mobilePhoneInput.sendKeys("+55 85 99771-4777");
        signUpPage.aliasAddressInput.sendKeys(signUpPage.addressInput.getText());
        signUpPage.registerButton.click();

        Assert.assertEquals(true, new DashboardPage(driver).myAccount.isDisplayed());
    }
}
