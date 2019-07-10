#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	13.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 13.06.2019
# Feature Name: Download uploaded files in Green Cleaning Policy Form- Entryway systems
# Feature Description: Download uploaded files in Green Cleaning Policy Form - Entryway systems which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Green Cleaning Policy Form- Custodial effectiveness assessment


#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of Upload for photos, drawings in Green Cleaning
  Given User has to see the table of uploaded files of photos, drawings in Green Cleaning 
  When User downloads the uploaded files of photos, drawings in Green Cleaning
  Then User can see the downloaded file of photos, drawings in Green Cleaning successfully 
  
  