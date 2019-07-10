#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 																		                                                     Reviewer    :
# Date   : 												                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Filling the Grid Harmonization Form- Permanent Load Shifting
# Feature Description: Filling the Grid Harmonization Form- Permanent Load Shifting which is case 3
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Grid Harmonization Form

	#Scenario-1
	  @SmokeTest
	  Scenario: User selects the case Permanent Load Shifting
	  Given User should see the radio button case Permanent Load Shifting
    When User clicks on Permanent Load Shifting case
    Then User should see the contents for Permanent Load Shifting case
    
    #Scenario-2
	  @SmokeTest
	  Scenario: User selects the checkbox for Permanent Load Shifting in Grid Harmonization
    Given User should be able to see the checkbox for Permanent Load Shifting in Grid Harmonization
    When User clicks the checkbox for Permanent Load Shifting in Grid Harmonization
    Then User able to see the selected checkbox over there     
    
  #Scenario-3
  @SmokeTest
  Scenario: User fills On-Peak electricity demand Numeric Field for Permanent Load Shifting in Grid Harmonization
    Given User can be able to see the textbox for On-Peak electricity demand in Grid Harmonization 
    When User can enters On-Peak electricity in Grid Harmonization
    Then User has able to see the entered values of On-Peak electricity in Grid Harmonization
    
    #Scenario-4
  @SmokeTest
  Scenario: User fills Planned demand reduction Numeric Field for Permanent Load Shifting in Grid Harmonization
    Given User should see the textbox for Planned demand reduction in Grid Harmonization 
    When User should enters Planned demand reduction in Grid Harmonization
    Then User has able to see the entered values of Planned demand reduction in Grid Harmonization
    
    
  #Scenario-5
  @SmokeTest
  Scenario: User fills Percent on Peak Reduction field for Permanent Load Shifting in Grid Harmonization
    Given User can able to see the field for Percent on Peak Reduction in Grid Harmonization
    When User has to enters Percent on Peak Reduction in Grid Harmonization
    Then User has able to see the entered values of Percent on Peak Reduction in Grid Harmonization 
    
    #Scenario-6
	  @SmokeTest
	  Scenario: User Upload the Project Load Shifting in Grid Harmonization 
    Given User should be able to see the Add File button for Project Load Shifting in Grid Harmonization
    Then User uploads file for Project Load Shifting in Grid Harmonization
   
    #Scenario-7
    @SmokeTest
	  Scenario: User selects the checkbox of distributed energy for Permanent Load Shifting in Grid Harmonization
    Given User should be able to see the checkbox of distributed energy for Permanent Load Shifting in Grid Harmonization
    When User clicks the checkbox of distributed energy for Permanent Load Shifting in Grid Harmonization
    Then User able to see the selected checkbox over there     
    
    
    #Scenario-8
  @SmokeTest
  Scenario: User has to save the form in GH
    Given User can see the save button in GH
    When User clicks on save button in GH
    Then User should see Form data saved successfully message in GH
    
    
    #Scenario-9
  @SmokeTest
  Scenario: To save the Grid Harmonization Form
    Given User able to see the generate pdf icon on the top of the Grid Harmonization Form   
    When User clicks the generate pdf icon to download the file in Grid Harmonization Form
    Then User has to verify the On_Peak electricity demand Numeric Field with downloaded pdf file in Grid Harmonization Form
    And User should verify the Planned demand reduction Numeric Field with downloaded pdf file in Grid Harmonization Form
    And User should verify Percent on Peak Reduction textbox with downloaded pdf file in Grid Harmonization Form
    And User has to verify Uploaded Project Load Shifting with downloaded pdf file in Grid Harmonization Form 
     And User has to verify Uploaded Additional documentation with downloaded pdf file in Grid Harmonization Form
    And User has to verify the text in Special circumstances editor box with downloaded pdf file in Grid Harmonization Form
    And User changes the status to ready for review for the Grid Harmonization form
    
    
    
    
    
    