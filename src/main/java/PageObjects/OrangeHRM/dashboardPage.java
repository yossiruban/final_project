package PageObjects.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class dashboardPage
{
    @FindBy (how = How.XPATH, using = "//div[@class='box']/div/h1")
    public WebElement txt_mainMenu;

    @FindBy (how = How.XPATH, using = "//*[@href='/index.php/time/viewEmployeeTimesheet']/img")
    public WebElement img_Timesheets;
}
