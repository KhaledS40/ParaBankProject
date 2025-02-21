Feature: Login page functionality

  @login
  Scenario Outline: User can login to the application with valid credentials
    Given user is on the home page
    When user enters "<username>" and "<password>"
    Then user can clicks on the login button
    And user should be navigate to login page
    And finally browser should be closed

    Examples:
      | username | password|
      | Bob.John | Cheers1234|

    @invalidUser
    Scenario: After failed attempt, user should be login again

      Given user is on the home page
      When user enters set of username and password
        | username | password|
        | mike.bob  | Cheers000 |
        | Bob.John | Cheers1234|
      Then user should be able to view the account balance
      And finally browser should be closed

      @newAccount
      Scenario: User opens new account
        Given




