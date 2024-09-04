Feature: Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username as "Admin" and password as "admin123"
    And clicks on login button
    Then the user should be redirected to the dashboard
