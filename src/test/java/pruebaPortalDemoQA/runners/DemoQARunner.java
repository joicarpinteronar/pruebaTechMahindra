package pruebaPortalDemoQA.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/test_demo_qa.feature",
    glue = "pruebaPortalDemoQA.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class DemoQARunner {}
