package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.timeTrackerConstants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class timeTrackerService {

    //Click on time tracker button
    public static void timeTrackerButton(){

        WebActionManager.click(timeTrackerConstants.TIME_TRACKER_BUTTON);
    }

    //Manual time entry
    public static void manualTimeEntry(){
        WebActionManager.click(timeTrackerConstants.MANUAL_TIME_ENTRY);
    }

    //Set start time entry
    public static void setStartTimeEntry(String time){
        WebElement delete = WebActionManager.getElement(timeTrackerConstants.START_TIME_ENTRY);
        delete.sendKeys(Keys.CONTROL + "a");
        delete.sendKeys(Keys.DELETE);
        WebActionManager.setInput(timeTrackerConstants.START_TIME_ENTRY, time);
    }

    //Set finish time entry
    public static void setFinishTimeEntry(String time){
        WebElement delete = WebActionManager.getElement(timeTrackerConstants.FINISH_TIME_ENTRY);
        delete.sendKeys(Keys.CONTROL + "a");
        delete.sendKeys(Keys.DELETE);
        WebActionManager.setInput(timeTrackerConstants.FINISH_TIME_ENTRY, time);
    }

    //Click on calendar
    public static void clickOnCalendar(){
        waitVisibility(timeTrackerConstants.CALENDAR);
        WebActionManager.click(timeTrackerConstants.CALENDAR);
    }

    //Click on date
    public static void clickOnDate(){
        waitVisibility(timeTrackerConstants.ADD_DATE);
        WebActionManager.click(timeTrackerConstants.ADD_DATE);
    }

    //Click on add button
    public static void clickOnAddButton(){
        WebActionManager.click(timeTrackerConstants.ADD_TIME_TRACKER);
    }

    //Added time entry
    public static void addedTimeEntry(){
        waitVisibility(timeTrackerConstants.TIME_ENTRY_ADDED);
        Assert.assertTrue(isVisible(timeTrackerConstants.TIME_ENTRY_ADDED));
    }

    //Time entry cancelled, clicking on clock
    public static void cancelledTimeEntry(){
        WebActionManager.click(timeTrackerConstants.CLOCK);
    }

    //Don´t added time to project clock
    public static void projectClock(){
        Assert.assertTrue(isVisible(timeTrackerConstants.PROJECT_CLOCK));
    }

    //Expand time entries
    public static void expandTimeEntries(){
        WebActionManager.click(timeTrackerConstants.EXPAND_TIME_ENTRIES);
    }

    //Update start clock
    public static void startClockUpdate(String clock){
        WebElement delete = WebActionManager.getElement(timeTrackerConstants.UPDATE_START_CLOCK, clock);
        delete.sendKeys(Keys.CONTROL + "a");
        delete.sendKeys(Keys.DELETE);
        WebActionManager.setInput(timeTrackerConstants.UPDATE_START_CLOCK, clock);
    }

    //Update finish clock
    public static void finishClockUpdate(String clock){
        WebElement delete = WebActionManager.getElement(timeTrackerConstants.UPDATE_FINAL_CLOCK, clock);
        delete.sendKeys(Keys.CONTROL + "a");
        delete.sendKeys(Keys.DELETE);
        WebActionManager.setInput(timeTrackerConstants.UPDATE_FINAL_CLOCK, clock);
    }

    //Click on time entry calendar
    public static void timeEntryCalendar(){
        WebActionManager.click(timeTrackerConstants.UPDATE_CALENDAR);
    }

    //Click on update date
    public static void dateUpdated(){
        WebActionManager.click(timeTrackerConstants.UPDATE_DATE);
    }

    //Time entry updated
    public static void timeEntryUpdated(){
        Assert.assertTrue(isVisible(timeTrackerConstants.TIME_ENTRY_UPDATED));
    }

}
