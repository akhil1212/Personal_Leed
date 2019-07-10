#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             					        Reviewer    :
# Date   : 	24.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 24.06.2019
# Feature Name: Navigating to Energy Efficiency Best Management practices Form
# Feature Description: Navigating to Energy Efficiency Best Management practices Form after login
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Energy Efficiency Best Management practices Form

 #Scenario-1
 @SmokeTest
  Scenario: User navigates to Energy Efficiency Best Management practices Form
    Given User should be on credits page 
    And User can see Energy Efficiency Best Management practices under Energy and Atmosphere
    And User has to select the status to Attempted for Energy Efficiency Best Management practices
    When User clicks on Energy Efficiency Best Management practices
    And User has to click on FormV01 button of Energy Efficiency Best Management practices
    Then User should be able to see the Energy Efficiency Best Management practices form