package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import com.example.selenium.pages.ProductPage;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class UserSteps {
    LoginPage loginPage;
    MainPage mainPage;
    ProductPage productPage;
    private WebDriver driver;


    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public UserSteps login(String username, String password) {
        mainPage = new MainPage(driver);
        mainPage.clickLogin();

        loginPage = new LoginPage(driver);
        loginPage.setUsername("иван@mail.com")
                .setPassword("P@ssw0rd")
                .clickLogin();
        return this;
    }

    public UserSteps search(String text) {
        productPage = mainPage.setSearch(text)
                .clickSearchButton()
                .clickFoundProduct();
        return this;
    }


    public UserSteps checkPrice(String expectedPrice) {
        assertEquals(productPage.getPrice(), "33 999₴", "Price is wrong");
        return this;
    }

    public UserSteps logout() {
        mainPage.clickName()
                .clickExit();
        return this;
    }
}
