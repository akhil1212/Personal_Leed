#----------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	25.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 25.06.2019
# Feature Name: Verifying the negative cases for file uploads in Project Information Form and save the form without any data
# Feature Description: Verifying the negative cases for file uploads in Project Information Form and save the form without any data
#----------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Project Information Form and save the form without any data

 
 
 #Scenario-1
  @NegativeTest
  Scenario: Saving the Project Information form without filling any data
    Given User should be on Project Information form
    When User clicks on save button without entering any data in Project Information form
    Then An error message saying Please fix the highlighted errors will be displayed
 
  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading file greater than 100MB for a site plan identifying the LEED project boundary
    Given User should be able to see the Add File button for a site plan identifying the LEED project boundary
    When User uploads a file which is greater than 100mb of a site plan identifying the LEED project boundary <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in a site plan identifying the LEED project boundary
    Given User should be able to see the Add File button in a site plan identifying the LEED project boundary
    When User uploads a file for a site plan identifying the LEED project boundary <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-4
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for representative floor plans for the project
    Given User should be able to see the Add File button for representative floor plans for the project
    When User uploads a file which is greater than 100mb of representative floor plans for the project <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in representative floor plans for the project
    Given User should be able to see the Add File button for representative floor plans for the project
    When User uploads a file for representative floor plans for the project <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for mechanical schedules and plans and or drawings
    Given User should be able to see the Add File button for mechanical schedules and plans and or drawings
    When User uploads a file which is greater than 100mb of mechanical schedules and plans and or drawings <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in mechanical schedules and plans and or drawings
    Given User should be able to see the Add File button for mechanical schedules and plans and or drawings
    When User uploads a file for mechanical schedules and plans and or drawings <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-8
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for photos or a video walkthrough of the project, both inside and outside
    Given User should be able to see the Add File button for photos or a video walkthrough of the project
    When User uploads a file which is greater than 100mb of photos or a video walkthrough of the project <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-9
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in photos or a video walkthrough of the project, both inside and outside
    Given User should be able to see the Add File button for photos or a video walkthrough of the project
    When User uploads a file for photos or a video walkthrough of the project <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-10
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for completed Performance Periods Table
    Given User should be able to see the Add File button for completed Performance Periods Table
    When User uploads a file which is greater than 100mb of completed Performance Periods Table <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-11
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in completed Performance Periods Table
    Given User should be able to see the Add File button for completed Performance Periods Table
    When User uploads a file for completed Performance Periods Table <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-12
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for special circumstances in Project Information
    Given User should be able to see the Add File button for special circumstances in Project Information
    When User uploads a file which is greater than 100mb of special circumstances in Project Information <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-13
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file for special circumstances in Project Information
    Given User should be able to see the Add File button for special circumstances in Project Information
    When User uploads a file for special circumstances in Project Information <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed
    And User has to refresh the form

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  
