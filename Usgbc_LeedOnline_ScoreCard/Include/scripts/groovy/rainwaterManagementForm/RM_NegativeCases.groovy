package rainwaterManagementForm
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
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


class RM_NegativeCases {
	/**
	 * Checking the negative test cases for the uploads in Rainwater Management ---- Started
	 */

	@When("User uploads a file which is greater than 100mb of rainfall events calculator or equivalent documentation (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_rainfall_events_calculator_or_equivalent_documentation_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		//WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/p_IntegrartedPestMngnt'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_EventsCalculator/input_AddFile'), myPdffilePath)
	}

	@Given("User should be able to see the Add File button for rainfall events calculator or equivalent documentation")
	public void user_should_be_able_to_see_the_Add_File_button_for_rainfall_events_calculator_or_equivalent_documentation() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_EventsCalculator/p_AddFile_EventsCalc'), 30)
	}

	@When("User uploads a file of rainfall events calculator or equivalent documentation (.*)")
	public void user_uploads_a_file_of_rainfall_events_calculator_or_equivalent_documentation_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_EventsCalculator/input_AddFile'), myPdffilePath)
	}


	@When("User uploads a file which is greater than 100mb of calculations of impervious surfaces (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_calculations_of_impervious_surfaces_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file of calculations of impervious surfaces (.*)")
	public void user_uploads_a_file_of_calculations_of_impervious_surfaces_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of documents that thoroughly depict the green infrastructure techniques used (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_documents_that_thoroughly_depict_the_green_infrastructure_techniques_used_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file of documents that thoroughly depict the green infrastructure techniques used (.*)")
	public void user_uploads_a_file_of_documents_that_thoroughly_depict_the_green_infrastructure_techniques_used_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of document or narrative describing the annual inspection and maintenance program (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_document_or_narrative_describing_the_annual_inspection_and_maintenance_program_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_AnnualInspection/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file of document or narrative describing the annual inspection and maintenance program (.*)")
	public void user_uploads_a_file_of_document_or_narrative_describing_the_annual_inspection_and_maintenance_program_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_AnnualInspection/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of additional documents in special circumstances in Rainwater Management (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_additional_documents_in_special_circumstances_in_Rainwater_Management_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_SpecialCircum/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file of additional documents in special circumstances in Rainwater Management (.*)")
	public void user_uploads_a_file_of_additional_documents_in_special_circumstances_in_Rainwater_Management_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_SpecialCircum/input_AddFile'), myPdffilePath)
	}
	/**
	 * Checking the negative test cases for the uploads in Rainwater Management ---- Ended
	 */
}