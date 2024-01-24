package com.krafttech.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class NavigationMenuStepDefs {

    @When("Get the text of dashboard")
    public void get_the_text_of_dashboard() {
        System.out.println("I got text of dashboard ");
    }
    @When("Go to Developers menu")
    public void go_to_developers_menu() {
        System.out.println("I went to developers menu ");
    }
    @When("Get the text of Developer")
    public void get_the_text_of_developer() {
        System.out.println("I got text of developers ");
    }
    @Then("Verify that text is developer")
    public void verify_that_text_is_developer() {
        System.out.println("Developers text is true ");
    }

    @When("Go to Edit Profile menu")
    public void go_to_edit_profile_menu() {
        System.out.println("I went to Edit Profile menu ");
    }
    @When("Get the text of Edit User Profile")
    public void get_the_text_of_edit_user_profile() {
        System.out.println("I got text of Edit User Profile ");
    }
    @Then("Verify that text is Edit User Profile")
    public void verify_that_text_is_edit_user_profile() {
        System.out.println("Edit User Profile text is true ");
    }

    @When("Go to My Profile menu")
    public void go_to_my_profile_menu() {
        System.out.println("I went to My Profile menu ");
    }
    @When("Get the text of User Profile")
    public void get_the_text_of_user_profile() {
        System.out.println("I got text of User Profile ");
    }
    @Then("Verify that text is User Profile")
    public void verify_that_text_is_user_profile() {
        System.out.println("User profile text is true ");
    }
}
