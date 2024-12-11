Feature: Login
@PositivLogin
  Scenario: Successful Login
    Given User is on HomePage
    When User clicks on Login icon
   # Then User verifies Login form is displayed
    And User enters velid data
    And User clicks on Anmelden button
    And User click on User icon
    Then User verifies his name

  @NegativLoginTest
  Scenario: Login with invalid email
    Given User is on HomePage
    When User clicks on Login icon
    And User enters wrong email and valid password
    And User clicks on Anmelden button
    Then User verifies Error message is displayed


