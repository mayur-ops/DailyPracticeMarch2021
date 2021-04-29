package com.March2021.StepDefinatation;

import com.March2021.PageObject.ArgosDropDown;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArgosDropDownSteps {

    ArgosDropDown argosDropDown = new ArgosDropDown();

    @Given("user type in search box puma product")
    public void user_type_in_search_box_puma_product() {
       argosDropDown.doSearch();
    }
    @When("user enter on the search button")
    public void user_enter_on_the_search_button() {
        argosDropDown.doSearchClick();
    }
    @When("user click on the drop down button")
    public void user_click_on_the_drop_down_button() {
        argosDropDown.dropDownOptions();
    }
    @When("user select the customer rating category")
    public void user_select_the_customer_rating_category() {
        argosDropDown.dropDownOptions();
    }
    @Then("user should able to see all customer rating related product")
    public void user_should_able_to_see_all_customer_rating_related_product() {
    argosDropDown.dropDownAssertion();
    }


}
