package retoOrange.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/agregarCandidato.feature",
        tags = "@Orange",
        glue = "retoOrange.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Orange {
}

