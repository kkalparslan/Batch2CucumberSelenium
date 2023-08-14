package com.krafttech.pages;


import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//h1[.='Dashboard']")
    public WebElement dashboardPageTitle_loc;
    @FindBy(xpath = "(//span[.='</aFm>'])[1]")
    public WebElement aFmTitle_loc;
    @FindBy(xpath = "//span[@class='d-none d-md-block dropdown-toggle ps-2']")
    public WebElement userPopUp_loc;
    @FindBy(xpath = "//a[.='Home']")
    public WebElement homeLink_loc;
    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOut_loc;
    @FindBy(xpath = "//div[@class='copyright']")
    public WebElement copyRight_loc;
    @FindBy(xpath = "//h3[.='isa akyuz']")
    public WebElement usernameLocator;
    @FindBy(xpath = "//span[.='JavaScript']")
    public WebElement tabLocator;
    @FindBy(xpath = "//span[.='Modal']")
    public WebElement moduleLocator;
    @FindBy(xpath = "//a[@class='nav-link nav-profile d-flex align-items-center pe-0']")
////span[@class='d-none d-md-block dropdown-toggle ps-2']
    public WebElement getUserName_loc;

    public String dashboardPageTitle(String title) {
        String Title = dashboardPageTitle_loc.getText();
        return Title;
    }

    public String UsersNames(String name) {
        String usernameLocator = "//h3[.='" + name + "']";
        BrowserUtils.waitForPresenceOfElement(By.xpath(usernameLocator), 5);
        WebElement UserName = Driver.get().findElement(By.xpath(usernameLocator));

        String actualName = UserName.getText();
        return actualName;
    }

    public String getUserName() {
        BrowserUtils.waitForVisibility(getUserName_loc, 5);
        return getUserName_loc.getText();
    }

    public String getHomeName(String homeName) {
        BrowserUtils.waitFor(1);
        return Driver.get().findElement(By.xpath("//li[text()='" + homeName + "']")).getText();
    }
}
