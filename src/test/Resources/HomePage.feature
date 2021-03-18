Feature: Aldi home page functionality

  @search
  Scenario: Aldi online individual product search.

    Given user is on aldi webside home page
    When user type apple in the search box
    And user click on the search
    Then user should be able to see all apple related products

    @starRating
  Scenario: Aldi apple 3 star ratings product lists.

    Given user is on aldi webside home page
    When user type apple in the search box
    And user click on the search
    And user select the three star rating apple product checkbox button
    Then user should able to see all apple three star rating products

  @actions
  Scenario: Aldi homepage reduced products

    Given user is on aldi webside home page
    When user mouse hover over to reduced element new window open
    And user do click on the below ten pound product
    Then user should able to see all below ten pound list of products