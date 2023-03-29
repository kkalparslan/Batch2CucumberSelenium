package com.krafttech.pages;


import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

//    public LoginPages() {
//
//        PageFactory.initElements(Driver.get(), this);
//
//    }
    @FindBy(name = "email")
    public WebElement userEmailInput_loc;

    @FindBy(name = "password")
    public WebElement passwordInput_loc;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton_loc;

    @FindBy(xpath = "//*[contains(text(),'Email address or password is incorrect')]")
    public WebElement warningMessage_loc;

    public void loginUser(){
        String username= ConfigurationReader.get("userEmail");
        String password=ConfigurationReader.get("password");

        userEmailInput_loc.sendKeys(username);
        passwordInput_loc.sendKeys(password);
        submitButton_loc.click();
    }
    public void loginWithParameters(String email, String password){
        userEmailInput_loc.sendKeys(email);
        passwordInput_loc.sendKeys(password);
        submitButton_loc.click();
    }
    public String getWarninMessageText(String message){
       return Driver.get().findElement(By.xpath("//*[contains(text(),'"+message+"')]")).getText();
       }
}



