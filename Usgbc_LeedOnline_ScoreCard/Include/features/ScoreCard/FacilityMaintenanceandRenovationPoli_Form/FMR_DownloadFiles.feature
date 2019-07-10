#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Download uploaded files in Facility Maintenance and Renovation Policy Form
# Feature Description: Download uploaded files in Facility Maintenance and Renovation Policy Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Facility Maintenance and Renovation Policy Form


#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of Base building in FMR Form
  Given User has to see the table of uploaded files on Base building in FMR Form 
  When User downloads the uploaded files of Base building in FMR Form
  Then User can see the downloaded file of Base building in FMR Form successfully 
  
  #Scenario-2
  @SmokeTest
  Scenario: Downloading the files of Furniture and furnishings in FMR Form
  Given User has to see the table of uploaded files on Furniture and furnishings in FMR Form
  When User downloads the uploaded files of Furniture and furnishings in FMR Form
  Then User can see the downloaded file of Furniture and furnishings in FMR Form successfully
   
  #Scenario-3
  @SmokeTest
  Scenario: Downloading the files of MR Credit Purchasing in FMR Form
  Given User has to see the table of uploaded files on MR Credit Purchasing in FMR Form 
  When User downloads the uploaded files of MR Credit Purchasing in FMR Form
  Then User can see the downloaded file of MR Credit Purchasing in FMR Form successfully 
  
  #Scenario-4
  @SmokeTest
  Scenario: Downloading the files of Information in Waste Management FMR Form
  Given User has to see the table of uploaded files on Information in Waste Management FMR Form 
  When User downloads the uploaded files of Information in Waste Management FMR Form
  Then User can see the downloaded file of Information in Waste Management FMR Form successfully 
  
  #Scenario-5
  @SmokeTest
  Scenario: Downloading the files of diversion strategies in Waste Management FMR Form
  Given User has to see the table of uploaded files on diversion strategies in Waste Management FMR Form
  When User downloads the uploaded files of diversion strategies in Waste Management FMR Form
  Then User can see the downloaded file of diversion strategies in Waste Management FMR Form successfully 
  
  #Scenario-6
  @SmokeTest
  Scenario: Downloading the files of Recommended design in Indoor Air Quality FMR Form
 	Given User has to see the table of uploaded files on Recommended design in Indoor Air Quality FMR Form
  When User downloads the uploaded files of Recommended design in Indoor Air Quality FMR Form
  Then User can see the downloaded file of Recommended design in Indoor Air Quality FMR Form successfully 
  
  #Scenario-7
  @SmokeTest
  Scenario: Downloading the files of reoccupying the space in Indoor Air Quality FMR Form
  Given User has to see the table of uploaded files on reoccupying the space in Indoor Air Quality FMR Form
  When User downloads the uploaded files of reoccupying the space in Indoor Air Quality FMR Form
  Then User can see the downloaded file of reoccupying the space in Indoor Air Quality FMR Form successfully 

  #Scenario-8
  @SmokeTest
  Scenario: Downloading the files of construction ends in Indoor Air Quality FMR Form
  Given User has to see the table of uploaded files on construction ends in Indoor Air Quality FMR Form
  When User downloads the uploaded files of construction ends in Indoor Air Quality FMR Form
  Then User can see the downloaded file of construction ends in Indoor Air Quality FMR Form successfully 
    
  #Scenario-9
  @SmokeTest
  Scenario: Downloading the files of additional documentation in FMR Form
  Given User has to see the table of uploaded files on additional documentation in FMR Form 
  When User downloads the uploaded files of additional documentation in FMR Form 
  Then User can see the downloaded file of additional documentation in FMR Form successfully