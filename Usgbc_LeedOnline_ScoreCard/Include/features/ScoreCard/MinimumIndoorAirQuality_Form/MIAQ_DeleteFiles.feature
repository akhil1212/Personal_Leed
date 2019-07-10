#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	14.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 14.06.2019
# Feature Name: Downloading and verifying the uploaded files from Minimum Indoor Air Quality Form
# Feature Description: Downloading and verifying the uploaded files from Minimum Indoor Air Quality Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files from Minimum Indoor Air Quality Form


 #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from Minimum Indoor Air Quality Calculator
    Given User has to see the table of uploaded files on minimum indoor air quality calculator
    When User deletes the uploaded files of minimum indoor air quality calculator
    Then User can see all the minimum indoor air quality calculator files are deleted
    
    
  #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from special circumstances in Minimum Indoor Air Quality Calculator
   Given User has to see the table of uploaded files on special circumstances for Minimum Indoor Air Quality    
 		When User deletes the uploaded files of special circumstances in Minimum Indoor Air Quality
    Then User can see all the special circumstances files in Minimum Indoor Air Quality are deleted