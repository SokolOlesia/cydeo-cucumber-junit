package com.cydeo.step_definitions;

import com.cydeo.pages.T1_GoogleSearchFunctionality;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class T1_GoogleSearch {
    T1_GoogleSearchFunctionality t1_googleSearchFunctionality = new T1_GoogleSearchFunctionality();

    @When("user types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        t1_googleSearchFunctionality.inputBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("user sees Steve Jobs is in the google title")
    public void user_sees_steve_jobs_is_in_the_google_title() {
        String expectedTitle = "Steve Jobs";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();
    }
}
