#---------------------------------------------------------------------------------------------------------------------------------
# Authors :																			                                                     Reviewer    :
# Date   : 										                                                                     Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name: Verifying the negative cases for file uploads in Site Management Form
# Feature Description: Verifying the negative cases for Site Management Form file uploads
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Site Management Form

  #Scenario-1
  @NegativeTest
  Scenario: 
    Given User should be in Site Management form
    When User clicks on save button without entering any data in SM
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Site Assessment in SM Form
    Given User should see the Add File button for Site Assessment in SM Form
    When User uploads a file which is greater than 100mb of Site Assessment in SM Form <Site_Assessment>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Site_Assessment |
      | 102MBfile.pdf   |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Site Assessment in SM Form
    Given User should see the Add File button for Site Assessment in SM Form
    When User uploads a file of Site Assessment in SM Form <Site_Assessment>
    Then User clicks on save while the file is uploading in SM
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Site_Assessment |
      | 24MBfile.doc    |

  #Scenario-4
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Documentation demonstrating in SM Form
    Given User should be able to see the Add File button for Documentation demonstrating in SM Form
    When User uploads a file which is greater than 100mb of Documentation demonstrating in SM Form <Documentation_demonstrating>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Documentation_demonstrating |
      | 102MBfile.pdf               |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Documentation demonstrating in SM Form
    Given User should be able to see the Add File button for Documentation demonstrating in SM Form
    When User uploads a file of Documentation demonstrating in SM Form <Documentation_demonstrating>
    Then User clicks on save while the file is uploading in SM
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Documentation_demonstrating |
      | 24MBfile.doc                |
      
      #Scenario-6
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for additional documentation in SM Form
    Given User should be able to see the Add File button for additional documentation in SM Form
    When User uploads a file which is greater than 100mb of additional documentation in SM Form <additional_documentation>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | additional_documentation |
      | 102MBfile.pdf            |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Form additional documentation in SM Form
    Given User should be able to see the Add File button for additional documentation in SM Form
    When User uploads a file of additional documentation in SM Form <additional_documentation>
    Then User clicks on save while the file is uploading in SM
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | additional_documentation |
      | 24MBfile.doc             |
      
