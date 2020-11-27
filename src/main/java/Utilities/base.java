package Utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import org.json.simple.JSONObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imgDiff = new ImageDiffer();
    public static ImageDiff diff;
    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static String Platform;
    
    public static PageObjects.OrangeHRM.LoginPage OrangeLogin;
    public static PageObjects.OrangeHRM.dashboardPage OrangeDashboard;
    public static PageObjects.OrangeHRM.mainMenuPage OrangeMainMenu;
    public static PageObjects.OrangeHRM.AddEmployeeMenuPage OrangeAddEmployeeMenu;
    public static PageObjects.OrangeHRM.AddEmployeePage OrangeAddEmployee;
    public static PageObjects.OrangeHRM.EmployeeIdPage OrangeEmployeeId;
    public static PageObjects.OrangeHRM.SearchEmployeePage OrangeSearchEmployee;
    public static PageObjects.OrangeHRM.NewEmployeePage OrangeNewEmployee;
    public static PageObjects.OrangeHRM.popupPage OrangePopup;

    public static PageObjects.Mortgage.mainPage mortgageMain;
    public static PageObjects.ElectronDEMO.mainPage electronMain;
    public static PageObjects.Calculator.mainPage calcMain;

    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams = new JSONObject();
    public static JsonPath jp;

    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;
}
