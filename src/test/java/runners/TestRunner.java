//Name:Aravindkumar S
//Date:05.09.2024
//CapstoneProject:API testing of Movie rental management endpoints, using restassured with cucumber

package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
 features = "src/test/resources/features",
 glue = "stepdefinitions",
 plugin = { "pretty", "html:target/cucumber-reports.html" }
)
public class TestRunner extends AbstractTestNGCucumberTests { 
}
