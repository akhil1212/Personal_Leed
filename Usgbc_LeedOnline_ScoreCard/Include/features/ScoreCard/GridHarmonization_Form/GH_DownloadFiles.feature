#---------------------------------------------------------------------------------------------------------------------------------
# Authors : 																                                                     Reviewer    :
# Date   : 												                                                                     Reviewed On :
# Last Updated By: 
# Last Updated On: 
# Feature Name: Download uploaded files in Grid Harmonization Form- Permanent Load Shifting and Demand Response Program
# Feature Description: Download uploaded files in Grid Harmonization Form - Permanent Load Shifting which is Case3 and Demand Response Program which is Case1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Grid Harmonization Form- Permanent Load Shifting and Demand Response Program

#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of Upload for Permanent Load Shifting in Grid Harmonization
  Given User has to see the table of uploaded files of summary in Grid Harmonization 
  When User downloads the uploaded files of summary for Permanent Load Shifting in GH Form
  Then User can see the downloaded file of summary for Permanent Load Shifting in GH successfully 


  #Scenario-2
  @SmokeTest
  Scenario: Downloading the files of Upload for Demand Response Program in Grid Harmonization
  Given User has to see the table of uploaded files of Proof of enrollement in Grid Harmonization
  When User downloads the uploaded files of enrollement Demand Response Program in GH Form
  Then User can see the downloaded file of enrollement Demand Response Program in GH successfully 
  
  
  #Scenario-3
  @SmokeTest
  Scenario: Downloading the files of Upload for additional documentation in Grid Harmonization
  Given User has to see the table of uploaded files of additional documentation in Grid Harmonization    
  When User downloads the uploaded files of additional documentation in GH Form
  Then User can see the downloaded file of additional documentation in GH Form
  And User should clear the form draft by clicking on clear draft
  And User should click on Yes button to clear draft