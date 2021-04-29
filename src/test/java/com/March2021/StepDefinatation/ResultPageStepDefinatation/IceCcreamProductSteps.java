package com.March2021.StepDefinatation.ResultPageStepDefinatation;

import com.March2021.PageObject.IceCreamProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IceCcreamProductSteps {

    IceCreamProduct iceCreamProduct = new IceCreamProduct();

    @Given("user search for the ice-cream products")
    public void user_search_for_the_ice_cream_products() {
    iceCreamProduct.iceCreamSearch();
    }
    @When("user click on the search button")
    public void user_click_on_the_search_button() {
    iceCreamProduct.iceCreamSearch();
    }
    @Then("user should able to see all ice-cream products")
    public void user_should_able_to_see_all_ice_cream_products() {
    iceCreamProduct.iceCreamAssertion();
    }

}
