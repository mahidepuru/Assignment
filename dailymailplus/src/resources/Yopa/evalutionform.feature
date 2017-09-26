Feature: Validating Free Valution Form



  Scenario: In order to validate the user journey of the Home page

    Given I am on HomePage
     When I provide postcode
    Then I provide the Housenumber or name
    And I see Booking detils text boxes to fill
    Then I click the House Number Text Field
    And I click Button



