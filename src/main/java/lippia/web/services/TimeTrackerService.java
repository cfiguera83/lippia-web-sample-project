package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.TimeTrackerConstants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;
import static org.bouncycastle.oer.its.etsi102941.CtlCommand.delete;

public class TimeTrackerService {

    //Click on time tracker button
    public static void TimeTrackerButton(){

        WebActionManager.click(TimeTrackerConstants.TIME_TRACKER_BUTTON);
    }

    //Manual time entry
    public static void ManualTimeEntry(){
        WebActionManager.click(TimeTrackerConstants.MANUAL_TIME_ENTRY);
    }

    //Set project description
    public static void ProjectDescription(String name){
        WebActionManager.setInput(TimeTrackerConstants.PROJECT_DESCRIPTION, name);
    }

    //Set start time entry
    public static void SetStartTimeEntry(String time){
        WebElement DeleteStartTimeEntry = WebActionManager.getElement(TimeTrackerConstants.START_TIME_ENTRY);
        DeleteStartTimeEntry.sendKeys(Keys.CONTROL + "a");
        DeleteStartTimeEntry.sendKeys(Keys.DELETE);
        WebActionManager.setInput(TimeTrackerConstants.START_TIME_ENTRY, time);
    }

    //Set finish time entry
    public static void SetFinishTimeEntry(String time){
        WebElement DeleteFinishTimeEntry = WebActionManager.getElement(TimeTrackerConstants.FINISH_TIME_ENTRY);
        DeleteFinishTimeEntry.sendKeys(Keys.CONTROL + "a");
        DeleteFinishTimeEntry.sendKeys(Keys.DELETE);
        WebActionManager.setInput(TimeTrackerConstants.FINISH_TIME_ENTRY, time);
    }

    //Click on calendar
    public static void ClickOnCalendar(){
        waitVisibility(TimeTrackerConstants.CALENDAR);
        WebActionManager.click(TimeTrackerConstants.CALENDAR);
    }

    //Click on date
    public static void ClickOnDate(){
        waitVisibility(TimeTrackerConstants.ADD_DATE);
        WebActionManager.click(TimeTrackerConstants.ADD_DATE);
    }

    //Click on add button
    public static void ClickOnAddButton(){
        WebActionManager.click(TimeTrackerConstants.ADD_TIME_TRACKER);
    }

    //Added time entry
    public static void AddedTimeEntry(){
        waitVisibility(TimeTrackerConstants.TIME_ENTRY_ADDED);
        Assert.assertTrue(isVisible(TimeTrackerConstants.TIME_ENTRY_ADDED));
    }

    //Time entry cancelled, clicking on clock
    public static void CancelledTimeEntry(){
        WebActionManager.click(TimeTrackerConstants.CLOCK);
    }

    //Don´t added time to project clock
    public static void ProjectClock(){
        Assert.assertTrue(isVisible(TimeTrackerConstants.PROJECT_CLOCK));
    }

    //Expand time entries
    public static void ExpandTimeEntries(){
        waitVisibility(TimeTrackerConstants.EXPAND_TIME_ENTRIES);
        WebActionManager.click(TimeTrackerConstants.EXPAND_TIME_ENTRIES);
    }

    //Click on add description
    public static void ClickOnDescription(){
        WebActionManager.click(TimeTrackerConstants.DESCRIPTION);
    }

    //Add description
    public static void AddDescription(String word){
        WebElement DeleteDescription = WebActionManager.getElement(TimeTrackerConstants.DESCRIPTION, word);
        DeleteDescription.sendKeys(Keys.CONTROL + "a");
        DeleteDescription.sendKeys(Keys.DELETE);
        WebActionManager.setInput(TimeTrackerConstants.DESCRIPTION, word);
    }


    //Update start clock
    public static void StartClockUpdate(String clock){
        waitVisibility(TimeTrackerConstants.UPDATE_START_CLOCK);
        WebElement DeleteStartClock = WebActionManager.getElement(TimeTrackerConstants.UPDATE_START_CLOCK, clock);
        DeleteStartClock.sendKeys(Keys.CONTROL + "a");
        DeleteStartClock.sendKeys(Keys.DELETE);
        WebActionManager.setInput(TimeTrackerConstants.UPDATE_START_CLOCK, clock);
    }

    //Update finish clock
    public static void FinishClockUpdate(String clock){
        waitVisibility(TimeTrackerConstants.UPDATE_FINAL_CLOCK);
        WebElement DeleteFinishClock = WebActionManager.getElement(TimeTrackerConstants.UPDATE_FINAL_CLOCK, clock);
        DeleteFinishClock.sendKeys(Keys.CONTROL + "a");
        DeleteFinishClock.sendKeys(Keys.DELETE);
        WebActionManager.setInput(TimeTrackerConstants.UPDATE_FINAL_CLOCK, clock);
    }

    //Click on time entry calendar
    public static void TimeEntryCalendar(){
        waitVisibility(TimeTrackerConstants.UPDATE_CALENDAR);
        WebActionManager.click(TimeTrackerConstants.UPDATE_CALENDAR);
    }

    //Click on update date
    public static void DateUpdated(){
        waitVisibility(TimeTrackerConstants.UPDATE_DATE);
        WebActionManager.click(TimeTrackerConstants.UPDATE_DATE);
    }

    //Time entry updated
    public static void TimeEntryUpdated(){
        waitVisibility(TimeTrackerConstants.TIME_ENTRY_UPDATED);
        Assert.assertTrue(isVisible(TimeTrackerConstants.TIME_ENTRY_UPDATED));
    }

    //Click clock
    public static void ClockButton(){
        WebActionManager.click(TimeTrackerConstants.CLOCK_BUTTON);
    }

    //Start button
    public static void StartButton(){
        WebActionManager.click(TimeTrackerConstants.START_BUTTON);
    }

    //Three points button
    public static void ThreePointsButton(){
        WebActionManager.click(TimeTrackerConstants.THREE_POINTS_BUTTON);
    }

    //Discard button
    public static void DiscardButton(){
        WebActionManager.click(TimeTrackerConstants.DISCARD_BUTTON);
    }

    //Make sure discard button
    public static void MakeSureDiscard(){
        waitVisibility(TimeTrackerConstants.MAKE_SURE_DISCARD_BUTTON);
        WebActionManager.waitPresence(TimeTrackerConstants.MAKE_SURE_DISCARD_BUTTON);
        WebActionManager.click(TimeTrackerConstants.MAKE_SURE_DISCARD_BUTTON);

    }

    //Time entry cancelled
    public static void TimeEntryCancelled(){
        waitVisibility(TimeTrackerConstants.DISCARD_ASSERT);
        Assert.assertTrue(isVisible(TimeTrackerConstants.DISCARD_ASSERT));
    }

}
