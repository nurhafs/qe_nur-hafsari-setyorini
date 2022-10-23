Feature: Get A User
  As an admin
  I want to get a user
  So I can modify user

  Scenario: Get a user with valid id number
    Given I set user url
    And I add valid id number
    When I send request get user
    Then I get user detail

  Scenario: Get a user with invalid id number
    Given I set user url
    And I add invalid id number
    When I send request get user
    Then I get error user