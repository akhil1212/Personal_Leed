#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	25.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 25.06.2019
# Feature Name: Navigating to USGBC Project Information Form
# Feature Description: Navigating to USGBC Project Information Form after login
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Project Information Form

  #Scenario-1
  @SmokeTest
  Scenario: User navigates to Project Information Form
    Given User should be on credits page
    And User can see Project Information under Project Information
    And User has to select the status to Attempted for Project Information
    When User clicks on Project Information
    And User has to click on FormV01 button of Project Information
    Then User should be able to see the Project Information form
