package com.krafttech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.sql.SQLOutput;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tThis is coming from Before Method");

    }

    @After
    public void tearDown(){
        System.out.println("\tThis is coming from After Method");

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
