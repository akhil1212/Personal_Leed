#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	14.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 14.06.2019
# Feature Name: Verifying the negative cases for file uploads GC
# Feature Description: Verifying the negative cases for file uploads GC - Cleaning products and materials which is option 4
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads GC

  #Scenario-1
  @NegativeTest
  Scenario: clicks on save button without entering any data in GC
    Given User should be in Cleaning products and materials option
    When User clicks on save button without entering any data in GC
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Green Cleaning
    Given User should be able to see the Add File button of Green Cleaning Calculator for Cleaning products in Green Cleaning
    When User uploads a file which is greater than 100mb of Green Cleaning Calculator for Cleaning products <Green_Cleaning_Calc>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Green_Cleaning_Calc |
      | 102MBfile.pdf       |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Green Cleaning
    Given User should be able to see the Add File button of Green Cleaning Calculator for Cleaning products in Green Cleaning
    When User uploads a file of Green Cleaning Calc for Cleaning products <Green_Cleaning_Calc>
    Then User clicks on save while the file is uploading in GC
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Green_Cleaning_Calc |
      | 24MBfile.doc        |

  #Scenario-4
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Green Cleaning
    Given User should be able to see the Add File button of executed contract for Cleaning products in Green Cleaning
    When User uploads a file which is greater than 100mb of executed contract for Cleaning products <executed_contract>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | executed_contract |
      | 102MBfile.pdf     |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Green Cleaning
    Given User should be able to see the Add File button of executed contract for Cleaning products in Green Cleaning
    When User uploads a file of executed contract <executed_contract>
    Then User clicks on save while the file is uploading in GC
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | executed_contract |
      | 24MBfile.doc      |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Green Cleaning
    Given User should be able to see the Add File button of MSDS sheets for Cleaning products in Green Cleaning
    When User uploads a file which is greater than 100mb of MSDS sheets for Cleaning products <MSDS_sheets>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | MSDS_sheets   |
      | 102MBfile.pdf |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Green Cleaning
    Given User should be able to see the Add File button of MSDS sheets for Cleaning products in Green Cleaning
    When User uploads a file of MSDS sheets <MSDS_sheets>
    Then User clicks on save while the file is uploading in GC
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | MSDS_sheets  |
      | 24MBfile.doc |

      #Scenario-8
  @NegativeTest
  Scenario Outline: User fills cleaning products with more than 10 digits in green cleaning
    Given User should be able to see the textbox for cleaning products in green cleaning
    When User can enter the values for cleaning products <cleaning_products>
    Then User can see the entered value and the value present in the cleaning products is not same

    Examples: 
      | cleaning_products |
      |  66,612,334,442.25 |

  #Scenario-9
  @NegativeTest
  Scenario Outline: User fills cleaning products with 10 digits and more than 2 decimal values in green cleaning
    Given User should be able to see the textbox for cleaning products in green cleaning
    When User can enter the values for cleaning products <cleaning_products>
    Then User can see the entered value and the value present in the cleaning products is not same

    Examples: 
      | cleaning_products |
      |  1,234,567,845.255 |
      
      #Scenario-9
  #@NegativeTest
  #Scenario Outline: User fills Percent of cleaning products with 0 in green cleaning
    #Given User should be able to see the textbox for Percent of cleaning products in green cleaning
    #When User can enter the values for Percent of cleaning products <Percent_cleaning>
    #Then User can see the entered value and the value present in the Percent of cleaning products is not same
#
    #Examples: 
      #| Percent_cleaning |
      #|  0 |
      