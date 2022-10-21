Feature: Add Task
  As a User
  I want to Add Task
  So I can save my tasks

  Scenario: Add Task with title and content
    Given I am in main page
    When I click add button
    And I input task title
    And I input task content
    And I click save button
    Then my new task will be saved

  Scenario: Add Task with title only
    Given I am in main page
    When I click add button
    And I input task title
    And I click save button
    Then I will get empty title error

  Scenario: Add Task with content only
    Given I am in main page
    When I click add button
    And I input task content
    And I click save button
    Then I will get empty content error

  Scenario: Add Task with empty title and content
    Given I am in main page
    When I click add button
    And I click save button
    Then I will get empty title error