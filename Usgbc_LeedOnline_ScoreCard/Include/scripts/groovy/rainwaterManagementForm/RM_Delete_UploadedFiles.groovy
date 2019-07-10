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

class RM_Delete_UploadedFiles {
	/**
	 * Deleting the uploaded files in the form and verifying whether the files are deleted -- Started
	 */

	String iframe = 'Object Repository/RainwaterManagement/iframe'

	@When("User deletes the uploaded files of rainfall events calculator or equivalent documentation")
	public void user_deletes_the_uploaded_files_of_rainfall_events_calculator_or_equivalent_documentation() {

		String tableRow = 'Object Repository/RainwaterManagement/AddFile_EventsCalculator/tbody_Table_EventsCalc'
		String tableId = RM_Entities.tableId_EventsCalculator
		String scrollTo = "Object Repository/RainwaterManagement/AddFile_EventsCalculator/p_AddFile_EventsCalc"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see all the rainfall events calculator or equivalent documentation files are deleted")
	public void user_can_see_all_the_rainfall_events_calculator_or_equivalent_documentation_files_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_EventsCalculator/table_EventsCalc'), 30)
	}


	@When("User deletes the uploaded files of calculations of impervious surfaces")
	public void user_deletes_the_uploaded_files_of_calculations_of_impervious_surfaces() {

		String tableRow = 'Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/tbody_Table_Calc_ImperSurfaces'
		String tableId = RM_Entities.tableId_Calc_ImperviousSurfaces
		String scrollTo = "Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/p_AddFile_Calc_ImperSurfaces"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see all the calculations of impervious surfaces files are deleted")
	public void user_can_see_all_the_calculations_of_impervious_surfaces_files_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/table_Calc_ImperSurfaces'), 30)
	}

	@When("User deletes the uploaded files of documents that thoroughly depict the green infrastructure techniques used")
	public void user_deletes_the_uploaded_files_of_documents_that_thoroughly_depict_the_green_infrastructure_techniques_used() {

		String tableRow = 'Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/tbody_Table_GreenInfra'
		String tableId = RM_Entities.tableId_GreenInfrastructure
		String scrollTo = "Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/p_AddFile_GreenInfra"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see all the documents that thoroughly depict the green infrastructure techniques used files are deleted")
	public void user_can_see_all_the_documents_that_thoroughly_depict_the_green_infrastructure_techniques_used_files_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/table_GreenInfra'), 30)
	}


	@When("User deletes the uploaded files of document or narrative describing the annual inspection and maintenance program")
	public void user_deletes_the_uploaded_files_of_document_or_narrative_describing_the_annual_inspection_and_maintenance_program() {

		String tableRow = 'Object Repository/RainwaterManagement/AddFile_AnnualInspection/tbody_Table_AnnualInsp'
		String tableId = RM_Entities.tableId_AnnualInspection
		String scrollTo = "Object Repository/RainwaterManagement/AddFile_AnnualInspection/p_AddFile_AnnualInsp"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see all the document or narrative describing the annual inspection and maintenance program files are deleted")
	public void user_can_see_all_the_document_or_narrative_describing_the_annual_inspection_and_maintenance_program_files_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_AnnualInspection/table_AnnualInsp'), 30)
	}

	@When("User deletes the uploaded files of additional documents in special circumstances in Rainwater Management")
	public void user_deletes_the_uploaded_files_of_additional_documents_in_special_circumstances_in_Rainwater_Management() {

		String tableRow = 'Object Repository/RainwaterManagement/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String tableId = RM_Entities.tableId_SpecialCircumstances
		String scrollTo = "Object Repository/RainwaterManagement/AddFile_SpecialCircum/p_AddFile_SplCircum"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see all the additional documents in special circumstances in Rainwater Management files are deleted")
	public void user_can_see_all_the_additional_documents_in_special_circumstances_in_Rainwater_Management_files_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_SpecialCircum/table_SplCircum'), 30)
	}

	/**
	 * Deleting the uploaded files in the form and verifying whether the files are deleted -- Ended
	 */
}