package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.apiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Utilities.listeners.class)
public class StudentListAPI extends commonOps
{
    @Test(description = "Test01: Get Student List")
    @Description("Test Description: Get Student List From Web")
    public void test01_getList()
    {
        verifications.VerifyStudentNumbers(apiFlows.getProperty("email"),100);
    }

    @Test(description = "Test02: Add new Student ")
    @Description("Test Description: Add new Student to Student List ")
    public void test02_AddStudentList()
    {
        apiFlows.postStudent("yossi", "ruban", "yossi@gmail.co", "QA Automation");
        verifications.VerifyStudentNumbers(apiFlows.getProperty("email"),101);
    }

    @Test(description = "Test03: Update Student and Verify ")
    @Description("Test Description: Update and Verify Student List ")
    public void test03_UpdateStudentList()
    {
        apiFlows.updateStudent("yossi", "ruban", "yossi@gmail.co", "QA", "115");
        verifications.text(apiFlows.getRecordProperty("[100].programme"),"QA");
    }

    @Test(description = "Test04: Delete Student and Verify ")
    @Description("Test Description: Delete and Verify Student List ")
    public void test04_deleteStudentList()
    {
        apiFlows.deleteStudent("115");
        verifications.VerifyStudentNumbers(apiFlows.getProperty("email"),100);
    }
}



