package starter.stepdefinitions.SearchJobs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchJobSteps {
    @And("I am in job page")
    public void iAmInJobPage() {
        System.out.println("I am in job page");
    }

    @When("I input valid keyword")
    public void iInputValidKeyword() {
        System.out.println("Input valid keyword");
    }

    @And("I click search button")
    public void iClickSearchButton() {
        System.out.println("Click search button");
    }

    @Then("jobs with keyword inputted will appear")
    public void jobsWithKeywordInputtedWillAppear() {
        System.out.println("jobs with keyword appeared");
    }

    @When("I input invalid keyword")
    public void iInputInvalidKeyword() {
        System.out.println("input invalid keyword");
    }

    @Then("job not found error page will appear")
    public void jobNotFoundErrorPageWillAppear() {
        System.out.println("job not found error appear");
    }

    @When("I click specific tags")
    public void iClickSpecificTags() {
        System.out.println("specific tags clicked");
    }

    @Then("the clicked tags will get marked")
    public void theClickedTagsWillGetMarked() {
        System.out.println("clicked tags will get marked");
    }

    @Then("jobs with chosen tags will appear")
    public void jobsWithChosenTagsWillAppear() {
        System.out.println("chosen tags appear");
    }
}
