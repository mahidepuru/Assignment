Feature: login and logout validations
  @login
  Scenario Outline: login with valid credentials
    Given i am in dailymailplus homepage
    When i enter username as '<username>' and password as '<password>'
    Then it should display following  Personal Details tab,Payment Details tab,Help tab,Issues tab
    Examples:
    |username               |password|
    |dmgtesters2+2@gmail.com |Technical01|

  Scenario Outline: logout
    Given i am in dailymailplus homepage
    When i enter username as '<username>' and password as '<password>'
    And click on logout
    Then i should successfully logout
  Examples:
    |username               |password|
    |dmgtesters2+2@gmail.com |Technical01|