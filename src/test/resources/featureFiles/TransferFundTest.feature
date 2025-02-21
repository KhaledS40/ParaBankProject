Feature: User can transfer fund easily now

    @transferFund
    Scenario: User can transfer funds from one account to another
      Given user clicks on accounts review
      When user clicks on transfer funds
      Then user can enters amount
      And user selects amount from both accounts to transfer
      And user now clicks transfer button
      And and now user should get confirmation message transfer complete
      And finally browser should be closed