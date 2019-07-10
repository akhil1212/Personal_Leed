#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	14.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 14.06.2019
# Feature Name: Downloading and verifying the uploaded files from Minimum Indoor Air Quality Form
# Feature Description: Downloading and verifying the uploaded files from Minimum Indoor Air Quality Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Downloading and verifying the uploaded files from Minimum Indoor Air Quality Form


 #Scenario-1
  @SmokeTest
  Scenario: Downloading the uploaded files for Minimum Indoor Air Quality Calculator
    Given User has to see the table of uploaded files on minimum indoor air quality calculator
    When User downloads the uploaded files of minimum indoor air quality calculatorn
    Then User can see the downloaded file of minimum indoor air quality calculator
    
    
    
   #Scenario-2
  @SmokeTest
  Scenario: Downloading the uploaded files for special circumstances in Minimum Indoor Air Quality Calculator
    Given User has to see the table of uploaded files on special circumstances for Minimum Indoor Air Quality    
    When User downloads the uploaded files of special circumstances for Minimum Indoor Air Quality 
    Then User can see the downloaded file of special circumstances for Minimum Indoor Air Quality 