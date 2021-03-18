package com.March2021.PageObject;

import com.March2021.BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

public class StarRating extends DriverFactory {

    @FindBy(css = ".category-facets__item.category-facets__item--facet.js-facet-item")
    List<WebElement> starRatings;

    @FindBy(xpath = "//*[@id=\"products-tab\"]/div[1]/div[1]/div[2]/ul/li[6]/ul/li[3]")
    WebElement threeStarRating;

    public void appleStarRating(){
        for (WebElement starRating: starRatings){
            System.out.println(starRating.getText());
            if (starRating.getText().contains("Available to buy online (3)"));
            starRating.click();
            break;
        }
    }

    public void appleStarRatingAssertion(){
       String actualStarRating = threeStarRating.getText();
        System.out.println(actualStarRating);
       Assert.assertEquals(actualStarRating,"(4)");
    }
}
