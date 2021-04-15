package com.March2021.PageObject;

import com.March2021.BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ArgosShopButton extends DriverFactory {

    @FindBy (xpath = "//*[@id=\"ShopLink\"]/span/span")
    WebElement shopButton;

    @FindBy (xpath = "//*[@id=\"megaMenu\"]/li[1]/ul/ul/li[6]/a")
    WebElement toysButton;

    @FindBy(xpath = "//h1[contains(text(),'Toys')]")
    WebElement toysText;

    public void currentUrl(){
       String currentUrl =  driver.getCurrentUrl();
        System.out.println(currentUrl);
    }

    public void argosShopButton(){
        Actions action = new Actions(driver);
        action.moveToElement(shopButton).perform();
        action.moveToElement(toysButton).click().perform();
    }

    public void toysAssertion(){
       String toysTitle = toysText.getText();
       System.out.println(toysTitle);
       Assert.assertEquals(toysTitle,"Toys");
    }
}
