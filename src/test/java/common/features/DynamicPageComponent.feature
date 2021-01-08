Feature: Dynamic Element Component

  @teamplate @feature_convension
  Scenario: Page Component Template
    #-----------------------------ACTION---------------------
    Given I open application
    #Button
    Given I click to dynamic "" button
    And I click to dynamic "" api google button
    #Link
    And Click to dynamic "" page link
    And Click to dynamic "" subpage link
    And Click to dynamic "" first button link
    And Click to dynamic "" post button link
    #Dropdown
    When I select in dynamic dropdown "" with item ""
    # Check box
    And I check to dynamic "" checkbox
    #textbox
    And Input to dymanic textbox "" with value ""
    And Input to dymanic textbox api google "" with value ""
    And Input to dymanic textbox "" with value random
    #Textarea
    And Input to dynamic textarea "" with value ""
    #Checkbox/ Radio
    And Click to dynamic "" radio or checkbox
    #Alert
    And Get text dynamic in alert ""
    And Accept dynamic in alert
    # --------------------------VERIFY----------------------
    Then Verify text noti "" is displayed in noti ""
    And Verify dynamic text "" is displayed in table ""
    And Verify dynamic text "" is displayed in table
    And Get text in dynamic "" noti
    And Verify "" text is displayed
