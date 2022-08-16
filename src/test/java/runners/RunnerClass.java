package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the features file
        features = "src/test/resources/features/EmployeeSearch.feature",
        //glue is where we find implementations for gherkin steps
        //we provide the path of package where we defined all the steps
        glue = "steps" ,
        //if we set dryRun to true, it stops the actual execution and quickly
        //scan all the steps wheter they are implemented or not
        //to execute the script , set dryRun to false(recommended to set it to false for rep)
        dryRun=false,
        //it cleans your console output  for cucumber test if it has
        //irrelevant or unreadeble character in it, recommended to set it to true always
        monochrome =true
)
public class RunnerClass {

}