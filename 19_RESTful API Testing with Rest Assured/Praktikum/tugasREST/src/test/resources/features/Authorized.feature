Feature: Signin
  As a new user
  I want to sign in
  So that I can access the website

  Scenario: Sign in with valid username and password
    Given I set url
    When I input valid username
    And I input valid password
    And I send request post signin
    Then I am signed in
