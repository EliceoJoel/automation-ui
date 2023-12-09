package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class Login {
    public static void as(WebDriver webDriver, String email, String password) {
        Click.on(webDriver, HomePageUI.loginButton);
        Enter.text(webDriver, HomePageUI.loginEmailInput, email);
        Enter.text(webDriver, HomePageUI.loginPasswordInput, password);
        Click.on(webDriver, HomePageUI.loginSubmitButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Login");
    }
}
