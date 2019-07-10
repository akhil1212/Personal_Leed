#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	24.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 24.06.2019
# Feature Name: Delete uploaded files in Energy Efficiency Best Management practices Form
# Feature Description: Delete uploaded files in Energy Efficiency Best Management practices Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Energy Efficiency Best Management practices Form

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from ASHRAE preliminary energy in EEBM Form
    Given User has to see the table of uploaded files on ASHRAE preliminary energy in EEBM Form
    When User deletes the uploaded files of ASHRAE preliminary energy in EEBM Form
    Then User can see all the ASHRAE preliminary energy in EEBM Form are deleted
    
    
     #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from current facility requirements in EEBM Form
    Given User has to see the table of uploaded files on current facility requirements in EEBM Form
    When User deletes the uploaded files of current facility requirements in EEBM Form
    Then User can see all the current facility requirements in EEBM Form are deleted
    
    
     #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from DC Pro Profiling Tool in EEBM Form
    Given User has to see the table of uploaded files on DC Pro Profiling Tool in EEBM Form
    When User deletes the uploaded files of DC Pro Profiling Tool in EEBM Form
    Then User can see all the DC Pro Profiling Tool in EEBM Form are deleted
    
    
     #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from additional documentation in EEBM Form
    Given User has to see the table of uploaded files on additional documentation in EEBM Form
    When User deletes the uploaded files of additional documentation in EEBM Form
    Then User can see all the additional documentation in EEBM Form are deleted