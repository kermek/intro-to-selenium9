package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends BasePage {

    @FindBy(how = How.LINK_TEXT, using = "войдите в личный кабинет")
    private WebElement login;

    @FindBy(how = How.NAME, using = "search")
    private WebElement search;

    @FindBy(how = How.CSS, using = ".search-form__submit")
    private WebElement searchButton;

    @FindBy(how = How.XPATH, using = "(//a[contains(@href,'apple_macbook_air_2020')])")
    private WebElement foundProduct;

    @FindBy(how = How.LINK_TEXT, using = "иван")
    private WebElement name;

    @FindBy(how = How.LINK_TEXT, using = "Выход")
    private WebElement exit;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage setSearch(String text) {
        search.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        login.click();
        return this;
    }

    public MainPage clickSearchButton() {
        searchButton.click();
        return this;
    }

    public ProductPage clickFoundProduct() {
        foundProduct.click();
        return new ProductPage(driver);
    }

    public MainPage clickName() {
        name.click();
        return this;
    }

    public MainPage clickExit() {
        exit.click();
        return this;
    }
}
