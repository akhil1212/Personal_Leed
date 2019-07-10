#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	27.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 27.06.2019
# Feature Name: Filling the Innovation -Innovation Strategy
# Feature Description: Filling the Form Innovation -Innovation Strategy which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Form Innovation -Innovation Strategy

		 #Scenario-1
    @SmokeTest
    Scenario: User feeds narrative text under LEED Accredited Professional text box for Innovation
    Given User should see the editor for LEED Accredited Professional for Innovation 
    When User feeds long narrative text for LEED Accredited Professional text box for Innovation 
    Then User should see the narrative text persist on LEED Accredited Professional text box for Innovation 
    
	#Scenario-2
  @SmokeTest
  Scenario: User Upload the project team member’s LEED Accredited in Innovation
    Given User should be able to see the Add File button for a project team member’s LEED Accredited in Innovation
    Then User uploads file for project team member’s LEED Accredited in Innovation
		
		#Scenario-3
	  @SmokeTest
	  Scenario: User selects an option Innovation Strategy
    Given User should see the radio button option Innovation Strategy
    When User clicks on Innovation Strategy
    Then User should see the contents for Innovation Strategy
    
     #Scenario-4
    @SmokeTest
    Scenario: User feeds narrative text under proposed requirements text box for Innovation Strategy in Innovation
    Given User should see the editor for proposed requirements for Innovation Strategy in Innovation 
    When User feeds long narrative text for proposed requirements for Innovation Strategy in Innovation
    Then User should see the narrative text persist on proposed requirements for Innovation Strategy in Innovation
    
	#Scenario-5
  @SmokeTest
  Scenario: User Upload the supporting documentation for Innovation Strategy in Innovation
    Given User should be able to see the Add File button for a supporting documentation for Innovation Strategy in Innovation
    Then User uploads file for supporting documentation for Innovation Strategy in Innovation
    
	#Scenario-6
  @SmokeTest
  Scenario: User Upload the additional documentation in Innovation
    Given User should be able to see the Add File button for a additional documentation in Innovation
    Then User uploads file for additional documentation in Innovation
    
    #Scenario-7
    @SmokeTest
    Scenario: User feeds narrative text under Special Circumstances in Innovation
    Given User should see the editor for Special Circumstances in Innovation 
    When User feeds long narrative text for Special Circumstances in Innovation
    Then User should see the narrative text persist on Special Circumstances in Innovation
    
    
    #Scenario-6
  @SmokeTest
  Scenario: User has to save the Innovation form
    Given User can see the save button in Innovation
    When User clicks on save button in Innovation
    Then User should see Form data saved successfully message in Innovation
    
  #Scenario-7
  @SmokeTest
  Scenario: To save the Innovation Form
    Given User can see the generate pdf icon on the top of the Innovation Form   
    When User clicks on generate pdf icon to download the file in Innovation Form
    Then User has to verify the LEED Accredited Professional html editor with downloaded pdf file in Innovation Form
    And User has to verify Uploaded project team member’s LEED Accredited with downloaded pdf file in Innovation Form    
    And User has to verify the Innovation Strategy html editor with downloaded pdf file in Innovation Form
    And User has to verify Uploaded supporting documentation with downloaded pdf file in Innovation Form 
    And User has to verify the Special Circumstances html editor with downloaded pdf file in Innovation Form
    And User has to verify Uploaded additional documentation with downloaded pdf file in Innovation Form
    
    
    #Scenario-8
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Innovation Strategy in Innovation
    Given User has to refresh the form
    Then User verifies the narrative text of LEED Accredited Professional html editor box for Innovation form
    And User verifies the narrative text of innovation strategy html editor box for Innovation form
    And User verifies the narrative text of Special Circumstances html editor box for Innovation form
    And User changes the status to ready for review for the Innovation form