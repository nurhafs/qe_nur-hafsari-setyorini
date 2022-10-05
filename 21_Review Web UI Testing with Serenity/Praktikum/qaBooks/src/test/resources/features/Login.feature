Feature: Login
  As a user
  I want to Login
  So that I can access my book list

  Scenario: Open login page
    Given I am on the main page
    When I click login button
    Then I will go to login page

  Scenario: Login with valid username and password
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    Then I will be logged in

  Scenario: Login with invalid username and valid password
    Given I am on the login page
    When I input invalid username
    And I input valid password
    And I click login button
    Then I will get error message

  Scenario: Login with valid username and invalid password
    Given I am on the login page
    When I input valid username
    And I input invalid password
    And I click login button
    Then I will get error message

    Scenario: Login with empty username and password
      Given I am on the login page
      When I input empty username
      And I input empty password
      And I click login button
      Then I will get empty error message

  Scenario: Login with empty username and valid password
    Given I am on the login page
    When I input empty username
    And I input valid password
    And I click login button
    Then I will get empty username error message

  Scenario: Login with valid username and empty password
    Given I am on the login page
    When I input valid username
    And I input empty password
    And I click login button
    Then I will get empty password error message