package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.LoggedPageUI;

public class AddProject {
    public static void as(WebDriver webDriver, String projectName) {
        Enter.text(webDriver, LoggedPageUI.newProjectInput, projectName);
        Click.on(webDriver, LoggedPageUI.newProjectAddButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "add project");
    }
}
