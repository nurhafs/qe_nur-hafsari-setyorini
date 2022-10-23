Feature: Update User
  As a user
  I want to update my profile
  So I can renew my data

  Scenario: Update valid id with valid data
    Given I set user url
    And I set valid new user data
    When I send request patch user with valid id
    Then data is updated

  Scenario: Update valid id with null data
    Given I set user url
    And I set null new user data
    When I send request patch user with valid id
    Then I get error user

  Scenario: Update invalid id with valid data
    Given I set user url
    And I set valid new user data
    When I send request patch user with invalid id
    Then I get error user

  Scenario: Update invalid id with null data
    Given I set user url
    And I set null new user data
    When I send request patch user with invalid id
    Then I get error user
