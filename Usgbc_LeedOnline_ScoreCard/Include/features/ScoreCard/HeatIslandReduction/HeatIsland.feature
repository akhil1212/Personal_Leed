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
    Then User can see the calculated value of Weighted Area for Architectural shading, Paving Material
    And User can see the values of standard nonroof and weighted nonroof measures in Table Contributing nonroof measures
    
  #Scenario-2
  @SmokeTest
  Scenario: Feeding the data to the Table Contributing high-reflectance roof
    Given User can see the Table Contributing high-reflectance roof
    When User enters the details of Roof Slope, Material Description, SRI, Initial, Area
    Then User can see the calculated value of Weighted Area in the Table Contributing high-reflectance roof
    And User can see the values of standard area,weighted area of qualifying high-reflectance roof 
    
  #Scenario-3
  @SmokeTest
  Scenario: Feeding the data to the Table Parking
    Given User can see the Table Parking
    When User enters the details of Material Description, SRI, Initial, Area, Number of Parking in Spaces covered by high-reflectance roof
		And User enters the details of Spaces covered by energy generation, vegetated roof, underground and parking spaces  
    Then User can see the values of qualifying and Percentage of compliant parking spaces in the Table Parking 
    And User enters the values of Total area of vegetated roof in Table Parking
    
  #Scenario-4
  @SmokeTest
  Scenario: Feeding the data to the Table Summary of nonroof and roof
    Given User can see the Table Summary of nonroof and roof
    And User enters the details of Total Weighted Area, Total Standard Area for nonroof measures and high-reflectance roof
    And User enters the details of Total Standard Area for Vegetated roof
    And User enters the details of Total Weighted Area, Total Standard Area for nonroof and roof measures     
    When User enters the details of Total Standard Area for Total project paving area and roof area
    Then User can see the values of Sum of roof area,Percentage of nonroof measures and vegetated in Table Summary of nonroof and roof
    
     #Scenario-5
  @SmokeTest
  Scenario: User Uploads files of additional documentation in HIR Form
    Given User should be able to see the Add File button for additional documentation in HIR Form
    Then User uploads file for additional documentation in HIR Form
    
  #Scenario-6
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances text box for Heat Isalnd Reduction Form
    Given User should see the editor for Special Circumstances for Heat Isalnd Reduction Form
    When User feeds long narrative text for Special Circumstances text box for Heat Isalnd Reduction Form
    Then User should see the narrative text persist on Special Circumstances text box for Heat Isalnd Reduction Form
    
 #Scenario-7
  @SmokeTest
  Scenario: User has to save the form in HIR Form
    Given User can see the save button in HIR Form
    When User clicks on save button in HIR Form
    Then User should see Form data saved successfully message in HIR Form
    
  #Scenario-8
  @SmokeTest
  Scenario: To save the Heat Isalnd Reduction Form
    Given User can see the generate pdf icon on the top of the Heat Isalnd Reduction Form   
    When User clicks on generate pdf icon to download the file in Heat Isalnd Reduction Form  
    