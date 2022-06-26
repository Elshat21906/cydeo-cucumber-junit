Feature: User should be able to login using correct credentials


  Scenario: Positive login scenario
    Given user is on the login page of table app
    When  user enters username "Test"
    And   user enters password "Tester"
    And   user clicks login button
    Then  user should see url contains order

  @wip
  Scenario: Positive login scenario
    Given user is on the login page of table app
    When  user enters username "Test" password "Tester" and login
    Then  user should see url contains order

  Scenario: User should be able to see all 12 months in
  months
  dropdown
    Given user is on the login page of table app
    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then  user should see url contains order
