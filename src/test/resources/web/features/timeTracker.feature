@timeEntry
Feature: Time entry

  @Smoke @timeEntry @Automated @Do
  Scenario: Add a new time entry
    Given The client is on clockify log in page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    When The client click on Time Tracker button
    And The client set start time 9
    And The client set finish time 10
    And The client click on Add button
    Then The time entry is added successfully