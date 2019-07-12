#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                         Reviewer    :
# Date   : 	11.07.2019											                                                         Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 11.07.2019
# Feature Name: Download files from Heat Island Reduction Form
# Feature Description: Download files from Heat Island Reduction Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Heat Island Reduction Form

#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of additional documentation in HIR Form
  Given User has to see the table of uploaded files on additional documentation in HIR Form
  When User downloads the uploaded files of additional documentation in HIR Form
  Then User can see the downloaded file of additional documentation in HIR Form successfully