Feature: Delete User
  As a user
  I want to delete user
  So I can stop using the website

  Scenario: Delete user with valid id
    Given I set user url
    And I add valid id number
    When I send request delete user
    Then User gets deleted

  Scenario: Get a user with invalid id number
    Given I set user url
    And I add invalid id number
    When I send request delete user
    Then I get error user