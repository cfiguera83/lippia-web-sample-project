package lippia.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LandingPageService;

public class LandingPageSteps {

    //Get Access to log In From Clockify Home Page
    @Given("^The client is on landing page$")
    public void TheClientIsOnLandingPage() {

        LandingPageService.NavegarWebClockify();
    }

    @When("The client click on LogIn button")
    public void ClickLogIn() {

        LandingPageService.ClickLogInButton();
    }

    @Then("The client get access to clockify LogIn page")
    public void TheClientGetAccessToClockifyLogIn() {
        LandingPageService.LandingPage();
        LandingPageService.GoogleButton();
    }

}
