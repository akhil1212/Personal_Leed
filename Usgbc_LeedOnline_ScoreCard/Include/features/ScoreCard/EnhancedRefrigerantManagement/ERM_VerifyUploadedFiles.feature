#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                                     Reviewer    :
# Date   : 	04.07.2019											                                                           Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 04.07.2019
# Feature Name: Verifying uploaded files in Enhanced Refrigerant Management Form
# Feature Description: Verifying uploaded files in Enhanced Refrigerant Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Enhanced Refrigerant Management Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files in refrigerant equipment schedule
    Given User has to see the table of uploaded files on refrigerant equipment schedule
    Then User verifies the file name uploaded with the file name present in the table of refrigerant equipment schedule

  #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files in special circumstances in ERM Form
    Given User has to see the table of uploaded files on special circumstances in ERM Form
    Then User verifies the file name uploaded with the file name present in the table of special circumstances in ERM Form
