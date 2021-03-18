package com.March2021.StepDefinatation;

import com.March2021.PageObject.IndividualProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndividualProductSteps {

    IndividualProduct individualProduct = new IndividualProduct();

    @Given("user is on aldi webside home page")
    public void user_is_on_aldi_webside_home_page() {
    individualProduct.currentURL();
    }
    @When("user type apple in the search box")
    public void user_type_apple_in_the_search_box() {
    individualProduct.doSearch("apple");
    }
    @When("user click on the search")
    public void user_click_on_the_search() {
    individualProduct.searchButton();
    }
    @Then("user should be able to see all apple related products")
    public void user_should_be_able_to_see_all_apple_related_products() {
    individualProduct.individualProductAssertion();
    }
}
