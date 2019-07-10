#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	27.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 27.06.2019
# Feature Name: Navigating to USGBC Purchasing Policy Form
# Feature Description: Navigating to USGBC Purchasing Policy Form after login
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Purchasing Policy Form


#Scenario-1
  @SmokeTest
  Scenario: User navigates to Purchasing Policy Form
    Given User should be on credits page
    And User can see Purchasing Policy under Materials And Resources
    And User has to select the status to Attempted for Purchasing Policy
    When User clicks on Purchasing Policy
    And User has to click on FormV01 button of Purchasing Policy
    Then User should be able to see the Purchasing Policy form