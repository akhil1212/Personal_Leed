#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             					        Reviewer    :
# Date   : 	10.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 10.06.2019
# Feature Name: Navigating to Facility Maintenance and Renovation policy Form
# Feature Description: Navigating to Facility Maintenance and Renovation policy Form after login
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Facility Maintenance and Renovation policy Form

 #Scenario-1
 @SmokeTest
  Scenario: User navigates to Facility Maintenance and Renovation policy Form
    Given User should be on credits page 
    And User can see Facility Maintenance and Renovation policy under Materials and Resources
    And User has to select the status to Attempted for Facility Maintenance and Renovation policy 
    When User clicks on Facility Maintenance and Renovation policy
    And User has to click on FormV01 button of Facility Maintenance and Renovation policy
    Then User should be able to see the Facility Maintenance and Renovation policy form