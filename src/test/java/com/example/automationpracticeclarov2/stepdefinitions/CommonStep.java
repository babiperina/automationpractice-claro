package com.example.automationpracticeclarov2.stepdefinitions;

import com.example.automationpracticeclarov2.utility.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStep {
    @Given("the user open the browser")
    public void openTheBrowser(){
        Base.openBrowser();
    }
    @Then("the user closes the browser")
    public void closeTheBrowser() throws InterruptedException {
        wait(20);
        Base.closeBrowser();
    }
}
