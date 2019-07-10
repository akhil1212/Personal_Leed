#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 													                                                     Reviewer    :
# Date   : 												                                                           Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Verifying the AutoSaveAsDraft functionality in Grid Harmonization Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Grid Harmonization Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Grid Harmonization Form

#Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if no change in the form in GH
    Given User is on the Formv01 of Grid Harmonization
    When User will not modify any field on the Grid Harmonization Form
    Then User should not see saving of draft even after 10 seconds in Grid Harmonization Form
    
  #Scenario-2
	@SmokeTest
  Scenario: Verifying form draft is not saved if upload files on Grid Harmonization
    Given User should be able to see Upload file on Grid Harmonization Form
    When User uploads any files on Grid Harmonization Form
    Then User should not see saving of draft even after 10 seconds in Grid Harmonization Form
    
  #Scenario-3
	@SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Textbox
    Given User should be able to see the textbox for Peak Electricity in Grid Harmonization
    When User modifies the values in the Peak Electricity in Grid Harmonization
    Then User can see saving of draft even after 10 seconds in Grid Harmonization Form
    
   
   #Scenario-4
	@SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Textbox
    Given User should be able to see textbox for Planned demand reduction in Grid Harmonization
    When User modifies the values in the Planned demand reduction in Grid Harmonization
    Then User should see saving of draft even after 10 seconds in Grid Harmonization Form
   
   
  #Scenario-5
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Percent on peak reduction
    Given User should be able to see the textbox for Percent on peak reduction in Grid Harmonization
    When User should click on textbox of Percent in Grid Harmonization
    Then User can see the draft is saved automatically with date and time for change in textbox in Grid Harmonization Form
    
   #Scenario-6
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should be able to see the Special Circumstances narrative in Grid Harmonization Form
    When User modifies the Special Circumstances narrative data in the Grid Harmonization Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for Special Circumstances narrative in Grid Harmonization Form
    
    #Scenario-7
    @SmokeTest
    Scenario: Verifying the form draft warning message is not retained when the form is saved in Grid Harmonization Form
    Given User can see the Draft is saved automatically with date and time in Grid Harmonization Form
    And User can see the save button in Grid Harmonization Form
    When User saves the Grid Harmonization Form
    Then User verifies the form draft warning message is not retained in Grid Harmonization Form
    
    #Scenario-8
    @SmokeTest
    Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should be able to see the Special Circumstances narrative in Grid Harmonization Form
    When User modifies the Special Circumstances narrative data in the GH Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for Special Circumstances narrative in Grid Harmonization Form
    And User should clear the draft present in Grid Harmonization Form
    
    
       #Scenario-9
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the radio button in Grid Harmonization form for Demand Response Capable
    When User clicks on the radio button of Demand Response Capable and waits for 10 seconds
    And User can see the Clear draft in Grid Harmonization form
    And User clicks on Clear draft in Grid Harmonization form
    Then User can see the draft is cleared in Grid Harmonization form
    
  
    
  #Scenario-10
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time after logout and login in GH
    Given User can see the narrative in Grid Harmonization Form
    When User modifies narrative data in Grid Harmonization Form
    And User will logout from the Grid Harmonization Form
    Then User logs in again to Grid Harmonization Form
    And User should see the warning message is displayed with date and time at the top of the Grid Harmonization Form
    And User verifies draft version is not changed after logout and login in Grid Harmonization Form
    And User click on clear draft on the Grid Harmonization Form
    
    
      
    
    
    
    
    
    
    
    
    