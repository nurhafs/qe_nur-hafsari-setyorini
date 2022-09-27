package starter.stepdefinitions.Post;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePostSteps {

    @Given("I am logged in")
    public void iAmLoggedIn() {
        System.out.println("I am logged in");
    }

    @And("I am in main page")
    public void iAmInMainPage() {
        System.out.println("I am in main page");
    }

    @When("I click write a post")
    public void iClickWriteAPost() {
        System.out.println("I click write a post");
    }

    @Then("a write post pop-up is showed")
    public void aWritePostPopUpIsShowed() {
        System.out.println("Pop-up is showed");
    }

    @And("I triggered write post pop-up")
    public void iTriggeredWritePostPopUp() {
        System.out.println("Write post pop-up is triggered");
    }

    @When("I fill the text section")
    public void iFillTheTextSection() {
        System.out.println("Text section is filled");
    }

    @And("I clicked post button")
    public void iClickedPostButton() {
        System.out.println("Post button is clicked");
    }

    @Then("the post will be published")
    public void thePostWillBePublished() {
        System.out.println("Post is published");
    }

    @When("I uploaded image")
    public void iUploadedImage() {
        System.out.println("Image uploaded");
    }

    @When("I uploaded video")
    public void iUploadedVideo() {
        System.out.println("Video uploaded");
    }

    @When("I uploaded document")
    public void iUploadedDocument() {
        System.out.println("Document uploaded");
    }


}
