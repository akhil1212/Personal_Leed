#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                                     Reviewer    :
# Date   : 	10.06.2019											                                                           Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 10.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in Facility Maintenance and Renovation Policy Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Facility Maintenance and Renovation Policy Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Facility Maintenance and Renovation Policy Form

  
  #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if no change in the form in FMR
    Given User is on the Formv01 of Facility Maintenance and Renovation Policy Form
    When User will not modify any field on the Facility Maintenance and Renovation Policy Form
    Then User should not see saving of draft even after 10 seconds in Facility Maintenance and Renovation Policy Form
    
	 #Scenario-2
	@SmokeTest
  Scenario: Verifying form draft is not saved if upload files in Base building in FMR Form
    Given User should be able to see Upload file on Facility Maintenance and Renovation Policy Form
    When User uploads any files on Facility Maintenance and Renovation Policy Form
    Then User should not see saving of draft even after 10 seconds in Facility Maintenance and Renovation Policy Form
    
  #Scenario-3
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should be able to see the Special Circumstances narrative in Facility Maintenance and Renovation Policy Form
    When User modifies the Special Circumstances narrative data in the Facility Maintenance and Renovation Policy Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for Special Circumstances narrative in Facility Maintenance and Renovation Policy Form
    
    #Scenario-4
    @SmokeTest
    Scenario: Verifying the form draft warning message is not retained when the form is saved in FMR
    Given User can see the Draft is saved automatically with date and time in FMR form
    And User can see the save button in FMR form
    When User saves the FMR form
    Then User verifies the form draft warning message is not retained in FMR form
    
    
    #Scenario-5
    @SmokeTest
    Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should be able to see the Special Circumstances narrative in Facility Maintenance and Renovation Policy Form
    When User modifies the Special Circumstances narrative data in the FMR Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for Special Circumstances narrative in Facility Maintenance and Renovation Policy Form
    And User should clear the draft present in Facility Maintenance and Renovation Policy Form
    
  #Scenario-6
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time after logout and login in FMR
    Given User can see the narrative in Facility Maintenance and Renovation Policy Form
    When User modifies narrative data in Facility Maintenance and Renovation Policy Form
    And User will logout from the Facility Maintenance and Renovation Policy Form
    Then User logs in again to Facility Maintenance and Renovation Policy Form
    And User should see the warning message is displayed with date and time at the top of the Facility Maintenance and Renovation Policy Form
    And User verifies draft version is not changed after logout and login in Facility Maintenance and Renovation Policy Form
    And User click on clear draft on the Facility Maintenance and Renovation Policy Form
    
    