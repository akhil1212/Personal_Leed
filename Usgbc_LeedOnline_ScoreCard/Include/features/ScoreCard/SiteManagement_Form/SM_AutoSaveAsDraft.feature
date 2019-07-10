#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 												                                                     Reviewer    :
# Date   : 							                                                           Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Verifying the AutoSaveAsDraft functionality in Site Management Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Site Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Site Management Form
  
  #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if no change in the form in SM
    Given User is on the Formv01 of Site Management Form
    When User will not modify any field on the Site Management Form
    Then User should not see saving of draft even after 10 seconds in Site Management Form
    
    #Scenario-2
	@SmokeTest
  Scenario: Verifying form draft is not saved if upload files in Site Assessment in SM Form
    Given User should be able to see Upload file on Site Management Form
    When User uploads any files on Site Management Form
    Then User should not see saving of draft even after 10 seconds in Site Management Form
    
    #Scenario-3
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User able to see the Special Circumstances narrative in Site Management Form
    When User modifies the Special Circumstances narrative data in the Site Management Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for Special Circumstances narrative in Site Management Form
    
    #Scenario-4
    @SmokeTest
    Scenario: Verifying the form draft warning message is not retained when the form is saved in SM
    Given User can see the Draft is saved automatically with date and time in SM form
    And User can see the save button in SM form
    When User saves the SM form
    Then User verifies the form draft warning message is not retained in SM form
    
     #Scenario-5
    @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should be able to see the Special Circumstances narrative in Site Management Form
    When User modifies the Special Circumstances narrative data in the SM Form and waits for 10 seconds
    Then User should clear the draft present in Site Management Form
    
  #Scenario-6
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time after logout and login in SM
    Given User can see the narrative in Site Management Form
    When User modifies narrative data in Site Management Form
    And User will logout from the Site Management Form
    Then User logs in again to Site Management Form
    And User should see the warning message is displayed with date and time at the top of the Site Management Form
    And User verifies draft version is not changed after logout and login in Site Management Form
    And User click on clear draft on the Site Management Form
    
    
    