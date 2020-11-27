package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import WorkFlows.WebFlows;


@Listeners(Utilities.listeners.class)
public class orangeWeb extends commonOps
{
    @Test(description = "Test01 Login to Orange")
    @Description("Test Description: Login to Orange Web Application")
    public void test01_login()
    {
        WebFlows.login(getData("user"),getData("password"));
        verifications.textVerify(OrangeDashboard.txt_mainMenu,"Dashboard");
    }

    @Test(description = "Test02 Add and Verify Employee")
    @Description("Test Description: Add a new Employee and Verify the Number of Employee")
    public void test02_AddEmployee()
    {
        WebFlows.AddEmployee("Yossi","","Ruban");
        WebFlows.SearchEmployee(WebFlows.emloyeeID);
        verifications.verifyNewEmployeeIdTest(OrangeNewEmployee.rows,1);
    }

    @Test(description = "Test03 Delete and Verify Employee")
    @Description("Test Description: Delete a new Employee and Verify No Records Found")
    public void test03_DeleteEmployee()
    {
        WebFlows.SearchEmployee(WebFlows.emloyeeID);
        WebFlows.DeleteEmployee();
        verifications.textVerify(OrangeNewEmployee.txt_NoRecordsFound,"No Records Found");
    }

    @Test(description = "Test04 verify Logo")
    @Description("Test Description: verify Orange Logo")
    public void test04_verifyLogo()
    {
        verifications.visualElement(OrangeDashboard.img_Timesheets,"orangeTimesheets_ver01");
    }

}
