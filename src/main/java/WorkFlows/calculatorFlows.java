package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class calculatorFlows extends commonOps
{
    @Step("Calculate Addition")
    public static void getCalculatorResult()
    {
        uiActions.click(calcMain.btn_Clear);
        uiActions.click(calcMain.btn_Five);
        uiActions.click(calcMain.btn_Plus);
        uiActions.click(calcMain.btn_One);
        uiActions.click(calcMain.btn_Equals);
    }
}
