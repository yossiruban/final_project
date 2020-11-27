package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void init()
    {
        OrangeLogin = PageFactory.initElements(driver, PageObjects.OrangeHRM.LoginPage.class);
        OrangeDashboard = PageFactory.initElements(driver,PageObjects.OrangeHRM.dashboardPage.class);
        OrangeMainMenu = PageFactory.initElements(driver,PageObjects.OrangeHRM.mainMenuPage.class);
        OrangeAddEmployeeMenu = PageFactory.initElements(driver,PageObjects.OrangeHRM.AddEmployeeMenuPage.class);
        OrangeAddEmployee = PageFactory.initElements(driver,PageObjects.OrangeHRM.AddEmployeePage.class);
        OrangeEmployeeId = PageFactory.initElements(driver,PageObjects.OrangeHRM.EmployeeIdPage.class);
        OrangeSearchEmployee = PageFactory.initElements(driver, PageObjects.OrangeHRM.SearchEmployeePage.class);
        OrangeNewEmployee = PageFactory.initElements(driver, PageObjects.OrangeHRM.NewEmployeePage.class);
        OrangePopup = PageFactory.initElements(driver, PageObjects.OrangeHRM.popupPage.class);

        mortgageMain = PageFactory.initElements(driver, PageObjects.Mortgage.mainPage.class);
        electronMain = PageFactory.initElements(driver, PageObjects.ElectronDEMO.mainPage.class);
        calcMain = PageFactory.initElements(driver, PageObjects.Calculator.mainPage.class);
    }

}
