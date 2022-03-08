package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtils {



    public static Response getRequest(String token,String endpoint ){

        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(endpoint);


        return  response;

    }






}
