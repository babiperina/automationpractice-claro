package com.example.automationpracticeclarov2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

    @FindBy(id = "account-creation_form")
    public WebElement createAccountForm;

    @FindBy(id = "id_gender1")
    public WebElement mrTitle;

    @FindBy(id = "id_gender2")
    public WebElement mrsTitle;

    @FindBy(id = "customer_firstname")
    public WebElement firstNameInput;

    @FindBy(id = "customer_lastname")
    public WebElement lastNameInput;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement dayOfBirthSelect;

    @FindBy(id = "months")
    public WebElement monthOfBirthSelect;

    @FindBy(id = "years")
    public WebElement yearOfBirthSelect;

    @FindBy(id = "address1")
    public WebElement addressInput;

    @FindBy(id = "city")
    public WebElement cityInput;

    @FindBy(id = "id_state")
    public WebElement stateSelect;

    @FindBy(id = "postcode")
    public WebElement zipCodeInput;

    @FindBy(id = "id_country")
    public WebElement countrySelect;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhoneInput;

    @FindBy(id = "alias")
    public WebElement aliasAddressInput;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Select selectDayOfBirth(){
        return new Select(dayOfBirthSelect);
    }

    public Select selectMonthOfBirth(){
        return new Select(monthOfBirthSelect);
    }

    public Select selectYearOfBirth(){
        return new Select(yearOfBirthSelect);
    }

    public Select selectState() {
        return new Select(stateSelect);
    }
}
