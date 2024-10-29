@LogIn
Feature: Clockify log in

  @Smoke @LogInManually @Automated
  Scenario: The client manually log in to clockify successfully
    Given The client is on clockify log in page
    When The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    Then The client is on clockify dashboard page
