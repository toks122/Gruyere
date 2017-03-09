@all
Feature: Navigate to the start page


  Scenario: Ensure that user can accept and start
    Given I am on the Start page
    And I agree to accept and start
    Then The Home page is displayed
