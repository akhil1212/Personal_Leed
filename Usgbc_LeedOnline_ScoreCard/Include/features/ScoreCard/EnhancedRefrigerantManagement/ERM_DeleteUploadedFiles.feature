#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	04.07.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 04.07.2019
# Feature Name: Delete uploaded files in Enhanced Refrigerant Management Form
# Feature Description: Delete uploaded files in Enhanced Refrigerant Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Enhanced Refrigerant Management Form

	
  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from refrigerant equipment schedule in ERM Form 
    Given User has to see the table of uploaded files on refrigerant equipment schedule
    When User deletes the uploaded files of refrigerant equipment schedule in ERM Form 
    Then User can see all the refrigerant equipment schedule in ERM Form  are deleted
    
  #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from additional documentation in ERM Form
    Given User has to see the table of uploaded files on special circumstances in ERM Form
    When User deletes the uploaded files of additional documentation in ERM Form
    Then User can see all the additional documentation in ERM Form are deleted