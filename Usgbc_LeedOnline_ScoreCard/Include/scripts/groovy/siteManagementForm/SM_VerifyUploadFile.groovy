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
import leedOnlineKeywords.projectKeywords

class SM_VerifyUploadFile {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	String iframe='Object Repository/Site_Management/iframe'

	@Given("User has to see the table of uploaded files on Site Assessment in SM Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_Site_Assessment_in_SM_Form() {

		WebUI.callTestCase(findTestCase('Test Cases/SiteManagement/TC_SM_Navigate'), null, FailureHandling.STOP_ON_FAILURE)


		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/Table_AddFile_SA'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/Table_AddFile_SA'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table Site Assessment in SM Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_Site_Assessment_in_SM_Form() {

		String tableRow = "Object Repository/Site_Management/AddFile_SiteAssessment/tbody_AddFile_SA"
		String tableId = SM_Entities.tableId_Xpath_SiteAssessment
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on Documentation demonstrating in SM Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_Documentation_demonstrating_in_SM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/Table_AddFile_DD'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/Table_AddFile_DD'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table Documentation demonstrating in SM Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_Documentation_demonstrating_in_SM_Form() {

		String tableRow = "Object Repository/Site_Management/AddFile_DocumentationDemonstrating/tbody_AddFile_DD"
		String tableId = SM_Entities.tableId_Xpath_Docs
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on additional documentation in SM Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_additional_documentation_in_SM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/Table_AddFile_SC'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/Table_AddFile_SC'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table additional documentation in SM Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_additional_documentation_in_SM_Form() {

		String tableRow = "Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/tbody_AddFile_SC"
		String tableId = SM_Entities.tableId_Xpath_SC
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
}