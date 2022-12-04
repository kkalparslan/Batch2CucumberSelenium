package com.krafttech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepDefs {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("Batch2 was here");
        System.out.println("I open browser and navigate to kraftech web page");

    }
    @When("The user enters Alparslan credentials")
    public void the_user_enters_alparslan_credentials() {
        System.out.println("I enter Alparslan username and password and click login button");

    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I verify that url changed Dashboard page");

    }

    @When("The user enters Jhon Nash credentials")
    public void the_user_enters_jhon_nash_credentials() {
        System.out.println("I enter Jhon Nash username and password and click login button");

    }
}
