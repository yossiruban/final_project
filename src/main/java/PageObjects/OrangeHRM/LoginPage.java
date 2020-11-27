package PageObjects.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage
{
    @FindBy (how = How.ID, using = "txtUsername")
    public WebElement txt_userName;

    @FindBy (how = How.ID, using = "txtPassword")
    public WebElement txt_password;

    @FindBy (how = How.ID, using = "btnLogin")
    public WebElement btn_login;
}
