Feature: Limit Cart Results
  As a cart
  I want to limit cart results
  So I can get better view of the list

  Scenario: Limit results with number
    Given I set cart url
    And I set limit cart
    When I send request get cart
    Then I get limited cart list

  Scenario: Limit results with alphabet
    Given I set cart url
    And I set invalid limit cart
    When I send request get cart
    Then I get error cart
