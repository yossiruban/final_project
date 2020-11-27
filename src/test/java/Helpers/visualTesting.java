package Helpers;

import Utilities.commonOps;
import Utilities.helperMethods;
import WorkFlows.WebFlows;
import org.testng.annotations.Test;

public class visualTesting extends commonOps
{
    @Test
    public void createScreenShot()
    {
        WebFlows.login("Admin","admin123");
        helperMethods.takeElementScreenShot(OrangeDashboard.img_Timesheets, "orangeTimesheets_ver01");
    }

}
