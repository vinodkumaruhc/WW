Feature: WW Studios nearest location finder

  
  Scenario Outline: Find WW Studios nearest location and check Business Hours
    Given  User on the WW Studio location Finder webpage 
    And Check page title display is correct  
    And User click on In-Person under Find your Workshop title
    Then Enter zip code as "<zip code>" in search field     
    And Click search button
    Then Print the title of the first result and the distance
    And Click on the first search result
    And user verify displayed location name/title matches with the name of the first searched result
    Then User  click on Business Hours
    And Print all the business hours for that studio
    Examples:
      |zip code|
      |10011|

 

