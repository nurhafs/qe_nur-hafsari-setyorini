package com.example.steps;

import com.example.app.pages.TaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddTaskStepDefinitions {

    @Steps
    TaskPage taskPage;

    @Given("I am in main page")
    public void iAmInMainPage() {
        taskPage.taskHeaderDisplayed();
    }

    @When("I click add button")
    public void iClickAddButton() {
        taskPage.clickAddBtn();
    }

    @And("I input task title")
    public void iInputTaskTitle() {
        taskPage.inputTaskTitle("Task 1");
    }

    @And("I input task content")
    public void iInputTaskContent() {
        taskPage.inputTaskContent("Kerjakan tugas miniproject");
    }

    @And("I click save button")
    public void iClickSaveButton() {
        taskPage.clickSaveBtn();
    }

    @Then("my new task will be saved")
    public void myNewTaskWillBeSaved() {
        taskPage.taskAdded();
    }

    @Then("I will get empty title error")
    public void iWillGetEmptyTitleError() {
        taskPage.titleEmptyError();
    }

    @Then("I will get empty content error")
    public void iWillGetEmptyContentError() {
        taskPage.contentEmptyError();
    }
}
