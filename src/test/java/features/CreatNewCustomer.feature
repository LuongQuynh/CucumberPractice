@newcustomer
  Feature: As a QA i want to verify creat new customer function
    Background: Login to guru99 Demo site successfully.
      Given I login with valid username and password
      Scenario Outline: I creat a new customer successfully.
        Given I click to create new customer section
        When I input "<name>" into customer name field with
        And I choose gender
        And I input "<date_of_birth>"
        And I input "<address>" into address field
        And I input "<city>" into city field
        And I input "<state>" into state field
        And I input "<pin>" into pin field
        And I input "<mobile_phone>" into mobile number field
        And I input "<email>" into email field
        And I input "<password>" into password field
        And I click to submit button
        Then I should see message successful display


        Examples:
        |name |date_of_birth|address  |city    |state  |pin   |mobile_phone|email          |password|
        |quin|11/25/1995   |Vinh Yen|Ha Noi  |VietNam|100000|097892345   |quynh2@gmail.com|test123 |