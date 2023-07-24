package com.home.cucumber.steps;

import com.home.cucumber.pages.DurationOfStayPage;
import io.cucumber.java.en.And;

public class DurationOfStaySteps {

    @And("I select stay for longer than six months {string}")
    public void iSelectStayForLongerThanSixMonths(String month) {
        new DurationOfStayPage().selectLengthOfStay(month);
    }

    @And("I click on continues button")
    public void iClickOnContinuesButton() {
        new DurationOfStayPage().clickNextStepButton();
    }


}
