package ui;

import org.openqa.selenium.By;

public class HomePageUI {
    // signup
    public  static  By signUpButton = By.xpath("//div[@class='HPHeaderSignup']/a");
    public  static  By signUpFullNameInput = By.id("ctl00_MainContent_SignupControl1_TextBoxFullName");
    public  static  By signUpEmailInput = By.id("ctl00_MainContent_SignupControl1_TextBoxEmail");
    public  static  By signUpPasswordInput = By.id("ctl00_MainContent_SignupControl1_TextBoxPassword");
    public  static  By signUpTermsCheckbox = By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms");
    public static  By signUpSubmitButton = By.id("ctl00_MainContent_SignupControl1_ButtonSignup");

    //login
    public  static  By loginButton = By.xpath("//div[@class='HPHeaderLogin']/a");
    public  static  By loginEmailInput = By.id("ctl00_MainContent_LoginControl1_TextBoxEmail");
    public  static  By loginPasswordInput = By.id("ctl00_MainContent_LoginControl1_TextBoxPassword");
    public static  By loginSubmitButton = By.id("ctl00_MainContent_LoginControl1_ButtonLogin");

}
