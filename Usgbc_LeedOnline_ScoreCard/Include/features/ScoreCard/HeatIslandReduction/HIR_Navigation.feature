#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             					        Reviewer    :
# Date   : 	10.07.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 10.07.2019
# Feature Name: Navigating to USGBC Heat Island Reduction Form
# Feature Description: Navigating to USGBC Heat Island Reduction Form after login
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Heat Island Reduction Form

 	#Scenario-1
  @SmokeTest
  Scenario: User navigates to Heat Island Reduction Form
    Given User should be on credits page 
    And User can see Heat Island Reduction under sustainable sites
    And User has to select the status to Attempted for Heat Island Reduction 
    When User clicks on Heat Island Reduction 
    And User has to click on FormV01 button of Heat Island Reduction
    Then User should be able to see the Heat Island Reduction form