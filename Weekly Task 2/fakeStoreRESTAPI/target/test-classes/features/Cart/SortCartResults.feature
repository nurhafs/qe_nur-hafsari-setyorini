Feature: Sort Cart Result
  As a User
  I want to sort cart result
  So I can view the list better

  Scenario: Sort cart Descending
    Given I set cart url
    And I set sort descending
    When I send request get cart
    Then I get cart list

  Scenario: Sort cart Ascending
    Given I set cart url
    And I set sort ascending
    When I send request get cart
    Then I get cart list