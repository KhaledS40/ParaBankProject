Feature: User opens new Account

  @newAccount
  Scenario: User is able to open new Account
    Given user is on the home page
    When user enters username and password
    Then user is able to click on the login button
    And user should clicks on Open New Account
    And user selects type of account from dropdown
    And finally user clicks Open New Account button
    And a congratulations message would displays to verify the account created
    And finally browser should be closed




