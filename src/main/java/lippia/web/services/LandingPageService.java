package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.LandingPageConstants;

import static com.crowdar.core.actions.WebActionManager.click;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LandingPageService extends ActionManager {

    //1. Test case: LogIn

    //Precondition
    public static void NavegarWebClockify(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    //Click Log In
    public static void ClickLogInButton() {
        Object landingPageConstants;
        WebActionManager.click(LandingPageConstants.LOG_IN_BUTTON);
    }

    //Log in page
    public static void LandingPage(){
        navigateTo("https://app.clockify.me/en/login");
    }

    //Verify log in button
    public static void GoogleButton() {
        WebActionManager.waitPresences(LandingPageConstants.GOOGLE_BUTTON);
        WebActionManager.waitVisibility(LandingPageConstants.GOOGLE_BUTTON);
        Assert.assertTrue(isVisible(LandingPageConstants.GOOGLE_BUTTON));
    }


}
