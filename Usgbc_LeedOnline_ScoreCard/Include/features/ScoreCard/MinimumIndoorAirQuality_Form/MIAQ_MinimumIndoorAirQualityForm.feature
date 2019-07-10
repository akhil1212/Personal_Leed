#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	14.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 14.06.2019
# Feature Name: Filling the Minimum Indoor Air Quality Form
# Feature Description: Filling the USGBC Minimum Indoor Air Quality Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Minimum Indoor Air Quality Form

 #Scenario-1
  @SmokeTest
  Scenario: User uploads files for Minimum Indoor Air Quality Calculator
    Given User should be able to see the Add File button for minimum indoor air quality calculator
    Then User uploads file for minimum indoor air quality calculator
    
    
  #Scenario-2
  @SmokeTest
  Scenario: User clicks the checkbox for the Energy Efficient Practices 
    Given User should be able to see the checkbox for the Energy Efficient Practices 
    When User clicks on the check box for the Energy Efficient Practices 
    Then User should be able to see the checkbox checked for for the Energy Efficient Practices
  
  
  #Scenario-3
  @SmokeTest
  Scenario: User feeds narrative text for describing the method or protocol
    Given User should see the editor for describing the method or protocol
    When User feeds long narrative text for describing the method or protocol
    Then User should see the narrative text persist on for describing the method or protocol
    
  
   #Scenario-4
  @SmokeTest
  Scenario: User clicks the checkbox for the Mechanically Ventilated Spaces
    Given User should be able to see the checkbox for the Mechanically Ventilated Spaces 
    When User clicks on the check box for the Mechanically Ventilated Spaces 
    Then User should be able to see the checkbox checked for for the Mechanically Ventilated Spaces
    
   
   #Scenario-5
  @SmokeTest
  Scenario: User clicks the checkbox for the Naturally Ventilated Spaces
    Given User should be able to see the checkbox for the Naturally Ventilated Spaces 
    When User clicks on the check box for the Naturally Ventilated Spaces 
    Then User should be able to see the checkbox checked for for the Naturally Ventilated Spaces
    
    
  
    #Scenario-6
  @SmokeTest
  Scenario: User uploads files for special circumstances for Minimum Indoor Air Quality
    Given User should be able to see the Add File button for special circumstances in Minimum Indoor Air Quality
    Then User uploads file for special circumstances in Minimum Indoor Air Quality
  
  #Scenario-7
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances for Minimum Indoor Air Quality
    Given User should see the editor for Special Circumstances for minimum indoor air quality
    When User feeds long narrative text for Special Circumstances for minimum indoor air quality
    Then User should see the narrative text persist on Special Circumstances for minimum indoor air quality
    
    
  #Scenario-8
  @SmokeTest
  Scenario: User has to save the Minimum Indoor Air Quality form
    Given User can see the save button in Minimum Indoor Air Quality form
    When User clicks on save button in Minimum Indoor Air Quality form
    Then User should see Form data saved successfully message
    
  #Scenario-9
  @SmokeTest
  Scenario: To verify the generated pdf for Minimum Indoor Air Quality form
    Given User can see the generate pdf icon on the top of the form
    When User clicks on generate pdf icon to download the file
    Then User has to verify Uploaded files for Minimum Indoor Air Quality Calculator with downloaded pdf file
    And User has to verify describing the method or protocol narrative content with downloaded pdf file
    And User has to verify the special circumstancesnarrative content for minimum indoor air quality with downloaded pdf file
    And User has to verify Uploaded for special circumstances in minimum indoor air quality with downloaded pdf file
  
   #Scenario-10
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Minimum Indoor Air Quality form
    Given User has to refresh the form
    Then User verifies the narrative text of describing the method or protocol in Minimum Indoor Air Quality
    And User verifies the narrative text of Special Circumstances in Minimum Indoor Air Quality
    And User changes the status to ready for review for the minimum indoor air quality form  
    