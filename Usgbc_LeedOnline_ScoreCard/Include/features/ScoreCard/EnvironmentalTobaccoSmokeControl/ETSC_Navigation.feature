#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	19.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 19.06.2019
# Feature Name: Navigating to USGBC Environmental Tobacco Smoke Control Form
# Feature Description: Navigating to USGBC Environmental Tobacco Smoke Control Form after login
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Environmental Tobacco Smoke Control Form

  #Scenario-1
  @SmokeTest
  Scenario: User navigates to Environmental Tobacco Smoke Control Form
    Given User should be on credits page
    And User can see Environmental Tobacco Smoke Control under Indoor Environmental Quality
    And User has to select the status to Attempted for Environmental Tobacco Smoke Control
    When User clicks on Environmental Tobacco Smoke Control
    And User has to click on FormV01 button of Environmental Tobacco Smoke Control
    Then User should be able to see the Environmental Tobacco Smoke Control form
