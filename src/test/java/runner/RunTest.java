package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions	(features="src/test/java/features",glue="stepsdefinition",
                    monochrome=true,
					publish=true,
					tags="@smoke"// execute all @smoke scenarios
					//tags ="@functional or @smoke" to execute test case with @ functional or @smoke
					)

//@CucumberOptions(features={"src/test/java/features/CreateLead.feature","src/test/java/features/EditLead.feature"},glue="stepsdefinition",monochrome=true,publish=true)
public class RunTest extends AbstractTestNGCucumberTests{
	
		

}
