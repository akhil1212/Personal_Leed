#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Verifying the negative cases for file uploads GC
# Feature Description: Verifying the negative cases for file uploads GC - Entryway systems which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads GC

  #Scenario-1
  @NegativeTest
  Scenario: clicks on save button without entering any data in GC
    Given User should be in Entryway systems option
    When User clicks on save button without entering any data in GC
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Green Cleaning
    Given User should be able to see the Add File button of photos for Entryway systems in Green Cleaning
    When User uploads a file which is greater than 100mb of photos for Entryway systems <photos>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | photos        |
      | 102MBfile.pdf |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Green Cleaning
    Given User should be able to see the Add File button of photos for Entryway systems in Green Cleaning
    When User uploads a file of photos <photos>
    Then User clicks on save while the file is uploading in GC
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | photos       |
      | 24MBfile.doc |
