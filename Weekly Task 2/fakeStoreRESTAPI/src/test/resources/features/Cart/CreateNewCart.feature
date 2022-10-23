Feature: Create New Cart
  As a User
  I want to create new cart
  So I can buy the products

  Scenario: Create new cart with products
    Given I set cart url
    And I provide cart data including products
    When I send request post cart
    Then I get new cart

  Scenario: Create new cart with no product
    Given I set cart url
    And I provide cart data
    When I send request post cart
    Then I get new cart

  Scenario: Create new cart with no data
    Given I set cart url
    When I send request post cart
    Then I get new cart