Feature: Limit User Results
  As a User
  I want to limit user results
  So I can get better view of the list

  Scenario: Limit results with number
    Given I set user url
    And I set limit parameter with number
    When I send request get user
    Then I get limited user list

  Scenario: Limit results with alphabet
    Given I set user url
    And I set limit parameter with alphabet
    When I send request get user
    Then I get error user
