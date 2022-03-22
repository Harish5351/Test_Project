Feature: To check calculator functionality
  
  Scenario: Verifying functionality of calculator app
    Given User on calculator app
    When User taps on N1 "5"
    And User taps on operator
    And User taps on N2 "4"
    Then User validate answer "9"
