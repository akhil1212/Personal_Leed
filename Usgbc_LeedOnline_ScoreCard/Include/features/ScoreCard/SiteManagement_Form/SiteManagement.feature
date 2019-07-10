#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 														                                             					        Reviewer    :
# Date   : 												                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Filling the Site Management Form
# Feature Description: Filling the Site Management Form under Sustainable Sites
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Site Management Form

  #Scenario-1
  @SmokeTest
  Scenario: User Uploads files of Site Assessment in Site Management Form
    Given User should be able to see the Add File button for Site Assessment in Site Management Form
    Then User uploads file for Site Assessment in Site Management Form
    
  #Scenario-2
  @SmokeTest
  Scenario: User Uploads files of Documentation demonstrating in Site Management Form
    Given User should be able to see the Add File button for Documentation demonstrating in Site Management Form
    Then User uploads file for Documentation demonstrating in Site Management Form
 
  #Scenario-3
  @SmokeTest
  Scenario: User Uploads files of additional documentation in Site Management Form
    Given User should be able to see the Add File button for additional documentation in Site Management Form
    Then User uploads file for additional documentation in Site Management Form
    
  #Scenario-4
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances text box for Site Management Form
    Given User should see the editor for Special Circumstances for Site Management Form
    When User feeds long narrative text for Special Circumstances text box for Site Management Form
    Then User should see the narrative text persist on Special Circumstances text box for Site Management Form
  
  #Scenario-5
  @SmokeTest
  Scenario: User has to save the form in Site Management Form
    Given User can see the save button in Site Management Form
    When User clicks on save button Site Management Form
    Then User should see Form data saved successfully message in Site Management Form
    
     #Scenario-6
  @SmokeTest
  Scenario: To save the Site Management Form 
    Given User can see the generate pdf icon on the top of the Site Management Form
    When User clicks on generate pdf icon to download the file in Site Management Form
    Then User has to verify Uploaded Site Assessment with downloaded pdf file in Site Management Form 
     Then User has to verify Uploaded Documentation demonstarting with downloaded pdf file in Site Management Form
    And User has to verify the Special Circumstances html editor with downloaded pdf file in Site Management Form
    And User has to verify Uploaded additional documentation with downloaded pdf file in Site Management Form
    
  #Scenario-7
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Site Management Form
    Given User has to refresh the form
    Then User verifies the narrative text of Special Circumstances html editor box for Site Management Form
    And User changes the status to ready for review for SM form
    