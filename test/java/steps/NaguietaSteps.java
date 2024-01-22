package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.NaguietaPaginaPrincipal;


public class NaguietaSteps {
    
    NaguietaPaginaPrincipal landingPage = new NaguietaPaginaPrincipal();

    @Given("I navigate to naguieta.github.io")
    public void iNavigateToNaguieta() {
        landingPage.navigateToNaguieta();
    }

    @When("I go to {string}")
    public void navigationNaguieta(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

}