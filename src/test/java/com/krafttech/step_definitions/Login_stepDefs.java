package com.krafttech.step_definitions;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;
public class Login_stepDefs {
    LoginPage loginPage =new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
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
    @When("The user enters Emel credentials")
    public void the_user_enters_emel_credentials() {
        System.out.println("I enter Emel username and password and click login button");
    }
    @When("The user enters Emine Ceren credentials")
    public void the_user_enters_emine_ceren_credentials() {
        System.out.println("I enter Emine Ceren username and password and click login button");
    }
    @When("The user enters Azra credentials")
    public void the_user_enters_azra_credentials() {
        System.out.println("I enter Azra username and password and click login button");
    }
    @Given("User should be on the login page")
    public void user_should_be_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("User should input login information")
    public void user_should_input_login_information() {
        loginPage.loginUser();
    }
    @Then("User should be on home page")
    public void user_should_be_on_home_page() {
        BrowserUtils.waitFor(3);
        String actualTitle=Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("Verify title","Dashboard - Kraft Techex Lab - aFm",actualTitle);
    }
    @When("User should input {string} and {string}")
    public void userShouldInputAnd(String email, String password) {
        loginPage.loginWithParameters(email,password);
    }
    @Then("User should input following credantials")
    public void user_should_input_foolowing_credantials(Map<String, String> userInfo) {
        loginPage.loginWithParameters(userInfo.get("email"), userInfo.get("password"));
        String actualName=dashboardPage.getUserName();
        String expectedName=userInfo.get("Name");
        System.out.println("actualName = " + actualName);
        System.out.println("expectedName = " + expectedName);
        Assert.assertEquals(expectedName, actualName);
    }
    @Then("The warning message contains {string}")
    public void the_warning_message_contains(String expectedWarningMessage) {
        BrowserUtils.waitFor(1);
        String actualWarninMessage = loginPage.getWarninMessageText(expectedWarningMessage);
        Assert.assertEquals("Verify", expectedWarningMessage, actualWarninMessage);
    }
}
