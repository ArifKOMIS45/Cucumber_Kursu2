Feature: Citizenship with scenario Outline


  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship page

  @RegressionTest
  Scenario Outline: Citizenship create and delete with scenario Outline
    When User a Citizenship name as "<CitizenShipName>" short name as "<ShortName>"
    Then Success message should be displayed

    When User a Citizenship name as "<CitizenShipName>" short name as "<ShortName>"
    Then Already exist message should be displayed
    And Click on close button

    When User delete the "<CitizenShipName>"
    Then Success message should be displayed

    Examples:
      | CitizenShipName | ShortName |
      | Arifish4113     | ari41     |
      | Arifish5113     | ari51     |
      | Arifish6113     | ari61     |
      | Arifish7113     | ari71     |