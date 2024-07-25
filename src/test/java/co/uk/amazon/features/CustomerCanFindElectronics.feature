Feature: Buying Electronics User Journey
  As a customer
  I want the ability to search for Tomatoes in Amazon
  Choose a random item from the search results
  So that I can click on the result I chose


  Scenario Outline: Customer can successfully search for 5th Samsung device to buy
    Given I navigate to Amazon homepage
    When I enter Samsung into the search field
    And I change the department to "<department>"
    And I choose the 5th Search Result
    And I add the product to the basket
    Then I should see the product in the basket

    Examples:
      |department  |
      |Electronics & Photo |