package com.March2021.StepDefinatation;

import com.March2021.PageObject.StarRating;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StarRatingSteps {

    StarRating starRating = new StarRating();

    @When("user select the three star rating apple product checkbox button")
    public void user_select_the_three_star_rating_apple_product_checkbox_button() {
    starRating.appleStarRating();
    }
    @Then("user should able to see all apple three star rating products")
    public void user_should_able_to_see_all_apple_three_star_rating_products() {
    starRating.appleStarRatingAssertion();
    }
}
