package starter.Cart;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.*;

public class Cart {
    private String url;

    public void setUrl() {
        url = "https://fakestoreapi.com/carts";
    }

    private JSONObject dataWithProducts() {
        JSONObject prod1 = new JSONObject();
        prod1.put("productId", "5");
        prod1.put("quantity", "1");

        JSONObject prod2 = new JSONObject();
        prod2.put("productId", "1");
        prod2.put("quantity", "5");

        JSONArray products = new JSONArray();
        products.add(prod1);
        products.add(prod2);

        JSONObject body = new JSONObject();
        body.put("userId", "5");
        body.put("date", "2020-02-03");
        body.put("products", products);
        return body;
    }

    private JSONObject dataWithNoProduct() {
        JSONArray products = new JSONArray();

        JSONObject body = new JSONObject();
        body.put("userId", "5");
        body.put("date", "2020-02-03");
        body.put("products", products);
        return body;
    }

    public void cartDataWithProducts() {
        given().header("Content-Type", "application/json")
                .body(dataWithProducts().toJSONString());
    }

    public void cartDataWithNoProduct() {
        given().header("Content-Type", "application/json")
                .body(dataWithNoProduct().toJSONString());
    }

    public void add(String s) {
        url = url + s;
    }

    public void requestPost() {
        when().post(url);
    }

    public void requestGet() {
        when().get(url);
    }

    public void requestDelete() {
        when().delete(url);
    }

    public void requestPatch() {
        given().header("Content-Type", "application/json");
        when().patch(url);
    }
    public void getNewCart() {
        then().statusCode(200);
        then().body("id", notNullValue());
    }

    public void getError() {
        then().statusCode(400);
        then().body("status", equalTo("error"));
    }

    public void deleted() {
        then().statusCode(200);
    }


    public void getCartDetail() {
        then().statusCode(200);
        then().body("id", notNullValue());
        then().body("userId", notNullValue());
        then().body("date", notNullValue());
        then().body("products", notNullValue());
    }

    public void getAllCartList() {
        then().statusCode(200);
        then().body(notNullValue());
    }

    public void getLimitedCartList() {
        then().statusCode(200);
        then().body(hasItems());
    }

    public void cartUpdated() {
        then().statusCode(200);
    }
}
