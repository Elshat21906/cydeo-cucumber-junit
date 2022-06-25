package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webTable_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of table app")
public void user_is_on_the_login_page_of_table_app() {
        String url = ConfigurationReader.getProperty("webTableURL");
        Driver.getDriver().get(url);
}

    @When("user enters username {string}")
    public void user_enters_username(String string) {

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {

    }



    @When("user clicks login button")
public void user_clicks_login_button() {

}

    @Then("user should see url contains order")
public void user_should_see_url_contains_order() {

}


}
