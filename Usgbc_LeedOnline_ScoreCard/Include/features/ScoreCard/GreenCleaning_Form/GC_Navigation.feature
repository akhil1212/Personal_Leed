#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             					        Reviewer    :
# Date   : 	14.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 14.06.2019
# Feature Name: Navigating to USGBC Green Cleaning Form
# Feature Description: Navigating to USGBC Green Cleaning Form after login
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Green Cleaning Form

 	#Scenario-1
  @SmokeTest
  Scenario: User navigates to Green Cleaning Form
    Given User should be on credits page 
    And User can see Green Cleaning under Indoor Environmental Quality section
    And User has to select the status to Attempted for Green Cleaning 
    When User clicks on Green Cleaning 
    And User has to click on FormV01 button of Green Cleaning
    Then User should be able to see the Green Cleaning form