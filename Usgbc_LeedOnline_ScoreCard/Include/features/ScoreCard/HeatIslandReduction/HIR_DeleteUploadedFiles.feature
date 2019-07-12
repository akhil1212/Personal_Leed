#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                         Reviewer    :
# Date   : 	10.07.2019											                                                         Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 10.07.2019
# Feature Name: Deleting the uploaded files in Heat Island Reduction Form
# Feature Description: Deleting the uploaded files in Heat Island Reduction Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Heat Island Reduction Form

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from additional documentation in HIR Form
    Given User has to see the table of uploaded files on additional documentation in HIR Form
    When User deletes the uploaded files of additional documentation in HIR Form
    Then User can see all the additional documentation in HIR Form are deleted