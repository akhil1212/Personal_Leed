#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             					        Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 04.06.2019
# Feature Name: Filling the Enhanced Refrigerant Management Form
# Feature Description: Filling the Enhanced Refrigerant Management Form - No Refrigerants or Low-Impact Refrigerants which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Enhanced Refrigerant Management Form- No Refrigerants or Low-Impact Refrigerants

		#Scenario-1
	  @SmokeTest
	  Scenario: User selects an option No Refrigerants or Low-Impact Refrigerants
    Given User should see the radio button option No Refrigerants or Low-Impact Refrigerants
    When User clicks on No Refrigerants or Low-Impact Refrigerants option
    Then User should see the contents for No Refrigerants or Low-Impact Refrigerants option
    
    #Scenario-2
    @SmokeTest
    Scenario: User feeds narrative text under low-impact refrigerants text box for Low-Impact Refrigerants in ERM Form
    Given User should see the editor for low-impact refrigerants for Low-Impact Refrigerants in ERM Form
    When User feeds long narrative text for low-impact refrigerants text box for Low-Impact Refrigerants in ERM Form
    Then User should see the narrative text persist on low-impact refrigerants text box for Low-Impact Refrigerants in ERM Form
    
   #Scenario-3
  @SmokeTest
  Scenario: User Upload the additional documentation in ERM Form
    Given User should be able to see the Add File button for additional documentation audit in ERM Form
    Then User uploads file for additional documentation in ERM Form
    
    #Scenario-4
    @SmokeTest
    Scenario: User feeds narrative text under Special Circumstances text box in ERM Form
    Given User should see the editor for Special Circumstances in ERM Form
    When User feeds long narrative text for Special Circumstances text box in ERM Form
    Then User should see the narrative text persist on Special Circumstances text box in ERM Form
    
    
  #Scenario-5
  @SmokeTest
  Scenario: User has to save the form in ERM Form
    Given User can see the save button in ERM Form
    When User clicks on save button in ERM Form
    Then User should see Form data saved successfully message in ERM Form
    
  #Scenario-6
  @SmokeTest
  Scenario: To save the Enhanced Refrigerant Management Form
    Given User can see the generate pdf icon on the top of the ERM Form   
    When User clicks on generate pdf icon to download the file in ERM Form
    Then User has to verify the low-impact refrigerants html editor with downloaded pdf file in ERM Form
    And User has to verify the Special Circumstances html editor with downloaded pdf file in ERM Form
    And User has to verify Uploaded additional documentation with downloaded pdf file in ERM Form
    
  #Scenario-7
  @SmokeTest
  Scenario: User verify the data entered after refreshing ERM form
    Given User has to refresh the form
    Then User verifies the narrative text of low-impact refrigerants html editor box for ERM form
    And User verifies the narrative text of Special Circumstances html editor box for ERM form
    And User changes the status to ready for review for the ERM form
    