Feature: Generate Policy for Exotic products

  Scenario: Generate policy for bird species of exotic breed
    When User enters pet name and click on continue button for bird product
    And User upload picture of pet and clicks on upload button for bird product
    And User selects breed of exotic product and clicks on continue button for bird product
    And User selects species of bird for bird product
    And User enters details of pet, clients and fills all additional questionnaire
    And User selects payment options
    Then Policy will generate in to the system