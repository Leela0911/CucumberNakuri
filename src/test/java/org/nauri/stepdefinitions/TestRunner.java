package org.nauri.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\MS-Office 2007\\Private\\eclipse\\CucumberNakuri\\src\\test\\resources\\Features",
                     glue = "org.nakuri.stepdefinitions",
                     monochrome = true,
                     dryRun = false
                   )

public class TestRunner {

}
