#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	25.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 25.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in Project Information Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Project Information Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Project Information Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if there is no change made in the form
    Given User is on the Formv01 of Project Information form
    When User will not modify any field on the Project Information form
    Then User should not see saving of draft even after 10 seconds in Project Information form

  #Scenario-2
  @SmokeTest
  Scenario: Verifying form draft is not saved if files are uploaded in the form
    Given User should be able to see Add files on Project Information form
    When User uploads any file on Project Information form
    Then User should not see saving of draft even after 10 seconds in project information form

  #Scenario-3
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when there is a change in narrative
    Given User should be able to see the narrative in Project Information form
    When User modifies the narrative data in the Project Information form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for narrative in Project Information form

  #Scenario-4
  @SmokeTest
  Scenario: Verifying the form draft warning message is not retained when the form is saved
    Given User can see the Draft is saved automatically with date and time in Project Information form
    And User can see the save button in Project Information form
    When User saves the Project Information form
    Then User verifies the form draft warning message is not retained in Project Information form

  #Scenario-5
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the narrative in Project Information form
    When User modifies the narrative data in Project Information form and waits for 10 seconds
    And User can see the Clear draft in Project Information form
    And User clicks on Clear draft in Project Information form
    Then User can see the draft is cleared in Project Information form

  #Scenario-6
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time
    Given User can see the narrative in Project Information form
    When User modifies the narrative data in Project Information form
    And User will logout from the Project Information form
    And User logs in again to Project Information form
    Then User should see the warning message is displayed with date and time at the top of the Project Information form
    And User verifies draft version is not changed after logout and login in Project Information form
