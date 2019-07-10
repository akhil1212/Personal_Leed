#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	04.07.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 04.07.2019
# Feature Name: Delete Table data in Enhanced Refrigerant Management Form
# Feature Description: Delete data in Enhanced Refrigerant Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded data in Enhanced Refrigerant Management Form

	#Sceanrio-1:
	@DeleteFiles
	Scenario: Deleting the rows for Contributing Nonroof Measures
	Given User should be in Calculation of Refrigerant Impact
	And User can see the Table Mechanical Cooling and Refrigeration Equipment of Refrigerant Impact
	When User deletes the rows for Mechanical Cooling and Refrigeration Equipment except mandatory fields
	Then User can see all the rows are deleted except the mandatory fields in Mechanical Cooling and Refrigeration Equipment