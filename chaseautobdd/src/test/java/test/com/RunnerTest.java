/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author Uma
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty" , "html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml", "rerun:target/rerun.txt"}  ,
        features="src/main/java/com/features/",
        glue=("com/definition/"),
        dryRun = false
        
)
public class RunnerTest {
    
  
   
}
