#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	28.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 28.06.2019
# Feature Name: Deleting the uploaded files from Purchasing Policy Form
# Feature Description: Deleting the uploaded files from Purchasing Policy Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files from Purchasing Policy Form

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from five most purchased product categories (EPP)
    Given User has to see the table of uploaded files on five most purchased product categories in EPP
    When User deletes the uploaded files of five most purchased product categories in EPP
    Then User can see all the files of five most purchased product categories in EPP are deleted
    
    
  #Scenario-2
 @DeleteFiles
  Scenario: Deleting files from Paper, toner cartridges, binders, batteries and desk accessories (EPP)
    Given User has to see the table of uploaded files on Paper, toner cartridges and desk accessories in EPP
    When User deletes the uploaded files of Paper, toner cartridges and desk accessories in EPP
    Then User can see all the files of Paper, toner cartridges and desk accessories in EPP are deleted
    
    #Scenario-3
 @DeleteFiles
  Scenario: Deleting files from Lamps (EPP)
    Given User has to see the table of uploaded files on Lamps in EPP
    When User deletes the uploaded files of Lamps in EPP
    Then User can see all the files of Lamps in EPP are deleted
    
    
    #Scenario-4
 @DeleteFiles
  Scenario: Deleting files from Office equipment, appliances and audiovisual equipment (EPP)
    Given User has to see the table of uploaded files on Office equipment, appliances and audiovisual equipment in EPP
    When User deletes the uploaded files of Office equipment, appliances and audiovisual equipment in EPP
    Then User can see all the files of Office equipment, appliances and audiovisual equipment in EPP are deleted
    
    #Scenario-5
 @DeleteFiles
  Scenario: Deleting files from Electric powered equipment (EPP)
    Given User has to see the table of uploaded files on Electric powered equipment in EPP
    When User deletes the uploaded files of Electric powered equipment in EPP
    Then User can see all the files of Electric powered equipment in EPP are deleted
    
    
      #Scenario-6
 @DeleteFiles
  Scenario: Deleting files from the five most purchased product categories based on total annual purchases (SWM)
    Given User has to see the table of uploaded files on five most purchased product categories in SWM
    When User deletes the uploaded files of five most purchased product categories in SWM
    Then User can see all the files of five most purchased product categories in SWM are deleted
    
        #Scenario-7
 @DeleteFiles
  Scenario: Deleting files from Office equipment, appliances and audiovisual equipment (SWM)
    Given User has to see the table of uploaded files on Office equipment, appliances and audiovisual equipment in SWM
    When User deletes the uploaded files of Office equipment, appliances and audiovisual equipment in SWM
    Then User can see all the files of Office equipment, appliances and audiovisual equipment in SWM are deleted
    
    
     #Scenario-8
 @DeleteFiles
  Scenario: Deleting files from Electric powered equipment (SWM)
    Given User has to see the table of uploaded files on Electric powered equipment in SWM
    When User deletes the uploaded files of Electric powered equipment in SWM
    Then User can see all the files of Electric powered equipment in SWM are deleted
    
    
    #Scenario-9
 @DeleteFiles
  Scenario: Deleting files from disposal of batteries and lamps (SWM)
    Given User has to see the table of uploaded files on disposal of batteries and lamps in SWM
    When User deletes the uploaded files of disposal of batteries and lamps in SWM
    Then User can see all the files of disposal of batteries and lamps in SWM are deleted
    
    
     #Scenario-10
 @DeleteFiles
  Scenario: Deleting files from special circumstances for Purchasing Policy
    Given User has to see the table of uploaded files on special circumstances for Purchasing Policy
    When User deletes the uploaded files of special circumstances for Purchasing Policy
    Then User can see all the files of special circumstances for Purchasing Policy are deleted
    
    
    