package greenCleaningForm
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import leedOnlineKeywords.projectKeywords

class GC_DeleteUploadedFiles {

	/**
	 *  Delete custodial effectiveness (Option 1)
	 */

	String iframe='Object Repository/Green_Cleaning/iframe'


	@When("User deletes the uploaded files of custodial effectiveness audit in Green Cleaning Form")
	public void user_deletes_the_uploaded_files_of_custodial_effectiveness_audit_in_Green_Cleaning_Form() {

		String tableRow ="Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/tbody_Table_Custodial"
		String tableId = GC_Entities.tableId_Xpath_custodial_effectiveness_audit
		String scrollTo = "Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the custodial effectiveness audit in Green Cleaning Form are deleted")
	public void user_can_see_all_the_custodial_effectiveness_audit_in_Green_Cleaning_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/Table_Custodial'), 30)
	}


	/**
	 *  Delete Entryway systems (Option 2)
	 */


	@When("User deletes the uploaded files of photos, drawings in Green Cleaning Form")
	public void user_deletes_the_uploaded_files_of_photos_drawings_in_Green_Cleaning_Form() {

		String tableRow ="Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/tbody_Table_photos"
		String tableId = GC_Entities.tableId_Xpath_photos
		String scrollTo = "Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/p_Upload photos"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the photos, drawings in Green Cleaning Form are deleted")
	public void user_can_see_all_the_photos_drawings_in_Green_Cleaning_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/Table_photos'), 30)
	}


	/**
	 *  Delete Powered cleaning equipment (Option 3)
	 */

	@When("User deletes the uploaded files of Green Cleaning Calculator in Green Cleaning Form")
	public void user_deletes_the_uploaded_files_of_Green_Cleaning_Calculator_in_Green_Cleaning_Form() {

		String tableRow ="Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/tbody_Table_GC_Calc"
		String tableId = GC_Entities.tableId_Xpath_Green_Cleaning_Calc
		String scrollTo = "Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the Green Cleaning Calculator in Green Cleaning Form are deleted")
	public void user_can_see_all_the_Green_Cleaning_Calculator_in_Green_Cleaning_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/Table_GC_Calc'), 30)
	}


	/**
	 *  Delete Cleaning products and materials (Option 4)
	 */

	@When("User deletes the uploaded files of executed contract in Green Cleaning Form")
	public void user_deletes_the_uploaded_files_of_executed_contract_in_Green_Cleaning_Form() {

		String tableRow ="Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/tbody_Table_executedContract"
		String tableId = GC_Entities.tableId_Xpath_executed_contract
		String scrollTo = "Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/p_executedContract"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the executed contract in Green Cleaning Form are deleted")
	public void user_can_see_all_the_executed_contract_in_Green_Cleaning_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/Table_executedContract'), 30)
	}

	@When("User deletes the uploaded files of MSDS sheets in Green Cleaning Form")
	public void user_deletes_the_uploaded_files_of_MSDS_sheets_in_Green_Cleaning_Form() {

		String tableRow ="Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/tbody_Table_Msds"
		String tableId = GC_Entities.tableId_Xpath_msds_Sheets
		String scrollTo = "Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/p_msds"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the MSDS sheets in Green Cleaning Form are deleted")
	public void user_can_see_all_the_MSDS_sheets_in_Green_Cleaning_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/Table_msds'), 30)
	}

	@When("User deletes the uploaded files of additional documentation in Green Cleaning Form")
	public void user_deletes_the_uploaded_files_of_additional_documentation_in_Green_Cleaning_Form() {

		String tableRow ="Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/tbody_Table_SC"
		String tableId = GC_Entities.tableId_Xpath_spl_circum
		String scrollTo = "Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/p_SC_additionalDoc"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the additional documentation in Green Cleaning Form are deleted")
	public void user_can_see_all_the_additional_documentation_in_Green_Cleaning_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/Table_SC'), 30)
	}
}