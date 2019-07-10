#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	14.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 14.06.2019
# Feature Name: Delete uploaded files in Green Cleaning Form- Entryway systems
# Feature Description: Delete uploaded files in Green Cleaning Form - Entryway systems which is Option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Green Cleaning Form- Entryway systems

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from photos, drawings in Green Cleaning Form
    Given User has to see the table of uploaded files of photos, drawings in Green Cleaning 
    When User deletes the uploaded files of photos, drawings in Green Cleaning Form
    Then User can see all the photos, drawings in Green Cleaning Form are deleted