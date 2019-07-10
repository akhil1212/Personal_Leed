#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	14.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 14.06.2019
# Feature Name: Delete uploaded files in Green Cleaning Form- Custodial effectiveness assessment
# Feature Description: Delete uploaded files in Green Cleaning Form - Custodial effectiveness assessment which is Option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Green Cleaning Form- Custodial effectiveness assessment

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from custodial effectiveness audit in Green Cleaning Form
    Given User has to see the table of uploaded files of custodial effectiveness audit in Green Cleaning
    When User deletes the uploaded files of custodial effectiveness audit in Green Cleaning Form
    Then User can see all the custodial effectiveness audit in Green Cleaning Form are deleted