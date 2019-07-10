#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 																                                                     Reviewer    :
# Date   : 											                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Delete uploaded files in Grid Harmonization Form- Permanent Load Shifting
# Feature Description: Delete uploaded files in Grid Harmonization Form - Permanent Load Shifting which is Case3
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Grid Harmonization Form - Custodial effectiveness assessment

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from Permanent Load Shifting in Grid Harmonization Form
    Given User has to see the table of uploaded files of summary in Grid Harmonization 
    When User deletes the uploaded files of summary in Grid Harmonization Form
    Then User can see all the Project's Load Shifting in Grid Harmonization Form are deleted
    
    #Scenario-2
    @DeleteFiles
    Scenario: Deleting files from Proof of enrollement in Grid Harmonization Form
  	Given User has to see the table of uploaded files of Proof of enrollement in Grid Harmonization
    When User deletes the uploaded files of Proof of enrollement in Grid Harmonization Form
    Then User can see all the Proof of enrollement in Grid Harmonization Form are deleted
    
 
  #Scenario-3
  @DeleteFiles
  Scenario: Deleting files from additional documentation in Grid Harmonization Form
    Given User has to see the table of uploaded files of additional documentation in Grid Harmonization
    When User deletes the uploaded files of additional documentation in Grid Harmonization Form
    Then User can see all the additional documentation in Grid Harmonization Form are deleted
    And User should clear the form draft by clicking on clear draft
    And User should click on Yes button to clear draft