package starter.User;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.*;

public class User {
    private String url;

    public void setUrl() {
        url = "https://fakestoreapi.com/users";
    }

    private JSONObject name() {
        JSONObject body = new JSONObject();
        body.put("firstname", "John");
        body.put("lastname", "Doe");
        return body;
    }

    private JSONObject address() {
        JSONObject body = new JSONObject();
        body.put("city", "John");
        body.put("street", "Doe");
        body.put("number", "3");
        body.put("zipcode", "12926-3874");
        return body;
    }

    private JSONObject validUserData() {
        JSONObject body = new JSONObject();
        body.put("email", "John@gmail.com");
        body.put("username", "johnd");
        body.put("password", "m38rmF$");
        body.put("name", name().toJSONString());
        body.put("address", address().toJSONString());
        return body;
    }

    private JSONObject nullUserData() {
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("username", "");
        body.put("password", "");
        body.put("name", "");
        body.put("address", "");
        return body;
    }

    public void add(String s) {
        url = url + s;
    }

    public void setValidUserData() {
        given().header("Content-Type", "application/json")
                .body(validUserData().toJSONString());
    }

    public void setNullUserData() {
        given().header("Content-Type", "application/json")
                .body(nullUserData().toJSONString());
    }
    public void sendPostRequest() {
        when().post(url);
    }

    public void sendGetRequest() {
        given().header("Content-Type", "application/json");
        when().get(url);
    }

    public void sendDeleteRequest() {
        given().header("Content-Type", "application/json");
        when().delete(url);
    }

    public void sendPatchRequest() {
        given().header("Content-Type", "application/json");
        when().patch(url);
    }
    public void getUserDetail() {
        then().statusCode(200);
        then().body("id", notNullValue());
        then().body("username", notNullValue());
        then().body("email", notNullValue());
    }

    public void getUserId() {
        then().statusCode(200);
        then().body("id", notNullValue());
    }

    public void getError() {
        then().statusCode(400);
        then().body("status", equalTo("error"));
    }

    public void userDeleted() {
        then().statusCode(200);
    }

    public void dataUpdated() {
        then().statusCode(200);
    }

    public void getUserList() {
        then().statusCode(200);
    }

    public void getLimitedUserList() {
        then().statusCode(200);
        then().body(hasItems());
    }

    public void cartIsDeleted() {
        then().statusCode(200);
    }

}
