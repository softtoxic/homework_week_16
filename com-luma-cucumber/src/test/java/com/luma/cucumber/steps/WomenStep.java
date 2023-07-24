package com.luma.cucumber.steps;

import com.luma.cucumber.pages.HomePage;
import com.luma.cucumber.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WomenStep {
    @When("I click on Women Menu")
    public void iClickOnWomenMenu() throws InterruptedException {
        new HomePage().mouserHooverToWomenMenu();
    }

    @And("I click on Tops")
    public void iClickOnTops() throws InterruptedException {
        new HomePage().mouseHooverToTopMenu();
    }

    @And("I click on jacket")
    public void iClickOnJacket() throws InterruptedException {
        new HomePage().clickOnJacket();
    }

    @And("I click on product name filter{string}")
    public void iClickOnProductNameFilter(String ByName) {
        new WomenPage().selectProductNameFilter(ByName);
    }

    @Then("I should verify the product name by filter")
    public void iShouldVerifyTheProductNameByFilter() throws InterruptedException {
        Assert.assertEquals("Product not sort by name", new WomenPage().productListBeforeSorting(), new WomenPage().productListAfterSorting());
    }

    @And("I select product by price filter{string}")
    public void iSelectProductByPriceFilter(String Price) {
        new WomenPage().selectSortPrice(Price);
    }

    @Then("I should verify the product price by filter")
    public void iShouldVerifyTheProductPriceByFilter() throws InterruptedException {
        Assert.assertEquals("Products not sort by price", new WomenPage().priceListBeforeSorting(), new WomenPage().priceListAfterSorting());
    }


}
