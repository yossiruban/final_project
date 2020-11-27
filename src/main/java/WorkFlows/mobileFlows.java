package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class mobileFlows extends commonOps
{
    @Step("Fill in Form and Calculate Mortgage")
    public static void calculate(String amount, String term,String rate)
    {
        uiActions.updateText(mortgageMain.txt_Amount, amount);
        uiActions.updateText(mortgageMain.txt_Years, term);
        uiActions.updateText(mortgageMain.txt_Rate, rate);
        uiActions.click(mortgageMain.btn_Calculate);
    }
}
