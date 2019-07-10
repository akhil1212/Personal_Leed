#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 																		                                                     Reviewer    :
# Date   : 												                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Filling the Grid Harmonization Form- Demand Response Capable building
# Feature Description: Filling the Grid Harmonization Form- Demand Response Capable building which is case 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Grid Harmonization Form

	#Scenario-1
	  @SmokeTest
	  Scenario: User selects the case Demand Response Capable building 
    Given User should see the radio button case Demand Response Capable building
    When User clicks on Demand Response Capable building case
    Then User should see the contents for Demand Response Capable building case
    
    #Scenario-2
	  @SmokeTest
	  Scenario: User selects the checkboxes for Demand Response Capable in Grid Harmonization
    Given User should be able to see all the checkboxes for Demand Response Capable in Grid Harmonization
    When User clicks all the checkboxes for Demand Response Capable in Grid Harmonization
    Then User able to see the selected checkboxes there     
    
  #Scenario-3
  @SmokeTest
  Scenario: User fills Peak electricity demand Numeric Field for Demand Response Capable in Grid Harmonization
    Given User should be able to see the textbox for Peak electricity demand in Grid Harmonization 
    When User enters Peak electricity in Grid Harmonization
    Then User should be able to see the entered values of Peak electricity in Grid Harmonization
    
    #Scenario-4
  @SmokeTest
  Scenario: User fills Planned demand reduction Numeric Field for Demand Response Capable in Grid Harmonization
    Given User should able to see the textbox for Planned demand reduction in Grid Harmonization 
    When User entered Planned demand reduction in Grid Harmonization
    Then User should able to see the entered values of Planned demand reduction in Grid Harmonization
    
    
  #Scenario-5
  @SmokeTest
  Scenario: User fills Percent on Peak Reduction Field for Demand Response Capable in Grid Harmonization
    Given User should able to see the Field for Percent on Peak Reduction in Grid Harmonization
    When User entered Percent on Peak Reduction in Grid Harmonization
    Then User should able to see the entered values of Percent on Peak Reduction in Grid Harmonization 
    
    
    #Scenario-6
  @SmokeTest
  Scenario: User has to save the form in GH
    Given User can see the save button in GH
    When User clicks on save button in GH
    Then User should see Form data saved successfully message in GH
    
    
    #Scenario-6
  @SmokeTest
  Scenario: To save the Grid Harmonization Form
    Given User can see generate pdf icon on the top of the Grid Harmonization Form   
    When User clicks generate pdf icon to download the file in Grid Harmonization Form
    Then User has to verify Peak electricity demand Numeric Field with downloaded pdf file in Grid Harmonization Form
    And User has to verify Planned demand reduction Numeric Field with downloaded pdf file in Grid Harmonization Form
    And User has to verify Percent on Peak Reduction textbox with downloaded pdf file in Grid Harmonization Form
    And User has to verify Uploaded Additional documentation with downloaded pdf file in Grid Harmonization Form
    And User has to verify the text in Special circumstances editor box with downloaded pdf file in Grid Harmonization Form
    And User changes the status to ready for review for the Grid Harmonization form
    
    
    
    
    