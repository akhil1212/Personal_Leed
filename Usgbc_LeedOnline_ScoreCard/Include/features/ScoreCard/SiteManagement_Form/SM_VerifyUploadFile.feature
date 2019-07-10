
# Authors : 																                                                     Reviewer    :
# Date   : 										                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On:
# Feature Name: Verifying uploaded files in Site Management Form
# Feature Description: Verifying uploaded files in Site Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Site Management Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files of the Site Assessment in SM Form
    Given User has to see the table of uploaded files on Site Assessment in SM Form
    Then User verifies the file name uploaded with the file name present in the table Site Assessment in SM Form

 
  #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files of Documentation demonstrating in SM Form
    Given User has to see the table of uploaded files on Documentation demonstrating in SM Form
  	Then User verifies the file name uploaded with the file name present in the table Documentation demonstrating in SM Form
  
 #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files of additional documentation in SM Form
    Given User has to see the table of uploaded files on additional documentation in SM Form
    Then User verifies the file name uploaded with the file name present in the table additional documentation in SM Form

