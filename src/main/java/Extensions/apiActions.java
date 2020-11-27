package Extensions;

import Utilities.commonOps;
import org.json.simple.JSONObject;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import java.util.List;


public class apiActions extends commonOps
{
    @Step("Get Data From Server")
    public static Response get(String paramValues)
    {
        response = httpRequest.get(paramValues);
        return response;
    }

    @Step("Extract Value From JSON Format")
    public static List<String> extractFromJSON(Response response, String path)
    {
        jp = response.jsonPath();
        List<String> name = jp.getList(path);
        return name;
    }

    @Step("Extract Value From JSON Format")
    public static String extractRecordFromJSON(Response response, String path)
    {
        jp = response.jsonPath();
        return jp.get(path).toString();
    }

    @Step("Post Data to Server")
    public static void post(JSONObject params, String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(resource);
//        System.out.println(response.prettyPrint());
    }

    @Step("Update Data in Server")
    public static void put(JSONObject params, String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(resource);
//        System.out.println(response.prettyPrint());
    }

    @Step("Delete Data from Server")
    public static void delete(String id)
    {
        response = httpRequest.delete("/student/" + id);
//        System.out.println(response.prettyPrint());
    }
}
