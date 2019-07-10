#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	14.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 14.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in Minimum Indoor Air Quality Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Minimum Indoor Air Quality Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Minimum Indoor Air Quality Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if there is no change made in the Minimum Indoor Air Quality form
    Given User is on the Formv01 of Minimum Indoor Air Quality form
    When User will not modify any field on the Minimum Indoor Air Quality form
    Then User should not see saving of draft even after 10 seconds in Minimum Indoor Air Quality form

  #Scenario-2
  @SmokeTest
  Scenario: Verifying form draft is not saved if files are uploaded in the Minimum Indoor Air Quality form
    Given User should be able to see Add files on Minimum Indoor Air Quality form
    When User uploads any file on Minimum Indoor Air Quality form
    Then User should not see saving of draft even after 10 seconds in minimum indoor air quality form

  #Scenario-3
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in EA prerequisite Checkbox
    Given User should be able to see the checkbox for EA prerequisite in Minimum Indoor Air Quality form
    When User modifies the checkbox in the EA prerequisite for Minimum Indoor Air Quality form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for EA prerequisite checkbox in Minimum Indoor Air Quality form

  #Scenario-4
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in mechanically ventilated spaces Checkbox
    Given User should be able to see the checkbox for mechanically ventilated spaces in Minimum Indoor Air Quality form
    When User modifies the checkbox in the mechanically ventilated spaces for Minimum Indoor Air Quality form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for mechanically ventilated spaces checkbox in Minimum Indoor Air Quality form

  #Scenario-5
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in naturally ventilated spaces Checkbox
    Given User should be able to see the checkbox for naturally ventilated spaces in Minimum Indoor Air Quality form
    When User modifies the checkbox in the naturally ventilated spaces for Minimum Indoor Air Quality form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for naturally ventilated spaces checkbox in Minimum Indoor Air Quality form

  #Scenario-6
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in describing the method or protocol narrative
    Given User should be able to see the describing the method or protocol narrative in Minimum Indoor Air Quality form
    When User modifies the describing the method or protocol narrative data in the Minimum Indoor Air Quality form form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for describing the method or protocol narrative in Minimum Indoor Air Quality form

  #Scenario-7
  @SmokeTest
  Scenario: Verifying the form draft warning message is not retained when the form is saved
    Given User can see the Draft is saved automatically with date and time in Minimum Indoor Air Quality form
    And User can see the save button in Minimum Indoor Air Quality form
    When User saves the Minimum Indoor Air Quality form
    Then User verifies the form draft warning message is not retained in Minimum Indoor Air Quality form

  #Scenario-8
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the special circumstances narrative in Minimum Indoor Air Quality form
    When User modifies the special circumstances narrative data in Minimum Indoor Air Quality form form and waits for 10 seconds
    And User can see the Clear draft in Minimum Indoor Air Quality form
    And User clicks on Clear draft in Minimum Indoor Air Quality form
    Then User can see the draft is cleared in Minimum Indoor Air Quality form

  #Scenario-9
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time
    Given User can see the special circumstances narrative in Minimum Indoor Air Quality form
    When User modifies the special circumstances narrative data in Minimum Indoor Air Quality form
    And User will logout from the Minimum Indoor Air Quality form
    And User logs in again to Minimum Indoor Air Quality form
    Then User should see the warning message is displayed with date and time at the top of the Minimum Indoor Air Quality form
    And User verifies draft version is not changed after logout and login in Minimum Indoor Air Quality form
