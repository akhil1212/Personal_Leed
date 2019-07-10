#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	11.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 11.06.2019
# Feature Name: Verifying uploaded files in Rainwater Management Form
# Feature Description:Verifying uploaded files in Rainwater Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Rainwater Management Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files for rainfall events calculator or equivalent documentation
    Given User has to see the table of uploaded files on rainfall events calculator or equivalent documentation
    Then User verifies the file name uploaded with the file name present in the table of rainfall events calculator or equivalent documentation

  #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files for calculations of impervious surfaces
    Given User has to see the table of uploaded files on calculations of impervious surfaces
    Then User verifies the file name uploaded with the file name present in the table of calculations of impervious surfaces

  #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files for documents that thoroughly depict the green infrastructure techniques used
    Given User has to see the table of uploaded files on documents that thoroughly depict the green infrastructure techniques used
    Then User verifies the file name uploaded with the file name present in the table of documents that thoroughly depict the green infrastructure techniques used

  #Scenario-4
  @SmokeTest
  Scenario: Verifying uploaded files for document or narrative describing the annual inspection and maintenance program
    Given User has to see the table of uploaded files on document or narrative describing the annual inspection and maintenance program
    Then User verifies the file name uploaded with the file name present in the table of document or narrative describing the annual inspection and maintenance program

  #Scenario-5
  @SmokeTest
  Scenario: Verifying uploaded files for additional documents in special circumstances in Rainwater Management
    Given User has to see the table of uploaded files on additional documents in special circumstances in Rainwater Management
    Then User verifies the file name uploaded with the file name present in the table of additional documents in special circumstances in Rainwater Management
