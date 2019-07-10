#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	27.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 27.06.2019
# Feature Name: Filling the Purchasing Policy Form
# Feature Description: Filling the USGBC Purchasing Policy Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Purchasing Policy Form

  #Scenario-1
  @SmokeTest
  Scenario: User uploads files for five most purchased product categories based on total annual purchases (EPP)
    Given User should be able to see the Add File button for five most purchased product categories in EPP
    Then User uploads file for five most purchased product categories in EPP

  #Scenario-2
  @SmokeTest
  Scenario: User uploads files for Paper, toner cartridges, binders, batteries and desk accessories (EPP)
    Given User should be able to see the Add File button for Paper, toner cartridges and desk accessories in EPP
    Then User uploads file for Paper, toner cartridges and desk accessories in EPP

  #Scenario-3
  @SmokeTest
  Scenario: User uploads files for Lamps (EPP)
    Given User should be able to see the Add File button for Lamps in EPP
    Then User uploads file for Lamps in EPP

  #Scenario-4
  @SmokeTest
  Scenario: User uploads files for Office equipment, appliances and audiovisual equipment (EPP)
    Given User should be able to see the Add File button for Office equipment, appliances and audiovisual equipment in EPP
    Then User uploads file for Office equipment, appliances and audiovisual equipment in EPP

  #Scenario-5
  @SmokeTest
  Scenario: User uploads files for Electric powered equipment (EPP)
    Given User should be able to see the Add File button for Electric powered equipment in EPP
    Then User uploads file for Electric powered equipment in EPP

  #Scenario-6
  @SmokeTest
  Scenario: User uploads files for the five most purchased product categories based on total annual purchases (SWM)
    Given User should be able to see the Add File button for five most purchased product categories in SWM
    Then User uploads file for five most purchased product categories in SWM

  #Scenario-7
  @SmokeTest
  Scenario: User uploads files for Office equipment, appliances and audiovisual equipment (SWM)
    Given User should be able to see the Add File button for Office equipment, appliances and audiovisual equipment in SWM
    Then User uploads file for Office equipment, appliances and audiovisual equipment in SWM

  #Scenario-8
  @SmokeTest
  Scenario: User uploads files for Electric powered equipment (SWM)
    Given User should be able to see the Add File button for Electric powered equipment in SWM
    Then User uploads file for Electric powered equipment in SWM

  #Scenario-9
  @SmokeTest
  Scenario: User uploads files for Safe disposal of batteries and lamps (SWM)
    Given User should be able to see the Add File button for Safe disposal of batteries and lamps in SWM
    Then User uploads file for Safe disposal of batteries and lamps in SWM

  #Scenario-10
  @SmokeTest
  Scenario: User uploads files for special circumstances for Purchasing Policy
    Given User should be able to see the Add File button for special circumstances in Purchasing Policy
    Then User uploads file for special circumstances in Purchasing Policy

  #Scenario-11
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances for Purchasing Policy
    Given User should see the editor for Special Circumstances for Purchasing Policy
    When User feeds long narrative text for Special Circumstances for Purchasing Policy
    Then User should see the narrative text persist on Special Circumstances for Purchasing Policy

  #Scenario-12
  @SmokeTest
  Scenario: User has to save the Purchasing Policy form
    Given User can see the save button in Purchasing Policy form
    When User clicks on save button in Purchasing Policy form
    Then User should see Form data saved successfully message

  #Scenario-13
  @SmokeTest
  Scenario: To verify the generated pdf for Purchasing Policy form
    Given User can see the generate pdf icon on the top of the form
    When User clicks on generate pdf icon to download the file
    Then User has to verify Uploaded files for five most purchased product categories in EPP with downloaded pdf file
    And User has to verify Uploaded files for Paper, toner cartridges and desk accessories in EPP with downloaded pdf file
    And User has to verify Uploaded files for Lamps in EPP with downloaded pdf file
    And User has to verify Uploaded files for Office equipment, appliances and audiovisual equipment in EPP with downloaded pdf file
    And User has to verify Uploaded files for Electric powered equipment in EPP with downloaded pdf file
    And User has to verify Uploaded files for five most purchased product categories in SWM with downloaded pdf file
    And User has to verify Uploaded files for Office equipment, appliances and audiovisual equipment in SWM with downloaded pdf file
    And User has to verify Uploaded files for Electric powered equipment in SWM with downloaded pdf file
    And User has to verify Uploaded files for Safe disposal of batteries and lamps in SWM with downloaded pdf file
    And User has to verify the special circumstances narrative content for Purchasing Policy with downloaded pdf file
    And User has to verify Uploaded for special circumstances in Purchasing Policy with downloaded pdf file

  #Scenario-14
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Purchasing Policy form
    Given User has to refresh the form
    Then User verifies the narrative text of Special Circumstances in Purchasing Policy
    And User changes the status to ready for review for the Purchasing Policy form
