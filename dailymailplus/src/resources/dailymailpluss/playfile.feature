
Feature: Play videos

  Scenario: In order to validate the first video

  As a User I want
  I want to play the videos on the file system



    Given navigate to the file delivery system page

    When I click on the first video play button

    And I click maximize option
    Then I revert the the video size to minimu size

    And I click on close button


    Scenario: In order to  validation  second video


      Given navigate to the file delivery system page

      When I click on the second video play button

      And I click maximize option
      Then I revert the the video size to minimu size

      And I click on close button



  Scenario: In order to play the third video

    Given I am on the file delivery system page

    When I click on the third video play button

    And I click maximize option
    Then I revert the the video size to minimu size

    And I click on close button




