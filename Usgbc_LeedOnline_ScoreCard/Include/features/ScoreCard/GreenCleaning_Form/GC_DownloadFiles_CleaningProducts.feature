#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	13.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 13.06.2019
# Feature Name: Download uploaded files in Green Cleaning Policy Form- Cleaning products and materials
# Feature Description: Download uploaded files in Green Cleaning Policy Form - Cleaning products and materials which is option 4
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Green Cleaning Policy Form- Cleaning products and materials

#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of Upload for Green Cleaning Calculator in Green Cleaning
  Given User has to see the table of uploaded files of Green Cleaning Calculator in Green Cleaning 
  When User downloads the uploaded files of Green Cleaning Calculator in Green Cleaning
  Then User can see the downloaded file of Green Cleaning Calculator in Green Cleaning successfully 

#Scenario-2
  @SmokeTest
  Scenario: Downloading the files of Upload for executed contract in Green Cleaning
  Given User has to see the table of uploaded files of executed contract in Green Cleaning 
  When User downloads the uploaded files of executed contract in Green Cleaning
  Then User can see the downloaded file of executed contract in Green Cleaning successfully   
  
  
  #Scenario-3
  @SmokeTest
  Scenario: Downloading the files of Upload for MSDS sheets in Green Cleaning
  Given User has to see the table of uploaded files of MSDS sheets in Green Cleaning 
  When User downloads the uploaded files of MSDS sheets in Green Cleaning
  Then User can see the downloaded file of MSDS sheets in Green Cleaning successfully   
  