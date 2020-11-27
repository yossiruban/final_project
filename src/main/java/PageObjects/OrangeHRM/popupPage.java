package PageObjects.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class popupPage
{
    @FindBy(how = How.ID, using = "dialogDeleteBtn")
    public WebElement btn_OkPopup;
}
