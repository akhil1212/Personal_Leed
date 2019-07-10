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

class DeleteSiteManageMent {

	String iframe='Object Repository/Site_Management/iframe'
	@When("User deletes the uploaded files of Site Assessment in SM Form")
	public void User_deletes_the_uploaded_files_of_Site_Assessment_in_SM_Form() {

		String tableRow ="Object Repository/Site_Management/AddFile_SiteAssessment/tbody_AddFile_SA"
		String tableId = SM_Entities.tableId_Xpath_SiteAssessment
		String scrollTo = "Object Repository/Site_Management/AddFile_SiteAssessment/p_Upload_SA"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the Site Assessment in SM Form are deleted")
	public void User_can_see_all_the_Site_Assessment_in_SM_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/Table_AddFile_SA'), 30)
	}

	@When("User deletes the uploaded files ofDocumentation demonstrating in SM Form")
	public void User_deletes_the_uploaded_files_ofDocumentation_demonstrating_in_SM_Form() {

		String tableRow ="Object Repository/Site_Management/AddFile_DocumentationDemonstrating/tbody_AddFile_DD"
		String tableId = SM_Entities.tableId_Xpath_Docs
		String scrollTo = "Object Repository/Site_Management/AddFile_DocumentationDemonstrating/p_Upload_DD"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the Documentation demonstrating in SM Form are deleted")
	public void User_can_see_all_the_Documentation_demonstrating_in_SM_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/Table_AddFile_DD'), 30)
	}


	@When("User deletes the uploaded files of additional documentation in SM Form")
	public void user_deletes_the_uploaded_files_of_additional_documentation_in_SM_Form() {

		String tableRow ="Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/tbody_AddFile_SC"
		String tableId = SM_Entities.tableId_Xpath_SC
		String scrollTo = "Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/p_Upload_SC"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the additional documentation in SM Form are deleted")
	public void user_can_see_all_the_additional_documentation_in_SM_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/Table_AddFile_SC'), 30)
	}
}