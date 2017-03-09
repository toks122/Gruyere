Feature: Users can manage snippets

  @snippets
  Scenario: Ensure that a user can create a snippet
    Given I am signed in
    And I create a snippet as 'Gruyere is great!'
    Then the snippet is added to my snippets
    
  
