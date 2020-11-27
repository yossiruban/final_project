package PageObjects.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddEmployeeMenuPage
{
    @FindBy(how = How.ID, using = "menu_pim_addEmployee")
    public WebElement link_AddEmployee;
}
