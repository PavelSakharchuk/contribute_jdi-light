package io.github.epam.tests.selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.entities.User;

import static selenium.seleniumPO.HomePage.leftNavigation;
import static selenium.seleniumPO.SiteSelenium.homePage;
import static selenium.seleniumPO.SiteSelenium.login;
import static selenium.site.data.DefaultDataProvider.ROMAN_CONTACT;
import static selenium.site.pages.ContactPage.seleniumContactForm;

public class SeleniumContactForm implements SimpleTestsInit {

    @BeforeMethod
    public void openPerformancePage() {
        homePage.open();
        login(new User());
        leftNavigation.select("Contact form");
    }

    @Test
    public void contactFormTest() {
        seleniumContactForm.submit(ROMAN_CONTACT);
    }
}
