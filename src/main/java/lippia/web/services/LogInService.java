package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.LogInConstants;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LogInService {

    //Click Manually Log In Button
    public static void LogInManually(){
        WebActionManager.click(LogInConstants.MANUALLY_LOGIN_BUTTON);
    }

    //Set Email
    public static void SetEmail( String email ){
        WebActionManager.setInput(LogInConstants.ENTER_EMAIL, email );
    }

    //Clockify Log In Page
    public static void LogInPage(){
        navigateTo("https://app.clockify.me/en/login");
    }

    //Set Password
    public static void SetPassword(String password){
        WebActionManager.setInput(LogInConstants.ENTER_PASSWORD, password);
    }

    //Click Log In
    public static void ClickLogIn(){
        WebActionManager.click(LogInConstants.LOG_IN);
    }

    //Navigate to Clockify Time Tracker
    public static void TimeTrackerPage(){
        navigateTo("https://app.clockify.me/workspaces");
    }

    //Click password
    public static void PasswordClick(){
        waitVisibility(LogInConstants.CLICK_PASSWORD);
        WebActionManager.click(LogInConstants.CLICK_PASSWORD);
    }

    //Verify error notification
    public static void ErrorVerification(){
        waitVisibility(LogInConstants.INVALID_EMAIL);
        Assert.assertTrue(isVisible(LogInConstants.INVALID_EMAIL));

    }


}
