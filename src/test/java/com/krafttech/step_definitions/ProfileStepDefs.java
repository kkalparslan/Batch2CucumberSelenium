package com.krafttech.step_definitions;

import com.krafttech.pages.ProfilePage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProfileStepDefs {

    ProfilePage profilePage=new ProfilePage();

    @When("User should go to My Profile")
    public void user_should_go_to_my_profile() {
        profilePage.myProfile_loc.click();
    }
    @When("User should go to navigate to {string}")
    public void user_should_go_to_navigate_to(String tabName) {
        profilePage.profileTabs(tabName);
    }
    @When("User should input the information boxes")
    public void user_should_input_the_information_boxes() {
        profilePage.fullName.clear();
        profilePage.fullName.sendKeys("Alparslan");
        profilePage.about.clear();
        profilePage.about.sendKeys("This is great work");
        profilePage.company.clear();
        profilePage.company.sendKeys("GHAN IT");

        BrowserUtils.waitForVisibility(profilePage.slider, 5);
        BrowserUtils.dragAndDropBy(profilePage.slider,150,0);

        Select select=new Select(profilePage.job);
        select.selectByVisibleText("SDET");
        profilePage.website.clear();
        profilePage.website.sendKeys("kraftechnolgie.com");
        profilePage.location.clear();
        profilePage.location.sendKeys("Ankara");
        profilePage.skills.clear();
        profilePage.skills.sendKeys("Postman, RestAssured, API, SQL");

        BrowserUtils.clickWithJS(profilePage.save);
    }
    @Then("User should verify profile updated message")
    public void user_should_verify_profile_updated_message() {
        String actulaMsg=profilePage.profileUpdate.getText();
        String expectedMsg="Profile Updated";
        Assert.assertEquals(expectedMsg, actulaMsg);
    }
    @Then("User should see the profile options")
    public void user_should_see_the_profile_options(List<String> profileOptions) {
        List<String>actualOptions=BrowserUtils.getElementsText(profilePage.profileOptions_loc);
        System.out.println("actualOptions.size() = " + actualOptions.size());
        System.out.println("actualOptions = " + actualOptions);
        System.out.println("profileOptions = " + profileOptions);

        Assert.assertEquals(profileOptions, actualOptions);
    }
}
