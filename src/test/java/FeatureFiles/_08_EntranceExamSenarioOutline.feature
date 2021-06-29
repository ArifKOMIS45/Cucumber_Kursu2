#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption | GradeLevelOption |
#| Math exam is1   | academicPeriod2              | option4  |
#| IT exam is1     | academicPeriod2              | option1  |
#| Oracle exam is1 | academicPeriod2              | option2  |
#| Math exam  is1  | academicPeriod2              | option3  |


Feature: Entrance Exam Functionality
  Scenario Outline: Create an Exam and Delete
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
      | nameInput | <ExamName>  |

    And Click on the element in the Form Content
      | academicPeriod1 |
      | <AcademicPeriodOption> |
      | gradeLevel      |
      | <GradeLevelOption>     |
      | saveBtn         |

    Then Success message should be displayed

    And Click on the element in the left Nav
      | enteranceExam     |
      | enteranceSetup    |
      | enteranceExamForm |

    Then User delete the "<ExamName>" from Form content
    Examples:
      | ExamName        | AcademicPeriodOption | GradeLevelOption |
      | Math exam is1   | academicPeriod2              | gradeLevel1  |
      | IT exam is1     | academicPeriod2              | gradeLevel4  |
      | Oracle exam is1 | academicPeriod2              | gradeLevel21  |
      | Math exam  is1  | academicPeriod2              | gradeLevel3  |
