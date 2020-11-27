package PageObjects.Mortgage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how = How.ID, using = "etAmount")
    public WebElement txt_Amount;

    @FindBy(how = How.ID, using = "etTerm")
    public WebElement txt_Years;

    @FindBy(how = How.ID, using = "etRate")
    public WebElement txt_Rate;

    @FindBy(how = How.ID, using = "btnCalculate")
    public WebElement btn_Calculate;

    @FindBy(how = How.ID, using = "tvRepayment")
    public WebElement txt_Repayment;
}
