Feature: Get All Users
  As a User
  I want to get all users
  So I get to know other users

  Scenario: Get All Users
    Given I set user url
    When I send request get user
    Then I get user list