package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage {

    @FindBy(how = How.CSS, using = ".product-prices__big")
    private WebElement price;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getPrice() {
        return price.getText();
    }
}
