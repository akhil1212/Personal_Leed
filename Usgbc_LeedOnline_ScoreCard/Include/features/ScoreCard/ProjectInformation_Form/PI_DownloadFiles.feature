#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	25.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 25.06.2019
# Feature Name: Downloading and verifying the uploaded files from Project Information Form
# Feature Description: Downloading and verifying the uploaded files from Project Information Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Downloading and verifying the uploaded files from Project Information Form

  #Scenario-1
  @SmokeTest
  Scenario: Downloading the uploaded files for a site plan identifying the LEED project boundary
    Given User has to see the table of uploaded files on a site plan identifying the LEED project boundary
    When User downloads the uploaded files of a site plan identifying the LEED project boundary
    Then User can see the downloaded files of a site plan identifying the LEED project boundary

  #Scenario-2
  @SmokeTest
  Scenario: Downloading the uploaded files for the representative floor plans for the project
    Given User has to see the table of uploaded files on the representative floor plans for the project
    When User downloads the uploaded files of the representative floor plans for the project
    Then User can see the downloaded files of the representative floor plans for the project

  #Scenario-3
  @SmokeTest
  Scenario: Downloading the uploaded files for the mechanical schedules and plans and or drawings
    Given User has to see the table of uploaded files on the mechanical schedules and plans and or drawings
    When User downloads the uploaded files of the mechanical schedules and plans and or drawings
    Then User can see the downloaded files of the mechanical schedules and plans and or drawings

  #Scenario-4
  @SmokeTest
  Scenario: Downloading the uploaded files for the photos or a video walkthrough of the project, both inside and outside
    Given User has to see the table of uploaded files on the photos or a video walkthrough of the project
    When User downloads the uploaded files of the photos or a video walkthrough of the project
    Then User can see the downloaded files of the photos or a video walkthrough of the project

  #Scenario-5
  @SmokeTest
  Scenario: Downloading the uploaded files for the completed Performance Periods Table
    Given User has to see the table of uploaded files on the completed Performance Periods Table
    When User downloads the uploaded files of the completed Performance Periods Table
    Then User can see the downloaded files of the completed Performance Periods Table

  #Scenario-6
  @SmokeTest
  Scenario: Downloading the uploaded files for special circumstances for Project Information
    Given User has to see the table of uploaded files on special circumstances for Project Information
    When User downloads the uploaded files of special circumstances for Project Information
    Then User can see the downloaded files of special circumstances for Project Information
