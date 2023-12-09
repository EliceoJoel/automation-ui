import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Logout;
import task.validations.IsLoggedInSuccessfully;
import task.validations.IsLoggedOutSucessfully;

public class LogoutTest extends BaseTest {
    @Test
    public void logoutSuccess() {
        Login.as(webDriver, "aei@gmail.com", "aei123");
        Logout.as(webDriver);
        Assert.assertTrue(IsLoggedOutSucessfully.visibleLoginButton(webDriver));
        Assert.assertTrue(IsLoggedOutSucessfully.visibleSingUpButton(webDriver));
    }
}
