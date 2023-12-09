import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.SignUp;
import task.validations.IsLoggedInSuccessfully;
import task.validations.IsSignUpSuccessfully;

public class LoginTest extends BaseTest {
    @Test
    public void loginSuccess() {
        Login.as(webDriver, "aei@gmail.com", "aei123");
        Assert.assertTrue(IsLoggedInSuccessfully.visibleLogoutButton(webDriver));
        Assert.assertTrue(IsLoggedInSuccessfully.visiblePageTittle(webDriver));
    }
}
