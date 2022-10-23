Feature: Add New User
  As a admin
  I want to add new user
  So that more user can use the website

  Scenario: Add new user with valid username and password
    Given I set user url
    And I set valid new user data
    When I send request post user
    Then I get new user id

  Scenario: Add new user with null username and password
    Given I set user url
    And I set null new user data
    When I send request post user
    Then I get error user