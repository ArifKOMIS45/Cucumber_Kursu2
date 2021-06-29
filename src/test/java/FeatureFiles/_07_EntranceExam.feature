Feature: Entrance Exam Functionality

  @SmokeTest

  Scenario: Create an Exam and Delete
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | enteranceExam     |
      | enteranceSetup    |
      | enteranceExamForm |

    And Click on the element in the Dialog
      | addButton |

    When User sending the keys in dailog content
      | nameInput | ArifExam1 |



    And Click on the element in the Form Content
      | academicPeriod1 |
      | academicPeriod2 |
      | gradeLevel      |
      | gradeLevel2     |
      | saveBtn         |

    Then Success message should be displayed

    And Click on the element in the left Nav
      | enteranceExam     |
      | enteranceSetup    |
      | enteranceExamForm |

    Then User delete the "ArifExam1" from Form content
