Feature: Sort User Result
  As a User
  I want to sort user result
  So I can view the list better

  Scenario: Sort User Descending
    Given I set user url
    And I set sort by descending
    When I send request get user
    Then I get user list

  Scenario: Sort User Ascending
    Given I set user url
    And I set sort by ascending
    When I send request get user
    Then I get user list