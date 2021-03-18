package com.March2021.PageObject;

import com.March2021.BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualProduct extends DriverFactory {

    @FindBy(id = "typeahead")
    WebElement searchBox;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    WebElement searchButton;



    public void doSearch(String product){
        searchBox.sendKeys(product);
    }

    public void searchButton(){
        searchButton.click();
    }

    public void currentURL(){
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertEquals(actualURL,"https://www.aldi.co.uk/");
    }

    public void individualProductAssertion(){
    String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,"apple - ALDI UK");
    }
}
