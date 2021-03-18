package com.March2021.PageObject;

import com.March2021.BaseClass.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ReducedProduct extends DriverFactory {

    @FindBy(linkText = "Reduced")
    WebElement reducedElement;

    @FindBy(linkText = "Below £20")
    WebElement belowTenPound;

    public void reduced() {
        Actions actions = new Actions(driver);
        actions.moveToElement(reducedElement).perform();
        actions.moveToElement(belowTenPound).click().perform();
    }
}
