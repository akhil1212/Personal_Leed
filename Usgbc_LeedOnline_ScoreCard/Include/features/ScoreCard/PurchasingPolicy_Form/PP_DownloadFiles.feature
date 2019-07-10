#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	28.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 28.06.2019
# Feature Name: Downloading and verifying the uploaded files from Purchasing Policy Form
# Feature Description: Downloading and verifying the uploaded files from Purchasing Policy Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Downloading and verifying the uploaded files from Purchasing Policy Form

 #Scenario-1
  @SmokeTest
  Scenario: Downloading the uploaded files for five most purchased product categories (EPP)
    Given User has to see the table of uploaded files on five most purchased product categories in EPP
    When User downloads the uploaded files of five most purchased product categories in EPP
    Then User can see the downloaded files of five most purchased product categories in EPP
    
    
    
 #Scenario-2
  @SmokeTest
  Scenario: Downloading the uploaded files for Paper, toner cartridges, binders, batteries and desk accessories (EPP)
    Given User has to see the table of uploaded files on Paper, toner cartridges and desk accessories in EPP
    When User downloads the uploaded files of Paper, toner cartridges and desk accessories in EPP
    Then User can see the downloaded files of Paper, toner cartridges and desk accessories in EPP
    
    
     #Scenario-3
  @SmokeTest
  Scenario: Downloading the uploaded files for Lamps (EPP)
    Given User has to see the table of uploaded files on Lamps in EPP
    When User downloads the uploaded files of Lamps in EPP
    Then User can see the downloaded files of Lamps in EPP
    
    
    #Scenario-4
  @SmokeTest
  Scenario: Downloading the uploaded files for Office equipment, appliances and audiovisual equipment (EPP)
    Given User has to see the table of uploaded files on Office equipment, appliances and audiovisual equipment in EPP
    When User downloads the uploaded files of Office equipment, appliances and audiovisual equipment in EPP
    Then User can see the downloaded files of Office equipment, appliances and audiovisual equipment in EPP
    
    #Scenario-5
  @SmokeTest
  Scenario: Downloading the uploaded files for Electric powered equipment (EPP)
    Given User has to see the table of uploaded files on Electric powered equipment in EPP
    When User downloads the uploaded files of Electric powered equipment in EPP
    Then User can see the downloaded files of Electric powered equipment in EPP
    
    
      #Scenario-6
  @SmokeTest
  Scenario: Downloading the uploaded files for the five most purchased product categories based on total annual purchases (SWM)
    Given User has to see the table of uploaded files on five most purchased product categories in SWM
    When User downloads the uploaded files of five most purchased product categories in SWM
    Then User can see the downloaded files of five most purchased product categories in SWM
    
        #Scenario-7
  @SmokeTest
  Scenario: Downloading the uploaded files for Office equipment, appliances and audiovisual equipment (SWM)
    Given User has to see the table of uploaded files on Office equipment, appliances and audiovisual equipment in SWM
    When User downloads the uploaded files of Office equipment, appliances and audiovisual equipment in SWM
    Then User can see the downloaded files of Office equipment, appliances and audiovisual equipment in SWM
    
    
     #Scenario-8
  @SmokeTest
  Scenario: Downloading the uploaded files for Electric powered equipment (SWM)
    Given User has to see the table of uploaded files on Electric powered equipment in SWM
    When User downloads the uploaded files of Electric powered equipment in SWM
    Then User can see the downloaded files of Electric powered equipment in SWM
    
    
    #Scenario-9
  @SmokeTest
  Scenario: Downloading the uploaded files for disposal of batteries and lamps (SWM)
    Given User has to see the table of uploaded files on disposal of batteries and lamps in SWM
    When User downloads the uploaded files of disposal of batteries and lamps in SWM
    Then User can see the downloaded files of disposal of batteries and lamps in SWM
    
    
     #Scenario-10
  @SmokeTest
  Scenario: Downloading the uploaded files for special circumstances for Purchasing Policy
    Given User has to see the table of uploaded files on special circumstances for Purchasing Policy
    When User downloads the uploaded files of special circumstances for Purchasing Policy
    Then User can see the downloaded files of special circumstances for Purchasing Policy
    
    
    