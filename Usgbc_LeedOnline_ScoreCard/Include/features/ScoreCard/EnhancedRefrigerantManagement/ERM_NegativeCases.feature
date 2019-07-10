#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	04.07.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 04.07.2019
# Feature Name: Verifying the negative cases for file uploads in Enhanced Refrigerant Management Form
# Feature Description: Verifying the negative cases for Enhanced Refrigerant Management Form file uploads
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Enhanced Refrigerant Management Form

  #Scenario-1
  @NegativeTest
  Scenario: clicks on save button without entering any data in Enhanced Refrigerant Management Form
    Given User should be in Calculation of Refrigerant Impact option
    When User clicks on save button without entering any data in ERM Form
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for refrigerant equipment schedule
    Given User should be able to see the Add File button for refrigerant equipment in ERM Form
    When User uploads a file which is greater than 100mb of refrigerant equipment schedule <refrigerant_equi>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | refrigerant_equi |
      | 102MBfile.pdf    |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in refrigerant equipment schedule
    Given User should be able to see the Add File button for refrigerant equipment in ERM Form
    When User uploads a file of refrigerant equipment schedule <refrigerant_equi>
    Then User clicks on save while the file is uploading in ERM Form
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | refrigerant_equi |
      | 24MBfile.doc     |
      
      
      
