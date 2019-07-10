#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	13.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 13.06.2019
# Feature Name: Filling the Green Cleaning Form- Powered cleaning equipment
# Feature Description: Filling the Green Cleaning Form- Powered cleaning equipment which is option 3
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Green Cleaning Policy Form- Powered cleaning equipment

	#Scenario-1
	  @SmokeTest
	  Scenario: User selects an option Powered cleaning equipment
    Given User should see the radio button option Powered cleaning equipment
    When User clicks on Powered cleaning equipment option
    Then User should see the contents for Powered cleaning equipment option
    
    #Scenario-2
	  @SmokeTest
	  Scenario: User Upload the Green Cleaning Calculator in Green Cleaning
    Given User should be able to see the Add File button for Green Cleaning Calculator in Green Cleaning
    Then User uploads file for Green Cleaning Calculator in Green Cleaning
    
  #Scenario-3
  @SmokeTest
  Scenario: User fills powered janitorial equipment Numeric Field in green cleaning
    Given User should be able to see the textbox for powered janitorial equipment in green cleaning
    When User enters powered janitorial equipment in green cleaning
    Then User should be able to see the entered value of powered janitorial equipment in green cleaning
    
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
    Then User has to verify Uploaded Green Cleaning Calculator with downloaded pdf file in Green Cleaning Form
    And User has to verify the powered janitorial equipment Numeric Field with downloaded pdf file in Green Cleaning Form
    And User changes the status to ready for review for GC form

    