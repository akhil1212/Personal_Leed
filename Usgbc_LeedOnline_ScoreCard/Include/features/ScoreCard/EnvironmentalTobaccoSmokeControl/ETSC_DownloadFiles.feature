#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	20.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 20.06.2019
# Feature Name: Downloading and verifying the uploaded files from Environmental Tobacco Smoke Control Form
# Feature Description: Downloading and verifying the uploaded files from Environmental Tobacco Smoke Control Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Downloading and verifying the uploaded files from Environmental Tobacco Smoke Control

  #Scenario-1
  @SmokeTest
  Scenario: Downloading the uploaded files for No-smoking policy document
    Given User has to see the table of uploaded files on No-smoking policy document
    When User downloads the uploaded files of No-smoking policy document
    Then User can see the downloaded file of No-smoking policy document

  #Scenario-2
  @SmokeTest
  Scenario: Downloading the uploaded files for scaled site plan
    Given User has to see the table of uploaded files on scaled site plan
    When User downloads the uploaded files of scaled site plan
    Then User can see the downloaded file of scaled site plan

  #Scenario-3
  @SmokeTest
  Scenario: Downloading the uploaded files for information about the code
    Given User has to see the table of uploaded files on information about the code
    When User downloads the uploaded files of information about the code
    Then User can see the downloaded file of information about the code

  #Scenario-4
  @SmokeTest
  Scenario: Downloading the uploaded files for weather stripping and sealing
    Given User has to see the table of uploaded files on weather stripping and sealing
    When User downloads the uploaded files of weather stripping and sealing
    Then User can see the downloaded file of weather stripping and sealing

  #Scenario-5
  @SmokeTest
  Scenario: Downloading the uploaded files for differential air pressure test report
    Given User has to see the table of uploaded files on differential air pressure test report
    When User downloads the uploaded files of differential air pressure test report
    Then User can see the downloaded file of differential air pressure test report

  #Scenario-6
  @SmokeTest
  Scenario: Downloading the uploaded files for special circumstances in Environmental Tobacco Smoke Control
    Given User has to see the table of uploaded files on special circumstances in Environmental Tobacco Smoke Control
    When User downloads the uploaded files of special circumstances in Environmental Tobacco Smoke Control
    Then User can see the downloaded file of special circumstances in Environmental Tobacco Smoke Control
