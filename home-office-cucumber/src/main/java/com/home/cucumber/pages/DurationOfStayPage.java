package com.home.cucumber.pages;


import com.home.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'6 months or less')]")
    WebElement selectLess6mon;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'longer than 6 months')]")
    WebElement selectLong6mon;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;


    public void selectLengthOfStay(String moreOrLess){
        switch (moreOrLess) {
            case "1":
                clickOnElement(selectLess6mon);
            case "2":
                clickOnElement(selectLong6mon);
        }
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }
}

