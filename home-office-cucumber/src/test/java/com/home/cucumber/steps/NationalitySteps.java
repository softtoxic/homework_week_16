package com.home.cucumber.steps;

import com.home.cucumber.pages.SelectNationalityPage;
import io.cucumber.java.en.And;

public class NationalitySteps {
    @And("I select nationality {string}")
    public void iSelectNationality(String country) {
        new SelectNationalityPage().nationalityDropDownList(country);
    }

    @And("I click on next step button")
    public void iClickOnNextStepButton() {
        new SelectNationalityPage().clickNextStepButton();
    }
}
