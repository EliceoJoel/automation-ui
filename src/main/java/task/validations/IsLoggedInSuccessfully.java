package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LoggedPageUI;

public class IsLoggedInSuccessfully {
    public static boolean visibleLogoutButton(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, LoggedPageUI.logoutLink);
    }

    public static boolean visiblePageTittle(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, LoggedPageUI.workTitle);
    }
}
