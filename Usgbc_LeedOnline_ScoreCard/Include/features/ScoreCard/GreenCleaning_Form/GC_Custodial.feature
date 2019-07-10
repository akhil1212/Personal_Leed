#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	13.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 13.06.2019
# Feature Name: Filling the Green Cleaning Form- Custodial effectiveness assessment
# Feature Description: Filling the Green Cleaning Form- Custodial effectiveness assessment which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Green Cleaning Form- Custodial effectiveness assessment

		#Scenario-1
	  @SmokeTest
	  Scenario: User selects an option Custodial effectiveness assessment
    Given User should see the radio button option Custodial effectiveness assessment
    When User clicks on Custodial effectiveness assessment option
    Then User should see the contents for Custodial effectiveness assessment option
    
    #Scenario-2
    @SmokeTest
    Scenario: User feeds narrative text under procedureDetails text box for Custodial effectiveness assessment in Green Cleaning
    Given User should see the editor for procedureDetails for Custodial effectiveness assessment in Green Cleaning 
    When User feeds long narrative text for procedureDetails text box for Custodial effectiveness assessment in Green Cleaning 
    Then User should see the narrative text persist on procedureDetails text box for Custodial effectiveness assessment in Green Cleaning 
    
    
   #Scenario-3
  @SmokeTest
  Scenario: User Upload the custodial effectiveness audit in Green Cleaning
    Given User should be able to see the Add File button for custodial effectiveness audit in Green Cleaning
    Then User uploads file for custodial effectiveness audit in Green Cleaning
    
  #Scenario-4
  @SmokeTest
  Scenario: User fills Overall score facility Numeric Field in green cleaning
    Given User should be able to see the textbox for Overall score facility in green cleaning
    When User enters Overall score facility in green cleaning
    Then User should be able to see the entered value of Overall score facility in green cleaning
    
  #Scenario-5
  @SmokeTest
  Scenario: User fills Date audit in green cleaning
    Given User should be able to see the Date audit in green cleaning
    When User enters Date audit in green cleaning
    Then User should be able to see the entered value of Date audit in green cleaning
    
     #Scenario-6
    @SmokeTest
    Scenario: User feeds narrative text under opportunities text box for Custodial effectiveness assessment in Green Cleaning
    Given User should see the editor for opportunities for Custodial effectiveness assessment in Green Cleaning 
    When User feeds long narrative text for opportunities text box for Custodial effectiveness assessment in Green Cleaning 
    Then User should see the narrative text persist on opportunities text box for Custodial effectiveness assessment in Green Cleaning 
    
      #Scenario-7
  @SmokeTest
  Scenario: User Upload the additional documentation in Green Cleaning
    Given User should be able to see the Add File button for additional documentation audit in Green Cleaning
    Then User uploads file for additional documentation in Green Cleaning
    
    #Scenario-8
    @SmokeTest
    Scenario: User feeds narrative text under Special Circumstances text box for Custodial effectiveness assessment in Green Cleaning
    Given User should see the editor for Special Circumstances for Custodial effectiveness assessment in Green Cleaning 
    When User feeds long narrative text for Special Circumstances text box for Custodial effectiveness assessment in Green Cleaning 
    Then User should see the narrative text persist on Special Circumstances text box for Custodial effectiveness assessment in Green Cleaning
    
    
    #Scenario-9
  @SmokeTest
  Scenario: User has to save the form in GC
    Given User can see the save button in GC
    When User clicks on save button in GC
    Then User should see Form data saved successfully message in GC
    
    
    #Scenario-10
  @SmokeTest
  Scenario: To save the Green Cleaning Form
    Given User can see the generate pdf icon on the top of the Green Cleaning Form   
    When User clicks on generate pdf icon to download the file in Green Cleaning Form
    Then User has to verify the procedureDetails html editor with downloaded pdf file in Green Cleaning Form
    And User has to verify Uploaded custodial effectiveness audit with downloaded pdf file in Green Cleaning Form    
    And User has to verify the Overall score facility Numeric field with downloaded pdf file in Green Cleaning Form
    And User has to verify the Date audit with downloaded pdf file in Green Cleaning Form
    And User has to verify the opportunities html editor with downloaded pdf file in Green Cleaning Form
    And User has to verify the Special Circumstances html editor with downloaded pdf file in Green Cleaning Form
    And User has to verify Uploaded additional documentation with downloaded pdf file in Green Cleaning Form
    
   #Scenario-11
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Custodial effectiveness assessmentin Green Cleaning form
    Given User has to refresh the form
    Then User verifies the narrative text of procedureDetails html editor box for Green Cleaning form
    And User verifies the narrative text of Special Circumstances html editor box for Green Cleaning form
    And User changes the status to ready for review for GC form
    
    
    
    
    
    
    
    