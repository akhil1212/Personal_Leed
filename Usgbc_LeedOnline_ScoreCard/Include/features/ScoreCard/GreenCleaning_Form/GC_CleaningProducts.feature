#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	13.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 13.06.2019
# Feature Name: Filling the Green Cleaning Form- Cleaning products and materials
# Feature Description: Filling the Green Cleaning Form- Cleaning products and materials which is option 4
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Green Cleaning Policy Form- Cleaning products and materials

	#Scenario-1
	  @SmokeTest
	  Scenario: User selects an option Cleaning products and materials
    Given User should see the radio button option Cleaning products and materials
    When User clicks on Cleaning products and materials option
    Then User should see the contents for Cleaning products and materials option
    
    #Scenario-2
	  @SmokeTest
	  Scenario: User Upload the Green Cleaning Calculator in Green Cleaning
    Given User should be able to see the Add File button for Green Cleaning Calculator in Green Cleaning
    Then User uploads file for Green Cleaning Calculator in Green Cleaning
    
    #Scenario-3
	  @SmokeTest
	  Scenario: User Upload the executed contract in Green Cleaning
    Given User should be able to see the Add File button for executed contract in Green Cleaning
    Then User uploads file for executed contract in Green Cleaning
    
    #Scenario-4
	  @SmokeTest
	  Scenario: User Upload the MSDS sheets in Green Cleaning
    Given User should be able to see the Add File button for MSDS sheets in Green Cleaning
    Then User uploads file for MSDS sheets in Green Cleaning
    
    
  #Scenario-5
  @SmokeTest
  Scenario: User fills cleaning products Numeric Field in Green Cleaning
    Given User should be able to see the textbox for cleaning products in green cleaning
    When User enters cleaning products in green cleaning
    Then User should be able to see the entered value of cleaning products in green cleaning
    
  #Scenario-5
  @SmokeTest
  Scenario: User fills Percent of cleaning products textbox in Green Cleaning
    Given User should be able to see the textbox for Percent of cleaning products in green cleaning
    When User enters Percent of cleaning products in green cleaning
    Then User should be able to see the entered value of Percent of cleaning products in green cleaning    
    
    
    #Scenario-6
  @SmokeTest
  Scenario: User has to save the form in GC
    Given User can see the save button in GC
    When User clicks on save button in GC
    Then User should see Form data saved successfully message in GC
    
    
    #Scenario-7
  @SmokeTest
  Scenario: To save the Green Cleaning Form
    Given User can see the generate pdf icon on the top of the Green Cleaning Form   
    When User clicks on generate pdf icon to download the file in Green Cleaning Form
    Then User has to verify Uploaded Green Cleaning Calculator with downloaded pdf file in Green Cleaning Form
    And User has to verify Uploaded executed contract with downloaded pdf file in Green Cleaning Form
    And User has to verify Uploaded MSDS sheets with downloaded pdf file in Green Cleaning Form
    And User has to verify the cleaning products Numeric Field with downloaded pdf file in Green Cleaning Form
    And User has to verify the Percent of cleaning products textbox with downloaded pdf file in Green Cleaning Form
    And User changes the status to ready for review for GC form       
    
    
    
    