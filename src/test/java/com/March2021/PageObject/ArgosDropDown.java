package com.March2021.PageObject;

import com.March2021.BaseClass.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ArgosDropDown extends DriverFactory {

    @FindBy (id = "searchTerm")
    WebElement argosSearchBox;

    @FindBy (id = "sort-select")
    WebElement dropDownButton;

    @FindBy (xpath = "//h1[contains(text(),'puma')]")
    WebElement pumaText;

    public void doSearch(){
        argosSearchBox.sendKeys("puma");

    }

    public void doSearchClick(){
        argosSearchBox.sendKeys(Keys.ENTER);
    }

    public void dropDownOptions(){
        Select sel = new Select(dropDownButton);

        sel.selectByIndex(3);

        List<WebElement> options = sel.getAllSelectedOptions();
        for (WebElement option: options){
            System.out.println(option.getText());
        }
    }

    public void dropDownAssertion(){
       String actualTitle = pumaText.getText();
        System.out.println(actualTitle);
        Assert.assertThat(actualTitle, Matchers.containsString("puma"));
    }

}
