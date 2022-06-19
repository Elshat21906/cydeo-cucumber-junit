package com.cydeo.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    // import from io.cucumber.java not
    @Before
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }
    @Before("@login")
    public void setupScenarioForLogin(){
        System.out.println("====this will only apply to scenario with @login tag");
    }

    @Before("@db")
    public void setupForDataBaseScenario(){
        System.out.println("====this will only apply to scenario with @db tag");
    }

    @After
    public void teardownScenario(){
        System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    @BeforeStep
    public void setupSteps() {
        System.out.println("--------> applying setup using @BeforeStep)");
    }

    @AfterStep
        public void afterStep(){
            System.out.println("--------> applying tearDown using @AfterStep");
    }
}
