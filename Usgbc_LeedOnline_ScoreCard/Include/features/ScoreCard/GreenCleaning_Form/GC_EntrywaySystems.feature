#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	13.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 13.06.2019
# Feature Name: Filling the Green Cleaning Form- Entryway systems
# Feature Description: Filling the Green Cleaning Form- Entryway systems which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Green Cleaning Policy Form- Entryway systems

		#Scenario-1
	  @SmokeTest
	  Scenario: User selects an option Entryway systems
    Given User should see the radio button option Entryway systems
    When User clicks on Entryway systems option
    Then User should see the contents for Entryway systems option
    
   	#Scenario-2
	  @SmokeTest
	  Scenario: User Upload the photos, drawings in Green Cleaning
    Given User should be able to see the Add File button for photos, drawings in Green Cleaning
    Then User uploads file for photos, drawings in Green Cleaning
    
    #Scenario-3
    @SmokeTest
    Scenario: User feeds narrative text under weekly basis text box for Entryway systems in Green Cleaning
    Given User should see the editor for weekly basis for Entryway systems in Green Cleaning 
    When User feeds long narrative text for weekly basis text box for Entryway systems in Green Cleaning 
    Then User should see the narrative text persist on weekly basis text box for Entryway systems in Green Cleaning 
    
    
   #Scenario-4
  @SmokeTest
  Scenario: User has to save the form in GC
    Given User can see the save button in GC
    When User clicks on save button in GC
    Then User should see Form data saved successfully message in GC
    
    
    #Scenario-5
  @SmokeTest
  Scenario: To save the Green Cleaning Form
    Given User can see the generate pdf icon on the top of the Green Cleaning Form   
    When User clicks on generate pdf icon to download the file in Green Cleaning Form
    Then User has to verify Uploaded  photos, drawings with downloaded pdf file in Green Cleaning Form
    And User has to verify the weekly basis html editor with downloaded pdf file in Green Cleaning Form
    
    
   #Scenario-6
  @SmokeTest
  Scenario: User verify the data entered after refreshing the In-house green cleaning policy in Green Cleaning form
    Given User has to refresh the form
    Then User verifies the narrative text of weekly basis html editor box for Green Cleaning form
    And User changes the status to ready for review for GC form
    