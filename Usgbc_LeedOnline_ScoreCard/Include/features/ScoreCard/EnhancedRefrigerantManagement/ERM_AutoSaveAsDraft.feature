#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                                     Reviewer    :
# Date   : 	04.07.2019											                                                           Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 04.07.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in Enhanced Refrigerant Management Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Enhanced Refrigerant Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Enhanced Refrigerant Management Form


 #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if no change in the ERM Form 
    Given User is on the Formv01 of ERM Form
    When User will not modify any field on the ERM Form
    Then User should not see saving of draft even after 10 seconds in ERM Form

  #Scenario-2
  @SmokeTest
  Scenario: Verifying form draft is not saved if upload files in the ERM Form
    Given User should be able to see Upload file on ERM Form
    When User uploads a file on ERM Form
    Then User should not see saving of draft even after 10 seconds in ERM Form
    
    #Scenario-3
	  @SmokeTest
	  Scenario: User selects an option GreenChill’s silver-level certification
    Given User should see the radio button option GreenChill’s silver-level certification
    When User clicks on GreenChill’s silver-level certification option
    Then User can see the draft is saved automatically with date and time for radio button in ERM Form
    
  #Scenario-4
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in narrative
    Given User should be able to see the narrative in ERM Form
    When User modifies the narrative data in the ERM Form form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for narrative in ERM Form
    
   #Scenario-5
	  @SmokeTest
	  Scenario: User selects an option No Refrigerants or Low-Impact Refrigerants
    Given User should see the radio button option No Refrigerants
    When User clicks on No Refrigerants or Low-Impact Refrigerants option
    Then User can see the draft is saved automatically with date and time for option in ERM Form
    And User clicks on clear draft in ERM Form
    
     #Scenario-6
    @SmokeTest
    Scenario: Verifying the form draft warning message is not retained when the form is saved in ERM Form
    Given User can see the Draft is saved automatically with date and time in ERM Form
    And User can see the save button in ERM Form
    When User clicks on save button in ERM Form
    Then User verifies the form draft warning message is not retained in ERM Form
    
  #Scenario-7
  @SmokeTest
  Scenario: Verification of Clear Draft functionality in ERM Form
    Given User can see the narrative in ERM Form
    When User modifies the narrative data in ERM Form form and waits for 10 seconds
    And User can see the Clear draft in ERM Form
    And User clicks on clear draft in ERM Form
    Then User can see the draft is cleared in ERM Form
    
    
  #Scenario-8
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time in ERM Form
    Given User can see the narrative in ERM Form
    When User modifies narrative data in ERM Form
    And User will logout from the ERM Form
    And User logs in again to ERM Form
    Then User should see the warning message is displayed with date and time at the top of the ERM Form
    And User verifies draft version is not changed after logout and login in ERM Form
  	And User clicks on clear draft in ERM Form
    
    
    
    