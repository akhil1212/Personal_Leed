#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	25.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 25.06.2019
# Feature Name: Verifying uploaded files in Project Information Form
# Feature Description: Verifying uploaded files in Project Information Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Project Information Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files in a site plan identifying the LEED project boundary
    Given User has to see the table of uploaded files on a site plan identifying the LEED project boundary
    Then User verifies the file name uploaded with the file name present in the table of a site plan identifying the LEED project boundary

  #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files in the representative floor plans for the project
    Given User has to see the table of uploaded files on the representative floor plans for the project
    Then User verifies the file name uploaded with the file name present in the table of the representative floor plans for the project

  #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files in the mechanical schedules and plans and or drawings
    Given User has to see the table of uploaded files on the mechanical schedules and plans and or drawings
    Then User verifies the file name uploaded with the file name present in the table of the mechanical schedules and plans and or drawings

  #Scenario-4
  @SmokeTest
  Scenario: Verifying uploaded files in the photos or a video walkthrough of the project, both inside and outside
    Given User has to see the table of uploaded files on the photos or a video walkthrough of the project
    Then User verifies the file name uploaded with the file name present in the table of the photos or a video walkthrough of the project

  #Scenario-5
  @SmokeTest
  Scenario: Verifying uploaded files in the completed Performance Periods Table
    Given User has to see the table of uploaded files on the completed Performance Periods Table
    Then User verifies the file name uploaded with the file name present in the table of the completed Performance Periods Table

  #Scenario-6
  @SmokeTest
  Scenario: Verifying uploaded files in special circumstances for Project Information
    Given User has to see the table of uploaded files on special circumstances for Project Information
    Then User verifies the file name uploaded with the file name present in the table of special circumstances for Project Information
