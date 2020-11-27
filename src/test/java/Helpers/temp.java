package Helpers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class temp
{
//    String url = "https://opensource-demo.orangehrmlive.com";
    String url = "https://api.chucknorris.io/";

    RequestSpecification httpRequest;
    Response response;

    @Test
    public void test01()
    {
//        JSONObject params = new JSONObject();
//        params

        RestAssured.baseURI = url;
        httpRequest = RestAssured.given(); //.auth().preemptive().basic("Admin ","admin123 ");

//        response = httpRequest.get("/api/employees/:emp_number?include=:includeParams&filter=:filter");
        response = httpRequest.get("jokes/search?query=Arnold");

        //System.out.println(response.getBody().asString());
        System.out.println(response.prettyPrint());





//        List<String> COURSES = new ArrayList<String>();
//        System.out.println(COURSES.get(0));

    }
}
