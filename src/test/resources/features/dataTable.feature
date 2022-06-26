Feature: Examples of Cucumber data table implementations

  #Datatables:- Why do we use the data tables?
  # - Parameterization allows us to pass multiple arg in one step
  # - But we cannot pass collection types under one step using parameterization
  # - Data tables allows us to pass collection types under one step
  # - We can pass List, Map, List of Maps, Maps of Maps etc...

  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |

    #to beautify the pipes above
    #mac: command + option + L
    #windows: control + alt + L

  @wip
  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |