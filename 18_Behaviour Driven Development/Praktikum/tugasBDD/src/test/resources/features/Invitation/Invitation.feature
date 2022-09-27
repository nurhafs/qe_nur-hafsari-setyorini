Feature: Create invitation
  As a user
  I want to invite other user
  So we can connect with each other

  Scenario: Invite other user
    Given I am logged in
    And I am in other user's profile page
    When I click invite button
    Then invitation request is sent