package PageObjects.Calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num1Button']")
    public WebElement btn_One;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num5Button']")
    public WebElement btn_Five;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='plusButton']")
    public WebElement btn_Plus;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='clearButton']")
    public WebElement btn_Clear;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='equalButton']")
    public WebElement btn_Equals;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement field_result;
}
