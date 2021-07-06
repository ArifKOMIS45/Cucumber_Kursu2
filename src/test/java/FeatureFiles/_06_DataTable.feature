Feature: DataTable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | Countries  |

    And Click on the element in the Dialog
      | addButton |

    When User sending the keys in dailog content
      | nameInput | ismetCountry134 |
      | codeInput | 12311         |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed


  Scenario: Create a Nationality
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    And Click on the element in the Dialog
      | addButton |

    When User sending the keys in dailog content
      | nameInput | ismetNation900 |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Create a Fee
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    When User sending the keys in dailog content
      | nameInput       | ArifFee121 |
      | codeInput       | 122345     |
      | integrationCode | 122365     |
      | priorityCode    | 56         |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed
#    Senaryo Outline da verilen değerler için tüm senaryo her satır kadar tekrar çalıştırılıyordu.
#    DataTable da ise, sadece ilgili step için toplu veri gönderme imkanı oluşuyor.