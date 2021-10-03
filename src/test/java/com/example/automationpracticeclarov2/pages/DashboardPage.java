package com.example.automationpracticeclarov2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    @FindBy(id = "my-account")
    public WebElement myAccount;

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
