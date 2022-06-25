package com.cydeo.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */
/*
 Hooks:Hooks are used to create pre- and post- conditions for scenarios and steps.
 - When we are using Hooks, we need to be extra careful because all the logic we create will be implements for all the scenarios and/or steps in our project.
 - We can specify using @tags if we want the pre- or post- condition to be applying to only certain steps or scenario
 */

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    // import from io.cucumber.java not
    @Before(order = 1)
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }
    @Before(value = "@login",order = 2)
    public void setupScenarioForLogin(){
        System.out.println("====this will only apply to scenario with @login tag");
    }

    @Before(value = "@db",order = 0)
    public void setupForDataBaseScenario(){
        System.out.println("====this will only apply to scenario with @db tag");
    }

    @After
    public void teardownScenario() {

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");

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
