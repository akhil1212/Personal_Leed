#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	19.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 19.06.2019
# Feature Name: Filling the Environmental Tobacco Smoke Control - No Smoking
# Feature Description: Filling the Environmental Tobacco Smoke Control - No Smoking which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Environmental Tobacco Smoke Control

  #Scenario-1
  @SmokeTest
  Scenario: User uploads files for No-smoking policy document
    Given User should be able to see the Add File button of No-smoking policy document
    Then User uploads file of No-smoking policy document

  #Scenario-2
  @SmokeTest
  Scenario: User uploads files for scaled site plan or map showing location of non-smoking areas
    Given User should be able to see the Add File button of scaled site plan
    Then User uploads file for scaled site plan

  #Scenario-3
  @SmokeTest
  Scenario: User feeds narrative text for explain how the no-smoking policy is communicated to the building occupants
    Given User should see the editor for explain how the no-smoking policy is communicated to the building occupants
    When User feeds long narrative text for explain how the no-smoking policy is communicated to the building occupants
    Then User should see the narrative text persist on explain how the no-smoking policy is communicated to the building occupants

  #Scenario-4
  @SmokeTest
  Scenario: User clicks the checkbox for project must comply with a code
    Given User should be able to see the checkbox for project must comply with a code
    When User clicks on the check box for project must comply with a code
    Then User should be able to see the checkbox checked for project must comply with a code

  #Scenario-5
  @SmokeTest
  Scenario: User uploads files for information about the code
    Given User should be able to see the Add File button of information about the code
    Then User uploads file of information about the code

  #Scenario-6
  @SmokeTest
  Scenario: User feeds narrative text for explain why the code does not allow smoking to be prohibited within 25 feet
    Given User should see the editor for explain why the code does not allow smoking to be prohibited
    When User feeds long narrative text for explain why the code does not allow smoking to be prohibited
    Then User should see the narrative text persist on explain why the code does not allow smoking to be prohibited

  #Scenario-7
  @SmokeTest
  Scenario: User clicks the checkbox for project includes residential units
    Given User should be able to see the checkbox for project includes residential units
    When User clicks on the check box for project includes residential units
    Then User should be able to see the checkbox checked for project includes residential units

  #Scenario-8
  @SmokeTest
  Scenario: User selects an option No smoking option
    Given User should see the radio button option No smoking
    When User clicks on No smoking option
    Then User should see the contents for No smoking option

  #Scenario-9
  @SmokeTest
  Scenario: User uploads files for special circumstances for Environmental Tobacco Smoke Control
    Given User should be able to see the Add File button for special circumstances in Environmental Tobacco Smoke Control
    Then User uploads file for special circumstances in Environmental Tobacco Smoke Control

  #Scenario-10
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances for Environmental Tobacco Smoke Control
    Given User should see the editor for Special Circumstances for Environmental Tobacco Smoke Control
    When User feeds long narrative text for Special Circumstances for Environmental Tobacco Smoke Control
    Then User should see the narrative text persist on Special Circumstances for Environmental Tobacco Smoke Control

  #Scenario-11
  @SmokeTest
  Scenario: User has to save the Environmental Tobacco Smoke Control form for No Smoking
    Given User can see the save button in Environmental Tobacco Smoke Control form
    When User clicks on save button in Environmental Tobacco Smoke Control form
    Then User should see Form data saved successfully message

  #Scenario-12
  @SmokeTest
  Scenario: To verify the generated pdf for Environmental Tobacco Smoke Control form
    Given User can see the generate pdf icon on the top of the form
    When User clicks on generate pdf icon to download the file
    Then User has to verify Uploaded files for No-smoking policy document with downloaded pdf file
    And User has to verify Uploaded files for scaled site plan with downloaded pdf file
    And User has to verify the narrative content explain how the no-smoking policy is communicated to the building occupants with downloaded pdf file
    And User has to verify Uploaded files for information about the code with downloaded pdf file
    And User has to verify the narrative content explain why the code does not allow smoking to be prohibited with downloaded pdf file
    And User has to verify the special circumstances narrative content for Environmental Tobacco Smoke Control with downloaded pdf file
    And User has to verify Uploaded for special circumstances in Environmental Tobacco Smoke Control with downloaded pdf file
    
    #Scenario-13
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Environmental Tobacco Smoke Control form
    Given User has to refresh the form
    Then User verifies the narrative text of explain how the no-smoking policy is communicated to the building occupants
    And User verifies the narrative text of explain why the code does not allow smoking to be prohibited
    And User verifies the narrative text of Special Circumstances in Environmental Tobacco Smoke Control
    And User changes the status to ready for review for the Environmental Tobacco Smoke Control form  
