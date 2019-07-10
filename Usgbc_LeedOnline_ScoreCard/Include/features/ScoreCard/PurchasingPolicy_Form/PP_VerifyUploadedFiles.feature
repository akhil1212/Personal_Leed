#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	27.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 27.06.2019
# Feature Name: Verifying uploaded files in Purchasing Policy Form
# Feature Description: Verifying uploaded files in Purchasing Policy Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Purchasing Policy Form

#Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files in for five most purchased product categories based on total annual purchases (EPP)
    Given User has to see the table of uploaded files on five most purchased product categories in EPP
    Then User verifies the file name uploaded with the file name present in the table of five most purchased product categories in EPP

    
    #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files in for Paper, toner cartridges, binders, batteries and desk accessories (EPP)
    Given User has to see the table of uploaded files on Paper, toner cartridges and desk accessories in EPP
    Then User verifies the file name uploaded with the file name present in the table of Paper, toner cartridges and desk accessories in EPP
    
   
     #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files in for Lamps (EPP)
    Given User has to see the table of uploaded files on Lamps in EPP
    Then User verifies the file name uploaded with the file name present in the table of Lamps in EPP
    
    
   #Scenario-4
  @SmokeTest
  Scenario: Verifying uploaded files in for Office equipment, appliances and audiovisual equipment (EPP)
    Given User has to see the table of uploaded files on Office equipment, appliances and audiovisual equipment in EPP
    Then User verifies the file name uploaded with the file name present in the table of Office equipment, appliances and audiovisual equipment in EPP
    
   #Scenario-5
  @SmokeTest
  Scenario: Verifying uploaded files in for Electric powered equipment (EPP)
    Given User has to see the table of uploaded files on Electric powered equipment in EPP
    Then User verifies the file name uploaded with the file name present in the table of Electric powered equipment in EPP
    
    
    #Scenario-6
  @SmokeTest
  Scenario: Verifying uploaded files in for the five most purchased product categories based on total annual purchases (SWM)
    Given User has to see the table of uploaded files on five most purchased product categories in SWM
    Then User verifies the file name uploaded with the file name present in the table of five most purchased product categories in SWM
    
    
    #Scenario-7
  @SmokeTest
  Scenario: Verifying uploaded files in for Office equipment, appliances and audiovisual equipment (SWM)
    Given User has to see the table of uploaded files on Office equipment, appliances and audiovisual equipment in SWM
    Then User verifies the file name uploaded with the file name present in the table of Office equipment, appliances and audiovisual equipment in SWM
    
    
     #Scenario-8
  @SmokeTest
  Scenario: Verifying uploaded files in for Electric powered equipment (SWM)
    Given User has to see the table of uploaded files on Electric powered equipment in SWM
    Then User verifies the file name uploaded with the file name present in the table of Electric powered equipment in SWM
    
    
    #Scenario-9
  @SmokeTest
  Scenario: Verifying uploaded files in for disposal of batteries and lamps (SWM)
    Given User has to see the table of uploaded files on disposal of batteries and lamps in SWM
    Then User verifies the file name uploaded with the file name present in the table of disposal of batteries and lamps in SWM
    
    
     #Scenario-10
  @SmokeTest
  Scenario: Verifying uploaded files in special circumstances for Purchasing Policy
    Given User has to see the table of uploaded files on special circumstances for Purchasing Policy
    Then User verifies the file name uploaded with the file name present in the table of special circumstances for Purchasing Policy
    