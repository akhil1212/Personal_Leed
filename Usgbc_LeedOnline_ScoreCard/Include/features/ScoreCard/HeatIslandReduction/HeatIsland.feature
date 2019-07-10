#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	10.07.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 10.07.2019
# Feature Name: Filling the Green Cleaning Form- Custodial effectiveness assessment
# Feature Description: Filling the Green Cleaning Form- Custodial effectiveness assessment which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Green Cleaning Form- Custodial effectiveness assessment

		#Scenario-1
	  @SmokeTest
	  Scenario: User selects an option Custodial effectiveness assessment
    Given User should see the radio button option Custodial effectiveness assessment
    When User clicks on Custodial effectiveness assessment option
    Then User should see the contents for Custodial effectiveness assessment option
    