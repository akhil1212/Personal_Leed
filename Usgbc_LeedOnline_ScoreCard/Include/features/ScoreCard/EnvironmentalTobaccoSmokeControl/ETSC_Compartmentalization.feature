#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	20.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 20.06.2019
# Feature Name: Filling the Environmental Tobacco Smoke Control - Compartmentalization of smoking areas
# Feature Description: Filling the Environmental Tobacco Smoke Control - Compartmentalization of smoking areas which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Environmental Tobacco Smoke Control

  #Scenario-1
  @SmokeTest
  Scenario: User selects an option Compartmentalization of smoking areas
    Given User should see the radio button option Compartmentalization of smoking areas
    When User clicks on Compartmentalization of smoking areas option
    Then User should see the contents for Compartmentalization of smoking areas option

  #Scenario-2
  @SmokeTest
  Scenario: User uploads files for weather stripping and sealing
    Given User should be able to see the Add File button of weather stripping and sealing
    Then User uploads file of weather stripping and sealing

  #Scenario-3
  @SmokeTest
  Scenario: User uploads files for differential air pressure test report demonstrating maximum leakage rates for the residential units
    Given User should be able to see the Add File button of differential air pressure test report
    Then User uploads file for differential air pressure test report

  #Scenario-4
  @SmokeTest
  Scenario: User has to save the Environmental Tobacco Smoke Control form for Compartmentalization of smoking areas
    Given User can see the save button in Environmental Tobacco Smoke Control form
    When User clicks on save button in Environmental Tobacco Smoke Control form
    Then User should see Form data saved successfully message

  #Scenario-5
  @SmokeTest
  Scenario: To verify the generated pdf for Environmental Tobacco Smoke Control form
    Given User can see the generate pdf icon on the top of the form
    When User clicks on generate pdf icon to download the file
    Then User has to verify Uploaded files for No-smoking policy document with downloaded pdf file
    And User has to verify Uploaded files for scaled site plan with downloaded pdf file
    And User has to verify the narrative content explain how the no-smoking policy is communicated to the building occupants with downloaded pdf file
    And User has to verify Uploaded files for information about the code with downloaded pdf file
    And User has to verify the narrative content explain why the code does not allow smoking to be prohibited with downloaded pdf file
    And User has to verify Uploaded files for weather stripping and sealing with downloaded pdf file
    And User has to verify Uploaded files for differential air pressure test report with downloaded pdf file
    And User has to verify the special circumstances narrative content for Environmental Tobacco Smoke Control with downloaded pdf file
    And User has to verify Uploaded for special circumstances in Environmental Tobacco Smoke Control with downloaded pdf file
    And User changes the status to ready for review for the Environmental Tobacco Smoke Control form
