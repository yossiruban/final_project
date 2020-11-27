package PageObjects.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddEmployeePage
{
    @FindBy(how = How.ID, using = "firstName")
    public WebElement txt_firstName;

    @FindBy(how = How.ID, using = "middleName")
    public WebElement txt_middleName;

    @FindBy(how = How.ID, using = "lastName")
    public WebElement txt_lastName;

    @FindBy(how = How.ID, using = "btnSave")
    public WebElement btn_Save;

}
