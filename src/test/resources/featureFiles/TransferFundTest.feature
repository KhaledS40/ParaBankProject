Feature: User can transfer fund easily now

  Background:
    Given user is on the home page
    And user enters username and password
    And user is able to click on the login button

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