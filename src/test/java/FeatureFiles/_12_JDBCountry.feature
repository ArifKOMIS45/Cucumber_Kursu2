Feature: Testing JDBC Country

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Country testing with JDBC
    Then Send The query the databse "select * from country2" and control match