package com.acikgoz.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",
        }, // to generate different types of reporting
        features ="./src/test/resources/features", //path of the feature file //  "classpath:features" can also be used
        glue = "/com/acikgoz/step_definitions", // path of step definition files
        dryRun = false, // to check the mapping is proper between the feature file and step deifnition file
        strict = false, // for checking if any step is not defined in the step definition file
        monochrome = true,  // to display console output in a good and more readable format
        tags = { "@newyear" }
)
public class CukesRunner {

}
