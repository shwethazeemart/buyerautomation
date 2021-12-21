package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
 
    

@RunWith(Cucumber.class)  


@CucumberOptions(strict = true, features = "src/test/resources/functionalTests/BuyerInventoryTag.feature",


tags ="@Smoke",


glue = { "stepDefinitions" },monochrome=true,dryRun=false,
plugin = {"json:target/cucumber.json"})
 
public class TestRunner {
	  
	  
}                                                 
      
    
                                                
         