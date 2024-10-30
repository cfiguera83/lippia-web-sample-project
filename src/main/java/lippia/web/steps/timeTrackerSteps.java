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

    @And("The client click on manual time entry")
    public void TheClientClickOnManualTimeEntry(){
        timeTrackerService.manualTimeEntry();
    }

    @And("The client set start time (.*)$")
    public void TheClientSetStartTimeEntry(String time){
        timeTrackerService.setStartTimeEntry(time);
    }

    @And("The client set finish time (.*)$")
    public void TheClientSetFinishTimeEntry(String time){
        timeTrackerService.setFinishTimeEntry(time);
    }

    @And ("The client click on calendar")
    public void TheClientClickOnCalendar(){
        timeTrackerService.clickOnCalendar();
    }

    @And("The client click on date")
    public void TheClientClickOnDate(){
        timeTrackerService.clickOnDate();
    }

    @And("The client click on Add button")
    public void TheClientClickOnAddButton(){
        timeTrackerService.clickOnAddButton();
    }

    @Then("The time entry is added successfully")
    public void TheTimeEntryIsAddedSuccessfully(){
        timeTrackerService.addedTimeEntry();
    }

    @And("The client click on clock")
    public void TheClientClickOnClock(){
        timeTrackerService.cancelledTimeEntry();
    }

    @Then("The time entry is not added")
    public void TheTimeEntryIsNotAdded(){
        timeTrackerService.projectClock();
    }

    @When("The client click on expand time entries button")
    public void theClientClickOnExpandTimeEntriesButton() {
        timeTrackerService.expandTimeEntries();
    }


    @And("The client update start clock (.*)$")
    public void theClientUpdateStartTime(String clock) {
        timeTrackerService.startClockUpdate(clock);
    }

    @And("The client update finish clock (.*)$")
    public void theClientUpdateFinishTime(String clock) {
        timeTrackerService.finishClockUpdate(clock);
    }

    @And("The client click on time entry calendar")
    public void theClientClickOnTimeEntryCalendar() {
        timeTrackerService.timeEntryCalendar();
    }

    @And("The client click on date to update the time entry (.*)$")
    public void theClientClickOnDateToUpdateTheTimeEntry(String update) {
        timeTrackerService.dateUpdated();
    }

    @Then("The time entry is successfully updated")
    public void theTimeEntryIsSuccessfullyUpdated() {

    }
}


