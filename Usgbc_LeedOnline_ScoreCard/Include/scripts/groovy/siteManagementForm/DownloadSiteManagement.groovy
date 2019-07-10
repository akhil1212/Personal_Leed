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

class DownloadSiteManagement {

	String iframe='Object Repository/Site_Management/iframe'

	@When("User downloads the uploaded files of Site Assessment in SM Form")
	public void user_downloads_the_uploaded_files_of_Site_Assessment_in_SM_Form() {

		String tableRow = "Object Repository/Site_Management/AddFile_SiteAssessment/tbody_AddFile_SA"
		String tableId = SM_Entities.tableId_Xpath_SiteAssessment
		String scrollTo = "Object Repository/Site_Management/AddFile_SiteAssessment/p_Upload_SA"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see the downloaded file of Site Assessment in SM Form successfully")
	public void user_can_see_the_downloaded_file_of_Site_Assessment_in_SM_Form_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of Documentation demonstrating in SM Form")
	public void user_downloads_the_uploaded_files_of_Documentation_demonstrating_in_SM_Form() {

		String tableRow = "Object Repository/Site_Management/AddFile_DocumentationDemonstrating/tbody_AddFile_DD"
		String tableId = SM_Entities.tableId_Xpath_Docs
		String scrollTo = "Object Repository/Site_Management/AddFile_DocumentationDemonstrating/p_Upload_DD"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see the downloaded file of Documentation demonstrating in SM Form successfully")
	public void user_can_see_the_downloaded_file_of_Documentation_demonstrating_in_SM_Form_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of additional documentation in SM Form")
	public void user_downloads_the_uploaded_files_of_additional_documentation_in_SM_Form() {

		String tableRow = "Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/tbody_AddFile_SC"
		String tableId = SM_Entities.tableId_Xpath_SC
		String scrollTo = "Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/p_Upload_SC"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see the downloaded file of additional documentation in SM Form successfully")
	public void user_can_see_the_downloaded_file_of_additional_documentation_in_SM_Form_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}
}