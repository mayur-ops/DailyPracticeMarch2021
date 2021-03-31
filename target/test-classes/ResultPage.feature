Feature: result page functionality

  Background:
    Given user is on aldi webside home page

    @result
  Scenario: ice-cream product result page functionality

    Given user search for the ice-cream products
    When user click on the search button
    Then user should able to see all ice-cream products