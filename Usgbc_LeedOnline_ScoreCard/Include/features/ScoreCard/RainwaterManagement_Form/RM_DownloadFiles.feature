#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	11.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 11.06.2019
# Feature Name: Downloading and verifying the uploaded files in Rainwater Management Form
# Feature Description: Downloading and verifying the uploaded files in Rainwater Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Downloading and verifying the uploaded files from Rainwater Management Form

  #Scenario-1
  @SmokeTest
  Scenario: Downloading the uploaded files for rainfall events calculator or equivalent documentation
    Given User has to see the table of uploaded files on rainfall events calculator or equivalent documentation
    When User downloads the uploaded files of rainfall events calculator or equivalent documentation
    Then User can see the downloaded file of rainfall events calculator or equivalent documentation

  #Scenario-2
  @SmokeTest
  Scenario: Downloading the uploaded files for calculations of impervious surfaces
    Given User has to see the table of uploaded files on calculations of impervious surfaces
    When User downloads the uploaded files of calculations of impervious surfaces
    Then User can see the downloaded file of calculations of impervious surfaces

  #Scenario-3
  @SmokeTest
  Scenario: Downloading the uploaded files for documents that thoroughly depict the green infrastructure techniques used
    Given User has to see the table of uploaded files on documents that thoroughly depict the green infrastructure techniques used
    When User downloads the uploaded files of documents that thoroughly depict the green infrastructure techniques used
    Then User can see the downloaded file of documents that thoroughly depict the green infrastructure techniques used

  #Scenario-4
  @SmokeTest
  Scenario: Downloading the uploaded files for document or narrative describing the annual inspection and maintenance program
    Given User has to see the table of uploaded files on document or narrative describing the annual inspection and maintenance program
    When User downloads the uploaded files of document or narrative describing the annual inspection and maintenance program
    Then User can see the downloaded file of document or narrative describing the annual inspection and maintenance program

  #Scenario-5
  @SmokeTest
  Scenario: Downloading the uploaded files for additional documents in special circumstances in Rainwater Management
    Given User has to see the table of uploaded files on additional documents in special circumstances in Rainwater Management
    When User downloads the uploaded files of additional documents in special circumstances in Rainwater Management
    Then User can see the downloaded file of additional documents in special circumstances in Rainwater Management
