#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Download uploaded files in Green Cleaning Policy Form- Custodial effectiveness assessment
# Feature Description: Download uploaded files in Green Cleaning Policy Form - Custodial effectiveness assessment which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Green Cleaning Policy Form- Custodial effectiveness assessment


#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of Upload for custodial effectiveness audit in Green Cleaning 
  Given User has to see the table of uploaded files of custodial effectiveness audit in Green Cleaning 
  When User downloads the uploaded files of custodial effectiveness audit in Green Cleaning
  Then User can see the downloaded file of custodial effectiveness audit in Green Cleaning successfully 
  
  
  #Scenario-2
  @SmokeTest
  Scenario: Downloading the files of Upload for additional documentation in Green Cleaning 
  Given User has to see the table of uploaded files of additional documentation in Green Cleaning    
  When User downloads the uploaded files of additional documentation in Green Cleaning  
  Then User can see the downloaded file of additional documentation in Green Cleaning