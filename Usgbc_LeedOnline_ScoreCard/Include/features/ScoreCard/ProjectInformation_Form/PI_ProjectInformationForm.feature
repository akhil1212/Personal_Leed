#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	25.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 25.06.2019
# Feature Name: Filling the Project Information Form
# Feature Description: Filling the USGBC Project Information Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Project Information Form

  #Scenario-1
  @SmokeTest
  Scenario: User feeds narrative text for describing the project in general
    Given User should see the editor for describing the project in general
    When User feeds long narrative text for describing the project in general
    Then User should see the narrative text persist on for describing the project in general

  #Scenario-2
  @SmokeTest
  Scenario: User uploads files for a site plan identifying the LEED project boundary
    Given User should be able to see the Add File button for a site plan identifying the LEED project boundary
    Then User uploads file for a site plan identifying the LEED project boundary

  #Scenario-3
  @SmokeTest
  Scenario: User uploads files for representative floor plans for the project
    Given User should be able to see the Add File button for representative floor plans for the project
    Then User uploads file for representative floor plans for the project

  #Scenario-4
  @SmokeTest
  Scenario: User uploads files for mechanical schedules and plans and or drawings
    Given User should be able to see the Add File button for mechanical schedules and plans and or drawings
    Then User uploads file for mechanical schedules and plans and or drawings

  #Scenario-5
  @SmokeTest
  Scenario: User uploads files for photos or a video walkthrough of the project, both inside and outside
    Given User should be able to see the Add File button for photos or a video walkthrough of the project
    Then User uploads file for photos or a video walkthrough of the project

  #Scenario-6
  @SmokeTest
  Scenario: User uploads files for completed Performance Periods Table
    Given User should be able to see the Add File button for completed Performance Periods Table
    Then User uploads file for completed Performance Periods Table

  #Scenario-7
  @SmokeTest
  Scenario: User uploads files for special circumstances for Project Information
    Given User should be able to see the Add File button for special circumstances in Project Information
    Then User uploads file for special circumstances in Project Information

  #Scenario-8
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances for Project Information
    Given User should see the editor for Special Circumstances for Project Information
    When User feeds long narrative text for Special Circumstances for Project Information
    Then User should see the narrative text persist on Special Circumstances for Project Information

  #Scenario-9
  @SmokeTest
  Scenario: User has to save the Project Information form
    Given User can see the save button in Project Information form
    When User clicks on save button in Project Information form
    Then User should see Form data saved successfully message

  #Scenario-10
  @SmokeTest
  Scenario: To verify the generated pdf for Project Information form
    Given User can see the generate pdf icon on the top of the form
    When User clicks on generate pdf icon to download the file
    Then User has to verify describing the project in general narrative content with downloaded pdf file
    And User has to verify Uploaded files for a site plan identifying the LEED project boundary with downloaded pdf file
    And User has to verify Uploaded files for representative floor plans for the project with downloaded pdf file
    And User has to verify Uploaded files for mechanical schedules and plans and or drawings with downloaded pdf file
    And User has to verify Uploaded files for photos or a video walkthrough of the project with downloaded pdf file
    And User has to verify Uploaded files for completed Performance Periods Table with downloaded pdf file
    And User has to verify the special circumstances narrative content for Project Information with downloaded pdf file
    And User has to verify Uploaded for special circumstances in Project Information with downloaded pdf file

  #Scenario-11
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Project Information form
    Given User has to refresh the form
    Then User verifies the narrative text of describing the project in general
    And User verifies the narrative text of Special Circumstances in Project Information
    And User changes the status to ready for review for the Project Information form
