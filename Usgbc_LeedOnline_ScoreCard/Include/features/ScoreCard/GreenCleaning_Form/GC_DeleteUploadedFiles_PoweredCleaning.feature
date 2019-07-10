#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	14.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 14.06.2019
# Feature Name: Delete uploaded files in Green Cleaning Form- Powered cleaning equipment
# Feature Description: Delete uploaded files in Green Cleaning Form - Powered cleaning equipment Form which is Option 3
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Green Cleaning Form- Powered cleaning equipment

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from Green Cleaning Calculator in Green Cleaning Form
    Given User has to see the table of uploaded files of Green Cleaning Calculator in Green Cleaning
    When User deletes the uploaded files of Green Cleaning Calculator in Green Cleaning Form
    Then User can see all the Green Cleaning Calculator in Green Cleaning Form are deleted