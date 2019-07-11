#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                         Reviewer    :
# Date   : 	10.07.2019											                                                         Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 10.07.2019
# Feature Name: Filling the form Heat Island Reduction
# Feature Description: Filling the Heat Island Reduction
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the HeatIslandReduction

		#Scenario-1
  @SmokeTest
  Scenario: Feeding the data to the Table Contributing nonroof measures
    Given User can see the Table Contributing nonroof measures
    When User enters the details of Material Description, SR, Initial, Area for Architectural shading
    And User enters the details of Material Description, SR, Initial, Area for Paving Material
    And User enters the details of vegetated planters, energy generation systems, vegetated structures, open-grid pavement system
    Then User can see the calculated value of Weighted Area for Architectural shading, Paving Material, standard nonroof and weighted nonroof
    
  #Scenario-2
  @SmokeTest
  Scenario: Feeding the data to the Table Contributing high-reflectance roof
    Given User can see the Table Contributing high-reflectance roof
    When User enters the details of Roof Slope, Material Description, SRI, Initial, Area
    Then User can see the calculated value of Weighted Area in the Table Contributing high-reflectance roof   
    
  #Scenario-3
  @SmokeTest
  Scenario: Feeding the data to the Table Parking
    Given User can see the Table Parking
    When User enters the details of Material Description, SRI, Initial, Area, Number of Parking Spaces
    Then User can see the calculated value of Weighted Area in the Table Parking 
    
  #Scenario-4
  @SmokeTest
  Scenario: Feeding the data to the Table Summary of nonroof and roof
    Given User can see the Table Summary of nonroof and roof
    When User enters the details of Material Description, SRI, Initial, Area, Number of Summary of nonroof and roof Spaces
    Then User can see the calculated value of Weighted Area in the Table Summary of nonroof and roof 