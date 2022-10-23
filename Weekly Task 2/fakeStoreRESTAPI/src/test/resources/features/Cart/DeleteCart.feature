Feature: Delete Cart
  As a user
  I want to delete cart
  So I can organize my carts

  Scenario: Delete cart with valid id
    Given I set cart url
    And I add valid cart id
    When I send request delete cart
    Then Cart gets deleted

  Scenario: Get a cart with invalid id number
    Given I set cart url
    And I add invalid cart id
    When I send request delete cart
    Then I get error cart