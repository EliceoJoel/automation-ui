package ui;

import org.openqa.selenium.By;

public class LoggedPageUI {
    public  static By logoutLink = By.id("ctl00_HeaderTopControl1_LinkButtonLogout");
    public  static  By workTitle = By.id("CurrentProjectTitle");
    public  static By todoInput = By.id("NewItemContentInput");
    public  static By newTodoButton = By.id("NewItemAddButton");
    public static By lastTodo = By.xpath("//div[@class='ItemContentDiv'][last()]");
    public  static By newProjectInput = By.id("NewProjNameInput");
    public  static By newProjectAddButton = By.id("NewProjNameButton");
    public static By lastProject = By.xpath("(//td[@class='ProjItemContent'])[last()]");
}
