@timeEntry
Feature: Time entry

  @Smoke @AddTimeEntry @Automated @Do
  Scenario: Add a new time entry successfully
    Given The client is on clockify log in page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    When The client click on Time Tracker button
    And The client click on manual time entry
    And The client set start time 9
    And The client set finish time 10
    And The client click on calendar
    And The client click on date
    And The client click on Add button
    Then The time entry is added successfully

  @Smoke @BadTimeEntry @Automated
  Scenario: Set a new time entry and cancel
    Given The client is on clockify log in page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    And The client click on Time Tracker button
    And The client click on manual time entry
    And The client set start time 9
    And The client set finish time 10
    And The client click on calendar
    And The client click on date
    When The client click on clock
    Then The time entry is not added

  @Smoke @UpdateTimeEntry @Automated
  Scenario Outline: Update time entry successfully
    Given The client is on clockify log in page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    And The client click on Time Tracker button
    When The client click on expand time entries button
    And The client click on add description
    And The client set a description <Description>
    And The client update start clock <Time1>
    And The client update finish clock <Time2>
    And The client click on time entry calendar
    Then The time entry is successfully updated

    Examples:

      | Description | Time1 | Time2 |
      | Crowdar     | 11    | 12    |
      | Crowdar     | 9     | 10    |