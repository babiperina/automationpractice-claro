package com.example.automationpracticeclarov2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public String URL = "http://automationpractice.com/";

    @FindBy(className = "login")
    public WebElement signInButton;

    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
