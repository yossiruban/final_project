package PageObjects.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;


public class NewEmployeePage
{
    @FindBy(how = How.XPATH, using = "//*[@id='resultTable']/tbody")
    public List<WebElement> rows;

    @FindBy(how = How.ID, using = "ohrmList_chkSelectAll")
    public WebElement txt_CheckBox;

    @FindBy(how = How.ID, using = "btnDelete")
    public WebElement btn_Delete;

    @FindBy(how = How.XPATH, using = "//table[@id='resultTable']//td[@colspan='8']")
    public WebElement txt_NoRecordsFound;
}
