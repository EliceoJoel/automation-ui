package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class SignUp {
    public static void as(WebDriver webDriver, String fullName, String email, String password) {
        Click.on(webDriver, HomePageUI.signUpButton);
        Enter.text(webDriver, HomePageUI.signUpFullNameInput, fullName);
        Enter.text(webDriver, HomePageUI.signUpEmailInput, email);
        Enter.text(webDriver, HomePageUI.signUpPasswordInput, password);
        Click.on(webDriver, HomePageUI.signUpTermsCheckbox);
        Click.on(webDriver, HomePageUI.signUpSubmitButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Sign up");
    }
}
