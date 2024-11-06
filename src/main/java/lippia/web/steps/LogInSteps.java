package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogInService;

public class LogInSteps extends PageSteps {


    //Manually log In
    @Given("The client is on clockify log in page")
        public void LogInPage() {
            LogInService.LogInPage();
    }

    @When("The client click on 'Log in manually'")
        public void theClientClickOnLogInManually() {
            LogInService.LogInManually();
    }

    @And("^The client set the email (.*)$")
        public void theClientSetTheEmail(String email) {
            LogInService.SetEmail( email );
    }

    @And("^The client set the password (.*)$")
        public void theClientSetThePassword(String password) {
            LogInService.SetPassword( password );
    }

    @And("The client click on Login button")
        public void theClientClickOnLogInButton() {
            LogInService.ClickLogIn();
    }

    @And("The client click on password")
        public void PasswordClick() {
            LogInService.PasswordClick();
    }

    @Then ("The system notified error message")
        public void InvalidEmail() {
            LogInService.ErrorVerification();
    }
}
