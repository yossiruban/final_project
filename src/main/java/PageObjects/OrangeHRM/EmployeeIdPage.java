package PageObjects.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeIdPage
{
    @FindBy(how = How.ID, using = "personal_txtEmployeeId")
    public WebElement txt_EmployeeId;


    @FindBy(how = How.ID, using = "menu_pim_viewEmployeeList")
    public WebElement btn_EmployeeList;
}
