import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddTodo;
import task.tasking.Login;
import task.validations.IsProjectAddedSuccessfully;
import task.validations.IsTodoAddedSuccessfully;

public class NewProjectTest extends BaseTest {
    @Test
    public void addTodo() {
        Login.as(webDriver, "aei@gmail.com", "aei123");
        AddTodo.as(webDriver, "My new project");
        Assert.assertTrue(IsProjectAddedSuccessfully.visibleNewProject(webDriver));
        Assert.assertTrue(IsProjectAddedSuccessfully.getTextOfLastProject(webDriver).contains("My new project"));
    }
}
