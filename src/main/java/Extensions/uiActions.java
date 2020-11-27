package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class uiActions extends commonOps
{
    @Step("Click on Element")
    public static void click(WebElement elem)
    {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("desktop")&& !Platform.equalsIgnoreCase("electron"))
        {
            wait.until(ExpectedConditions.elementToBeClickable(elem));
        }
        elem.click();
    }

    @Step("Send Text to Text-Field")
    public static void updateText(WebElement elem, String value)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }


    @Step("Mouse Hover to Element")
    public static void mouseHoverElements(WebElement elem1, WebElement elem2)
    {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

}
