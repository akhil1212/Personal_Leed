#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	19.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 19.06.2019
# Feature Name: Verifying uploaded files in Environmental Tobacco Smoke Control Form
# Feature Description: Verifying uploaded files in Environmental Tobacco Smoke Control Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Environmental Tobacco Smoke Control Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files in No-smoking policy document
    Given User has to see the table of uploaded files on No-smoking policy document
    Then User verifies the file name uploaded with the file name present in the table of No-smoking policy document

  #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files in scaled site plan
    Given User has to see the table of uploaded files on scaled site plan
    Then User verifies the file name uploaded with the file name present in the table of scaled site plan

  #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files in information about the code
    Given User has to see the table of uploaded files on information about the code
    Then User verifies the file name uploaded with the file name present in the table of information about the code

  #Scenario-4
  @SmokeTest
  Scenario: Verifying uploaded files in weather stripping and sealing
    Given User has to see the table of uploaded files on weather stripping and sealing
    Then User verifies the file name uploaded with the file name present in the table of weather stripping and sealing

  #Scenario-5
  @SmokeTest
  Scenario: Verifying uploaded files in differential air pressure test report
    Given User has to see the table of uploaded files on differential air pressure test report
    Then User verifies the file name uploaded with the file name present in the table of differential air pressure test report

  #Scenario-6
  @SmokeTest
  Scenario: Verifying uploaded files in special circumstances in Environmental Tobacco Smoke Control
    Given User has to see the table of uploaded files on special circumstances in Environmental Tobacco Smoke Control
    Then User verifies the file name uploaded with the file name present in the table of special circumstances in Environmental Tobacco Smoke Control
