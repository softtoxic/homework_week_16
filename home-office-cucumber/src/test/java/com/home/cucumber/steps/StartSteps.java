package com.home.cucumber.steps;

import com.home.cucumber.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StartSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I accept the cookies")
    public void iAcceptTheCookies() {
        new StartPage().acceptCookies();
    }

    @And("I click on hide button")
    public void iClickOnHideButton() {
        new StartPage().clickHideMessage();
    }

    @And("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

}
