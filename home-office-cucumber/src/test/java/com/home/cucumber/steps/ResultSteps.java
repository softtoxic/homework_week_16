package com.home.cucumber.steps;

import com.home.cucumber.pages.ResultPage;
import io.cucumber.java.en.Then;

public class ResultSteps {
    @Then("I should see the visa messageOne")
    public void iShouldSeeTheVisaMessageOne() {
new ResultPage().getResultMessage();
    }

    @Then("I should see the visa messageTwo")
    public void iShouldSeeTheVisaMessageTwo() {
new ResultPage().confirmResultMessage();
    }

    @Then("I should see the visa messageThree")
    public void iShouldSeeTheVisaMessageThree() {
        new ResultPage().getResultMessage1();
    }
}
