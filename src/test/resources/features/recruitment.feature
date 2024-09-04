Feature: Recruitment

  Scenario: Add a new candidate
    Given the user is logged in
    When the user navigates to the recruitment page
    And adds a new candidate with first name "Juan", last name "Fernandez", and email "JuanFernandez@demo.com"
    Then the candidate should be added successfully
