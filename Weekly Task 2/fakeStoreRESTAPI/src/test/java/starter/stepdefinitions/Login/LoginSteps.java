package starter.stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I set login url")
    public void iSetLoginUrl() {
        login.setUrl();
    }

    @And("I set valid username and valid password")
    public void iSetValidUsernameAndValidPassword() {
        login.setValidUsernameValidPassword();
    }

    @When("I send request post login")
    public void iSendRequestPost() {
        login.sendPostRequest();
    }

    @Then("I get authorization token")
    public void iGetAuthorizationToken() {
        login.getAuthorizationToken();
    }

    @And("I set valid username and invalid password")
    public void iSetValidUsernameAndInvalidPassword() {
        login.setValidUsernameInvalidPassword();
    }


    @And("I set valid username and null password")
    public void iSetValidUsernameAndNullPassword() {
        login.setValidUsernameNullPassword();
    }

    @Then("I get error")
    public void iGetNullError() {
        login.getError();
    }

    @And("I set null username and null password")
    public void iSetNullUsernameAndNullPassword() {
        login.setNullUsernameNullPassword();
    }

    @And("I set invalid username and password")
    public void iSetInvalidUsernameAndPassword() {
        login.setInvalidUsernameAndPassword();
    }
}
