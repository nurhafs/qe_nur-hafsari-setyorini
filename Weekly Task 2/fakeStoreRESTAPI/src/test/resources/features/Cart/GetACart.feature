Feature: Get A Cart
  As a User
  I want to get a cart
  So I can change products or checkout

  Scenario: Get a cart with valid id number
    Given I set cart url
    And I add valid cart id
    When I send request get cart
    Then I get cart detail

  Scenario: Get a cart with invalid id number
    Given I set cart url
    And I add invalid cart id
    When I send request get cart
    Then I get error cart