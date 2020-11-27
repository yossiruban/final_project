package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.calculatorFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class calculatorDesktop extends commonOps
{
    @Test(description = "Test01 Verify Calculator Result")
    @Description("Test Description: verify Calculator Result")
    public void test01_calcResult()
    {
        calculatorFlows.getCalculatorResult();
        verifications.textVerify(calcMain.field_result,"6");
    }
}
