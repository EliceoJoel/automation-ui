package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoggedPageUI;

public class AddTodo {
    public static void as(WebDriver webDriver, String todo) {
        Enter.text(webDriver, LoggedPageUI.todoInput, todo);
        Click.on(webDriver, LoggedPageUI.newTodoButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "add todo");
    }
}
