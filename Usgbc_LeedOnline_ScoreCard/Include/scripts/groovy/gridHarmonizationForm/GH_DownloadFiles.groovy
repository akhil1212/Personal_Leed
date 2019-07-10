package gridHarmonizationForm
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

class GH_DownloadFiles {

	String iframe='Object Repository/GridHarmonization/iframe'
	@When("User downloads the uploaded files of summary for Permanent Load Shifting in GH Form")
	public void user_downloads_the_uploaded_files_of_summary_for_permanent_Load_Shifting_in_GH_Form() {

		String tableRow = "Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/tbody_UploadSummary"
		String tableId = GH_Entities.tableId_Xpath_Summary
		String scrollTo = "Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/p_Upload a summary"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see the downloaded file of summary for Permanent Load Shifting in GH successfully")
	public void user_can_see_the_downloaded_file_of_summary_for_Permanent_Load_Shifting_in_GH_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of enrollement Demand Response Program in GH Form")
	public void user_downloads_the_uploaded_files_of_enrollement_Demand_Response_Program_in_GH_Form() {

		String tableRow = "Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/tbody_UploadProof"
		String tableId = GH_Entities.tableId_Xpath_Proof_Of_Enrollement
		String scrollTo = "Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/p_Upload proof of enrollment"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see the downloaded file of enrollement Demand Response Program in GH successfully")
	public void user_can_see_the_downloaded_file_of_enrollement_Demand_Response_Program_in_GH_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of additional documentation in GH Form")
	public void user_downloads_the_uploaded_files_of_additional_documentation_in_GH_Form() {

		String tableRow = "Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/tbody_SC_AddFile"
		String tableId = GH_Entities.tableId_Xpath_Additional_Documentation
		String scrollTo = "Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/p_SC_AddFile"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see the downloaded file of additional documentation in GH Form")
	public void user_can_see_the_downloaded_file_of_additional_documentation_in_SM_Form() {

		new projectKeywords().verifyDownloadedFiles()
	}
}