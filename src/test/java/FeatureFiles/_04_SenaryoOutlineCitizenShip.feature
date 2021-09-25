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
      | Arifish4110     | ari400     |
      | Arifish5110     | ari500    |
      | Arifish6110     | ari600    |
      | Arifish7110     | ari700    |