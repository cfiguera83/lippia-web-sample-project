package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.timeTrackerConstants;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class timeTrackerService {

    //Click on time tracker button
    public static void timeTrackerButton(){
        WebActionManager.click(timeTrackerConstants.TIME_TRACKER_BUTTON);
    }

    //Set start time entry
    public static void setStartTimeEntry(String time){
        WebActionManager.setInput(timeTrackerConstants.START_TIME_ENTRY, time);
    }

    //Set finish time entry
    public static void setFinishTimeEntry(String time){
        WebActionManager.setInput(timeTrackerConstants.FINISH_TIME_ENTRY, time);
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

}
