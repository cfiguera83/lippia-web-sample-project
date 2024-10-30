package lippia.web.constants;

public class timeTrackerConstants {

//Time tracker button
public static final String TIME_TRACKER_BUTTON = "xpath:(//span[contains(text(),'TIME TRACKER')])[1]";

//Time entry manual mode
public static final String MANUAL_TIME_ENTRY = "xpath://a[@id='manual-mode']";

//Start Time tracker time
public static final String START_TIME_ENTRY = "xpath://time-tracker-recorder[@class='cl-new-layer cl-time-tracker-recorder']//input-time-ampm[1]//input[1]";

//Add finish time entry
public static final String FINISH_TIME_ENTRY = "xpath://time-tracker-recorder[@class='cl-new-layer cl-time-tracker-recorder']//input-time-ampm[2]//input[1]";

//Add start time entry
public static final String ADD_TIME_TRACKER = "xpath://button[@class='cl-btn cl-btn-primary cl-d-none cl-d-lg-custom-block']";

//Calendar
public static final String CALENDAR = "xpath://span[@class='pointer cl-non-selectable cl-position-relative cl-z-index-2 ng-star-inserted']//img[@alt='Select date from calendar']";

//Add date
public static final String ADD_DATE = "xpath://td[@class='available'][normalize-space()='24']";

//Time entry added
public static final String TIME_ENTRY_ADDED = "xpath://div[@aria-label='Time entry has been created']";

//Clock
public static final String CLOCK = "xpath://input[@class='cl-form-control cl-input-time-picker-sum ng-untouched ng-pristine ng-valid']";

//Project clock
public static final String PROJECT_CLOCK = "xpath://div[@class='cl-h2 cl-mb-0 cl-ml-2 cl-lh-1']";

//Expand time entries
public static final String EXPAND_TIME_ENTRIES = "xpath://span[@class='cl-badge cl-badge-same-entries']";

//Add description
public static final String DESCRIPTION = "id:67225d32a75c3e4ef3f46f00";

//Update start clock
public static final String UPDATE_START_CLOCK = "xpath:(//input[@type='text'])[11]";

//Update final clock
public static final String UPDATE_FINAL_CLOCK = "xpath:(//input[@type='text'])[12]";

//Update time entry calendar
public static final String UPDATE_CALENDAR = "xpath:(//img[@alt='Select date from calendar'])[3]";

//Update time entry date
public static final String UPDATE_DATE = "xpath://body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[5]";

//Time entry updated
public static final String TIME_ENTRY_UPDATED = "xpath://div[@aria-label='Successfully updated date and time']";

}
