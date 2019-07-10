#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	20.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 20.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in the Environmental Tobacco Smoke Control Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in the Environmental Tobacco Smoke Control Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in the Environmental Tobacco Smoke Control Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if there is no change made in the Environmental Tobacco Smoke Control form
    Given User is on the Formv01 of Environmental Tobacco Smoke Control form
    When User will not modify any field on the Environmental Tobacco Smoke Control form
    Then User should not see saving of draft even after 10 seconds in Environmental Tobacco Smoke Control form

  #Scenario-2
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Radio button
    Given User should be able to see the radio button in Environmental Tobacco Smoke Control form
    When User modifies the radio button in the Environmental Tobacco Smoke Control form form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time after changing radio button in Environmental Tobacco Smoke Control form

  #Scenario-3
  @SmokeTest
  Scenario: Verifying form draft is not saved if files are uploaded in the Environmental Tobacco Smoke Control form
    Given User should be able to see Add files on Environmental Tobacco Smoke Control form
    When User uploads any file on Environmental Tobacco Smoke Control form
    Then User should not see any change in saving of draft even after 10 seconds in Environmental Tobacco Smoke Control form

  #Scenario-4
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in no smoking policy narrative
    Given User should be able to see the no smoking policy narrative in Environmental Tobacco Smoke Control form
    When User modifies the no smoking policy narrative data in the Environmental Tobacco Smoke Control form form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for no smoking policy narrative in Environmental Tobacco Smoke Control form

  #Scenario-5
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in project code Checkbox
    Given User should be able to see the checkbox for project code in Environmental Tobacco Smoke Control form
    When User modifies the checkbox in the project code for Environmental Tobacco Smoke Control form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for project code checkbox in Environmental Tobacco Smoke Control form

  #Scenario-6
  @SmokeTest
  Scenario: Verifying the form draft warning message is not retained when the form is saved
    Given User can see the Draft is saved automatically with date and time in Environmental Tobacco Smoke Control form
    And User can see the save button in Environmental Tobacco Smoke Control form
    When User saves the Environmental Tobacco Smoke Control form
    Then User verifies the form draft warning message is not retained in Environmental Tobacco Smoke Control form

  #Scenario-7
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the special circumstances narrative in Environmental Tobacco Smoke Control form
    When User modifies the special circumstances narrative data in Environmental Tobacco Smoke Control form and waits for 10 seconds
    And User can see the Clear draft in Environmental Tobacco Smoke Control form
    And User clicks on Clear draft in Environmental Tobacco Smoke Control form
    Then User can see the draft is cleared in Environmental Tobacco Smoke Control form

  #Scenario-8
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time
    Given User can see the special circumstances narrative in Environmental Tobacco Smoke Control form
    When User modifies the special circumstances narrative data in Environmental Tobacco Smoke Control form
    And User will logout from the Environmental Tobacco Smoke Control form
    And User logs in again to Environmental Tobacco Smoke Control form
    Then User should see the warning message is displayed with date and time at the top of the Environmental Tobacco Smoke Control form
    And User verifies draft version is not changed after logout and login in Environmental Tobacco Smoke Control form
