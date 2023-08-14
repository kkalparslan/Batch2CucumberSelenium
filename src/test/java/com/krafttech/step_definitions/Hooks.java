package com.krafttech.step_definitions;

import com.krafttech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        //System.out.println("\tThis is coming from Before Method");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
    @After
    public void tearDown(Scenario scenario){  // after method kendisinden önceki scenario fail olsa bile çalışır..
                             // buradan hooks ile .feature file arasında bir bağlantı olmadığını anlıyoruz
        //System.out.println("\tThis is coming from After Method");
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();

    }
    @Before("@db")
    public void setUpDb(){
        System.out.println("\t Connecting DB");
    }
    @After("@db")
    public void tearDownDb(){
        System.out.println("\t Disconnecting DB");
    }
}
