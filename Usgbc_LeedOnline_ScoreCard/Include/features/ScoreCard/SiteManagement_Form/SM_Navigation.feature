#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 														                                             					        Reviewer    :
# Date   : 											                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Navigating to Site Management Form
# Feature Description: Navigating to Site Management Form after login
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Site Management Form

 #Scenario-1
 @SmokeTest
  Scenario: User navigates to Site Management Form
    Given User should be on credits page
    And User can see Site Management under Sustainable Sites
    And User has to select the status to Attempted for Site Management
    When User clicks on Site Management
    And User has to click on FormV01 button of Site Management
    Then User should be able to see the Site Management form