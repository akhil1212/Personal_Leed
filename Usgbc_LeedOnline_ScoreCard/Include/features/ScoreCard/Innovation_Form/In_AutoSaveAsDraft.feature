#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                                     Reviewer    :
# Date   : 	24.06.2019											                                                           Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 24.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in Innovation Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Innovation Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Innovation Form

  
  #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if no change in the form in Innovation Form
    Given User is on the Formv01 of Innovation Form
    When User will not modify any field on the Innovation Form
    Then User should not see saving of draft even after 10 seconds in Innovation Form
    
   #Scenario-2
	@SmokeTest
  Scenario: Verifying form draft is not saved if upload files in Innovation Form
    Given User should be able to see Upload file on Innovation Form
    When User uploads any files on Innovation Form
    Then User should not see saving of draft even after 10 seconds in Innovation Form
    
  #Scenario-3
	@SmokeTest
  Scenario: Verifying form draft is saved if change in name of the pilot credit textbox in Innovation Form
    Given User should be able to see the textbox for name of the pilot credit in Innovation
    When User changes name of the pilot credit textbox on Innovation Form
    Then User should see saving of draft after 10 seconds in Innovation Form
    
    
  #Scenario-4
	@SmokeTest
  Scenario: Verifying form draft is saved if change in number of the pilot credit in Innovation Form
    Given User should be able to see the textbox for number of the pilot credit in Innovation
    When User changes number of the pilot credit on Innovation Form
    Then User should see the draft is saved automatically with date and time for Innovation Form
    
  #Scenario-5
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in LEED Accredited Professional narrative
    Given User should be able to see the LEED Accredited Professional narrative in Innovation Form
    When User modifies the LEED Accredited Professional data in the Innovation Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for LEED Accredited Professional in Innovation Form 
    
     #Scenario-6
    @SmokeTest
    Scenario: Verifying the form draft warning message is not retained when the form is saved in Innovation Form
    Given User can see the Draft is saved automatically with date and time in Innovation form
    And User can see the save button in Innovation
    When User clicks on save button in Innovation
    Then User verifies the form draft warning message is not retained in Innovation form
    
  #Scenario-7
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User should see the radio button option Innovation Strategy
    When User clicks on the radio button of Innovation Strategy and waits for 10 seconds
    And User can see the Clear draft in Innovation form
    And User clicks clear draft in Innovation
    Then User can see the draft is cleared in Innovation form
    
    
    #Scenario-8
    @SmokeTest
    Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should see the editor for Special Circumstances in Innovation
    When User modifies the Special Circumstances narrative data in the Innovation Form and waits for 10 seconds
    Then User can see the draft is saved for Special Circumstances narrative in Innovation Form
    And User should clear the draft present in Innovation Form
    
  #Scenario-9
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time after logout and login in Innovation
    Given User should see the editor for Special Circumstances in Innovation
    When User modifies narrative data in Innovation Form
    And User will logout from the Innovation Form
    Then User logs in again to Innovation Form
    And User should see the warning message is displayed with date and time at the top of the Innovation Form
    And User verifies draft version is not changed after logout and login in Innovation Form
    And User clicks clear draft in Innovation