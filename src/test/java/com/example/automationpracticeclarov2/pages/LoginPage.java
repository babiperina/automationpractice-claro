package com.example.automationpracticeclarov2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "authentication")
    public WebElement authenticationText;

    @FindBy(id = "email_create")
    public WebElement createAccountEmailInput;

    @FindBy(id = "email")
    public WebElement loginEmailInput;

    @FindBy(id = "passwd")
    public WebElement loginPasswordInput;

    @FindBy(id = "SubmitCreate")
    public WebElement createAnAccountButton;

    @FindBy(id = "SubmitLogin")
    public WebElement loginButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
