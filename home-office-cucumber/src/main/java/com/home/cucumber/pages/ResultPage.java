package com.home.cucumber.pages;

import com.home.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement heathcarevisaText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner in the UK')]")
    WebElement needVisaMessage;

    public String getResultMessage(){
        return getTextFromElement( resultMessage);
    }

    public String confirmResultMessage(){
        return getTextFromElement(heathcarevisaText);

    }
    public String getResultMessage1(){
        return getTextFromElement(needVisaMessage);
    }






}
