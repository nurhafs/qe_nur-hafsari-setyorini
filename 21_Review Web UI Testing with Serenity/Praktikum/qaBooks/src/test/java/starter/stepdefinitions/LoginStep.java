package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage loginPage;

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        loginPage.openUrl();
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
        loginPage.clickLoginButton();
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        loginPage.inputUsername("buku1");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("KHA8930ut9;';';';__!+df");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I will be logged in")
    public void iWillGoToMyBookListPage() {
        loginPage.bookListUsernameDisplayed();
    }

    @When("I input invalid username")
    public void iInputInvalidUsername() {
        loginPage.inputUsername("buku0123");

    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        loginPage.errorMessageDisplayed();
    }

    @Then("I will go to login page")
    public void iWillGoToLoginPage() {
        loginPage.loginPageDisplayed();
    }

    @When("I input empty username")
    public void iInputEmptyUsername() {
        loginPage.inputUsername("");
    }

    @And("I input empty password")
    public void iInputEmptyPassword() {
        loginPage.inputPassword("");
    }

    @Then("I will get empty error message")
    public void iWillGetEmptyErrorMessage() {
        loginPage.usernameEmpty();
        loginPage.passwordEmpty();
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputPassword("dh8eob74vg");
    }

    @Then("I will get empty username error message")
    public void iWillGetEmptyUsernameErrorMessage() {
        loginPage.usernameEmpty();
    }

    @Then("I will get empty password error message")
    public void iWillGetEmptyPasswordErrorMessage() {
        loginPage.passwordEmpty();
    }
}
