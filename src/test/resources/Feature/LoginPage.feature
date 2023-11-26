Feature: To verify Travel WebPage

  Scenario Outline: To Verify Travel Login WebPage With Valid Credentails
    Given User Should Be In Travel Login Page
    When User Should Enter the Username and Password
    And User Should Click the Login button
    And User Should Click the continuebutton
    And User Should Click the next button
    And User Should be Paynow Was sucessfull
    Then User Should Verify the Suessfull Message
