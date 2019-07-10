#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 														                                             					        Reviewer    :
# Date   : 											                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Navigating to USGBC Grid Harmonization Form
# Feature Description: Navigating to USGBC Grid Harmonization Form after login
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Grid Harmonization Form

 	#Scenario-1
  @SmokeTest
  Scenario: User navigates to Grid Harmonization Form
    Given User should be on credits page
    And User can see Grid Harmonization under Energy and Atmosphere
    And User has to select the status to Attempted for Grid Harmonization
    When User clicks on Grid Harmonization 
    And User has to click on FormV01 button of Grid Harmonization
    Then User should be able to see the Grid Harmonization form