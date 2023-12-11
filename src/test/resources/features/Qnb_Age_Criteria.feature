Feature: Verify Minimum and Maximum age criteria of various breed


  Scenario: User does not allowed to go further if age of any bird species is less than 12
    When User enters name of pet and upload image of same
    And User selects product and species from respected  dropdown for bird product
    And User enters pet date of birth less than 12 week from current date for bird product
    Then User will come across error message and not allowed to move further on the system

  Scenario: User does not allowed to go further if age of any Mammals species  is less than 8
    When User enters name of pet and upload image of same
    And User selects product and species from respected  dropdown for mammals product
    And User enters pet date of birth less than 8 week from current date for mammals product
    Then User will come across error message and not allowed to move further on the system

  Scenario: User does not allowed to go further if age of any reptile species is less than 12
    When User enters name of pet and upload image of same
    And User selects product and species from respected  dropdown for reptile product
    And User enters pet date of birth less than 12 week from current date for reptile product
    Then User will come across error message and not allowed to move further on the system

  Scenario: User does not allowed to go further if age of any tortoise species  is less than 12
    When User enters name of pet and upload image of same
    And User selects product and species from respected  dropdown for tortoise product
    And User enters pet date of birth less than 12 week from current date for tortoise product
    Then User will come across error message and not allowed to move further on the system

  Scenario: User does not allowed to go on the sign up page from client and page details page if age of client is under 18
    When User enters name of pet and upload image of same
    And User selects product and species from respected product dropdown
    And User enters client date of birth less than 18  from current date
    Then User will come across error message and not allowed to move log in page on the system