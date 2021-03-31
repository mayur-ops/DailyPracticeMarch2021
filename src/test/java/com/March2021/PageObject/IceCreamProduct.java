package com.March2021.PageObject;

import com.March2021.BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IceCreamProduct extends DriverFactory {

    @FindBy(id = "typeahead")
    WebElement searchBox;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    WebElement searchButton;

    @FindBy(xpath = "//body/main[1]/div[2]/div[4]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement iceCreamProductTitle;

    public void iceCreamSearch(){
        searchBox.sendKeys("ice cream");
    }

    public void clickOnSearch(){
        searchButton.click();
    }

    public void iceCreamAssertion(){
    String actualPageTitle = iceCreamProductTitle.getText();
        System.out.println(actualPageTitle);
        Assert.assertEquals(actualPageTitle,"You searched for ice cream");
        }
}
