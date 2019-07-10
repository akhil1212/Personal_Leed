#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 																		                                                     Reviewer    :
# Date   : 												                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Verifying the negative cases for file uploads GH
# Feature Description: Verifying the negative cases for file uploads GH - Demand Response Capable which is Case2
#---------------------------------------------------------------------------------------------------------------------------------

@FunctionalTest
Feature: Verifying the negative cases for Grid Harmonization file uploads

  #Scenario-1
  @NegativeTest
  Scenario: clicks on save button without entering any data in GH
    Given User should be in Demand Response Capable option
    When User clicks on save button without entering any data in GH
    Then An error message saying Please fix the highlighted errors will be displayed

  
  
      #Scenario-2
  @NegativeTest
  Scenario Outline: User fills Peak Electricity with more than 10 digits in Grid Harmonization
    Given User should be able to see the textbox for peak Electricity in Grid Harmonization
    When User can enter the values for Peak Electricity <Peak_Electricity>
    Then User can see the entered value and the value present in the Peak Electricity is not same

    Examples: 
      | Peak_Electricity |
      |  66,612,334,442.25 |

  #Scenario-3
  @NegativeTest
  Scenario Outline: User fills Peak Electricity with 10 digits and more than 2 decimal values in Grid Harmonization
    Given User should be able to see the textbox for peak Electricity in Grid Harmonization
    When User can enter the values for Peak Electricity <Peak_Electricity>
    Then User can see the entered value and the value present in the Peak Electricity is not same

    Examples: 
      | Peak_Electricity |
      |  1,234,567,845.255 |



#Scenario-4
  @NegativeTest
  Scenario Outline: User fills Planned demand reduction with more than 10 digits in Grid Harmonization
    Given User should be able to see the textbox for planned demand reduction in Grid Harmonization
    When User can enter the values for planned demand reduction <Planned_demand_reduction>
    Then User can see the entered value and the value present in the Planned demand reduction is not same

    Examples: 
      | Planned_demand_reduction |
      |  66,612,334,442.25 |

  #Scenario-5
  @NegativeTest
  Scenario Outline: User fills Planned demand reduction with 10 digits and more than 2 decimal values in Grid Harmonization
    Given User should be able to see the textbox for planned demand reduction in Grid Harmonization
    When User can enter the values for planned demand reduction <Planned_demand_reduction>
    Then User can see the entered value and the value present in the Planned demand reduction is not same

    Examples: 
      | Planned_demand_reduction |
      |  1,234,567,845.255 |