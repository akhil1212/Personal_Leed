#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	20.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 20.06.2019
# Feature Name: Deleting the uploaded files from Environmental Tobacco Smoke Control Form
# Feature Description: Deleting the uploaded files from Environmental Tobacco Smoke Control Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files from Environmental Tobacco Smoke Control

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from No-smoking policy document
    Given User has to see the table of uploaded files on No-smoking policy document
    When User deletes the uploaded files of No-smoking policy document
    Then User can see all the No-smoking policy document files are deleted

  #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from scaled site plan
    Given User has to see the table of uploaded files on scaled site plan
    When User deletes the uploaded files of scaled site plan
    Then User can see all the scaled site plan files are deleted

  #Scenario-3
  @DeleteFiles
  Scenario: Deleting files from information about the code
    Given User has to see the table of uploaded files on information about the code
    When User deletes the uploaded files of information about the code
    Then User can see all the information about the code files are deleted

  #Scenario-4
  @DeleteFiles
  Scenario: Deleting files from weather stripping and sealing
    Given User has to see the table of uploaded files on weather stripping and sealing
    When User deletes the uploaded files of weather stripping and sealing
    Then User can see all the weather stripping and sealing files are deleted

  #Scenario-5
  @DeleteFiles
  Scenario: Deleting files from differential air pressure test report
    Given User has to see the table of uploaded files on differential air pressure test report
    When User deletes the uploaded files of differential air pressure test report
    Then User can see all the differential air pressure test report files are deleted

  #Scenario-6
  @DeleteFiles
  Scenario: Deleting files from special circumstances in Environmental Tobacco Smoke Control
    Given User has to see the table of uploaded files on special circumstances in Environmental Tobacco Smoke Control
    When User deletes the uploaded files of special circumstances in Environmental Tobacco Smoke Control
    Then User can see all the special circumstances in Environmental Tobacco Smoke Control files are deleted
