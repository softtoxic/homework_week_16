package com.home.cucumber.steps;

import com.home.cucumber.pages.WorkTypePage;
import io.cucumber.java.en.And;

public class WorkTypeSteps {
    @And("I select health work visa option {string}")
    public void iSelectHealthWorkVisaOption(String Work) {
        new WorkTypePage().selectJobType(Work);
    }

    @And("I click on next continue button")
    public void iClickOnNextContinueButton() {
        new WorkTypePage().clickNextStepButton();
    }
}
