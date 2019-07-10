#---------------------------------------------------------------------------------------------------------------------------------
# Authors :																			                                                     Reviewer    :
# Date   : 										                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On:
# Feature Name: Download uploaded files in Site Management Form
# Feature Description: Download uploaded files in Site Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Site Management Form


#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of Site Assessment in SM Form
  Given User has to see the table of uploaded files on Site Assessment in SM Form
  When User downloads the uploaded files of Site Assessment in SM Form
  Then User can see the downloaded file of Site Assessment in SM Form successfully 
  
  #Scenario-2
  @SmokeTest
  Scenario: Downloading the files of Documentation demonstrating in SM Form
  Given User has to see the table of uploaded files on Documentation demonstrating in SM Form
  When User downloads the uploaded files of Documentation demonstrating in SM Form
  Then User can see the downloaded file of Documentation demonstrating in SM Form successfully
  
  #Scenario-3
  @SmokeTest
  Scenario: Downloading the files of additional documentation in SM Form
  Given User has to see the table of uploaded files on additional documentation in SM Form 
  When User downloads the uploaded files of additional documentation in SM Form 
  Then User can see the downloaded file of additional documentation in SM Form successfully
   