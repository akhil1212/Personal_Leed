#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                         Reviewer    :
# Date   : 	10.07.2019											                                                         Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 10.07.2019
# Feature Name: Verifying uploaded files in Heat Island Reduction Form
# Feature Description: Verifying uploaded files in Heat Island Reduction Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Heat Island Reduction Form

   #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files in additional documentation in HIR Form
    Given User has to see the table of uploaded files on additional documentation in HIR Form
    Then User verifies the file name uploaded with the file name present in the table of additional documentation in HIR Form
    
    