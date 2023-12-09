package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoggedPageUI;

public class Logout {
    public static void as(WebDriver webDriver) {
        Click.on(webDriver, LoggedPageUI.logoutLink);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Logout");
    }
}
