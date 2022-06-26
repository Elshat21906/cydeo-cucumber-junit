package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",//determines what type of report we want to generate with our project, and also where we want to store.
        features = "src/test/resources/features",// we provide the path of the 'features' directory and let our project know where to find all the feature files.
        glue = "com/cydeo/step_definitions",//glue gives path to the package of the step_definitions
        dryRun = false,// dryRun determines if we want to execute the step_definitions or not
                       // if dryRun is true: dryRun is turned on, and step definitions are turned off (will not run)
                       // if dryRUn is false: dryRun is turned off, and step definitions are turned on (will run)
                       // this is mostly used for when implementing new steps and step definitions, and we do not want to run the code and open browser etc.,just to get the snippets.
        tags = "@maleScientist" // What are tags and why we use them?
                                  // Tag allows us to create different scenario suites or groups to run
                                  // we can include, or exclude different feature files or scenarios using tags.
)
public class CukesRunner {

}
