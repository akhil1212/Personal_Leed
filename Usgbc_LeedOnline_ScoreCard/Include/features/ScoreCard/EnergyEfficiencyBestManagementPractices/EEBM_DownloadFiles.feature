#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	24.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 24.06.2019
# Feature Name: Download uploaded files in Energy Efficiency Best Management practices Form
# Feature Description: Download uploaded files in Energy Efficiency Best Management practices Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Energy Efficiency Best Management practices Form

#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of ASHRAE preliminary energy in EEBM Form
  Given User has to see the table of uploaded files on ASHRAE preliminary energy in EEBM Form
  When User downloads the uploaded files of ASHRAE preliminary energy in EEBM Form
  Then User can see the downloaded file of ASHRAE preliminary energy in EEBM Form successfully 
  
#Scenario-2
  @SmokeTest
  Scenario: Downloading the files of current facility requirements in EEBM Form
  Given User has to see the table of uploaded files on current facility requirements in EEBM Form
  When User downloads the uploaded files of current facility requirements in EEBM Form
  Then User can see the downloaded file of current facility requirements in EEBM Form successfully   
  
  
  #Scenario-3
  @SmokeTest
  Scenario: Downloading the files of DC Pro Profiling Tool in EEBM Form
  Given User has to see the table of uploaded files on DC Pro Profiling Tool in EEBM Form
  When User downloads the uploaded files of DC Pro Profiling Tool in EEBM Form
  Then User can see the downloaded file of DC Pro Profiling Tool in EEBM Form successfully 
  
  
  #Scenario-4
  @SmokeTest
  Scenario: Downloading the files of additional documentation in EEBM Form
  Given User has to see the table of uploaded files on additional documentation in EEBM Form
  When User downloads the uploaded files of additional documentation in EEBM Form
  Then User can see the downloaded file of additional documentation in EEBM Form successfully 