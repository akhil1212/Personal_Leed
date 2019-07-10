#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	14.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 14.06.2019
# Feature Name: Delete uploaded files in Green Cleaning Form- Cleaning products and materials
# Feature Description: Delete uploaded files in Green Cleaning Form - Cleaning products and materials Form which is Option 4
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Green Cleaning Form- Cleaning products and materials

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from Green Cleaning Calculator in Green Cleaning Form
  	Given User has to see the table of uploaded files of Green Cleaning Calculator in Green Cleaning
    When User deletes the uploaded files of Green Cleaning Calculator in Green Cleaning Form
    Then User can see all the Green Cleaning Calculator in Green Cleaning Form are deleted
    
  #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from executed contract in Green Cleaning Form
    Given User has to see the table of uploaded files of executed contract in Green Cleaning
    When User deletes the uploaded files of executed contract in Green Cleaning Form
    Then User can see all the executed contract in Green Cleaning Form are deleted
    
  #Scenario-3
  @DeleteFiles
  Scenario: Deleting files from MSDS sheets in Green Cleaning Form
    Given User has to see the table of uploaded files of MSDS sheets in Green Cleaning
    When User deletes the uploaded files of MSDS sheets in Green Cleaning Form
    Then User can see all the MSDS sheets in Green Cleaning Form are deleted
    
  #Scenario-4
  @DeleteFiles
  Scenario: Deleting files from additional documentation in Green Cleaning Form
    Given User has to see the table of uploaded files of additional documentation in Green Cleaning
    When User deletes the uploaded files of additional documentation in Green Cleaning Form
    Then User can see all the additional documentation in Green Cleaning Form are deleted