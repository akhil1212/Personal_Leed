#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             					        Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 04.06.2019
# Feature Name: Filling the Enhanced Refrigerant Management Form
# Feature Description: Filling the Enhanced Refrigerant Management Form - Calculation of Refrigerant Impact which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Enhanced Refrigerant Management Form - Calculation of Refrigerant Impact

		#Scenario-1
	  @SmokeTest
	  Scenario: User selects an option Calculation of Refrigerant Impact
    Given User should see the radio button option Calculation of Refrigerant Impact
    When User clicks on Calculation of Refrigerant Impact option
    Then User should see the contents for Calculation of Refrigerant Impact option
    
  #Sceanrio-2
  @SmokeTest
  Scenario: Feeding the data to the Table Mechanical Cooling and Refrigeration Equipment of Refrigerant Impact
    Given User can see the Table Mechanical Cooling and Refrigeration Equipment of Refrigerant Impact
    When User enters the details of Equipment Type, Units,Qunit,Refrigerant,Rc,Life
    Then User can see the calculated value of GWPr,ODPr,Lr,Mr,LCGWP,LCODP,Impact,ImpactTotal in the Table Mechanical Cooling of Refrigerant Impact
    
    #Scenario-3
	  @SmokeTest
	  Scenario: User selects an option GreenChill’s silver-level certification
    Given User should see the radio button option GreenChill’s silver-level certification
    Then User clicks on GreenChill’s silver-level certification option
    
     #Scenario-4
	  @SmokeTest
	  Scenario: User selects an option project requirements
    Given User should see the radio button option project requirements
    Then User clicks on project requirements option
    
   #Scenario-5
  @SmokeTest
  Scenario: User Upload the refrigerant equipment in ERM Form
    Given User should be able to see the Add File button for refrigerant equipment in ERM Form
    Then User uploads file for refrigerant equipment in ERM Form
    
   #Scenario-6
  @SmokeTest
  Scenario: User has to save the form in ERM Form
    Given User can see the save button in ERM Form
    When User clicks on save button in ERM Form
    Then User should see Form data saved successfully message in ERM Form
    
    ####### (PI/SI)########
   #Scenario-7
  @SmokeTest
  Scenario: User has to change the units in ERM Form
    Given User checks the unit type of Qunit, Rc in ERM Form
    When User changes Units from IP to SI
    Then User again checks the unit type of Qunit, Rc in ERM Form
    And User should be able to see the change in the unit type in ERM Form
    And User changes Units to IP
    
   #Scenario-7
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Mechanical Cooling and Refrigeration Equipment in ERM Form
    Given User has to refresh the form
    Then User verifies the data present in the table Mechanical Cooling and Refrigeration Equipment with the entered data
    
  #Scenario-8
  @SmokeTest
  Scenario: To verify the generated pdf for Calculation of Refrigerant Impact of ERM Form
    Given User can see the generate pdf icon on the top of the ERM Form
    When User clicks on generate pdf icon to download the file in ERM Form
    Then User has to verify the Mechanical Cooling and Refrigeration Equipment table with downloaded pdf file
    And User has to verify Uploaded refrigerant equipment with downloaded pdf file
    And User changes the status to ready for review for the ERM form