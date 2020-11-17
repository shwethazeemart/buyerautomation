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
@CucumberOptions(strict = true, features = "src/test/resources/functionalTests", glue = { "stepDefinitions" })
public class TestRunner {

}    