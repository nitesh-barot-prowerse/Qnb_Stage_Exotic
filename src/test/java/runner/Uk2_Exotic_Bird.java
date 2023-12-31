package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Uk2_Exotic_Birds_Premier.feature",
        glue = {"steps", "hook"},
        monochrome = true,
        plugin = { "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
)
public class Uk2_Exotic_Bird {
}
