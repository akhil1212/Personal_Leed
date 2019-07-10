#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 																	                                                     Reviewer    :
# Date   : 												                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Verifying uploaded files in Grid Harmonization Form - Permanent Load Shifting and Demand Response Program
# Feature Description: Verifying uploaded files in Grid Harmonization Form - Permanent Load Shifting which is Case3 and Demand Response Program Case1
#--------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Grid Harmonization Form-Permanent Load Shifting and Demand Response Program

 #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files of Summary for Permanent Load Shifting in Grid Harmonization
    Given User has to see the table of uploaded files of summary in Grid Harmonization
    Then User verifies the file name uploaded with the file name present in the table summary in Grid Harmonization

   #Scenario-2
    @SmokeTest
   Scenario: Verifying uploaded files of Proof of enrollement for Demand Response Program in Grid Harmonization
    Given User has to see the table of uploaded files of Proof of enrollement in Grid Harmonization
    Then User verifies the file name uploaded with the file name present in the table Proof of enrollement in Grid Harmonization
    
    
    #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files of additional documentation in Grid Harmonization
    Given User has to see the table of uploaded files of additional documentation in Grid Harmonization
    Then User verifies the file name uploaded with the file name present in the table additional documentation in Grid Harmonization
    And User should clear the form draft by clicking on clear draft
    And User should click on Yes button to clear draft