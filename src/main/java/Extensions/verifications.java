package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import static org.testng.Assert.*;


public class verifications extends commonOps
{

    @Step("Verify Text in Element")
    public static void textVerify(WebElement elem, String expectedValue)
    {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("desktop") && !Platform.equalsIgnoreCase("electron"))
        {
            wait.until(ExpectedConditions.visibilityOf(elem));
        }
        if (Platform.equalsIgnoreCase("desktop"))
        {
            assertEquals(elem.getText().replaceAll("Display is", "").trim(), expectedValue);
        }
        else
            assertEquals(elem.getText(),expectedValue);
    }


    @Step("Verify New Employee Id")
    public static void verifyNewEmployeeIdTest(List<WebElement> elems, int expectedValue)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(),expectedValue);
    }

    @Step("Verify Element Visually")
    public static void visualElement (WebElement imageElement , String expectedImageName)
    {
        BufferedImage expectedImage = null;
        try
        {
            expectedImage = ImageIO.read(new File(getData("ImageRepo") + expectedImageName + ".png"));
        }
        catch (Exception e)
        {
            System.out.println("Error reading image file: " + e);
        }
        Screenshot imageScreenShot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,imageElement);
        BufferedImage actualImage = imageScreenShot.getImage();
        diff = imgDiff.makeDiff(actualImage,expectedImage);
        assertFalse(diff.hasDiff(),"Image are not the same");
    }

    @Step("Verify Numbers of Student")
    public static void VerifyStudentNumbers(List<String> list, int expectedValue)
    {
        System.out.println(list.size());
        for (String STU:list)
            System.out.println(STU);
        assertEquals(list.size(),expectedValue);
    }

    @Step("Verify Text with Text")
    public static void text(String actualText, String expectedText)
    {
        assertEquals(actualText,expectedText);
    }
}

