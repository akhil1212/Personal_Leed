#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	11.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 11.06.2019
# Feature Name: Deleting the uploaded files in Rainwater Management Form
# Feature Description: Deleting the uploaded files in Rainwater Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files from Rainwater Management Form

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from rainfall events calculator or equivalent documentation
    Given User has to see the table of uploaded files on rainfall events calculator or equivalent documentation
    When User deletes the uploaded files of rainfall events calculator or equivalent documentation
    Then User can see all the rainfall events calculator or equivalent documentation files are deleted

  #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from calculations of impervious surfaces
    Given User has to see the table of uploaded files on calculations of impervious surfaces
    When User deletes the uploaded files of calculations of impervious surfaces
    Then User can see all the calculations of impervious surfaces files are deleted

  #Scenario-3
  @DeleteFiles
  Scenario: Deleting files from documents that thoroughly depict the green infrastructure techniques used
    Given User has to see the table of uploaded files on documents that thoroughly depict the green infrastructure techniques used
    When User deletes the uploaded files of documents that thoroughly depict the green infrastructure techniques used
    Then User can see all the documents that thoroughly depict the green infrastructure techniques used files are deleted

  #Scenario-4
  @DeleteFiles
  Scenario: Deleting files from document or narrative describing the annual inspection and maintenance program
    Given User has to see the table of uploaded files on document or narrative describing the annual inspection and maintenance program
    When User deletes the uploaded files of document or narrative describing the annual inspection and maintenance program
    Then User can see all the document or narrative describing the annual inspection and maintenance program files are deleted

  #Scenario-5
  @DeleteFiles
  Scenario: Deleting files from additional documents in special circumstances in Rainwater Management
    Given User has to see the table of uploaded files on additional documents in special circumstances in Rainwater Management
    When User deletes the uploaded files of additional documents in special circumstances in Rainwater Management
    Then User can see all the additional documents in special circumstances in Rainwater Management files are deleted
