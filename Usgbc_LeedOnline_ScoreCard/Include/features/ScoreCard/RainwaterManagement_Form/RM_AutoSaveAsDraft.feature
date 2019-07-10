#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	11.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 11.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in Rainwater Management Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Rainwater Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Rainwater Management Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if there is no change made in the form
    Given User is on the Formv01 of Rainwater Management form
    When User will not modify any field on the Rainwater Management form
    Then User should not see saving of draft even after 10 seconds in Rainwater Management form

  #Scenario-2
  @SmokeTest
  Scenario: Verifying form draft is not saved if files are uploaded in the form
    Given User should be able to see Add files on Rainwater Management form
    When User uploads any file on Rainwater Management form
    Then User should not see saving of draft even after 10 seconds in rainwater management form

  #Scenario-3
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when there is a change in narrative
    Given User should be able to see the narrative in Rainwater Management form
    When User modifies the narrative data in the Rainwater Management form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for narrative in Rainwater Management form

  #Scenario-4
  @SmokeTest
  Scenario: Verifying the form draft warning message is not retained when the form is saved
    Given User can see the Draft is saved automatically with date and time in Rainwater Management form
    And User can see the save button in Rainwater Management form
    When User saves the Rainwater Management form
    Then User verifies the form draft warning message is not retained in Rainwater Management form

  #Scenario-5
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the narrative in Rainwater Management form
    When User modifies the narrative data in Rainwater Management form and waits for 10 seconds
    And User can see the Clear draft in Rainwater Management form
    And User clicks on Clear draft in Rainwater Management form
    Then User can see the draft is cleared in Rainwater Management form

  #Scenario-6
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time
    Given User can see the narrative in Rainwater Management form
    When User modifies the narrative data in Rainwater Management form
    And User will logout from the Rainwater Management form
    And User logs in again to Rainwater Management form
    Then User should see the warning message is displayed with date and time at the top of the Rainwater Management form
    And User verifies draft version is not changed after logout and login in Rainwater Management form
