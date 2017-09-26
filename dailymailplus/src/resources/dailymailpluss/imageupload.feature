Feature: upload image
  @uploadimage
  Scenario: upload an image
    Given i am on imageupload main page
    When i click on upload file
    And select image to upload
    Then i should successfully upload an image
