Feature: Login
  As a user
  I want to Login
  So I can fully utilize the website

  Scenario: Login with valid username and valid password
    Given I set login url
    And I set valid username and valid password
    When I send request post login
    Then I get authorization token

  Scenario: Login with valid username and invalid password
    Given I set login url
    And I set valid username and invalid password
    When I send request post login
    Then I get error

  Scenario: Login with valid username and null password
    Given I set login url
    And I set valid username and null password
    When I send request post login
    Then I get error

  Scenario: Login with null username and null password
    Given I set login url
    And I set null username and null password
    When I send request post login
    Then I get error

  Scenario: Login with invalid username and password
    Given I set login url
    And I set invalid username and password
    When I send request post login
    Then I get error