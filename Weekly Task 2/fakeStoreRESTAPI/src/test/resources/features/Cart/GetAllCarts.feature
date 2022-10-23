Feature: Get All Carts
  As a Admin
  I want to get all carts
  So I can see user's cart activity

  Scenario: Get All Carts
    Given I set cart url
    When I send request get cart
    Then I get all cart list