#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 																		                                                     Reviewer    :
# Date   : 												                                                                     Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name: Filling the Grid Harmonization Form- Demand Response Program
# Feature Description: Filling the Grid Harmonization Form- Demand Response Program which is case 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Grid Harmonization Form

  #Scenario-1
  @SmokeTest
  Scenario: User selects the case Demand Response Program
    Given User should see the radio button case Demand Response Program
    When User clicks on Demand Response Program case
    Then User should see the contents for Demand Response Program case

  #Scenario-2
  @SmokeTest
  Scenario: User selects the checkboxes for Demand Response Program in Grid Harmonization
    Given User should be able to see all the fields of checkboxes and textboxes for Demand Response Program in Grid Harmonization
    When User clicks all the checkboxes for Demand Response Program in Grid Harmonization
    Then User able to see the selected checkboxes over there

  #Scenario-3
  @SmokeTest
  Scenario: User fills On-Peak electricity demand Numeric Field for Demand Response Program in Grid Harmonization
    Given User should be able to see the textbox for On-Peak electricity demand in Grid Harmonization
    When User enters On-Peak electricity in Grid Harmonization
    Then User should be able to see the entered values of On-Peak electricity in Grid Harmonization

  #Scenario-4
  @SmokeTest
  Scenario: User fills Planned demand reduction Numeric Field for Demand Response Program in Grid Harmonization
    Given User should be able to see the textbox for Planned demand reduction in Grid Harmonization
    When User enters Planned demand reduction in Grid Harmonization
    Then User should be able to see the entered values of Planned demand reduction in Grid Harmonization

  #Scenario-5
  @SmokeTest
  Scenario: User fills Percent on Peak Reduction field for Demand Response Program in Grid Harmonization
    Given User should be able to see the field for Percent on Peak Reduction in Grid Harmonization
    When User enters Percent on Peak Reduction in Grid Harmonization
    Then User should be able to see the entered values of Percent on Peak Reduction in Grid Harmonization

  #Scenario-6
  @SmokeTest
  Scenario: User Upload the Proof of enrollement in Grid Harmonization
    Given User should be able to see the Add File button for Proof of enrollement in Grid Harmonization
    Then User uploads file for Proof of enrollement in Grid Harmonization
    
    
    #Scenario-7
  @SmokeTest
  Scenario: User Upload the additional documentation in Grid Harmonization
    Given User should be able to see the Add File button for additional documentation audit in Grid Harmonization
    Then User uploads file for additional documentation in Grid Harmonization
    
    #Scenario-8
    @SmokeTest
    Scenario: User feeds narrative text under Special Circumstances text box for in Grid Harmonization
    Given User should see the editor for Special Circumstances in Grid Harmonization
    When User feeds long narrative text for Special Circumstances text box in Grid Harmonization
    Then User should see the narrative text persist on Special Circumstances text box in Grid Harmonization
    
  #Scenario-9
  @SmokeTest
  Scenario: User has to save the form in GH
    Given User can see the save button in GH
    When User clicks on save button in GH
    Then User should see Form data saved successfully message in GH

  #Scenario-10
  @SmokeTest
  Scenario: To save the Grid Harmonization Form
    Given User can see the generate pdf icon on the top of the Grid Harmonization Form
    When User clicks on generate pdf icon to download the file in Grid Harmonization Form
    Then User has to verify the Peak electricity demand Numeric Field with downloaded pdf file in Grid Harmonization Form
    And User has to verify the Planned demand reduction Numeric Field with downloaded pdf file in Grid Harmonization Form
    And User has to verify the Percent on Peak Reduction textbox with downloaded pdf file in Grid Harmonization Form
    And User has to verify Uploaded Proof of enrollement with downloaded pdf file in Grid Harmonization Form
    And User has to verify Uploaded Additional documentation with downloaded pdf file in Grid Harmonization Form
    And User has to verify the text in Special circumstances editor box with downloaded pdf file in Grid Harmonization Form
    
   #Scenario-11
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Grid Harmonization Form
    Given User has to refresh the form
    Then User verifies the narrative text of Special Circumstances html editor box for Grid Harmonization Form
		And User changes the status to ready for review for the Grid Harmonization form

  
