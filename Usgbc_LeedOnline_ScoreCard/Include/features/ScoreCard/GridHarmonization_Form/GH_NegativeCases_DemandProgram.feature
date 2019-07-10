#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 																		                                                     Reviewer    :
# Date   : 												                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Verifying the negative cases for file uploads GH
# Feature Description: Verifying the negative cases for file uploads GH - Demand Response Program which is Case1
#---------------------------------------------------------------------------------------------------------------------------------

@FunctionalTest
Feature: Verifying the negative cases for Grid Harmonization file uploads

  
  #Scenario-1
  @NegativeTest
  Scenario: clicks on save button without entering any data in GH
    Given User should be in Demand Response Program option
    When User clicks on save button without entering any data in GH
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Proof of enrollement
    Given User should be able to see the Add File button of Proof of enrollement for Demand Response Capable in Grid Harmonization
    When User uploads a file which is greater than 100 mb of Proof of enrollement for Demand Response Capable <Proof_of_enrollement>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Proof_of_enrollement |
      | 102MBfile.pdf       |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Grid Harmonization
    Given User should be able to see the Add File button of Proof of enrollement for Demand Response Capable in Grid Harmonization
    When User uploads a file of Proof of enrollement for Demand Response Capable <Proof_of_enrollement>
    Then User clicks on save while the file is uploading in GH
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Proof_of_enrollement|
      | 24MBfile.doc        |

  
      #Scenario-4
  @NegativeTest
  Scenario Outline: User fills Electricity with more than 10 digits in Grid Harmonization
    Given User should be able to see the textbox for Electricity in Grid Harmonization
    When User can enter the values for Electricity <Electricity>
    Then User can see the entered value and the value present in the Electricity is not same

    Examples: 
      | Electricity |
      |  66,612,334,442.25 |

  #Scenario-5
  @NegativeTest
  Scenario Outline: User fills Electricity with 10 digits and more than 2 decimal values in Grid Harmonization
    Given User should be able to see the textbox for Electricity in Grid Harmonization
    When User can enter the values for Electricity <Electricity>
    Then User can see the entered value and the value present in the Electricity is not same

    Examples: 
      | Electricity |
      |  1,234,567,845.255 |


 #Scenario-6
  @NegativeTest
  Scenario Outline: User fills Demand reduction with more than 10 digits in Grid Harmonization
    Given User should be able to see the textbox for Demand reduction in Grid Harmonization
    When User can enter the values for Demand reduction <Demand_reduction>
    Then User can see the entered value and the value present in the Demand reduction is not same

    Examples: 
      | Demand_reduction |
      |  66,612,334,442.25 |

  #Scenario-7
  @NegativeTest
  Scenario Outline: User fills Demand reduction with 10 digits and more than 2 decimal values in Grid Harmonization
    Given User should be able to see the textbox for Demand reduction in Grid Harmonization
    When User can enter the values for Demand reduction <Demand_reduction>
    Then User can see the entered value and the value present in the Demand reduction is not same

    Examples: 
      | Demand_reduction |
      |  1,234,567,845.255 |





  