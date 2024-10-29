package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.landingPageService;
import lippia.web.services.logInService;
import lippia.web.services.timeTrackerService;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class timeTrackerSteps {

    @Then("The client is on clockify dashboard page")
    public void TheClientIsOnTheDashboard(){
        logInService.timeTrackerPage();
        }

    @When("The client click on Time Tracker button")
    public void TheClientClickOnTimeTrackerButton(){
        timeTrackerService.timeTrackerButton();
    }

    @And("The client set start time (.*)$")
    public void TheClientSetStartTimeEntry(String time){
        timeTrackerService.setStartTimeEntry(time);
    }

    @And("The client set finish time (.*)$")
    public void TheClientSetFinishTimeEntry(String time){
        timeTrackerService.setFinishTimeEntry(time);
    }

    @And("The client click on Add button")
    public void TheClientClickOnAddButton(){
        timeTrackerService.clickOnAddButton();
    }

    @Then("The time entry is added successfully")
    public void TheTimeEntryIsAddedSuccessfully(){
        timeTrackerService.addedTimeEntry();
    }

    }


