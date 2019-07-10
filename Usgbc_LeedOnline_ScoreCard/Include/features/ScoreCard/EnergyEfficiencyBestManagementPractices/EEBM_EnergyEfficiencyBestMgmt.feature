#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             					        Reviewer    :
# Date   : 	24.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 24.06.2019
# Feature Name: Filling the Energy Efficiency Best Management practices Form
# Feature Description: Filling the Energy Efficiency Best Management practices Form under Energy and Atmosphere
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Energy Efficiency Best Management practices Form


 #Scenario-1
  @SmokeTest
  Scenario: User clicks the checkbox for the project team in EEBM
    Given User should be able to see the checkbox for the project team in EEBM
    When User clicks on the check box for the project team in EEBM
    Then User should be able to see the checkbox checked for project team in EEBM
    
  #Scenario-2
  @SmokeTest
  Scenario: User fills Date audit in green cleaning
    Given User should be able to see the Date audit in EEBM Form
    When User enters Date audit in EEBM Form
    Then User should be able to see the entered value of Date audit in EEBM Form
    
  #Scenario-3
  @SmokeTest
  Scenario: User Uploads files of ASHRAE preliminary energy in EEBM Form
    Given User should be able to see the Add File button for ASHRAE preliminary energy in EEBM Form
    Then User uploads file for ASHRAE preliminary energy in EEBM Form
    
  #Scenario-4
  @SmokeTest
  Scenario: User Uploads files of current facility requirements in EEBM Form
    Given User should be able to see the Add File button for current facility requirements in EEBM Form
    Then User uploads file for current facility requirements in EEBM Form
    
   #Scenario-5
  @SmokeTest
  Scenario: User Uploads files of DC Pro Profiling Tool in EEBM Form
    Given User should be able to see the Add File button for DC Pro Profiling Tool in EEBM Form
    Then User uploads file for DC Pro Profiling Tool in EEBM Form
    
    
    #Scenario-6
  @SmokeTest
  Scenario: User Uploads files of additional documentation in EEBM Form
    Given User should be able to see the Add File button for additional documentation in EEBM Form
    Then User uploads file for additional documentation in EEBM Form
    
  #Scenario-7
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances text box for Energy Efficiency Best Management practices Form
    Given User should see the editor for Special Circumstances for Energy Efficiency Best Management practices Form
    When User feeds long narrative text for Special Circumstances text box for Energy Efficiency Best Management practices Form
    Then User should see the narrative text persist on Special Circumstances text box for Energy Efficiency Best Management practices Form
    
 #Scenario-8
  @SmokeTest
  Scenario: User has to save the form in EEBM Form
    Given User can see the save button in EEBM Form
    When User clicks on save button in EEBM Form
    Then User should see Form data saved successfully message in EEBM Form
    
    #Scenario-9
  @SmokeTest
  Scenario: To save the Energy Efficiency Best Management practices Form
    Given User can see the generate pdf icon on the top of the Energy Efficiency Best Management practices Form   
    When User clicks on generate pdf icon to download the file in Energy Efficiency Best Management practices Form     
    Then User has to verify the Date audit with downloaded pdf file in Energy Efficiency Best Management practices
    And User has to verify Uploaded ASHRAE preliminary energy with downloaded pdf file in Energy Efficiency Best Management practices Form    
    And User has to verify Uploaded current facility requirements with downloaded pdf file in Energy Efficiency Best Management practices Form
    And User has to verify Uploaded DC Pro Profiling Tool with downloaded pdf file in Energy Efficiency Best Management practices Form
    And User has to verify Uploaded additional documentation with downloaded pdf file in Energy Efficiency Best Management practices Form
   	And User has to verify the Special Circumstances html editor with downloaded pdf file in Energy Efficiency Best Management practices Form
    
     #Scenario-10
  @SmokeTest
  Scenario: User verify the data entered after refreshing Energy Efficiency Best Management practices Form
    Given User has to refresh the form
    Then User verifies the narrative text of Special Circumstances html editor box for Energy Efficiency Best Management practices Form
    And User changes the status to ready for review for EEBM form