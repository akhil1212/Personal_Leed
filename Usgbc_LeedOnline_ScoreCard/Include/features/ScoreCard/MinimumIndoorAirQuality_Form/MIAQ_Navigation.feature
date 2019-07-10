#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	14.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 14.06.2019
# Feature Name: Navigating to USGBC Minimum Indoor Air Quality Form
# Feature Description: Navigating to USGBC Minimum Indoor Air Quality Form after login
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Minimum Indoor Air Quality Form

  #Scenario-1
  @SmokeTest
  Scenario: User navigates to Minimum Indoor Air Quality Form
    Given User should be on credits page
    And User can see Minimum Indoor Air Quality under Indoor Environmental Quality
    And User has to select the status to Attempted for Minimum Indoor Air Quality
    When User clicks on Minimum Indoor Air Quality
    And User has to click on FormV01 button of Minimum Indoor Air Quality
    Then User should be able to see the Minimum Indoor Air Quality form
