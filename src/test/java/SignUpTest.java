import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.SignUp;
import task.validations.IsLoggedInSuccessfully;
import task.validations.IsSignUpSuccessfully;

public class SignUpTest extends BaseTest {
    @Test
    public void signUpSuccess() {
        SignUp.as(webDriver, "Eliceo Joel Herbas", "myemail@gmail.com", "password");
        Assert.assertTrue(IsSignUpSuccessfully.visibleLogoutButton(webDriver));
        Assert.assertTrue(IsSignUpSuccessfully.visiblePageTittle(webDriver));
    }
}
