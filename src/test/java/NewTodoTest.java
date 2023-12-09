import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddTodo;
import task.tasking.Login;
import task.tasking.SignUp;
import task.validations.IsSignUpSuccessfully;
import task.validations.IsTodoAddedSuccessfully;

public class NewTodoTest extends BaseTest {
    @Test
    public void addTodo() {
        Login.as(webDriver, "aei@gmail.com", "aei123");
        AddTodo.as(webDriver, "My new To Do");
        Assert.assertTrue(IsTodoAddedSuccessfully.visibleNewTodo(webDriver));
        Assert.assertTrue(IsTodoAddedSuccessfully.getTextOfLastTodo(webDriver).contains("My new To Do"));
    }
}
