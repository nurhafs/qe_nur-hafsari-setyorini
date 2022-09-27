package starter.stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am in login page")
    public void iAmInLoginPage() {
        System.out.println("i am in login page");
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        System.out.println("valid username inputted");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        System.out.println("valid password inputted");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        System.out.println("login button clicked");
    }

    @Then("I am redirected to my dashboard page")
    public void iAmRedirectedToMyDashboardPage() {
        System.out.println("redirected to dashboard page");
    }

    @Then("I will not get logged in")
    public void iWillNotGetLoggedIn() {
        System.out.println("i am not logged in");
    }

    @And("I will get null error message")
    public void iWillGetNullErrorMessage() {
        System.out.println("i get null error message");
    }

    @When("I input invalid email")
    public void iInputInvalidEmail() {
        System.out.println("invalid email inputted");
    }

    @And("I input password")
    public void iInputPassword() {
        System.out.println("password inputted");
    }

    @And("I will get invalid error message")
    public void iWillGetInvalidErrorMessage() {
        System.out.println("i get invalid error messages");
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        System.out.println("valid email inputted");
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        System.out.println("invalid password inputted");
    }
}
