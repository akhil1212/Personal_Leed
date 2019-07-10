#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	27.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 27.06.2019
# Feature Name: Verifying the negative cases for file uploads in Innovation Form
# Feature Description: Verifying the negative cases for Innovation Form file uploads
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Innovation Form

  #Scenario-1
  @NegativeTest
  Scenario: clicks on save button without entering any data in Innovation Form
    Given User should be in Innovation Form
    When User clicks on save button without entering any data in Innovation Form
    Then An error message saying Please fix the highlighted errors will be displayed

	#Scenario-2
  @NegativeTest
  Scenario: enters 100 characters for pilot credit
    Given User should be able to see the textbox for pilot credit
    When User enters the data more than 100 characters for pilot credit
    Then User should not be able to see the complete entered value in pilot credit

  #Scenario-3
  @NegativeTest
  Scenario: enters Zero for pilot credit
    Given User should be able to see the textbox for pilot credit
    When User enters the data Zero for pilot credit
    Then User clicks on save button
    And User finds the error message saying Please fix the highlighted errors will be displayed
    
  #Scenario-4
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for LEED Accredited Professional in Innovation Form
  	Given User should be able to see the Add File button for a project team member’s LEED Accredited in Innovation
    When User uploads a file which is greater than 100mb of LEED Accredited Professional in Innovation Form <Accredited_Professional>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Accredited_Professional |
      | 102MBfile.pdf           |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in LEED Accredited Professional in Innovation Form
    Given User should be able to see the Add File button for a project team member’s LEED Accredited in Innovation
    When User uploads a file of LEED Accredited Professional in Innovation Form <Accredited_Professional>
    Then User clicks on save while the file is uploading in Innovation Form
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Accredited_Professional |
      | 24MBfile.doc            |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for required documentation in Innovation Form
 		Given User should be able to see the Add File button for a required documentation for pilot credit in Innovation
    When User uploads a file which is greater than 100mb of required documentation in Innovation Form <required_documentation>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | required_documentation |
      | 102MBfile.pdf          |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in required documentation in Innovation Form
    Given User should be able to see the Add File button for a required documentation for pilot credit in Innovation
    When User uploads a file of required documentation in Innovation Form <required_documentation>
    Then User clicks on save while the file is uploading in Innovation Form
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | required_documentation |
      | 24MBfile.doc           |

  #Scenario-8
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for additional documentation in Innovation Form
  	Given User should be able to see the Add File button for a additional documentation in Innovation
    When User uploads a file which is greater than 100mb of additional documentation in Innovation Form <additional_documentation>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | additional_documentation |
      | 102MBfile.pdf            |

  #Scenario-9
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in additional documentation in Innovation Form
    Given User should be able to see the Add File button for a additional documentation in Innovation
    When User uploads a file of additional documentation in Innovation Form <additional_documentation>
    Then User clicks on save while the file is uploading in Innovation Form
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | additional_documentation |
      | 24MBfile.doc             |

  #Scenario-10
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for supporting documentation in Innovation Form
    Given User should see the radio button option Innovation Strategy
    And User clicks on Innovation Strategy
    And User should be able to see the Add File button for a supporting documentation for Innovation Strategy in Innovation
    When User uploads a file which is greater than 100mb of supporting documentation in Innovation Form <supporting_documentation>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | supporting_documentation |
      | 102MBfile.pdf            |

  #Scenario-11
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in supporting documentation in Innovation Form
    Given User should be able to see the Add File button for a supporting documentation for Innovation Strategy in Innovation
    When User uploads a file of supporting documentation in Innovation Form <supporting_documentation>
    Then User clicks on save while the file is uploading in Innovation Form
    And An error message saying Please wait running actions to complete will be displayed
    And User should see saving of draft after 10 seconds in Innovation
    And User clicks clear draft in Innovation

    Examples: 
      | supporting_documentation |
      | 24MBfile.doc             |
