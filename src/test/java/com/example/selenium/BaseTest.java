package com.example.selenium;

import com.example.selenium.steps.UserSteps;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps steps;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().setSize(new Dimension(1680, 1027));
        steps = new UserSteps(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
