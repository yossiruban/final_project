package WorkFlows;

import Extensions.apiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import java.util.List;

public class apiFlows extends commonOps
{
    @Step("Get Student List")
    public static List<String> getProperty(String jpath)
    {
        Response response = apiActions.get("/student/list");
        return apiActions.extractFromJSON(response, jpath);
    }

    @Step("Get Student List")
    public static String getRecordProperty(String jpath)
    {
        Response response = apiActions.get("/student/list");
        return apiActions.extractRecordFromJSON(response, jpath);
    }

    @Step("Create New Student")
    public static void postStudent(String firstName, String lastName, String email, String programme)
    {
        requestParams.put("firstName",firstName);
        requestParams.put("lastName",lastName);
        requestParams.put("email",email);
        requestParams.put("programme",programme);
        apiActions.post(requestParams,"/student/");
    }

    @Step("Update Student List")
    public static void updateStudent(String firstName, String lastName, String email, String programme, String id)
    {
        requestParams.put("firstName",firstName);
        requestParams.put("lastName",lastName);
        requestParams.put("email",email);
        requestParams.put("programme",programme);
        apiActions.put(requestParams,"/student/" + id);
    }

    @Step("Delete Student List")
    public static void deleteStudent(String id)
    {
        apiActions.delete(id);
    }
}
