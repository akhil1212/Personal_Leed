#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             					        Reviewer    :
# Date   : 	27.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 27.06.2019
# Feature Name: Navigating to Innovation Form
# Feature Description: Navigating to Innovation Form after login
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Innovation Form

 #Scenario-1
 @SmokeTest
  Scenario: User navigates to Innovation Form
    Given User should be on credits page 
    And User can see Innovation Form under Innovation
    And User has to select the status to Attempted for Innovation
    When User clicks on Innovation
    And User has to click on FormV01 button of Innovation
    Then User should be able to see the Innovation form