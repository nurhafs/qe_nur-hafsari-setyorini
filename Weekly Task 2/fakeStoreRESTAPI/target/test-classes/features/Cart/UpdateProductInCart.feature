Feature: Update cart
  As a cart
  I want to update my profile
  So I can renew my data

  Scenario: Renew valid id with product
    Given I set cart url
    And I provide cart data including products
    When I send request patch cart with valid id
    Then cart is updated

  Scenario: Renew valid id with no product
    Given I set cart url
    And I provide cart data
    When I send request patch cart with valid id
    Then cart is updated

  Scenario: Renew valid id with no data
    Given I set cart url
    When I send request patch cart with valid id
    Then I get error cart

  Scenario: Renew invalid id with product
    Given I set cart url
    And I provide cart data including products
    When I send request patch cart with invalid id
    Then I get error cart

  Scenario: Renew invalid id with no product
    Given I set cart url
    And I provide cart data
    When I send request patch cart with invalid id
    Then I get error cart
