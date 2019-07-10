#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	27.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 27.06.2019
# Feature Name: Delete uploaded files in Innovation Form
# Feature Description: Delete uploaded files in Innovation Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Innovation Form

#Scenario-1
  @DeleteFiles
  Scenario: Deleting files from LEED Accredited Professional in Innovation
    Given User has to see the table of uploaded files on LEED Accredited in Innovation
    When User deletes the uploaded files of LEED Accredited Professional in Innovation Form
    Then User can see all the LEED Accredited Professional in Innovation Form are deleted
    
    #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from supporting documentation in Innovation Form
    And User has to see the table of uploaded files on required documentation in Innovation
    When User deletes the uploaded files of required documentation in Innovation Form
    Then User can see all the required documentaion in Innovation Form are deleted
    
     #Scenario-3
  @DeleteFiles
  Scenario: Deleting files from additional documentation in Innovation Form
    Given User has to see the table of uploaded files on additional documentation in Innovation
    When User deletes the uploaded files of additional documentation in Innovation Form
    Then User can see all the supporting additional in Innovation Form are deleted
    
   #Scenario-4
  @SmokeTest
  Scenario: Downloading the files of required documentation in innovation
    Given User should see the radio button option Innovation Strategy
    And User clicks on Innovation Strategy
   	And User has to see the table of uploaded files on supporting documentation in Innovation
    When User deletes the uploaded files of supporting documentation in Innovation Form
    Then User can see all the supporting documentation in Innovation Form are deleted
    And User should see saving of draft after 10 seconds in Innovation
    And User clicks clear draft in Innovation
    
    
     