Feature: Employee Funtionality

  Scenario: : Create an Employee and Delete
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

    And Click on the element in the left Nav
      | humanResources |
      | employees      |
    And Click on the element in the Dialog
      | addButton |
    When User sending the infos in Form content
      | employeeName           | ArifAli112     |
      | employeeSurname        | Kaya1           |
      | employeeId             | 9315099009      |
      | employeeDocumentNumber | 998700999050009 |
    And Click on the element in the Form Content
      | employeeDocumentType  |
      | employeeDocumentType2 |
      | employeeGender        |
      | employeeGenderMale    |
      | saveBtn               |
    And Click on the element in the left Nav
      | humanResources |
      | employees      |

    Then Delete the user "ArifAli112" from Form Content
    Then Success message should be displayed
    #delete basamagini aratip sonra silinecek odev1
  #country edit yapilacak