#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                                     Reviewer    :
# Date   : 	11.07.2019											                                                           Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 11.07.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in Heat Island Reduction Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Heat Island Reduction Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Heat Island Reduction Form

 #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if no change in the form in HIR Form
    Given User is on the Formv01 of Heat Island Reduction Form
    When User will not modify any field on the Heat Island Reduction Form
    Then User should not see saving of draft even after 10 seconds in Heat Island Reduction Form
    
  #Scenario-2
	@SmokeTest
  Scenario: Verifying form draft is not saved if upload files in Heat Island Reduction Form
    Given User should be able to see Upload file on Heat Island Reduction Form
    When User uploads any files on Heat Island Reduction Form
    Then User should not see saving of draft even after 10 seconds in Heat Island Reduction Form
    
  #Scenario-3
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in narrative
    Given User should be able to see the narrative in Heat Island Reduction Form
    When User modifies the narrative data in the Heat Island Reduction Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for narrative in Heat Island Reduction Form
    
  #Scenario-4
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in textbox
    Given User should be able to see the textbox in Heat Island Reduction Form
    When User modifies the textbox value in the Heat Island Reduction Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for change in textbox in Heat Island Reduction Form
    
  
  #Scenario-5
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in table
    Given User should be able to see the Table in Heat Island Reduction Form
    When User can add rows to the table and deletes a row in the table and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for change in table in Heat Island Reduction Form
    
    
  #Scenario-6
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in table data
    Given User should be able to see the Table in Heat Island Reduction Form
    When User modifies the table data in Heat Island Reduction Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for change in table data in Heat Island Reduction Form
    
     #Scenario-7
    @SmokeTest
    Scenario: Verifying the form draft warning message is not retained when the form is saved in HIR Form
    Given User can see the Draft is saved automatically with date and time in HIR form
    And User can see the save button in HIR form
    When User saves the HIR form
    Then User verifies the form draft warning message is not retained in HIR form
    
  #Scenario-8
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the narrative in Heat Island Reduction Form
    When User modifies the narrative data in Heat Island Reduction Form and waits for 10 seconds
    And User can see the Clear draft in Heat Island Reduction Form
    And User clicks on Clear draft in Heat Island Reduction Form
    Then User can see the draft is cleared in Heat Island Reduction Form
    
   #Scenario-8
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time after logout and login in HIR Form
    Given User should be able to see the Special Circumstances narrative in Heat Island Reduction Form
    When User modifies narrative data in Heat Island Reduction Form
    And User will logout from the Heat Island Reduction Form
    Then User logs in again to Heat Island Reduction Form
    And User should see the warning message is displayed with date and time at the top of the Heat Island Reduction Form
    And User verifies draft version is not changed after logout and login in Heat Island Reduction Form
    And User click on clear draft on the Heat Island Reduction Form
       
    
    