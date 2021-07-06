Feature: Country Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Create a Country
    When Create a country name as "Arif Ulkesi45" code as "45700"
    Then Success message should be displayed


  Scenario: Edit The country
    When User edit The given "Arif Ulkesi45" account to "Arif Ulkesi1975"
    Then Success message should be displayed

Scenario: Delete The Country
    When User delete the "Arif Ulkesi1975"
    Then  Success message should be displayed
