package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.mobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class mortgageMobile extends commonOps
{
    @Test(description = "Test01 Verify Mortgage")
    @Description("Test Description: Fill in Mortgage fields and calculate Repaymet")
    public void test01_verifyRepayment()
    {
        mobileFlows.calculate("100000","10","4");
        verifications.textVerify(mortgageMain.txt_Repayment,"£1027.42");
    }
}
