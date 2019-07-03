package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/skeleton/sc3.feature"},glue= "skeleton",
plugin="json:target/cucumber.json")

public class Stepdefs {
   
}
