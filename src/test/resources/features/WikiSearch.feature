Feature: Wikipedia search functionality and verifications

  Scenario:Wikipedia Search Functionality Title Verification
   Given User is on Wikipedia home page
   When User types "史蒂夫·乔布斯 - 维基百科，自由的百科全书" in the wiki search box
   And User clicks wiki search button
   Then User sees "史蒂夫·乔布斯 - 维基百科，自由的百科全书" is in the wiki title

  Scenario:Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When  User types "史蒂夫·乔布斯 - 维基百科，自由的百科全书" in the wiki search box
    And   User clicks wiki search button
    Then  User see the 史蒂夫·乔布斯 - 维基百科，自由的百科全书 is in the mean header