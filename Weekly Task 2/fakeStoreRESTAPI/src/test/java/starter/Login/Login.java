package starter.Login;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

public class Login {
    private String url;

    public void setUrl() {
        url = "https://fakestoreapi.com/auth/login";
    }

    public JSONObject validUsernameValidPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "mor_2314");
        body.put("password", "83r5^_");
        return body;
    }

    public JSONObject validUsernameInvalidPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "mor_2314");
        body.put("password", "9823hod_+_@A");
        return body;
    }

    public JSONObject validUsernameNullPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "mor_2314");
        body.put("password", "");
        return body;
    }

    public JSONObject invalidUsernameAndPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "har_309148");
        body.put("password", "83r5^_");
        return body;
    }

    public JSONObject nullUsernameNullPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "");
        body.put("password", "");
        return body;
    }

    public void setValidUsernameValidPassword() {
        given().body(validUsernameValidPassword().toJSONString());
    }

    public void setValidUsernameInvalidPassword() {
        given().body(validUsernameInvalidPassword().toJSONString());
    }

    public void setValidUsernameNullPassword() {
        given().body(validUsernameNullPassword().toJSONString());
    }

    public void setInvalidUsernameAndPassword() {
        given().body(invalidUsernameAndPassword().toJSONString());
    }

    public void setNullUsernameNullPassword() {
        given().header("Content-Type", "application/json")
               .body(nullUsernameNullPassword().toJSONString());
    }
    public void sendPostRequest() {
        when().post(url);
    }

    public void getAuthorizationToken() {
        then().body("token", notNullValue());
    }

    public void noAuthorizationToken() {
        then().body("token", nullValue());
    }

    public void getError() {
        then().statusCode(524);
    }


}
