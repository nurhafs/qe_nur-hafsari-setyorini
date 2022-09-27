Feature: Search Job
  As a user
  I want to search job
  So that I can apply new job

  Scenario: Search with valid keyword
    Given I am logged in
    And I am in job page
    When I input valid keyword
    And I click search button
    Then jobs with keyword inputted will appear

  Scenario: Search with invalid keyword
    Given I am logged in
    And I am in job page
    When I input invalid keyword
    And I click search button
    Then job not found error page will appear

  Scenario: Click tags
    Given I am logged in
    And I am in job page
    When I click specific tags
    Then the clicked tags will get marked

  Scenario: Search with specific tags
    Given I am logged in
    And I am in job page
    When I click specific tags
    And I click search button
    Then jobs with chosen tags will appear