#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	14.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 14.06.2019
# Feature Name: Verifying the negative cases for file uploads in Minimum Indoor Air Quality Form
# Feature Description: Verifying the negative cases for file uploads in Minimum Indoor Air Quality Form
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Minimum Indoor Air Quality Form

#Scenario-1
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Minimum Indoor Air Quality Calculator
    Given User should be able to see the Add File button for minimum indoor air quality calculator
    When User uploads a file which is greater than 100mb of minimum indoor air quality calculator <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

   #Scenario-2
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Minimum Indoor Air Quality Calculator
	    Given User should be able to see the Add File button in minimum indoor air quality calculator
	    When User uploads a file for minimum indoor air quality calculator <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |
  
  
#Scenario-3
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for special circumstances in Minimum Indoor Air Quality 
    Given User should be able to see the Add File button for special circumstances in Minimum Indoor Air Quality
    When User uploads a file which is greater than 100mb of special circumstances in Minimum Indoor Air Quality <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

   #Scenario-4
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file for special circumstances in Minimum Indoor Air Quality 
    Given User should be able to see the Add File button for special circumstances in Minimum Indoor Air Quality
    When User uploads a file for special circumstances in Minimum Indoor Air Quality <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed
    And User has to refresh the form

    Examples: 
      | FileName     |
      | 24MBfile.doc |