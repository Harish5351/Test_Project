Feature: Check Login Functionality
@Webtest
  Scenario: Login with valid credentials
    Given User navigate to the Login page
    When User perform a login
    Then User should close the browser
    
@Mouseover
  Scenario: User checking mousehover functionality
    Given User navigate to the Login page
    When User perform a login
    And User hover over on Admin user and user management
    Then User verifies user admin page
