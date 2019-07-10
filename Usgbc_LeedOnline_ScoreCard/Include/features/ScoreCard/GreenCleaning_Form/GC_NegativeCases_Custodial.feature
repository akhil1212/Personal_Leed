#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	14.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 14.06.2019
# Feature Name: Verifying the negative cases for Green Cleaning file uploads
# Feature Description: Verifying the negative cases for file uploads GC - Custodial effectiveness assessment which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for Green Cleaning file uploads

  #Scenario-1
  @NegativeTest
  Scenario: clicks on save button without entering any data in GC
    Given User should be in Custodial effectiveness assessment option
    When User clicks on save button without entering any data in GC
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Green Cleaning
    Given User should be able to see the Add File button of custodial effectiveness audit in Green Cleaning
    When User uploads a file which is greater than 100mb of custodial effectiveness audit <custodial_effectiveness>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | custodial_effectiveness |
      | 102MBfile.pdf           |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Green_Cleaning
    Given User should be able to see the Add File button of custodial effectiveness audit in Green Cleaning
    When User uploads a file of custodial effectiveness audit <custodial_effectiveness>
    Then User clicks on save while the file is uploading in GC
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | custodial_effectiveness |
      | 24MBfile.doc            |

  #Scenario-4
  @NegativeTest
  Scenario Outline: User fills Overall score facility with more than 10 digits in green cleaning
    Given User should be able to see the textbox for Overall score facility in green cleaning
    When User can enter the values for Overall score facility<Overall_Score>
    Then User can see the entered value and the value present in the text box is not same

    Examples: 
      | Overall_Score     |
      | 66,612,334,442.25 |

  #Scenario-5:
  @NegativeTest
  Scenario Outline: User fills Overall score facility with 10 digits and more than 2 decimal values in green cleaning
    Given User should be able to see the textbox for Overall score facility in green cleaning
    When User can enter the values for Overall score facility<Overall_Score>
    Then User can see the entered value and the value present in the text box is not same

    Examples: 
      | Overall_Score     |
      | 1,234,567,845.255 |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Green Cleaning
    Given User should be able to see the Add File button of additional doc in Green Cleaning
    When User uploads a file which is greater than 100mb of additional doc <additional_doc>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | additional_doc |
      | 102MBfile.pdf  |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Green_Cleaning
    Given User should be able to see the Add File button of additional doc in Green Cleaning
    When User uploads a file of additional doc <additional_doc>
    Then User clicks on save while the file is uploading in GC
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | additional_doc |
      | 24MBfile.doc   |
