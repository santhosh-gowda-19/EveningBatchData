package runnerScripts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = 
{"src/test/java/loginScripts/loginCred.feature"},
glue = {"stepDefn"},plugin = {"html:target/cucumberReport.html"})
public class Runner1 {

}
