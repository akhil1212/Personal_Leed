#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	10.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 10.06.2019
# Feature Name: Navigating to USGBC Rainwater Management Form
# Feature Description: Navigating to USGBC Rainwater Management Form after login
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Rainwater Management Form

  #Scenario-1
  @SmokeTest
  Scenario: User navigates to Rainwater Management Form
    Given User should be on credits page
    And User can see Rainwater Management under Sustainable Sites section
    And User has to select the status to Attempted for Rainwater Management
    When User clicks on Rainwater Management
    And User has to click on FormV01 button of Rainwater Management
    Then User should be able to see the Rainwater Management form
