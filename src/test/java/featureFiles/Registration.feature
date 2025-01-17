
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @registration
  Scenario: User can register by clicking Register link
    Given user is on the home page
    When user click on "regiser" link
    And user enter "first name " and " last name"
    And user etner address and city
    And user enter state and zipCode
    And user enter phone number and SSN
    And now user should create username
    And user also should create password and confirm password
    Then user can click "Register" link to register ot the site 
    And a confirmation message should be created "Your account was created successfully."

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    ##When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
     # | name1 |     5 | success |
      #| name2 |     7 | Fail    |
