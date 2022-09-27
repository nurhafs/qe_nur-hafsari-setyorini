Feature: Create new post
  As a user
  I want to write new post
  So people can see my recent updates

  Scenario: Trigger create post pop-up
    Given I am logged in
    And I am in main page
    When I click write a post
    Then a write post pop-up is showed

  Scenario: Create post with only words
      Given I am logged in
      And I triggered write post pop-up
      When I fill the text section
      And I clicked post button
      Then the post will be published

  Scenario: Create post with image
        Given I am logged in
        And I triggered write post pop-up
        When I uploaded image
        And I clicked post button
        Then the post will be published

  Scenario: Create post with video
          Given I am logged in
          And I triggered write post pop-up
          When I uploaded video
          And I clicked post button
          Then the post will be published

  Scenario: Create post with document
    Given I am logged in
    And I triggered write post pop-up
    When I uploaded document
    And I clicked post button
    Then the post will be published