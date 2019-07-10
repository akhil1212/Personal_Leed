#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                                     Reviewer    :
# Date   : 	24.06.2019											                                                           Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 24.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in Energy Efficiency Best Management practices Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Energy Efficiency Best Management practices Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Energy Efficiency Best Management practices Form

  
  #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if no change in the form in EEBM Form
    Given User is on the Formv01 of Energy Efficiency Best Management practices Form
    When User will not modify any field on the Energy Efficiency Best Management practices Form
    Then User should not see saving of draft even after 10 seconds in Energy Efficiency Best Management practices Form
    
    
  #Scenario-2
	@SmokeTest
  Scenario: Verifying form draft is not saved if upload files in Energy Efficiency Best Management practices Form
    Given User should be able to see Upload file on Energy Efficiency Best Management practices Form
    When User uploads any files on Energy Efficiency Best Management practices Form
    Then User should not see saving of draft even after 10 seconds in Energy Efficiency Best Management practices Form
    
  #Scenario-3
	@SmokeTest
  Scenario: Verifying form draft is saved if change in checkbox in Energy Efficiency Best Management practices Form
    Given User should be able to see project team checkbox on Energy Efficiency Best Management practices Form
    When User uncheck project team checkbox on Energy Efficiency Best Management practices Form
    Then User should see saving of draft after 10 seconds in Energy Efficiency Best Management practices Form
 
  #Scenario-4
	@SmokeTest
  Scenario: Verifying form draft is saved if change in Date in Energy Efficiency Best Management practices Form
    Given User should be able to see Date Draft on Energy Efficiency Best Management practices Form
    When User changes Date Draft on Energy Efficiency Best Management practices Form
    Then User should see the draft is saved automatically with date and time for Energy Efficiency Best Management practices Form 
    
   #Scenario-5
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should be able to see the Special Circumstances narrative in Energy Efficiency Best Management practices Form
    When User modifies the Special Circumstances narrative data in the  Energy Efficiency Best Management practices Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for Special Circumstances narrative in Energy Efficiency Best Management practices Form
    
     #Scenario-6
    @SmokeTest
    Scenario: Verifying the form draft warning message is not retained when the form is saved in EEBM Form
    Given User can see the Draft is saved automatically with date and time in EEBM form
    And User can see the save button in EEBM form
    When User saves the EEBM form
    Then User verifies the form draft warning message is not retained in EEBM form
    
    
    #Scenario-7
    @SmokeTest
    Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should be able to see the Special Circumstances narrative in Energy Efficiency Best Management practices Form
    When User modifies the Special Circumstances narrative data in the EEBM Form and waits for 10 seconds
    Then User can see the draft is saved for Special Circumstances narrative in Energy Efficiency Best Management practices Form
    And User should clear the draft present in Energy Efficiency Best Management practices Form
    
    
   #Scenario-8
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time after logout and login in EEBM
    Given User should be able to see the Special Circumstances narrative in Energy Efficiency Best Management practices Form
    When User modifies narrative data in Energy Efficiency Best Management practices Form
    And User will logout from the Energy Efficiency Best Management practices Form
    Then User logs in again to Energy Efficiency Best Management practices Form
    And User should see the warning message is displayed with date and time at the top of the Energy Efficiency Best Management practices Form
    And User verifies draft version is not changed after logout and login in Energy Efficiency Best Management practices Form
    And User click on clear draft on the Energy Efficiency Best Management practices Form
    
    
    
    
    
    
    
    
    
      