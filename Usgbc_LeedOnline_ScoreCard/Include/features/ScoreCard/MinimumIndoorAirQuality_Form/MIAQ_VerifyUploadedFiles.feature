#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	14.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 14.06.2019
# Feature Name: Verifying uploaded files in Minimum Indoor Air Quality Form
# Feature Description: Verifying uploaded files in Minimum Indoor Air Quality Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Minimum Indoor Air Quality Form

#Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files in Minimum Indoor Air Quality Calculator
    Given User has to see the table of uploaded files on minimum indoor air quality calculator
    Then User verifies the file name uploaded with the file name present in the table of minimum indoor air quality calculator
    
    
  #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files in special circumstances for Minimum Indoor Air Quality
    Given User has to see the table of uploaded files on special circumstances for Minimum Indoor Air Quality
    Then User verifies the file name uploaded with the file name present in the table of special circumstances for Minimum Indoor Air Quality