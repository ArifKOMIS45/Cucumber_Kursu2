Feature: Country Multi Scenario

  Background:#ortak calisan yerler icin kullanilacak
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page


  Scenario: Create a Country
    When Create a country
    Then Success message should be displayed

  Scenario:Create a Country parameter data
    When Create a country name as "Arif yeni34" code as "1976455"
    Then Success message should be displayed