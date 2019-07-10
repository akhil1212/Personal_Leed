#---------------------------------------------------------------------------------------------------------------------------------
# Authors :																			                                                     Reviewer    :
# Date   : 												                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On:
# Feature Name: Delete uploaded files in Site Management Form
# Feature Description: Delete uploaded files in Site Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Site Management Form
  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from Site Assessment in SM Form
    Given User has to see the table of uploaded files on Site Assessment in SM Form
    When User deletes the uploaded files of Site Assessment in SM Form
    Then User can see all the Site Assessment in SM Form are deleted

 #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from Documentation demonstrating in SM Form
    Given User has to see the table of uploaded files on Documentation demonstrating in SM Form
    When User deletes the uploaded files ofDocumentation demonstrating in SM Form
    Then User can see all the Documentation demonstrating in SM Form are deleted
    
  #Scenario-3
  @DeleteFiles
  Scenario: Deleting files from additional documentation in SM Form
    Given User has to see the table of uploaded files on additional documentation in SM Form
    When User deletes the uploaded files of additional documentation in SM Form
    Then User can see all the additional documentation in SM Form are deleted