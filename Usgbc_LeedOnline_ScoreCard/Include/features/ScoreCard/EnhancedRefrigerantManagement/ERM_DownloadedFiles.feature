#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                                     Reviewer    :
# Date   : 	04.07.2019											                                                           Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 04.07.2019
# Feature Name: Downloading uploaded files in Enhanced Refrigerant Management Form
# Feature Description: Downloading uploaded files in Enhanced Refrigerant Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Downloading uploaded files in Enhanced Refrigerant Management Form

	#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of Upload for refrigerant equipment schedule in ERM Form 
   Given User has to see the table of uploaded files on refrigerant equipment schedule 
  When User downloads the uploaded files of refrigerant equipment schedule in ERM Form
  Then User can see the downloaded file of refrigerant equipment schedule in ERM Form successfully 
  
  
  #Scenario-2
  @SmokeTest
  Scenario: Downloading the files of Upload for additional documentation in ERM Form 
  Given User has to see the table of uploaded files on special circumstances in ERM Form
  When User downloads the uploaded files of additional documentation in ERM Form  
  Then User can see the downloaded file of additional documentation in ERM Form