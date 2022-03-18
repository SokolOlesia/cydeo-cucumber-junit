package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html", //for create new file for reports
        features = "src/test/resources/features", //
        glue = "com/cydeo/step_definitions",
        dryRun = false, //false - код запускается полностью
        tags = "@Google"

)
public class CukesRunner {
}
