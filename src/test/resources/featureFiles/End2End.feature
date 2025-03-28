@end2end
Feature: Testing the whole application

  Background:
    Given user is on the home page
    And user enters username and password
    And user is able to click on the login button

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

  @homeLinks
  Scenario: User can navigate in the home page
    Given user is on the home page
    When user clicks About Us link
    And user clicks Services link
    And user clicks Products link
    And user clicks Locations link
    And user clicks Admin Page link
    Then user selects soap checkbox
    And user clicks clean button
    And user enters soap endpoint
    And user enters rest endpoint
    And user enters endpoint
    And user enters initial balance
    And user enters mini balance
    And user selects loan provider
    And user selects loan processor and enters threshold amount
    And finally user clicks submit button and get confirmation text
    And finally browser should be closed

  @transferFund
  Scenario: User can transfer funds from one account to another
    Given user clicks on accounts review
    When user clicks on transfer funds
    Then user can enters amount
#      And user selects amount from both accounts to transfer
    And user now clicks transfer button
    And and now user should get confirmation message transfer complete
    And finally browser should be closed

  @payBill
  Scenario: User pay bill functionality is working
    Given user clicks Bill pay link
    When user can enters all Bill payment information
    Then user can click send payment to complete transaction
    And finally browser should be closed

  @findTransaction
  Scenario: User is able to find transaction
    Given user clicks Find Transaction link
    When user enters date of transaction
    Then user clicks find transaction button
    And finally browser should be closed

  @requestLoan
  Scenario: User can request loan using the link
    Given user clicks Update Contact Info
    When user clicks Request Loan link
    Then user is able to enter Loan amount and down payment
    And finally user clicks Apply button
    And user logout the application
    And finally browser should be closed

#  @login
#  Scenario Outline: User can login to the application with valid credentials
#    Given user is on the home page
#    When user enters "<username>" and "<password>"
#    Then user can clicks on the login button
#    And user should be navigate to login page
#    And finally browser should be closed
#
#    Examples:
#      | username | password|
#      | Bob.John | Cheers1234|
#
#  @invalidUser
#  Scenario: After failed attempt, user should be login again
#
#    Given user is on the home page
#    When user enters set of username and password
#      | username | password|
#      | mike.bob  | Cheers000 |
#      | Bob.John | Cheers1234|
#    Then user should be able to view the account balance
#    And finally browser should be closed