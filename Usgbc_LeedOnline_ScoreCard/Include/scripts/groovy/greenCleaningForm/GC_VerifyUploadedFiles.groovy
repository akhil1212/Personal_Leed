package greenCleaningForm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import leedOnlineKeywords.projectKeywords

import internal.GlobalVariable

public class GC_VerifyUploadedFiles {

	/**
	 *  Verify custodial effectiveness (Option 1)
	 */
	
	String iframe='Object Repository/GreenCleaningPolicy/iframe'
	
	@Given("User has to see the table of uploaded files of custodial effectiveness audit in Green Cleaning")
	public void user_has_to_see_the_table_of_uploaded_files_of_custodial_effectiveness_audit_in_Green_Cleaning() {
		
		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)
		
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/Table_Custodial'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/Table_Custodial'), 30)
		
	}

	@Then("User verifies the file name uploaded with the file name present in the table custodial effectiveness audit in Green Cleaning")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_custodial_effectiveness_audit_in_Green_Cleaning() {
		
		String tableRow = "Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/tbody_Table_Custodial"
		String tableId = GC_Entities.tableId_Xpath_custodial_effectiveness_audit
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files of additional documentation in Green Cleaning")
	public void user_has_to_see_the_table_of_uploaded_files_of_additional_documentation_in_Green_Cleaning() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/Table_SC'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/Table_SC'), 30)
		
	}

	@Then("User verifies the file name uploaded with the file name present in the table additional documentation in Green Cleaning")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_additional_documentation_in_Green_Cleaning() {
	
	
		String tableRow = "Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/tbody_Table_SC"
		String tableId = GC_Entities.tableId_Xpath_spl_circum
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
	
	
	/**
	 *  Entryway Systems (Option 2)
	 */
	
	
	@Given("User has to see the table of uploaded files of photos, drawings in Green Cleaning")
	public void user_has_to_see_the_table_of_uploaded_files_of_photos_drawings_in_Green_Cleaning() {
		
		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)
		
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/Table_photos'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/Table_photos'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table photos, drawings in Green Cleaning")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_photos_drawings_in_Green_Cleaning() {
		
		String tableRow = "Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/tbody_Table_photos"
		String tableId = GC_Entities.tableId_Xpath_photos
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
	
	/**
	 *  Powered cleaning equipment (Option 3)
	 */
	
	@Given("User has to see the table of uploaded files of Green Cleaning Calculator in Green Cleaning")
	public void user_has_to_see_the_table_of_uploaded_files_of_Green_Cleaning_Calculator_in_Green_Cleaning() {
		
		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)
		
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/Table_GC_Calc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/Table_GC_Calc'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table Green Cleaning Calculator in Green Cleaning")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_Green_Cleaning_Calculator_in_Green_Cleaning() {
		
		String tableRow = "Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/tbody_Table_GC_Calc"
		String tableId = GC_Entities.tableId_Xpath_Green_Cleaning_Calc
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
	
	/**
	 *  Cleaning products and materials (Option 4)
	 */
	
	@Given("User has to see the table of uploaded files of executed contract in Green Cleaning")
	public void user_has_to_see_the_table_of_uploaded_files_of_executed_contract_in_Green_Cleaning() {
		
		
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/Table_executedContract'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/Table_executedContract'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table executed contract in Green Cleaning")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_executed_contract_in_Green_Cleaning() {
		
		String tableRow = "Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/tbody_Table_executedContract"
		String tableId = GC_Entities.tableId_Xpath_executed_contract
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
	
	@Given("User has to see the table of uploaded files of MSDS sheets in Green Cleaning")
	public void user_has_to_see_the_table_of_uploaded_files_of_MSDS_sheets_in_Green_Cleaning() {
		
		
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/Table_msds'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/Table_msds'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table MSDS sheets in Green Cleaning")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_MSDS_sheets_in_Green_Cleaning() {
		
		String tableRow = "Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/tbody_Table_Msds"
		String tableId = GC_Entities.tableId_Xpath_msds_Sheets
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
}






