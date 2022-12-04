package com.krafttech.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @Given("The user is on the dashboard page")
    public void the_user_is_on_the_dashboard_page() {
        System.out.println("I am on the dashboard page");

    }
    @When("Go to Developers menu and get the text of Developer")
    public void go_to_developers_menu_and_get_the_text_of_developer() {
        System.out.println("I went to the developers menu and got the text");

    }
    @Then("The user should be able to dashboard page")
    public void the_user_should_be_able_to_dashboard_page() {
        System.out.println("I am on the dashboard page");

    }

    @When("Get the text of dashboard")
    public void getTheTextOfDashboard() {
        System.out.println("I got the text of dashboard");
    }

    @And("Go to Edit Profile menu and get the text of Edit User Profile")
    public void goToEditProfileMenuAndGetTheTextOfEditUserProfile() {
        System.out.println("I went to the Edit Profile menu and got the text");
    }

    @Then("The user should be able to Edit Profile module")
    public void theUserShouldBeAbleToEditProfileModule() {
        System.out.println("I am on the Edit Profile module");
    }

    @And("Go to My Profile menu and get the text of User Profile")
    public void goToMyProfileMenuAndGetTheTextOfUserProfile() {
        System.out.println("I went to the My Profile menu and got the text");
    }

    @Then("The user should be able to My Profile module")
    public void theUserShouldBeAbleToMyProfileModule() {
        System.out.println("I am on the My Profile module");
    }
}
