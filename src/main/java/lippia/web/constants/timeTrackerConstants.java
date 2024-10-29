package lippia.web.constants;

public class timeTrackerConstants {

//Time tracker button
public static final String TIME_TRACKER_BUTTON = "xpath:(//span[contains(text(),'TIME TRACKER')])[1]";

//Start Time tracker time
public static final String START_TIME_ENTRY = "xpath://time-tracker-recorder[@class='cl-new-layer cl-time-tracker-recorder']//input-time-ampm[1]//input[1]";

//Add finish time entry
public static final String FINISH_TIME_ENTRY = "xpath://input[@class='cl-form-control cl-input-time-picker cl-input-time-picker--time-format-24 ng-pristine ng-valid ng-touched']";

//Add start time entry
public static final String ADD_TIME_TRACKER = "xpath://button[@class='cl-btn cl-btn-primary cl-btn-sm cl-d-block cl-d-lg-custom-none']";

//Time entry added
public static final String TIME_ENTRY_ADDED = "xpath://div[@aria-label='Time entry has been created']";

}
