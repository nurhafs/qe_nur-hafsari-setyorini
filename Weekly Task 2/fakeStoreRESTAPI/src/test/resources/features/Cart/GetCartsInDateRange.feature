Feature: Get All Carts In Date Range
  As a Admin
  I want to get all carts in date range
  So I can see user's cart activity in specific period

  Scenario: Get All Carts with Valid Date Range
    Given I set cart url
    And I add valid date range
    When I send request get cart
    Then I get all cart list

  Scenario: Get All Carts with Invalid Date Range
    Given I set cart url
    And I add invalid date range
    When I send request get cart
    Then I get error cart