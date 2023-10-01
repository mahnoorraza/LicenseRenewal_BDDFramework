package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue = {"StepDefinitions"},
           tags = ("not @skip"),
        plugin = {"summary","pretty","html:target/cucumber-reports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        		
},
        

  monochrome = true,
  publish = true
  )


public class TestRunner {

}