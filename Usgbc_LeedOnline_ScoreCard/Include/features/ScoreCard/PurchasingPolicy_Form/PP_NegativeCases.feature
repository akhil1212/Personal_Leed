#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	28.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 28.06.2019
# Feature Name: Verifying the negative cases for file uploads in Purchasing Policy Form and save the form without any data
# Feature Description: Verifying the negative cases for file uploads in Purchasing Policy Form and save the form without any data
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Purchasing Policy Form and save the form without any data

  #Scenario-1
  @NegativeTest
  Scenario Outline: Uploading file greater than 100MB for five most purchased product categories (EPP)
    Given User should be able to see the Add File button for five most purchased product categories in EPP
    When User uploads a file which is greater than 100mb for five most purchased product categories in EPP <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-2
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in five most purchased product categories (EPP)
    Given User should be able to see the Add File button in five most purchased product categories in EPP
    When User uploads a file for five most purchased product categories in EPP <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Uploading file greater than 100MB for Paper, toner cartridges, binders, batteries and desk accessories (EPP)
    Given User should be able to see the Add File button for Paper, toner cartridges and desk accessories in EPP
    When User uploads a file which is greater than 100mb for Paper, toner cartridges and desk accessories in EPP <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-4
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Paper, toner cartridges, binders, batteries and desk accessories (EPP)
    Given User should be able to see the Add File button for Paper, toner cartridges and desk accessories in EPP
    When User uploads a file for for Paper, toner cartridges and desk accessories in EPP <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Uploading file greater than 100MB for Lamps (EPP)
    Given User should be able to see the Add File button for Lamps in EPP
    When User uploads a file which is greater than 100mb for Lamps in EPP <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Lamps (EPP)
    Given User should be able to see the Add File button for Lamps in EPP
    When User uploads a file for Lamps in EPP <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Uploading file greater than 100MB for Office equipment, appliances and audiovisual equipment (EPP)
    Given User should be able to see the Add File button for Office equipment, appliances and audiovisual equipment in EPP
    When User uploads a file which is greater than 100mb for Office equipment, appliances and audiovisual equipment in EPP <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-8
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Office equipment, appliances and audiovisual equipment (EPP)
    Given User should be able to see the Add File button for Office equipment, appliances and audiovisual equipment in EPP
    When User uploads a file for Office equipment, appliances and audiovisual equipment in EPP <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-9
  @NegativeTest
  Scenario Outline: Uploading file greater than 100MB for Electric powered equipment (EPP)
    Given User should be able to see the Add File button for Electric powered equipment in EPP
    When User uploads a file which is greater than 100mb for Electric powered equipment in EPP <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-10
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Electric powered equipment (EPP)
    Given User should be able to see the Add File button for Electric powered equipment in EPP
    When User uploads a file for Electric powered equipment in EPP <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-11
  @NegativeTest
  Scenario Outline: Uploading file greater than 100MB for five most purchased product categories (SWM)
    Given User should be able to see the Add File button for five most purchased product categories in SWM
    When User uploads a file which is greater than 100mb for five most purchased product categories in SWM <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-12
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in five most purchased product categories (SWM)
    Given User should be able to see the Add File button for five most purchased product categories in SWM
    When User uploads a file for five most purchased product categories in SWM <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-13
  @NegativeTest
  Scenario Outline: Uploading file greater than 100MB for Office equipment, appliances and audiovisual equipment (SWM)
    Given User should be able to see the Add File button for Office equipment, appliances and audiovisual equipment in SWM
    When User uploads a file which is greater than 100mb for Office equipment, appliances and audiovisual equipment in SWM <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-14
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Office equipment, appliances and audiovisual equipment (SWM)
    Given User should be able to see the Add File button for Office equipment, appliances and audiovisual equipment in SWM
    When User uploads a file for Office equipment, appliances and audiovisual equipment in SWM <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-15
  @NegativeTest
  Scenario Outline: Uploading file greater than 100MB for Electric powered equipment (SWM)
    Given User should be able to see the Add File button for Electric powered equipment in SWM
    When User uploads a file which is greater than 100mb for Electric powered equipment in SWM <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-16
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Electric powered equipment (SWM)
    Given User should be able to see the Add File button for Electric powered equipment in SWM
    When User uploads a file for Electric powered equipment in SWM <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-17
  @NegativeTest
  Scenario Outline: Uploading file greater than 100MB for Safe disposal of batteries and lamps (SWM)
    Given User should be able to see the Add File button for Safe disposal of batteries and lamps in SWM
    When User uploads a file which is greater than 100mb for Safe disposal of batteries and lamps in SWM <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-18
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Safe disposal of batteries and lamps (SWM)
    Given User should be able to see the Add File button for Safe disposal of batteries and lamps in SWM
    When User uploads a file for Safe disposal of batteries and lamps in SWM <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-19
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for special circumstances in Purchasing Policy
    Given User should be able to see the Add File button for special circumstances in Purchasing Policy
    When User uploads a file which is greater than 100mb of special circumstances in Purchasing Policy <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-20
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file for special circumstances in Purchasing Policy
    Given User should be able to see the Add File button for special circumstances in Purchasing Policy
    When User uploads a file for special circumstances in Purchasing Policy <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed
    And User has to refresh the form

    Examples: 
      | FileName     |
      | 24MBfile.doc |
      
      
 #Scenario-21
  @NegativeTest
  Scenario: Saving the Purchasing Policy form without filling any data
    Given User should be on Purchasing Policy form
    When User clicks on save button without entering any data in Purchasing Policy form
    Then An error message saying Please fix the highlighted errors will be displayed
