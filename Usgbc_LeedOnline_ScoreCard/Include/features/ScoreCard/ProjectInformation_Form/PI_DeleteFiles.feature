#--------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	25.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 25.06.2019
# Feature Name: Deleting the uploaded files from Project Information Form
# Feature Description: Deleting the uploaded files from Project Information Form
#--------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files from Project Information Form

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from a site plan identifying the LEED project boundary
    Given User has to see the table of uploaded files on a site plan identifying the LEED project boundary
    When User deletes the uploaded files of a site plan identifying the LEED project boundary
    Then User can see all the site plan identifying the LEED project boundary files are deleted

  #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from the representative floor plans for the project
    Given User has to see the table of uploaded files on the representative floor plans for the project
    When User deletes the uploaded files of the representative floor plans for the project
    Then User can see all the representative floor plans for the project files are deleted

  #Scenario-3
  @DeleteFiles
  Scenario: Deleting files from the mechanical schedules and plans and or drawings
    Given User has to see the table of uploaded files on the mechanical schedules and plans and or drawings
    When User deletes the uploaded files of the mechanical schedules and plans and or drawings
    Then User can see all the mechanical schedules and plans and or drawings files are deleted

  #Scenario-4
  @DeleteFiles
  Scenario: Deleting files from the photos or a video walkthrough of the project, both inside and outside
    Given User has to see the table of uploaded files on the photos or a video walkthrough of the project
    When User deletes the uploaded files of the photos or a video walkthrough of the project
    Then User can see all the photos or a video walkthrough of the project files are deleted

  #Scenario-5
  @DeleteFiles
  Scenario: Deleting files from the completed Performance Periods Table
    Given User has to see the table of uploaded files on the completed Performance Periods Table
    When User deletes the uploaded files of the completed Performance Periods Table
    Then User can see all the completed Performance Periods Table files are deleted

  #Scenario-6
  @DeleteFiles
  Scenario: Deleting files from special circumstances for Project Information
    Given User has to see the table of uploaded files on special circumstances for Project Information
    When User deletes the uploaded files of special circumstances for Project Information
    Then User can see all the special circumstances for Project Information files are deleted
