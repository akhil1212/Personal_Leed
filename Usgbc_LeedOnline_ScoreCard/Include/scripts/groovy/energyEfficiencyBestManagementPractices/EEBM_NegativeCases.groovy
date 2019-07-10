package energyEfficiencyBestManagementPractices
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


class EEBM_NegativeCases {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User should be in Energy Efficiency Best Management practices Form")
	public void user_should_be_in_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.callTestCase(findTestCase('Test Cases/EnergyEfficiencyBestManagementPractices/TC_EEBM_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User clicks on save button without entering any data in EEBM Form")
	public void user_clicks_on_save_button_without_entering_any_data_in_EEBM_Form() {

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/btn_Save'))
	}

	@When("User uploads a file which is greater than 100mb of ASHRAE preliminary energy in EEBM Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_ASHRAE_preliminary_energy_in_EEBM_Form_MBfile_pdf(String preliminary_energy) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+preliminary_energy
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/p_Upload the ASHRAE preliminary'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/input_ASHRAE_preliminary'), myPdffilePath)
	}

	@When("User uploads a file of ASHRAE preliminary energy in EEBM Form (.*)")
	public void user_uploads_a_file_of_ASHRAE_preliminary_energy_in_EEBM_Form_MBfile_doc(String preliminary_energy) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+preliminary_energy
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/p_Upload the ASHRAE preliminary'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/input_ASHRAE_preliminary'), myPdffilePath)
	}

	@Then("User clicks on save while the file is uploading in EEBM Form")
	public void user_clicks_on_save_while_the_file_is_uploading_in_EEBM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/btn_Save'), 30)
		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/btn_Save'))
	}

	@When("User uploads a file which is greater than 100mb of current facility requirements in EEBM Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_current_facility_requirements_in_EEBM_Form_MBfile_pdf(String current_facility) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+current_facility
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/p_current_facility_requirements'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/input_current_facility_requirements'), myPdffilePath)
	}

	@When("User uploads a file of current facility requirements in EEBM Form (.*)")
	public void user_uploads_a_file_of_current_facility_requirements_in_EEBM_Form_MBfile_doc(String current_facility) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+current_facility
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/p_current_facility_requirements'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/input_current_facility_requirements'), myPdffilePath)
	}



	@When("User uploads a file which is greater than 100mb of DC Pro Profiling Tool in EEBM Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_DC_Pro_Profiling_Tool_in_EEBM_Form_MBfile_pdf(String Pro_Profiling_Tool) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Pro_Profiling_Tool
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/p_DC_Pro'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/input_DC_Pro'), myPdffilePath)
	}

	@When("User uploads a file of DC Pro Profiling Tool in EEBM Form (.*)")
	public void user_uploads_a_file_of_DC_Pro_Profiling_Tool_in_EEBM_Form_MBfile_doc(String Pro_Profiling_Tool) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Pro_Profiling_Tool
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/p_DC_Pro'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/input_DC_Pro'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of additional documentation in EEBM Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_additional_documentation_in_EEBM_Form_MBfile_pdf(String additional_documentation) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+additional_documentation
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/input_additionalDoc'), myPdffilePath)
	}

	@When("User uploads a file of additional documentation in EEBM Form (.*)")
	public void user_uploads_a_file_of_additional_documentation_in_EEBM_Form_MBfile_doc(String additional_documentation) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+additional_documentation
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/input_additionalDoc'), myPdffilePath)
	}
}