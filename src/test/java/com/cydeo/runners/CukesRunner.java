package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //determines what type of report we want to generate with our project, and also where we want to store.
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                //"me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },

        // we provide the path of the 'features' directory and let our project know where to find all the feature files.
        features = "src/test/resources/features",

        //glue gives path to the package of the step_definitions
        glue = "com/cydeo/step_definitions",

        // dryRun determines if we want to execute the step_definitions or not
        // if dryRun is true: dryRun is turned on, and step definitions are turned off (will not run)
        // if dryRUn is false: dryRun is turned off, and step definitions are turned on (will run)
        // this is mostly used for when implementing new steps and step definitions, and we do not want to run the code and open browser etc.,just to get the snippets.
        dryRun = false,

        // What are tags and why we use them?
        // Tag allows us to create different scenario suites or groups to run
        // we can include, or exclude different feature files or scenarios using tags.
        tags = ""
)
public class CukesRunner {

}
