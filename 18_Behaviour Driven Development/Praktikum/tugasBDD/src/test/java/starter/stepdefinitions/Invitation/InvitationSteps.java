package starter.stepdefinitions.Invitation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvitationSteps {
    @And("I am in other user's profile page")
    public void iAmInOtherUserSProfilePage() {
        System.out.println("i am in another user's login page");
    }

    @When("I click invite button")
    public void iClickInviteButton() {
        System.out.println("invite button clicked");
    }

    @Then("invitation request is sent")
    public void invitationRequestIsSent() {
        System.out.println("invitation request sent");
    }
}
