Feature: AddUser
  As a new user
  I want to sign in
  So that I can get authorized

  Scenario: Login with valid username and password
    Given I set url
    When I input valid username
    And I input valid password
    And I send request post login
    Then I am logged in

  Scenario: Login with null username and password
    Given I set url
    When I send request post login
    Then I am not logged in
    And I get error message

  Scenario: Login with username and invalid password
    Given I set url
    When I input valid username
    And I input invalid password
    And I send request post login
    Then I am not get logged in
    And I get error message