Feature: Verify Home page links are functional

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

