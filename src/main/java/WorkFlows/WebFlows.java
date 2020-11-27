package WorkFlows;

import Extensions.dbActions;
import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import java.util.List;


public class WebFlows extends commonOps
{
    public static String emloyeeID;

    @Step("Login Orange")
    public static void login(String user, String pass)
    {
        uiActions.updateText(OrangeLogin.txt_userName, user);
        uiActions.updateText(OrangeLogin.txt_password, pass);
        uiActions.click(OrangeLogin.btn_login);
    }

    @Step("Login Orange with DB Credentials")
    public static void loginDB ()
    {
        List<String> cred =  dbActions.getCredentials("SELECT user_name, password FROM Credentials WHERE id='1'");
        uiActions.updateText(OrangeLogin.txt_userName, cred.get(0));
        uiActions.updateText(OrangeLogin.txt_password, cred.get(1));
        uiActions.click(OrangeLogin.btn_login);
    }

    @Step("Add Employee")
    public static void AddEmployee(String FirstName ,String MiddleName ,String LastName)
    {
        uiActions.mouseHoverElements(OrangeMainMenu.btn_PIM,OrangeAddEmployeeMenu.link_AddEmployee);
        uiActions.click(OrangeAddEmployeeMenu.link_AddEmployee);
        uiActions.updateText(OrangeAddEmployee.txt_firstName, FirstName);
        uiActions.updateText(OrangeAddEmployee.txt_middleName, MiddleName);
        uiActions.updateText(OrangeAddEmployee.txt_lastName, LastName);
        uiActions.click(OrangeAddEmployee.btn_Save);
        GetEmployeeId();
    }

    @Step("Get Employee Id")
    public static void GetEmployeeId()
    {
        emloyeeID =  OrangeEmployeeId.txt_EmployeeId.getAttribute("value");
    }

    @Step("Search Employee")
    public static void SearchEmployee(String EmployeeId)
    {
        uiActions.mouseHoverElements(OrangeMainMenu.btn_PIM,OrangeEmployeeId.btn_EmployeeList);
        uiActions.updateText(OrangeSearchEmployee.txt_EmployeeId,EmployeeId);
        uiActions.click(OrangeSearchEmployee.btn_Search);
    }

    @Step("Delete Employee")
    public static void DeleteEmployee()
    {
        uiActions.click(OrangeNewEmployee.txt_CheckBox);
        uiActions.click(OrangeNewEmployee.btn_Delete);
        uiActions.click(OrangePopup.btn_OkPopup);
    }

}
