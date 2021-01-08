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
        And I input "<state>" into state field
        And I input "<pin>" into pin field
        And I input "<mobile_phone>" into mobile number field
        And I input "<email>" into email field
        And I input "<password>" into password field
        And I click to submit button
        Then I should see message successful display


        Examples:
        |name      |date_of_birth|address|state  |pin |mobile_phone|email          |password|
        |quynhluong|25/11/1995   |HaNoi  |VietNam|1000|097892345   |quynh@gmail.com|test123 |