package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObject {

    private By fieldUsername() {
        return By.id("userName");
    }

    private By fieldPassword() {
        return By.id("password");
    }

    private By loginButton() {
        return By.id("login");
    }

    private By bookListUsername() {
        return By.id("userName-value");
    }

    private By errorMessage() {
        return By.id("name");
    }

    private By loginPage() {
        return By.xpath("//h5");
    }

    private By loggedInPage() {
        return By.id("loading-label");
    }

    private By loginSpan() {
        return By.id("item-1");
    }

    public void openUrl(){
        openAt("/");
    }

    public void loginPageDisplayed() {
        $(loginPage()).isDisplayed();
    }

    public void bookListUsernameDisplayed() {
        $(bookListUsername()).isDisplayed();
    }

    public void clickLoginButton() {
        $(loginButton()).waitUntilVisible();
        $(loginButton()).click();
    }

    public void inputUsername(String username) {
        $(fieldUsername()).type(username);
    }

    public void inputPassword(String password) {
        $(fieldPassword()).type(password);
    }

    public void errorMessageDisplayed() {
        $(errorMessage()).isDisplayed();
    }

    public void loggedInPageDisplayed() {
        $(loggedInPage()).isDisplayed();
    }

    public void goToLoginPage() {
        $(loginSpan()).waitUntilVisible();
        $(loginSpan()).click();
    }

    public void usernameEmpty() {
        $(fieldUsername()).hasClass("is-invalid");
    }

    public void passwordEmpty() {
        $(fieldPassword()).hasClass("is-invalid");
    }




}
