package PageObjects.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchEmployeePage
{
    @FindBy(how = How.ID, using = "empsearch_id")
    public WebElement txt_EmployeeId;

    @FindBy(how = How.ID, using = "searchBtn")
    public WebElement btn_Search;
}
