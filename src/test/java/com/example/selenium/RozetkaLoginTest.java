package com.example.selenium;

import org.testng.annotations.Test;

public class RozetkaLoginTest extends BaseTest {

    @Test
    public void rozetkalogin() {
        steps.login("иван@mail.com", "P@ssw0rd")
                .search("MacBook Air 2020")
                .checkPrice("33 999₴")
                .logout();
    }
}
