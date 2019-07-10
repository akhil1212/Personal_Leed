#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																		                                                     Reviewer    :
# Date   : 	24.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 24.06.2019
# Feature Name: Verifying uploaded files in Energy Efficiency Best Management practices Form
# Feature Description: Verifying uploaded files in Energy Efficiency Best Management practices Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Energy Efficiency Best Management practices Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files in ASHRAE preliminary energy in EEBM Form
    Given User has to see the table of uploaded files on ASHRAE preliminary energy in EEBM Form
    Then User verifies the file name uploaded with the file name present in the table of ASHRAE preliminary energy in EEBM Form
    
    #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files in current facility requirements in EEBM Form
    Given User has to see the table of uploaded files on current facility requirements in EEBM Form
    Then User verifies the file name uploaded with the file name present in the table of current facility requirements in EEBM Form
    
    #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files in DC Pro Profiling Tool in EEBM Form
    Given User has to see the table of uploaded files on DC Pro Profiling Tool in EEBM Form
    Then User verifies the file name uploaded with the file name present in the table of DC Pro Profiling Tool in EEBM Form
    
    #Scenario-4
  @SmokeTest
  Scenario: Verifying uploaded files in additional documentation in EEBM Form
    Given User has to see the table of uploaded files on additional documentation in EEBM Form
    Then User verifies the file name uploaded with the file name present in the table of additional documentation in EEBM Form
    
    