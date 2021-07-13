package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * 
 * @author AjanthanSivalingarajah
 * @since 2020/05/12 
 *
 */
@RunWith(Cucumber.class)  
@CucumberOptions(strict = true, features = "src/test/resources/functionalTests/AdminLogin.feature", glue = { "stepDefinitions" },monochrome=true,tags="@Smoke",dryRun=false,
plugin= {"json:target/cucumber.json"})
public class TestRunner {
  
}                