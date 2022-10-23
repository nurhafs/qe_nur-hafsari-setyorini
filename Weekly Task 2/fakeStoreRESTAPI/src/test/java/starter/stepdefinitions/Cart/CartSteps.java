package starter.stepdefinitions.Cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Cart.Cart;

public class CartSteps {
    @Steps
    Cart cart;

    @Given("I set cart url")
    public void iSetCartUrl() {
        cart.setUrl();
    }


    @And("I provide cart data including products")
    public void iProvideCartDataIncludingProducts() {
        cart.cartDataWithProducts();
    }

    @And("I provide cart data")
    public void iProvideCartData() {
        cart.cartDataWithNoProduct();
    }

    @When("I send request post cart")
    public void iSendRequestPostCart() {
        cart.requestPost();
    }

    @Then("I get new cart")
    public void iGetNewCart() {
        cart.getNewCart();
    }


    @When("I send request get cart")
    public void iSendRequestGetCart() {
        cart.requestGet();
    }

    @Then("I get cart detail")
    public void iGetCartDetail() {
        cart.getCartDetail();
    }

    @Then("I get error cart")
    public void iGetErrorCart() {
        cart.getError();
    }

    @And("I add valid cart id")
    public void iAddValidCartId() {
        cart.add("/5");
    }

    @And("I add invalid cart id")
    public void iAddInvalidCartId() {
        cart.add("/abc");
    }

    @Then("I get all cart list")
    public void iGetAllCartList() {
        cart.getAllCartList();
    }

    @And("I add valid date range")
    public void iAddValidDateRange() {
        cart.add("/startdate" + "=" + "2019-12-10&enddate" + "=" + "2020-10-10)");
    }

    @And("I add invalid date range")
    public void iAddInvalidDateRange() {
        cart.add("/startdate=2019-19-10&enddate=2043-20-41')");
    }

    @When("I send request delete cart")
    public void iSendRequestDeleteCart() {
        cart.requestDelete();
    }

    @Then("Cart gets deleted")
    public void cartGetsDeleted() {
        cart.deleted();
    }

    @Then("I get limited cart list")
    public void iGetLimitedCartList() {
        cart.getLimitedCartList();
    }

    @Then("I get cart list")
    public void iGetCartList() {
    }

    @And("I set limit cart")
    public void iSetLimitCart() {
        cart.add("?limit=5");
    }

    @And("I set invalid limit cart")
    public void iSetInvalidLimitCart() {
        cart.add("?limit=abc");
    }

    @And("I set sort descending")
    public void iSetSortDescending() {
        cart.add("?sort=desc");
    }

    @And("I set sort ascending")
    public void iSetSortAscending() {
        cart.add("?sort=asc");
    }

    @When("I send request patch cart with valid id")
    public void iSendRequestPatchCartWithValidId() {
        cart.add("/7");
        cart.requestPatch();
    }

    @When("I send request patch cart with invalid id")
    public void iSendRequestPatchCartWithInvalidId() {
        cart.add("/xyz");
        cart.requestPatch();
    }

    @Then("cart is updated")
    public void cartIsUpdated() {
        cart.cartUpdated();
    }
}
