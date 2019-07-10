#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                                     Reviewer    :
# Date   : 	14.06.2019											                                                           Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 14.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in Green Cleaning Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Green Cleaning Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in Green Cleaning Form

#Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if no change in the form in GC
    Given User is on the Formv01 of Green Cleaning Form
    When User will not modify any field on the Green Cleaning Form
    Then User should not see saving of draft even after 10 seconds in Green Cleaning Form
    
  #Scenario-2
	@SmokeTest
  Scenario: Verifying form draft is not saved if upload files on Green Cleaning
    Given User should be able to see Upload file on Green Cleaning Form
    When User uploads any files on Green Cleaning Form
    Then User should not see saving of draft even after 10 seconds in Green Cleaning Form
    
  #Scenario-3
	@SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Textbox
    Given User should be able to see the textbox for cleaning products in green cleaning
    When User modifies the value in the cleaning products in Green cleaning
    Then User should see saving of draft even after 10 seconds in Green Cleaning Form
    
    #Scenario-4
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Percent of cleaning products
    Given User should be able to see the textbox for Percent of cleaning products in green cleaning
    When User modifies the textbox value in the Green Cleaning Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for change in textbox in Green Cleaning Form
    
   #Scenario-5
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should be able to see the Special Circumstances narrative in Green Cleaning Form
    When User modifies the Special Circumstances narrative data in the Green Cleaning Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for Special Circumstances narrative in Green Cleaning Form
    
    #Scenario-6
    @SmokeTest
    Scenario: Verifying the form draft warning message is not retained when the form is saved in Green Cleaning Form
    Given User can see the Draft is saved automatically with date and time in Green Cleaning Form
    And User can see the save button in Green Cleaning Form
    When User saves the Green Cleaning Form
    Then User verifies the form draft warning message is not retained in Green Cleaning Form
    
    #Scenario-7
    @SmokeTest
    Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should be able to see the Special Circumstances narrative in Green Cleaning Form
    When User modifies the Special Circumstances narrative data in the GC Form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for Special Circumstances narrative in Green Cleaning Form
    And User should clear the draft present in Green Cleaning Form
    
    
       #Scenario-8
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the radio button in Green Cleaning form for Powered cleaning
    When User clicks on the radio button of Powered cleaning and waits for 10 seconds
    And User can see the Clear draft in Green Cleaning form
    And User clicks on Clear draft in Green Cleaning form
    Then User can see the draft is cleared in Green Cleaning form
    
  
    
  #Scenario-9
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time after logout and login in GC
    Given User can see the narrative in Green Cleaning Form
    When User modifies narrative data in Green Cleaning Form
    And User will logout from the Green Cleaning Form
    Then User logs in again to Green Cleaning Form
    And User should see the warning message is displayed with date and time at the top of the Green Cleaning Form
    And User verifies draft version is not changed after logout and login in Green Cleaning Form
    And User click on clear draft on the Green Cleaning Form
    
    
      #Scenario-10
  #@SmokeTest
  #Scenario: Verification of Date functionality
    #Given User should see the radio button option Custodial effectiveness assessment
    #When User clicks on Custodial effectiveness assessment option
    #And User can see Date audit in Green Cleaning form
    #And User enters values for Date audit and waits for 10 sec in Green Cleaning form
    #And User can see the Clear draft in Green Cleaning form
    #And User enters all the required fields in Green Cleaning
    #Then User saves the Green Cleaning Form
    #And User verifies the form draft warning is not retained in Green Cleaning Form
    #
    
    
    
    
    
    
    
    
    