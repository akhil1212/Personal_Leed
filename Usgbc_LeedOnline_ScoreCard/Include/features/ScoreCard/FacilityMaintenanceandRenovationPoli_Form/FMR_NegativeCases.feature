#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	10.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 10.06.2019
# Feature Name: Verifying the negative cases for file uploads in Facility Maintenance And Renovation Policy Form
# Feature Description: Verifying the negative cases for Facility Maintenance And Renovation Policy Form file uploads
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Facility Maintenance And Renovation Policy Form

  #Scenario-1
  @NegativeTest
  Scenario: 
    Given User should be in Facility Maintenance and Renovation policy form
    When User clicks on save button without entering any data in FMR
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Base building in FMR Form
    Given User should see the Add File button for Base building in FMR Form
    When User uploads a file which is greater than 100mb of Base building in FMR Form <Base_building>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Base_building |
      | 102MBfile.pdf |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Base building in FMR Form
    Given User should see the Add File button for Base building in FMR Form
    When User uploads a file of Base building in FMR Form <Base_building>
    Then User clicks on save while the file is uploading in FMR
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Base_building |
      | 24MBfile.doc  |

  #Scenario-4
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Furniture And furnishings in FMR Form
    Given User should be able to see the Add File button for Furniture and furnishings in FMR Form
    When User uploads a file which is greater than 100mb of Furniture And furnishings in FMR Form <Furniture_and_furnishings>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Furniture_and_furnishings |
      | 102MBfile.pdf             |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Furniture And furnishings in FMR Forms
    Given User should be able to see the Add File button for Furniture and furnishings in FMR Form
    When User uploads a file of Furniture And furnishings in FMR Form <Furniture_and_furnishings>
    Then User clicks on save while the file is uploading in FMR
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Furniture_and_furnishings |
      | 24MBfile.doc              |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for MR Credit Purchasing in FMR Form
    Given User should be able to see the Add File button for MR Credit Purchasing in FMR Form
    When User uploads a file which is greater than 100mb of MR Credit Purchasing in FMR Form <Credit_Purchasing>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Credit_Purchasing |
      | 102MBfile.pdf     |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in MR Credit Purchasing in FMR Form
    Given User should be able to see the Add File button for MR Credit Purchasing in FMR Form
    When User uploads a file of MR Credit Purchasing in FMR Form <Credit_Purchasing>
    Then User clicks on save while the file is uploading in FMR
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Credit_Purchasing |
      | 24MBfile.doc      |

  #Scenario-8
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Information in Waste Management FMR Form
    Given User should be able to see the Add File button for Information in Waste Management FMR Form
    When User uploads a file which is greater than 100mb of Information in Waste Management FMR Form <InformationWM>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | InformationWM |
      | 102MBfile.pdf |

  #Scenario-9
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Information in Waste Management FMR Form
    Given User should be able to see the Add File button for Information in Waste Management FMR Form
    When User uploads a file of Information in Waste Management FMR Form <InformationWM>
    Then User clicks on save while the file is uploading in FMR
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | InformationWM |
      | 24MBfile.doc  |

  #Scenario-8
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for diversion strategies in Waste Management FMR Form
    Given User should be able to see the Add File button for diversion strategies in Waste Management FMR Form
    When User uploads a file which is greater than 100mb of diversion strategies in Waste Management FMR Form <diversion_strategies>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | diversion_strategies |
      | 102MBfile.pdf        |

  #Scenario-9
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in diversion strategies in Waste Management FMR Form
    Given User should be able to see the Add File button for diversion strategies in Waste Management FMR Form
    When User uploads a file of diversion strategies in Waste Management FMR Form <diversion_strategies>
    Then User clicks on save while the file is uploading in FMR
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | diversion_strategies |
      | 24MBfile.doc         |

  #Scenario-10
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Recommended design in Indoor Air Quality FMR Form
    Given User should be able to see the Add File button for Recommended design in Indoor Air Quality FMR Form
    When User uploads a file which is greater than 100mb of Recommended design in Indoor Air Quality FMR Form <Recommended_design>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Recommended_design |
      | 102MBfile.pdf      |

  #Scenario-11
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Recommended design in Indoor Air Quality FMR Form
    Given User should be able to see the Add File button for Recommended design in Indoor Air Quality FMR Form
    When User uploads a file of Recommended design in Indoor Air Quality FMR Form <Recommended_design>
    Then User clicks on save while the file is uploading in FMR
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Recommended_design |
      | 24MBfile.doc       |

  #Scenario-12
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for reoccupying the space in Indoor Air Quality FMR Form
    Given User should be able to see the Add File button for reoccupying the space in Indoor Air Quality FMR Form
    When User uploads a file which is greater than 100mb of reoccupying the space in Indoor Air Quality FMR Form <reoccupying>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | reoccupying   |
      | 102MBfile.pdf |

  #Scenario-13
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in reoccupying the space in Indoor Air Quality FMR Form
    Given User should be able to see the Add File button for reoccupying the space in Indoor Air Quality FMR Form
    When User uploads a file of reoccupying the space in Indoor Air Quality FMR Form <reoccupying>
    Then User clicks on save while the file is uploading in FMR
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | reoccupying  |
      | 24MBfile.doc |

  #Scenario-14
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for construction ends in Indoor Air Quality FMR Form
    Given User should be able to see the Add File button for construction ends in Indoor Air Quality FMR Form
    When User uploads a file which is greater than 100mb of construction ends in Indoor Air Quality FMR Form <construction>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | construction  |
      | 102MBfile.pdf |

  #Scenario-15
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in reoccupying the space in Indoor Air Quality FMR Form
    Given User should be able to see the Add File button for construction ends in Indoor Air Quality FMR Form
    When User uploads a file of construction ends in Indoor Air Quality FMR Form <construction>
    Then User clicks on save while the file is uploading in FMR
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | construction |
      | 24MBfile.doc |

  #Scenario-16
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for additional documentation in FMR Form
    Given User should be able to see the Add File button for additional documentation in FMR Form
    When User uploads a file which is greater than 100mb of additional documentation in FMR Form <additional_documentation>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | additional_documentation |
      | 102MBfile.pdf            |

  #Scenario-17
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in reoccupying the space in Indoor Air Quality FMR Form
    Given User should be able to see the Add File button for additional documentation in FMR Form
    When User uploads a file of additional documentation in FMR Form <additional_documentation>
    Then User clicks on save while the file is uploading in FMR
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | additional_documentation |
      | 24MBfile.doc             |
