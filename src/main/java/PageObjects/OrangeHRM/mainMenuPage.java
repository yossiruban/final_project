package PageObjects.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainMenuPage
{
    @FindBy(how = How.ID, using = "menu_pim_viewPimModule")
    public WebElement btn_PIM;
}
