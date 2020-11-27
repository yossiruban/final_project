package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Utilities.listeners.class)
public class orangeWebDB extends commonOps
{
    @Test(description = "Test01 Login to Orange")
    @Description("Test Description: Login to Orange Web Application")
    public void test01_login()
    {
        WebFlows.loginDB ();
        verifications.textVerify(OrangeDashboard.txt_mainMenu,"Dashboard");
    }

}
