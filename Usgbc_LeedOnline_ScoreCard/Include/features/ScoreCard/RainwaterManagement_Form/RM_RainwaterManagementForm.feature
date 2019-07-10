#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	10.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 10.06.2019
# Feature Name: Filling the Rainwater Management Form
# Feature Description: Filling the Rainwater Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Rainwater Management Form

  #Scenario-1
  @SmokeTest
  Scenario: User uploads files for rainfall events calculator or equivalent documentation
    Given User should be able to see the Add File button for rainfall events calculator
    Then User uploads file for rainfall events calculator

  #Scenario-2
  @SmokeTest
  Scenario: User uploads files for calculations that demonstrate how the volume of runoff from 25% of impervious surfaces
    Given User should be able to see the Add File button for calculations that demonstrate how the volume of runoff from 25% of impervious surfaces
    Then User uploads file for calculations that demonstrate how the volume of runoff from 25% of impervious surfaces

  #Scenario-3
  @SmokeTest
  Scenario: User uploads files for documents that thoroughly depict the green infrastructure techniques
    Given User should be able to see the Add File button for documents that thoroughly depict the green infrastructure techniques
    Then User uploads file for documents that thoroughly depict the green infrastructure techniques

  #Scenario-4
  @SmokeTest
  Scenario: User feeds narrative text under proposed practices for Rainwater Management
    Given User should see the editor for proposed practices for rainwater management
    When User feeds long narrative text for proposed practices for rainwater management
    Then User should see the narrative text persist on proposed practices for rainwater management

  #Scenario-5
  @SmokeTest
  Scenario: User uploads files for document or narrative describing the annual inspection and maintenance program
    Given User should be able to see the Add File button for document or narrative describing the annual inspection and maintenance program
    Then User uploads file for document or narrative describing the annual inspection and maintenance program

  #Scenario-6
  @SmokeTest
  Scenario: User uploads files for additional documents in special circumstances in Rainwater Management
    Given User should be able to see the Add File button for for additional documents in special circumstances in rainwater management
    Then User uploads file for for additional documents in special circumstances in rainwater management

  #Scenario-7
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances for Rainwater Management
    Given User should see the editor for Special Circumstances for rainwater management
    When User feeds long narrative text for Special Circumstances for rainwater management
    Then User should see the narrative text persist on Special Circumstances for rainwater management

  #Scenario-8
  @SmokeTest
  Scenario: User has to save the form
    Given User can see the save button
    When User clicks on save button
    Then User should see Form data saved successfully message

  #Scenario-9
  @SmokeTest
  Scenario: To verify the generated pdf for Rainwater Management Form
    Given User can see the generate pdf icon on the top of the form
    When User clicks on generate pdf icon to download the file
    Then User has to verify Uploaded rainfall events calculator or equivalent documentation with downloaded pdf file
    And User has to verify Uploaded calculations of impervious surfaces with downloaded pdf file
    And User has to verify Uploaded documents that thoroughly depict the green infrastructure techniques with downloaded pdf file
    And User has to verify the proposed practices html editor for rainwater management with downloaded pdf file
    And User has to verify Uploaded document or narrative describing the annual inspection and maintenance program with downloaded pdf file
    And User has to verify the special circumstances html editor for rainwater management with downloaded pdf file
    And User has to verify Uploaded additional documents in special circumstances in rainwater management with downloaded pdf file

  #Scenario-10
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Rainwater Management Form
    Given User has to refresh the form
    Then User verifies the narrative text of proposed practices for Rainwater Management
    And User verifies the narrative text of Special Circumstances html editor box for rainwater management Form
    And User changes the status to ready for review for the rainwater management form
