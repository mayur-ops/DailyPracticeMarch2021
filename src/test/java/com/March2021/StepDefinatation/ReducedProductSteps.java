package com.March2021.StepDefinatation;

import com.March2021.PageObject.ReducedProduct;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReducedProductSteps {

    ReducedProduct reducedProduct = new ReducedProduct();

    @When("user mouse hover over to reduced element new window open")
    public void user_mouse_hover_over_to_reduced_element_new_window_open() throws InterruptedException {
     reducedProduct.reduced();
    }
    @When("user do click on the below ten pound product")
    public void user_do_click_on_the_below_ten_pound_product() {

    }
    @Then("user should able to see all below ten pound list of products")
    public void user_should_able_to_see_all_below_ten_pound_list_of_products() {

    }


}
