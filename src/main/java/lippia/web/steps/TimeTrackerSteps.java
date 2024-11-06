package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogInService;
import lippia.web.services.TimeTrackerService;

public class TimeTrackerSteps {

    @Then("The client is on clockify dashboard page")
    public void TheClientIsOnTheDashboard(){
        LogInService.TimeTrackerPage();
        }

    @When("The client click on Time Tracker button")
    public void TheClientClickOnTimeTrackerButton(){
        TimeTrackerService.TimeTrackerButton();
    }

    @And("The client click on manual time entry")
    public void TheClientClickOnManualTimeEntry(){
        TimeTrackerService.ManualTimeEntry();
    }

    @And("The client set start time (.*)$")
    public void TheClientSetStartTimeEntry(String time){
        TimeTrackerService.SetStartTimeEntry(time);
    }

    @And("The client set finish time (.*)$")
    public void TheClientSetFinishTimeEntry(String time){
        TimeTrackerService.SetFinishTimeEntry(time);
    }

    @And ("The client click on calendar")
    public void TheClientClickOnCalendar(){
        TimeTrackerService.ClickOnCalendar();
    }

    @And("The client click on date")
    public void TheClientClickOnDate(){
        TimeTrackerService.ClickOnDate();
    }

    @And("The client click on Add button")
    public void TheClientClickOnAddButton(){
        TimeTrackerService.ClickOnAddButton();
    }

    @Then("The time entry is added successfully")
    public void TheTimeEntryIsAddedSuccessfully(){
        TimeTrackerService.AddedTimeEntry();
    }

    @And("The client click on clock")
    public void TheClientClickOnClock(){
        TimeTrackerService.CancelledTimeEntry();
    }

    @Then("The time entry is not added")
    public void TheTimeEntryIsNotAdded(){
        TimeTrackerService.ProjectClock();
    }

    @When("The client click on expand time entries button")
    public void TheClientClickOnExpandTimeEntriesButton() {
        TimeTrackerService.ExpandTimeEntries();
    }

    @And("The client click on add description")
    public void TheClientClickOnAddDescription(){
        TimeTrackerService.ClickOnDescription();
    }

    @And("The client set a description (.*)$")
    public void TheClientSetDescription(String word){
        TimeTrackerService.AddDescription(word);
    }

    @And("The client update start clock (.*)$")
    public void TheClientUpdateStartTime(String clock) {
        TimeTrackerService.StartClockUpdate(clock);
    }

    @And("The client update finish clock (.*)$")
    public void TheClientUpdateFinishTime(String clock) {
        TimeTrackerService.FinishClockUpdate(clock);
    }

    @And("The client click on time entry calendar")
    public void TheClientClickOnTimeEntryCalendar() {
        TimeTrackerService.TimeEntryCalendar();
    }

    @And("The client click on date to update the time entry (.*)$")
    public void TheClientClickOnDateToUpdateTheTimeEntry(String update) {
        TimeTrackerService.DateUpdated();
    }

    @Then("The time entry is successfully updated")
    public void TheTimeEntryIsSuccessfullyUpdated() {
        TimeTrackerService.TimeEntryUpdated();
    }

    @When("The client click on clock button")
    public void TheClientClickOnClockButton() {
        TimeTrackerService.ClockButton();
    }

    @And("The client click on Start button")
    public void TheClientClickOnStartButton() {
        TimeTrackerService.StartButton();
    }

    @And("The client click on three point button")
    public void TheClientClickOnThreePointButton() {
        TimeTrackerService.ThreePointsButton();
    }

    @And("The client click on discard")
    public void TheClientClickOnDiscard() {
        TimeTrackerService.DiscardButton();
    }

    @And("The client click on make sure to discard")
    public void TheClientClickOnMakeSureToDiscard() {
        TimeTrackerService.MakeSureDiscard();
    }

    @Then("The time entry is cancelled")
    public void TheTimeEntryIsCancelled() {
        TimeTrackerService.TimeEntryCancelled();
    }

    @And("The client set the project name (.*)$")
    public void TheClientSetTheProjectNamePostman(String name) {
        TimeTrackerService.ProjectDescription(name);
    }
}


