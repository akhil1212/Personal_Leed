#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	24.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 24.06.2019
# Feature Name: Verifying the negative cases for file uploads in Energy Efficiency Best Management practices Form
# Feature Description: Verifying the negative cases for Energy Efficiency Best Management practices Form file uploads
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Energy Efficiency Best Management practices Form

  #Scenario-1
  @NegativeTest
  Scenario: clicks on save button without entering any data in EEBM Form
    Given User should be in Energy Efficiency Best Management practices Form
    When User clicks on save button without entering any data in EEBM Form
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for ASHRAE preliminary energy in EEBM Form
    Given User should be able to see the Add File button for ASHRAE preliminary energy in EEBM Form
    When User uploads a file which is greater than 100mb of ASHRAE preliminary energy in EEBM Form <preliminary_energy>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | preliminary_energy |
      | 102MBfile.pdf      |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in ASHRAE preliminary energy in EEBM Form
    Given User should be able to see the Add File button for ASHRAE preliminary energy in EEBM Form
    When User uploads a file of ASHRAE preliminary energy in EEBM Form <preliminary_energy>
    Then User clicks on save while the file is uploading in EEBM Form
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | preliminary_energy |
      | 24MBfile.doc      |

  #Scenario-4
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for current facility requirements in EEBM Form
    Given User should be able to see the Add File button for current facility requirements in EEBM Form
    When User uploads a file which is greater than 100mb of current facility requirements in EEBM Form <current_facility>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | current_facility |
      | 102MBfile.pdf    |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in current facility requirements in EEBM Form
    Given User should be able to see the Add File button for current facility requirements in EEBM Form
    When User uploads a file of current facility requirements in EEBM Form <current_facility>
    Then User clicks on save while the file is uploading in EEBM Form
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | current_facility |
      | 24MBfile.doc    |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for DC Pro Profiling Tool in EEBM Form
    Given User should be able to see the Add File button for DC Pro Profiling Tool in EEBM Form
    When User uploads a file which is greater than 100mb of DC Pro Profiling Tool in EEBM Form <Pro_Profiling_Tool>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Pro_Profiling_Tool |
      | 102MBfile.pdf      |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in DC Pro Profiling Tool in EEBM Form
    Given User should be able to see the Add File button for DC Pro Profiling Tool in EEBM Form
    When User uploads a file of DC Pro Profiling Tool in EEBM Form <Pro_Profiling_Tool>
    Then User clicks on save while the file is uploading in EEBM Form
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Pro_Profiling_Tool |
      | 24MBfile.doc     |

  #Scenario-8
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for additional documentation in EEBM Form
    Given User should be able to see the Add File button for additional documentation in EEBM Form
    When User uploads a file which is greater than 100mb of additional documentation in EEBM Form <additional_documentation>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | additional_documentation |
      | 102MBfile.pdf            |

  #Scenario-9
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in additional documentation in EEBM Form
    Given User should be able to see the Add File button for additional documentation in EEBM Form
    When User uploads a file of additional documentation in EEBM Form <additional_documentation>
    Then User clicks on save while the file is uploading in EEBM Form
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | additional_documentation |
      | 24MBfile.doc           |
