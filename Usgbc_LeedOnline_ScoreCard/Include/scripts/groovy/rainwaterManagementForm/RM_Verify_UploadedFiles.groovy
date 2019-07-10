package rainwaterManagementForm
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
import rainwaterManagementForm.RM_Entities

class RM_Verify_UploadedFiles {
	/**
	 * Verifying the uploaded files present in the form with the files uploaded -- Started
	 */

	String iframe = 'Object Repository/RainwaterManagement/iframe'

	@Given("User has to see the table of uploaded files on rainfall events calculator or equivalent documentation")
	public void user_has_to_see_the_table_of_uploaded_files_on_rainfall_events_calculator_or_equivalent_documentation() {

		WebUI.callTestCase(findTestCase('Test Cases/RainwaterManagement/TC_NavigateToRM'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_EventsCalculator/table_EventsCalc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_EventsCalculator/table_EventsCalc'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of rainfall events calculator or equivalent documentation")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_rainfall_events_calculator_or_equivalent_documentation() {

		String tableRow = 'Object Repository/RainwaterManagement/AddFile_EventsCalculator/tbody_Table_EventsCalc'
		String tableId = RM_Entities.tableId_EventsCalculator
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on calculations of impervious surfaces")
	public void user_has_to_see_the_table_of_uploaded_files_on_calculations_of_impervious_surfaces() {

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/table_Calc_ImperSurfaces'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/table_Calc_ImperSurfaces'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of calculations of impervious surfaces")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_calculations_of_impervious_surfaces() {

		String tableRow = 'Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/tbody_Table_Calc_ImperSurfaces'
		String tableId = RM_Entities.tableId_Calc_ImperviousSurfaces
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on documents that thoroughly depict the green infrastructure techniques used")
	public void user_has_to_see_the_table_of_uploaded_files_on_documents_that_thoroughly_depict_the_green_infrastructure_techniques_used() {

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/table_GreenInfra'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/table_GreenInfra'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of documents that thoroughly depict the green infrastructure techniques used")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_documents_that_thoroughly_depict_the_green_infrastructure_techniques_used() {

		String tableRow = 'Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/tbody_Table_GreenInfra'
		String tableId = RM_Entities.tableId_GreenInfrastructure
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on document or narrative describing the annual inspection and maintenance program")
	public void user_has_to_see_the_table_of_uploaded_files_on_document_or_narrative_describing_the_annual_inspection_and_maintenance_program() {

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_AnnualInspection/table_AnnualInsp'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_AnnualInspection/table_AnnualInsp'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of document or narrative describing the annual inspection and maintenance program")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_document_or_narrative_describing_the_annual_inspection_and_maintenance_program() {

		String tableRow = 'Object Repository/RainwaterManagement/AddFile_AnnualInspection/tbody_Table_AnnualInsp'
		String tableId = RM_Entities.tableId_AnnualInspection
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on additional documents in special circumstances in Rainwater Management")
	public void user_has_to_see_the_table_of_uploaded_files_on_additional_documents_in_special_circumstances_in_Rainwater_Management() {

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_SpecialCircum/table_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_SpecialCircum/table_SplCircum'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of additional documents in special circumstances in Rainwater Management")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_additional_documents_in_special_circumstances_in_Rainwater_Management() {

		String tableRow = 'Object Repository/RainwaterManagement/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String tableId = RM_Entities.tableId_SpecialCircumstances
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	/**
	 * Verifying the uploaded files present in the form with the files uploaded -- Ended
	 */
}