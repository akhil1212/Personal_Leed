#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	20.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 20.06.2019
# Feature Name: Verifying the negative cases for file uploads in Environmental Tobacco Smoke Control Form
# Feature Description: Verifying the negative cases for file uploads in Environmental Tobacco Smoke Control Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Environmental Tobacco Smoke Control Form

  #Scenario-1
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for No-smoking policy document
    Given User should be able to see the Add File button of No-smoking policy document
    When User uploads a file which is greater than 100mb of No-smoking policy document <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-2
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in No-smoking policy document
    Given User should be able to see the Add File button in No-smoking policy document
    When User uploads a file for No-smoking policy document <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for scaled site plan
    Given User should be able to see the Add File button of scaled site plan
    When User uploads a file which is greater than 100mb of scaled site plan <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-4
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in scaled site plan
    Given User should be able to see the Add File button of scaled site plan
    When User uploads a file for scaled site plan <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for information about the code
    Given User should be able to see the Add File button of information about the code
    When User uploads a file which is greater than 100mb of information about the code <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in information about the code
    Given User should be able to see the Add File button of information about the code
    When User uploads a file for information about the code <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for weather stripping and sealing
    Given User should be able to see the Add File button of weather stripping and sealing
    When User uploads a file which is greater than 100mb of weather stripping and sealing <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-8
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in weather stripping and sealing
    Given User should be able to see the Add File button of weather stripping and sealing
    When User uploads a file for weather stripping and sealing <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-9
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for differential air pressure test report
    Given User should be able to see the Add File button of differential air pressure test report
    When User uploads a file which is greater than 100mb of differential air pressure test report <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-10
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in differential air pressure test report
    Given User should be able to see the Add File button of differential air pressure test report
    When User uploads a file for differential air pressure test report <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-11
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for special circumstances in Environmental Tobacco Smoke Control
    Given User should be able to see the Add File button for special circumstances in Environmental Tobacco Smoke Control
    When User uploads a file which is greater than 100mb of special circumstances in Environmental Tobacco Smoke Control <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-12
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in special circumstances in Environmental Tobacco Smoke Control
    Given User should be able to see the Add File button for special circumstances in Environmental Tobacco Smoke Control
    When User uploads a file for special circumstances in Environmental Tobacco Smoke Control <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed
    And User has to refresh the form

    Examples: 
      | FileName     |
      | 24MBfile.doc |
