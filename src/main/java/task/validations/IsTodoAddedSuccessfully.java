package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LoggedPageUI;

public class IsTodoAddedSuccessfully {
    public static boolean visibleNewTodo(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, LoggedPageUI.logoutLink);
    }
}
