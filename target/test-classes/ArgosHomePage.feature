Feature: argos home page functionality

  @argosShop
  Scenario: argos home page functionality

    Given user is on argos home page
    When user hover the mouse on shop option and auto option display
    Then user click to the Toys option

  @ArgosDropDown

  Scenario: dropdown functionality

    Given user is on argos home page
    And user type in search box puma product
    When user enter on the search button
    And user click on the drop down button
    And user select the customer rating category
    Then user should able to see all customer rating related product