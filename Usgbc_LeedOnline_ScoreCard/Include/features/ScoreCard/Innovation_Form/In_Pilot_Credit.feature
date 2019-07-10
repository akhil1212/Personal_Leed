#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                 Reviewer    :
# Date   : 	27.06.2019											                                                 Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 27.06.2019
# Feature Name: Filling the Innovation - Pilot Credit
# Feature Description: Filling the Form Innovation - Pilot Credit which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Form Innovation - Pilot Credit

	#Scenario-1
	  @SmokeTest
	  Scenario: User selects an option Pilot Credit
    Given User should see the radio button option Pilot Credit
    When User clicks on Pilot Credit 
    Then User should see the contents for Pilot Credit
    
	#Scenario-2
  @SmokeTest
  Scenario: User fills name of the pilot credit in Innovation
    Given User should be able to see the textbox for name of the pilot credit in Innovation
    When User enters name of the pilot credit in Innovation
    Then User should be able to see the entered value in name of the pilot credit in Innovation
    
    #Scenario-3
  @SmokeTest
  Scenario: User fills name of the pilot credit in Innovation
    Given User should be able to see the textbox for number of the pilot credit in Innovation
    When User enters number of the pilot credit in Innovation
    Then User should be able to see the entered value in number of the pilot credit in Innovation
    
    #Scenario-4
  @SmokeTest
  Scenario: User Upload the required documentation for pilot credit in Innovation
    Given User should be able to see the Add File button for a required documentation for pilot credit in Innovation
    Then User uploads file for required documentation for pilot credit in Innovation
    
   #Scenario-5
  @SmokeTest
  Scenario: User has to save the Innovation form
    Given User can see the save button in Innovation
    When User clicks on save button in Innovation
    Then User should see Form data saved successfully message in Innovation
    
  #Scenario-6
  @SmokeTest
  Scenario: User verify the data entered after refreshing the pilot credit in Innovation
    Given User has to refresh the form
    Then User verifies the textbox of name of the pilot credit for Innovation form
    And User verifies the textbox of number of the pilot credit for Innovation form
     And User changes the status to ready for review for the Innovation form   
    
    