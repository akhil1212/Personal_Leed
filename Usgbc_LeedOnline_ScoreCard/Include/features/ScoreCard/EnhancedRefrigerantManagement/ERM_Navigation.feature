#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             	Reviewer    :
# Date   : 	04.06.2019											                                                    Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 04.06.2019
# Feature Name: Navigating to Enhanced Refrigerant Management Form
# Feature Description: Navigating to Enhanced Refrigerant Management Form under Energy and Atmosphere
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Enhanced Refrigerant Management Form

 #Scenario-1
 @SmokeTest
  Scenario: User navigates to Enhanced Refrigerant Management Form
    Given User should be on credits page 
    And User can see Enhanced Refrigerant Management under Energy and Atmosphere
    And User has to select the status to Attempted for Enhanced Refrigerant Management
    When User clicks on Enhanced Refrigerant Management
    And User has to click on FormV01 button of Enhanced Refrigerant Management
    Then User should be able to see the Enhanced Refrigerant Management form