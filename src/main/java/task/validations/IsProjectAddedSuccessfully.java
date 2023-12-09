package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LoggedPageUI;

public class IsProjectAddedSuccessfully {
    public static boolean visibleNewProject(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, LoggedPageUI.lastProject);
    }

    public  static String getTextOfLastProject(WebDriver webDriver) {
        return webDriver.findElement(LoggedPageUI.lastProject).getText();
    }
}
