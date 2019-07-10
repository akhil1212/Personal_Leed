#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	27.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 27.06.2019
# Feature Name: Verifying uploaded files in Innovation Form
# Feature Description: Verifying uploaded files in Innovation
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Innovation

 #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files of project team member’s LEED Accredited
    Given User has to see the table of uploaded files on project team member’s LEED Accredited
    Then User verifies the file name uploaded with the file name present in the table of project team member’s LEED Accredited
    
  #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files of required documentation
    Given User has to see the table of uploaded files on required documentation
    Then User verifies the file name uploaded with the file name present in the table of required documentation
    
    
  #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files of additional documentation
    Given User has to see the table of uploaded files on additional documentation
    Then User verifies the file name uploaded with the file name present in the table of additional documentation 
    
   #Scenario-4
  @SmokeTest
  Scenario: Verifying uploaded files of supporting documentation in Innovation Strategy
    Given User should see the radio button option Innovation Strategy
    And User clicks on Innovation Strategy
    And User has to see the table of uploaded files on supporting documentation in Innovation Strategy
    Then User verifies the file name uploaded with the file name present in the table of supporting documentation in Innovation Strategy
    And User should see saving of draft after 10 seconds in Innovation
    And User clicks clear draft in Innovation
    
       