package com.March2021.StepDefinatation;

import com.March2021.PageObject.ArgosShopButton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ArgosShopButtonSteps {

    ArgosShopButton argosShopButton = new ArgosShopButton();

    @Given("user is on argos home page")
    public void user_is_on_argos_home_page() {
        argosShopButton.currentUrl();
    }
    @When("user hover the mouse on shop option and auto option display")
    public void user_hover_the_mouse_on_shop_option_and_auto_option_display() {
    argosShopButton.argosShopButton();
    }
    @Then("user click to the Toys option")
    public void user_click_to_the_toys_option() {
    argosShopButton.toysAssertion();
    }


}
