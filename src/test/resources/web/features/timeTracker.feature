@timeEntry
Feature: Time entry

  @Smoke @addTimeEntry @Automated
  Scenario Outline: Add a new time entry successfully
    Given The client is on clockify log in page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    When The client click on Time Tracker button
    And The client click on manual time entry
    And The client set the project name Postman
    And The client set start time <Start>
    And The client set finish time <Finish>
    And The client click on calendar
    And The client click on date
    And The client click on Add button
    Then The time entry is added successfully

    Examples:
      | Start | Finish |
      | 10    | 11     |
      | 9     | 10     |

  @cancelTimeEntry @Automated @Do
  Scenario: Set a new time entry and cancel
    Given The client is on clockify log in page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    And The client click on Time Tracker button
    When The client click on clock button
    And The client click on Start button
    And The client click on three point button
    And The client click on discard
    And The client click on make sure to discard
    Then The time entry is cancelled

  @updateTimeEntry @Automated
  Scenario Outline: Update time entry successfully
    Given The client is on clockify log in page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    And The client click on Time Tracker button
    When The client click on expand time entries button
    And The client click on add description
    And The client set a description Crowdar
    And The client update start clock <Start Time>
    And The client update finish clock <Finish Time>
    And The client click on time entry calendar
    Then The time entry is successfully updated

    Examples:
      | Start Time | Finish Time |
      | 10         | 11          |
      | 9          | 10          |