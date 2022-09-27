Feature: Login
  As a user
  I want to log in
  So I can access my dashboard page

  Scenario: Login with valid email and password
    Given I am in login page
    When I input valid username
    And I input valid password
    And I click login button
    Then I am redirected to my dashboard page

  Scenario: Login with null email and password
    Given I am in login page
    When I click login button
    Then I will not get logged in
    And I will get null error message

  Scenario: Login with invalid email and password
    Given I am in login page
    When I input invalid email
    And I input password
    And I click login button
    Then I will not get logged in
    And I will get invalid error message

  Scenario: Login with valid email and invalid password
    Given I am in login page
    When I input valid email
    And I input invalid password
    And I click login button
    Then I will not get logged in
    And I will get invalid error message