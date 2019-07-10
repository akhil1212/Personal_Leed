#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             					        Reviewer    :
# Date   : 	10.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 10.06.2019
# Feature Name: Filling the Facility Maintenance and Renovation Policy Form
# Feature Description: Filling the Facility Maintenance and Renovation Policy Form under Materials and Resources
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Facility Maintenance and Renovation Policy Form

  #Scenario-1
  @SmokeTest
  Scenario: User Uploads files of Base building in FMR Form
    Given User should be able to see the Add File button for Base building in FMR Form
    Then User uploads file for Base building in FMR Form
    
   #Scenario-2
  @SmokeTest
  Scenario: User Uploads files of Furniture and furnishings in FMR Form
    Given User should be able to see the Add File button for Furniture and furnishings in FMR Form
    Then User uploads file for Furniture and furnishings in FMR Form
 
  #Scenario-3
  @SmokeTest
  Scenario: User Uploads files of MR Credit Purchasing in FMR Form
    Given User should be able to see the Add File button for MR Credit Purchasing in FMR Form
    Then User uploads file for MR Credit Purchasing in FMR Form
    
    
  #Scenario-4
  @SmokeTest
  Scenario: User Uploads files of Information in Waste Management FMR Form
    Given User should be able to see the Add File button for Information in Waste Management FMR Form
    Then User uploads file for Information in Waste Management FMR Form
    
  #Scenario-5
  @SmokeTest
  Scenario: User Uploads files of diversion strategies in Waste Management FMR Form 
    Given User should be able to see the Add File button for diversion strategies in Waste Management FMR Form
    Then User uploads file for diversion strategies in Waste Management FMR Form
 
  #Scenario-6
  @SmokeTest
  Scenario: User Uploads files of Recommended design in Indoor Air Quality FMR Form
    Given User should be able to see the Add File button for Recommended design in Indoor Air Quality FMR Form
    Then User uploads file for Recommended design in Indoor Air Quality FMR Form
    
  #Scenario-7
  @SmokeTest
  Scenario: User Uploads files of reoccupying the space in Indoor Air Quality FMR Form
    Given User should be able to see the Add File button for reoccupying the space in Indoor Air Quality FMR Form
    Then User uploads file for reoccupying the space in Indoor Air Quality FMR Form
    
  #Scenario-8
  @SmokeTest
  Scenario: User Uploads files of construction ends in Indoor Air Quality FMR Form
    Given User should be able to see the Add File button for construction ends in Indoor Air Quality FMR Form
    Then User uploads file for construction ends in Indoor Air Quality FMR Form
    
  #Scenario-9
  @SmokeTest
  Scenario: User Uploads files of additional documentation in FMR Form
    Given User should be able to see the Add File button for additional documentation in FMR Form
    Then User uploads file for additional documentation in FMR Form
    
  #Scenario-10
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances text box for Facility Maintenance and Renovation Policy Form
    Given User should see the editor for Special Circumstances for Facility Maintenance and Renovation Policy Form
    When User feeds long narrative text for Special Circumstances text box for Facility Maintenance and Renovation Policy Form
    Then User should see the narrative text persist on Special Circumstances text box for Facility Maintenance and Renovation Policy Form
    
 #Scenario-11
  @SmokeTest
  Scenario: User has to save the form in FMR Form
    Given User can see the save button in FMR Form
    When User clicks on save button in FMR Form
    Then User should see Form data saved successfully message in FMR Form
    
  #Scenario-12
  @SmokeTest
  Scenario: To save the Facility Maintenance and Renovation Policy Form
    Given User can see the generate pdf icon on the top of the Facility Maintenance and Renovation Policy Form   
    When User clicks on generate pdf icon to download the file in Facility Maintenance and Renovation Policy Form
    Then User has to verify Uploaded Base building with downloaded pdf file in Facility Maintenance and Renovation Policy Form    
    And User has to verify Uploaded Furniture and furnishings with downloaded pdf file in Facility Maintenance and Renovation Policy Form
    And User has to verify Uploaded MR Credit Purchasing with downloaded pdf file in Facility Maintenance and Renovation Policy Form
    And User has to verify Uploaded Information WM with downloaded pdf file in Facility Maintenance and Renovation Policy Form
   	And User has to verify Uploaded diversion strategies WM with downloaded pdf file in Facility Maintenance and Renovation Policy Form
    And User has to verify Uploaded Recommended design with downloaded pdf file in Facility Maintenance and Renovation Policy Form
    And User has to verify Uploaded reoccupying with downloaded pdf file in Facility Maintenance and Renovation Policy Form
    And User has to verify Uploaded construction ends with downloaded pdf file in Facility Maintenance and Renovation Policy Form
    And User has to verify the Special Circumstances html editor with downloaded pdf file in Facility Maintenance and Renovation Policy Form
    And User has to verify Uploaded additional documentation with downloaded pdf file in Facility Maintenance and Renovation Policy Form
    
  #Scenario-13
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Facility Maintenance and Renovation Policy Form
    Given User has to refresh the form
    Then User verifies the narrative text of Special Circumstances html editor box for Facility Maintenance and Renovation Policy Form
     And User changes the status to ready for review for FMR form
    