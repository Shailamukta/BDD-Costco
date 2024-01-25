package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	tags = "@test11 or @bdd-data-driven",
					features = "src/test/java/features",
					glue = {"base","stepdefs"},
					plugin = {"pretty", "html:target/dolphin.html"},
					monochrome = true,
					dryRun = false
					)
public class TestRunner {

}
