#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                         Reviewer    :
# Date   : 	11.07.2019											                                                         Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 11.07.2019
# Feature Name: Deleting the table rows except manditory fields in Heat Island Reduction Form
# Feature Description: Deleting the table rows except manditory fields in Heat Island Reduction Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the table rows except manditory fields in Heat Island Reduction Form
	
	#Sceanrio-1:
		@DeleteFiles
		Scenario: Deleting the rows for Contributing nonroof measures
		Given User should be in Heat Island Reduction Form
		And User can see the Table Contributing nonroof measures of Heat Island Reduction
		When User deletes the rows for Contributing nonroof measures except mandatory fields
		Then User can see all the rows are deleted except the mandatory fields in Table Contributing nonroof measures
		
		#Sceanrio-2:
		@DeleteFiles
		Scenario: Deleting the rows for Contributing high-reflectance roof
		Given User can see the Table Contributing high-reflectance roof of Heat Island Reduction
		When User deletes the rows for Contributing high-reflectance roof except mandatory fields
		Then User can see all the rows are deleted except the mandatory fields in Table Contributing high-reflectance roof
		
		#Sceanrio-3:
		@DeleteFiles
		Scenario: Deleting the rows for Parking
		Given User can see the Table Parking of Heat Island Reduction
		When User deletes the rows for Parking except mandatory fields
		Then User can see all the rows are deleted except the mandatory fields in Table Parking
		
		#Sceanrio-4:
		@DeleteFiles
		Scenario: Deleting the rows for Summary of nonroof and roof
		Given User can see the Table Summary of nonroof and roof of Heat Island Reduction
		When User deletes the rows for Summary of nonroof and roof except mandatory fields
		Then User can see all the rows are deleted except the mandatory fields in Table Summary of nonroof and roof