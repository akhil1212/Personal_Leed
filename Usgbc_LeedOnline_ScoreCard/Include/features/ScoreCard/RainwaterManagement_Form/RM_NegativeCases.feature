#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	11.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 11.06.2019
# Feature Name: Verifying the negative cases for file uploads in Rainwater Management Form
# Feature Description: Verifying the negative cases for file uploads in Rainwater Management Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Rainwater Management Form

  #Scenario-1
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for rainfall events calculator or equivalent documentation
    Given User should be able to see the Add File button for rainfall events calculator
    When User uploads a file which is greater than 100mb of rainfall events calculator or equivalent documentation <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-2
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in rainfall events calculator or equivalent documentation
    Given User should be able to see the Add File button for rainfall events calculator or equivalent documentation
    When User uploads a file of rainfall events calculator or equivalent documentation <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for calculations of impervious surfaces
    Given User should be able to see the Add File button for calculations that demonstrate how the volume of runoff from 25% of impervious surfaces
    When User uploads a file which is greater than 100mb of calculations of impervious surfaces <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-4
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in calculations of impervious surfaces
    Given User should be able to see the Add File button for calculations that demonstrate how the volume of runoff from 25% of impervious surfaces
    When User uploads a file of calculations of impervious surfaces <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for documents that thoroughly depict the green infrastructure techniques used
    Given User should be able to see the Add File button for documents that thoroughly depict the green infrastructure techniques
    When User uploads a file which is greater than 100mb of documents that thoroughly depict the green infrastructure techniques used <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in documents that thoroughly depict the green infrastructure techniques used
    Given User should be able to see the Add File button for documents that thoroughly depict the green infrastructure techniques
    When User uploads a file of documents that thoroughly depict the green infrastructure techniques used <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for document or narrative describing the annual inspection and maintenance program
    Given User should be able to see the Add File button for document or narrative describing the annual inspection and maintenance program
    When User uploads a file which is greater than 100mb of document or narrative describing the annual inspection and maintenance program <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-8
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in document or narrative describing the annual inspection and maintenance program
    Given User should be able to see the Add File button for document or narrative describing the annual inspection and maintenance program
    When User uploads a file of document or narrative describing the annual inspection and maintenance program <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-9
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for additional documents in special circumstances in Rainwater Management
    Given User should be able to see the Add File button for for additional documents in special circumstances in rainwater management
    When User uploads a file which is greater than 100mb of additional documents in special circumstances in Rainwater Management <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-10
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in additional documents in special circumstances in Rainwater Management
    Given User should be able to see the Add File button for for additional documents in special circumstances in rainwater management
    When User uploads a file of additional documents in special circumstances in Rainwater Management <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed
		And User has to refresh the form
    Examples: 
      | FileName     |
      | 24MBfile.doc |
