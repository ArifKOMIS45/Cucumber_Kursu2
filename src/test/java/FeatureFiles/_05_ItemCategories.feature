Feature: Item Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline:
    Given Navigate to Item Category page
    When User create an item categories name as "<InventoryItemName>" shortName as "<UserTypeOption>"
    Then Success message should be displayed
    When User delete the "<InventoryItemName>"
    Then Success message should be displayed


    Examples:
      | InventoryItemName | UserTypeOption |
      | Laptopis2132881111   | Manager        |
      | Projectoris22881111   | Student        |
      | Whiteboardis221881111 | Teacher        |