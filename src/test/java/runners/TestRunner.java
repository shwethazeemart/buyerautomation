package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 
 
<<<<<<< HEAD
    

 
 
@RunWith(Cucumber.class)    



@CucumberOptions(strict = true, features = "src/test/resources/functionalTests/SupplierHubAllTestcases.feature",
=======

@RunWith(Cucumber.class)   

@CucumberOptions(strict = true, features = "src/test/resources/functionalTests/Buyerhuballlatestcode.feature",
>>>>>>> f3e9142c4bd3a3ecdf0fc881f013f9bbef52b125

tags="@Smoke",
glue = { "stepDefinitions" },monochrome=true,dryRun=false, 
plugin = {"json:target/cucumber.json"}) 
 

 
public class TestRunner { 
	
		  
}                                                 
         
                                                 
           
 