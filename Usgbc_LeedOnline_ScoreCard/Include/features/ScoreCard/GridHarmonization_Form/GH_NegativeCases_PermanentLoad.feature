#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 																		                                                     Reviewer    :
# Date   : 												                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Verifying the negative cases for file uploads GH
# Feature Description: Verifying the negative cases for file uploads GH - Permanent Load Shifting which is Case3
#---------------------------------------------------------------------------------------------------------------------------------

@FunctionalTest
Feature: Verifying the negative cases for Grid Harmonization file uploads

  #Scenario-1
  @NegativeTest
  Scenario: clicks on save button without entering any data in GH
    Given User should be in Permanent Load Shifting option
    When User clicks on save button without entering any data in GH
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Summary
    Given User should be able to see the Add File button of Summary for Permanent Load Shifting in Grid Harmonization
    When User uploads a file which is greater than 100mb of Summary for Permanent Load Shifting <Summary>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Summary |
      | 102MBfile.pdf       |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Grid Harmonization
    Given User should be able to see the Add File button of Summary for Permanent Load Shifting in Grid Harmonization
    When User uploads a file of Summary for Permanent Load Shifting <Summary>
    Then User clicks on save while the file is uploading in GH
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Summary |
      | 24MBfile.doc        |

  
      #Scenario-4
  @NegativeTest
  Scenario Outline: User fills On Peak Electricity with more than 10 digits in Grid Harmonization
    Given User should be able to see the textbox for On Peak Electricity in Grid Harmonization
    When User can enter the values for On Peak Electricity <On_Peak_Electricity>
    Then User can see the entered value and the value present in the On Peak Electricity is not same

    Examples: 
      | On_Peak_Electricity |
      |  66,612,334,442.25 |

  #Scenario-5
  @NegativeTest
  Scenario Outline: User fills On Peak Electricity with 10 digits and more than 2 decimal values in Grid Harmonization
    Given User should be able to see the textbox for On Peak Electricity in Grid Harmonization
    When User can enter the values for On Peak Electricity <On_Peak_Electricity>
    Then User can see the entered value and the value present in the On Peak Electricity is not same

    Examples: 
      | On_Peak_Electricity |
      |  1,234,567,845.255 |

 #Scenario-6
  @NegativeTest
  Scenario Outline: User fills Planned demand with more than 10 digits in Grid Harmonization
    Given User should be able to see the textbox for Planned demand in Grid Harmonization
    When User can enter the values for Planned demand <Planned_demand>
    Then User can see the entered value and the value present in the Planned demand is not same

    Examples: 
      | Planned_demand |
      |  66,612,334,442.25 |

  #Scenario-7
  @NegativeTest
  Scenario Outline: User fills Planned demand with 10 digits and more than 2 decimal values in Grid Harmonization
    Given User should be able to see the textbox for Planned demand in Grid Harmonization
    When User can enter the values for Planned demand <Planned_demand>
    Then User can see the entered value and the value present in the Planned demand is not same

    Examples: 
      | Planned_demand |
      |  1,234,567,845.255 |