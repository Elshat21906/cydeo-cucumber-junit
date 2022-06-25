Feature: Wikipedia search functionality and verifications

  #PARAMETERIZATION: CUCUMBER EXPRESSIONS
  #- this allow us to pass arguments to our steps from feature files
  #- allows us to do data driven testing

  #- Scenario outlines
  # - Using scenario outlines, we can create a data table of examples, and run our scenario against this table.
  # - Instead of using "Scenario" keyword, we use "Scenario Outline keyword"
  # - After this step, it will not compile unless we provide a table of "Examples"
  # - The arguments we provide in our steps become "header" for the "examples table"
  # - and we provide rest of the data under headers.
  #- we can pass more than one examples table under one scenario outline


  Scenario:Wikipedia Search Functionality Title Verification
   Given User is on Wikipedia home page
   When User types "史蒂夫·乔布斯 - 维基百科，自由的百科全书" in the wiki search box
   And User clicks wiki search button
   Then User sees "史蒂夫·乔布斯 - 维基百科，自由的百科全书" is in the wiki title

  Scenario:Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When  User types "史蒂夫·乔布斯" in the wiki search box
    And   User clicks wiki search button
    Then  User see the "史蒂夫·乔布斯" is in the main header

    @ScenarioOutline
  Scenario Outline:Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When  User types "<searchValue>" in the wiki search box
    And   User clicks wiki search button
    Then  User see the "<expectedTitle>>" is in the main header
    Then  User see the "<expectedMainHeader>>" is in the main header

    Examples:search values we are going to be using in this scenario is as below
      | searchValue | expectedTitle | expectedMainHeader |
      | 史蒂夫·乔布斯     | 史蒂夫·乔布斯       | 史蒂夫·乔布斯            |
      | 克里斯蒂亚诺·罗纳尔多 | 克里斯蒂亚诺·罗纳尔多   | 克里斯蒂亚诺·罗纳尔多        |
      | 鲍勃·马利       | Bob Mar鲍勃·马利  | 鲍勃·马利              |
      | 查克·诺里斯      | 查克·诺里斯        | 查克·诺里斯             |
      | 安东尼·霍普金斯    | 安东尼·霍普金斯      | 安东尼·霍普金斯           |

