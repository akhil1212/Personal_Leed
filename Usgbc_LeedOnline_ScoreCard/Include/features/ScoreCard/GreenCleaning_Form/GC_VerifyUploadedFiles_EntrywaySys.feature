#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	13.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 13.06.2019
# Feature Name: Verifying uploaded files in Green Cleaning Form- Entryway Systems
# Feature Description: Verifying uploaded files in Green Cleaning Form - Entryway Systems which is option 2
#--------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Green Cleaning Policy Form- Entryway Systems

 #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files of photos, drawings in Green Cleaning
    Given User has to see the table of uploaded files of photos, drawings in Green Cleaning
    Then User verifies the file name uploaded with the file name present in the table photos, drawings in Green Cleaning

