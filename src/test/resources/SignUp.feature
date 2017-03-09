Feature: Users can sign up for new accounts

  @signUp
  Scenario: Ensure that a user can sign up for a new account
    Given I sign up as a new user
    Then my account is created successfully
    
  
    