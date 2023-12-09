package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoggedPageUI;

public class IsLoggedOutSucessfully {
    public static boolean visibleLoginButton(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, HomePageUI.loginButton);
    }

    public  static  boolean visibleSingUpButton(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, HomePageUI.signUpButton);
    }
}
