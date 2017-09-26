
Feature: download  videos

  Scenario: In order to download videos function validation


  As a User

  I want to download the video on the filesystem website



    Given navigate to the file delivery system page

    When I click download button on the first video

    Then I see theconfirmation message on top




    Scenario: In order to  validation  mulitple videos download function validation on the filesystem website


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




