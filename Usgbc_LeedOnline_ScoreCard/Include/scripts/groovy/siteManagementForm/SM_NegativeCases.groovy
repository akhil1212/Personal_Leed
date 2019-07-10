package siteManagementForm
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
import com.kms.katalon.core.configuration.RunConfiguration

class SM_NegativeCases {
	@Given("User should be in Site Management form")
	public void user_should_be_in_Site_Management_form() {
		WebUI.callTestCase(findTestCase('Test Cases/SiteManagement/TC_SM_Navigate'), null, FailureHandling.STOP_ON_FAILURE)


		boolean insideForm = WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/Navigation/sitemanagement_Credit'), 30)
		if (insideForm == true){
			println "Inside the site management form"
		}
		else {
			println "Not inside the site management form"
		}
	}

	@When("User clicks on save button without entering any data in SM")
	public void user_clicks_on_save_button_without_entering_any_data_in_SM() {
		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/button_Save'), 30)
		WebUI.click(findTestObject('Object Repository/Site_Management/button_Save'))
	}



	@Given("User should see the Add File button for Site Assessment in SM Form")
	public void user_should_see_the_Add_File_button_for_Site_Assessment_in_SM_Form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/p_Upload_SA'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/p_Upload_SA'), 30)
	}

	@When("User uploads a file which is greater than 100mb of Site Assessment in SM Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_100mb_of_Site_Assessment_in_SM_Form(String Site_Assessment) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Site_Assessment
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/p_Upload_SA'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/input_AddFile_SA'), myPdffilePath)
	}


	@When("User uploads a file of Site Assessment in SM Form(.*)")
	public void user_uploads_a_file_of_Site_Assessment_in_SM_Form(String Site_Assessment) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Site_Assessment
		println ("######################"+ myPdffilePath)

		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/input_AddFile_SA'), myPdffilePath)
	}

	@Then("User clicks on save while the file is uploading in SM")
	public void user_clicks_on_save_while_the_file_is_uploading_in_SM() {
		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/button_Save'), 30)
		WebUI.click(findTestObject('Object Repository/Site_Management/button_Save'))
	}


	@Given("User should be able to see the Add File button for Documentation demonstrating in SM Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_Documentation_demonstrating_in_SM_Form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/p_Upload_DD'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/p_Upload_DD'), 30)
	}

	@When("User uploads a file which is greater than 100mb of Documentation demonstrating in SM Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Documentation_demonstrating_in_SM_Form(String Documentation_demonstrating ){
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Documentation_demonstrating
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/p_Upload_DD'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/input_AddFile_DD'), myPdffilePath)
	}

	@When("User uploads a file of Documentation demonstrating in SM Form (.*)")
	public void user_uploads_a_file_of_Documentation_demonstrating_in_SM_Form(String Documentation_demonstrating ) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Documentation_demonstrating
		println ("######################"+ myPdffilePath)

		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/input_AddFile_DD'), myPdffilePath)
	}

	@Given("User should be able to see the Add File button for additional documentation in SM Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_additional_documentation_in_SM_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/p_Upload_SC'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/p_Upload_SC'), 30)
	}

	@When("User uploads a file which is greater than 100mb of additional documentation in SM Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_additional_documentation_in_SM_Form(String additional_documentation) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+additional_documentation
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/p_Upload_SC'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/input_AddFile_SC'), myPdffilePath)
	}

	@When("User uploads a file of additional documentation in SM Form (.*)")
	public void user_uploads_a_file_of_additional_documentation_in_SM_Form_MBfile_doc(String additional_documentation) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+additional_documentation
		println ("######################"+ myPdffilePath)

		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/input_AddFile_SC'), myPdffilePath)
	}
}