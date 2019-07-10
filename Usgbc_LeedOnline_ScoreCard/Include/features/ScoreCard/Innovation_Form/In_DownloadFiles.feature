#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	27.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 27.06.2019
# Feature Name: Download uploaded files in Innovation Form
# Feature Description: Download uploaded files in Innovation Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Innovation Form


#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of LEED Accredited the Innovation
  Given User has to see the table of uploaded files on LEED Accredited in Innovation
  When User downloads the uploaded files of LEED Accredited in Innovation
  Then User can see the downloaded files of LEED Accredited Innovation successfully 
  
  #Scenario-2
  @SmokeTest
  Scenario: Downloading the files of required documentation in Innovation Form
  Given User has to see the table of uploaded files on required documentation in Innovation
  When User downloads the uploaded files of required documentation in Innovation
  Then User can see the downloaded file of required documentation in Innovation successfully   
  
  
  #Scenario-3
  @SmokeTest
  Scenario: Downloading the files of additional documentation in Innovation
  Given User has to see the table of uploaded files on additional documentation in Innovation
  When User downloads the uploaded files of additional documentation in Innovation
  Then User can see the downloaded file of additional documentation in Innovation successfully 
  
   #Scenario-4
  @SmokeTest
  Scenario: Downloading the files of supporting documentation in Innovation
    Given User should see the radio button option Innovation Strategy
    And User clicks on Innovation Strategy
   	And User has to see the table of uploaded files on supporting documentation in Innovation
  	When User downloads the uploaded files of supporting documentation in Innovation
  	Then User can see the downloaded file of supporting documentation in Innovation successfully 
    And User should see saving of draft after 10 seconds in Innovation
    And User clicks clear draft in Innovation
    