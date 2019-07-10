#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	28.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 28.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in Purchasing Policy Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Purchasing Policy Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Purchasing Policy Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if there is no change made in the form
    Given User is on the Formv01 of Purchasing Policy form
    When User will not modify any field on the Purchasing Policy form
    Then User should not see saving of draft even after 10 seconds in Purchasing Policy form

  #Scenario-2
  @SmokeTest
  Scenario: Verifying form draft is not saved if files are uploaded in the form
    Given User should be able to see Add files on Purchasing Policy form
    When User uploads any file on Purchasing Policy form
    Then User should not see saving of draft even after 10 seconds in purchasing policy form

  #Scenario-3
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when there is a change in narrative
    Given User should be able to see the narrative in Purchasing Policy form
    When User modifies the narrative data in the Purchasing Policy form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for narrative in Purchasing Policy form

  #Scenario-4
  @SmokeTest
  Scenario: Verifying the form draft warning message is not retained when the form is saved
    Given User can see the Draft is saved automatically with date and time in Purchasing Policy form
    And User can see the save button in Purchasing Policy form
    When User saves the Purchasing Policy form
    Then User verifies the form draft warning message is not retained in Purchasing Policy form

  #Scenario-5
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the narrative in Purchasing Policy form
    When User modifies the narrative data in Purchasing Policy form and waits for 10 seconds
    And User can see the Clear draft in Purchasing Policy form
    And User clicks on Clear draft in Purchasing Policy form
    Then User can see the draft is cleared in Purchasing Policy form

  #Scenario-6
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time
    Given User can see the narrative in Purchasing Policy form
    When User modifies the narrative data in Purchasing Policy form
    And User will logout from the Purchasing Policy form
    And User logs in again to Purchasing Policy form
    Then User should see the warning message is displayed with date and time at the top of the Purchasing Policy form
    And User verifies draft version is not changed after logout and login in Purchasing Policy form
