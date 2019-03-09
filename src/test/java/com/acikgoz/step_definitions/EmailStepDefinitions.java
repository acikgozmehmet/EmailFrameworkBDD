package com.acikgoz.step_definitions;

import com.acikgoz.pages.LoginPage;
import com.acikgoz.pages.MainPage;
import com.acikgoz.pages.NewMessagePage;
import com.acikgoz.utilities.BrowserUtils;
import com.acikgoz.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.it.Ma;
import org.junit.Assert;

import java.util.Map;

public class EmailStepDefinitions {

    @Given("user is already on the login page")
    public void user_is_already_on_the_login_page() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
    }

    @Given("user enters valid credentials")
    public void user_enters_valid_credentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

    @Then("user should be able to see the mainpage")
    public void user_should_be_able_to_see_the_mainpage() {
        MainPage mainPage = new MainPage();
        BrowserUtils.waitUntilTextToBePresentInElement(mainPage.composeBtn, "Compose", 30);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("inbox"));
    }

    @Then("user clicks on the Compose button")
    public void user_clicks_on_the_Compose_button() {
        MainPage mainPage = new MainPage();
        mainPage.composeMail();
    }

    @Then("user should be able to send an email to {string} with the subject {string} and the following body")
    public void user_should_be_able_to_send_an_email_to_with_the_subject_and_the_following_body(String email, String subject, String message) {
        NewMessagePage newMessagePage = new NewMessagePage();
        BrowserUtils.waitForVisibility(newMessagePage.toInput, 30);
        BrowserUtils.changeBackgroundColor(newMessagePage.toInput, "Yellow");
//        BrowserUtils.drawBorder(newMessagePage.toInput);


        newMessagePage.toInput.sendKeys(email);


        BrowserUtils.changeBackgroundColor(newMessagePage.subjectInput, "Yellow");

        newMessagePage.subjectInput.sendKeys(subject);
        BrowserUtils.changeBackgroundColor(newMessagePage.subjectInput, "White");


        BrowserUtils.changeBackgroundColor(newMessagePage.textFieldInput, "Yellow");
        newMessagePage.textFieldInput.sendKeys(message);

        BrowserUtils.drawBorder(newMessagePage.sendBtn);
        BrowserUtils.hover(newMessagePage.sendBtn);
        newMessagePage.sendBtn.click();
        BrowserUtils.wait(5);
    }


}
