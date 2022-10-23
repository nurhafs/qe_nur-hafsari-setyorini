package starter.stepdefinitions.User;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import starter.User.User;

public class UserSteps {
    @Steps
    User user;

    @Given("I set user url")
    public void iSetUserUrl() {
        user.setUrl();
    }

    @And("I set valid new user data")
    public void iSetValidNewUserData() {
        user.setValidUserData();
    }

    @Then("I get new user id")
    public void iGetNewUserId() {
        user.getUserId();
    }

    @And("I add valid id number")
    public void iAddValidIdNumber() {
        user.add("/1");
    }

    @When("I send request post user")
    public void iSendRequestPost() {
        user.sendPostRequest();
    }

    @Then("I get user detail")
    public void iGetUserDetail() {
        user.getUserDetail();
    }

    @And("I add invalid id number")
    public void iAddInvalidIdNumber() {
        user.add("/abc");
    }

    @Then("I get error user")
    public void iGetError() {
        user.getError();
    }

    @When("I send request get user")
    public void iSendRequestGetUser() {
        user.sendGetRequest();
    }

    @And("I set null new user data")
    public void iSetNullNewUserData() {
        user.setNullUserData();
    }

    @When("I send request delete user")
    public void iSendRequestDeleteUser() {
        user.sendDeleteRequest();
    }

    @Then("User gets deleted")
    public void userGetsDeleted() {
        user.userDeleted();
    }

    @When("I send request patch user with valid id")
    public void iSendRequestPatchUserWithValidId() {
        user.add("/7");
        user.sendPatchRequest();
    }

    @Then("data is updated")
    public void dataIsUpdated() {
        user.dataUpdated();
    }

    @When("I send request patch user with invalid id")
    public void iSendRequestPatchUserWithInvalidId() {
        user.add("/abc");
        user.sendPatchRequest();
    }

    @Then("I get user list")
    public void iGetUserList() {
        user.getUserList();
    }

    @And("I set limit parameter with number")
    public void iSetLimitParameterWithNumber() {
        user.add("?limit=5");
    }

    @And("I set limit parameter with alphabet")
    public void iSetLimitParameterWithAlphabet() {
        user.add("?limit=fg");
    }

    @Then("I get limited user list")
    public void iGetLimitedUserList() {
        user.getLimitedUserList();
    }


    @And("I set sort by descending")
    public void iSetSortByDescending() {
        user.add("?sort=desc");
    }

    @And("I set sort by ascending")
    public void iSetSortByAscending() {
        user.add("?sort=asc");
    }

}
