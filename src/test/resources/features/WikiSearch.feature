Feature: Wikipedia search functionality and verifications

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

