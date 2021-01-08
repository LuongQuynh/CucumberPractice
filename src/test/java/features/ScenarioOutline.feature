
Feature: As a QA i want to verify creat new customer function
  Scenario Outline: Add a new customer successfully

    // And I input to Name textbox "xpath"  with data "<name>"
    Given I stay at homepage
    When I click to Create button
    And I input to Name textbox with data <name>
    And I choose on gender radio button
    And I input to Date Of Birth textbox with data <date>
    And I input to Address textbox with data <address>
    And I input to City textbox with data <city>
    And I input to State textbox with data <state>
    And I input to PIN textbox with data <pin>
    And I input to PhoneNumber textbox with data <phone>
    And I input to Emai textbox with data <email>
    And I input to Password textbox of Add New Customer Page with data <password>
    And I click to Submit button
    Then Verify Alert Success Message displayed
    Examples:
      | name     | date     | address | city | state  | pin  | phone    | email                | password |
      |quynhluong|25111995  |Vinh Phuc|Ha Noi|Viet Nam|012345|0967895322|quynhluongvp@gmail.com|Quynh123  |
