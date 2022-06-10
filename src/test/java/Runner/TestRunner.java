package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// from here I want to execute cucumber file
// I want to run login.feature


// dryRun: if I want to check if all the methods are implemented
// dryRun will not execute the code/ script when it is true
// why we give curly brackets, it make sure that it looks inside the package/ path
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Login\\Login.feature"},
glue = {"Test"}, dryRun = false, tags = "@PositiveCase", 
plugin = {"html:testout/liesl.html"})

public class TestRunner {

}
