#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	13.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 13.06.2019
# Feature Name: Verifying uploaded files in Green Cleaning Form- Powered cleaning equipment
# Feature Description: Verifying uploaded files in Green Cleaning Form - Powered cleaning equipment which is option 2
#--------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Green Cleaning Policy Form- Powered cleaning equipment

 #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files of Green Cleaning Calculator in Green Cleaning
    Given User has to see the table of uploaded files of Green Cleaning Calculator in Green Cleaning
    Then User verifies the file name uploaded with the file name present in the table Green Cleaning Calculator in Green Cleaning

#Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files of executed contract in Green Cleaning
    Given User has to see the table of uploaded files of executed contract in Green Cleaning
    Then User verifies the file name uploaded with the file name present in the table executed contract in Green Cleaning

    
 #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files of MSDS sheets in Green Cleaning
    Given User has to see the table of uploaded files of MSDS sheets in Green Cleaning
    Then User verifies the file name uploaded with the file name present in the table MSDS sheets in Green Cleaning
    