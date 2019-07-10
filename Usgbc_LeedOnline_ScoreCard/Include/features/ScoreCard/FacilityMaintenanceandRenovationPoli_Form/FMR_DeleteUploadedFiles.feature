#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	10.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 10.06.2019
# Feature Name: Delete uploaded files in Facility Maintenance and Renovation Policy Form
# Feature Description: Delete uploaded files in Facility Maintenance and Renovation Policy Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Facility Maintenance and Renovation Policy Form

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from Base building in FMR Form
    Given User has to see the table of uploaded files on Base building in FMR Form
    When User deletes the uploaded files of Base building in FMR Form
    Then User can see all the Base building in FMR Formt are deleted

 #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from Furniture and furnishings in FMR Form
    Given User has to see the table of uploaded files on Furniture and furnishings in FMR Form
    When User deletes the uploaded files of Furniture and furnishings in FMR Form
    Then User can see all the Furniture and furnishings in FMR Form are deleted
    
  #Scenario-3
  @DeleteFiles
  Scenario: Deleting files from MR Credit Purchasing in FMR Form
    Given User has to see the table of uploaded files on MR Credit Purchasing in FMR Form
    When User deletes the uploaded files of MR Credit Purchasing in FMR Form
    Then User can see all the MR Credit Purchasing in FMR Form are deleted
    
   #Scenario-4
  @DeleteFiles
  Scenario: Deleting files from Information in Waste Management FMR Form
    Given User has to see the table of uploaded files on Information in Waste Management FMR Form
    When User deletes the uploaded files of Information in Waste Management FMR Form
    Then User can see all the Information in Waste Management FMR Form are deleted

   #Scenario-5
  @DeleteFiles
  Scenario: Deleting files from diversion strategies in Waste Management FMR Form
    Given User has to see the table of uploaded files on diversion strategies in Waste Management FMR Form
    When User deletes the uploaded files of diversion strategies in Waste Management FMR Form
    Then User can see all the diversion strategies in Waste Management FMR Form are deleted
    
  #Scenario-6
  @DeleteFiles
  Scenario: Deleting files from Recommended design in Indoor Air Quality FMR Form
    Given User has to see the table of uploaded files on Recommended design in Indoor Air Quality FMR Form
    When User deletes the uploaded files of Recommended design in Indoor Air Quality FMR Form
    Then User can see all the Recommended design in Indoor Air Quality FMR Form are deleted
    
  #Scenario-7
  @DeleteFiles
  Scenario: Deleting files from reoccupying the space in Indoor Air Quality FMR Form
    Given User has to see the table of uploaded files on reoccupying the space in Indoor Air Quality FMR Form
    When User deletes the uploaded files of reoccupying the space in Indoor Air Quality FMR Form
    Then User can see all the reoccupying the space in Indoor Air Quality FMR Form are deleted
    
    #Scenario-8
  @DeleteFiles
  Scenario: Deleting files from construction ends in Indoor Air Quality FMR Form
    Given User has to see the table of uploaded files on construction ends in Indoor Air Quality FMR Form
    When User deletes the uploaded files of construction ends in Indoor Air Quality FMR Form
    Then User can see all the construction ends in Indoor Air Quality FMR Form are deleted
    
    #Scenario-7
  @DeleteFiles
  Scenario: Deleting files from additional documentation in FMR Form
    Given User has to see the table of uploaded files on additional documentation in FMR Form
    When User deletes the uploaded files of additional documentation in FMR Form
    Then User can see all the additional documentation in FMR Form are deleted
    
 