#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	13.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 13.06.2019
# Feature Name: Verifying uploaded files in Green Cleaning Form-Custodial effectiveness assessment
# Feature Description: Verifying uploaded files in Green Cleaning Form -  Custodial effectiveness assessment which is option 1
#--------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Green Cleaning Policy Form-Custodial effectiveness assessment

 #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files of custodial effectiveness audit in Green Cleaning
    Given User has to see the table of uploaded files of custodial effectiveness audit in Green Cleaning
    Then User verifies the file name uploaded with the file name present in the table custodial effectiveness audit in Green Cleaning


#Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files of additional documentation in Green Cleaning
    Given User has to see the table of uploaded files of additional documentation in Green Cleaning
    Then User verifies the file name uploaded with the file name present in the table additional documentation in Green Cleaning
    