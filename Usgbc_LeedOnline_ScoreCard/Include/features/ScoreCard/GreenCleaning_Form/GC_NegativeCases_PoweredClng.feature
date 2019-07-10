#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	14.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 14.06.2019
# Feature Name: Verifying the negative cases for file uploads GC
# Feature Description: Verifying the negative cases for file uploads GC - Powered cleaning equipment which is option 3
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads GC

  #Scenario-1
  @NegativeTest
  Scenario: clicks on save button without entering any data in GC
  Given User should be in Powered cleaning equipment option
  When User clicks on save button without entering any data in GC
  Then An error message saying Please fix the highlighted errors will be displayed
  
  
  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Green Cleaning
  Given User should be able to see the Add File button of Green Cleaning Calculator for Powered cleaning equipment in Green Cleaning
  When User uploads a file which is greater than 100mb of Green Cleaning Calculator for Powered cleaning equipment <Green_Cleaning_Calc>
  Then An error message saying Maximum allowed file size is 100 MB only will be displayed
  
  Examples:
  | Green_Cleaning_Calc |
  | 102MBfile.pdf       |
  
  
  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Green Cleaning
  Given User should be able to see the Add File button of Green Cleaning Calculator for Powered cleaning equipment in Green Cleaning
  When User uploads a file of Green Cleaning Calculator <Green_Cleaning_Calc>
  Then User clicks on save while the file is uploading in GC
  And An error message saying Please wait running actions to complete will be displayed
  
  Examples:
  | Green_Cleaning_Calc |
  | 24MBfile.doc        |
  
  
  #Scenario-4
  @NegativeTest
  Scenario Outline: User fills powered janitorial equipment with more than 10 digits in green cleaning
    Given User should be able to see the textbox for powered janitorial equipment  in green cleaning
    When User can enter the values for powered janitorial equipment <powered_janitorial>
    Then User can see the entered value and the value present in the powered janitorial equipment is not same

    Examples: 
      | powered_janitorial |
      |  66,612,334,442.25 |

  #Scenario-5:
  @NegativeTest
  Scenario Outline: User fills powered janitorial equipment  with 10 digits and more than 2 decimal values in green cleaning
    Given User should be able to see the textbox for powered janitorial equipment  in green cleaning
    When User can enter the values for powered janitorial equipment <powered_janitorial>
    Then User can see the entered value and the value present in the powered janitorial equipment is not same

    Examples: 
      | powered_janitorial |
      |  1,234,567,845.255 |
