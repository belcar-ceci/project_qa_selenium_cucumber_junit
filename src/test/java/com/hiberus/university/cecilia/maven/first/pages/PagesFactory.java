package com.hiberus.university.cecilia.maven.first.pages;

import org.openqa.selenium.WebDriver;

public class PagesFactory {
    private static PagesFactory pagesFactories;

    private final WebDriver driver;
    private final LoginPage loginPage;

    private PagesFactory(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    public static void start(WebDriver driver) {
        pagesFactories = new PagesFactory(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }
    }


