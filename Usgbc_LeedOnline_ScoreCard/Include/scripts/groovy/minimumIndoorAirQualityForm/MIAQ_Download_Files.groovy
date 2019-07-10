package minimumIndoorAirQualityForm
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
import minimumIndoorAirQualityForm.MIAQ_Entities


class MIAQ_Download_Files {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("User downloads the uploaded files of minimum indoor air quality calculatorn")
	public void user_downloads_the_uploaded_files_of_minimum_indoor_air_quality_calculatorn() {

		String tableRow = 'Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/tbody_Table_CalcUpload'
		String tableId = MIAQ_Entities.tableId_CalculatorUpload
		String scrollTo = "Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/p_AddFile_CalcUpload"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,MIAQ_Entities.iframe)
	}

	@Then("User can see the downloaded file of minimum indoor air quality calculator")
	public void user_can_see_the_downloaded_file_of_minimum_indoor_air_quality_calculator() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of special circumstances for Minimum Indoor Air Quality")
	public void user_downloads_the_uploaded_files_of_special_circumstances_for_Minimum_Indoor_Air_Quality() {

		String tableRow = 'Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/tbody_Table_SplCircum'
		String tableId =  MIAQ_Entities.tableId_SpecialCircumstances
		String scrollTo = "Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/p_AddFile_SplCircum"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,MIAQ_Entities.iframe)
	}

	@Then("User can see the downloaded file of special circumstances for Minimum Indoor Air Quality")
	public void user_can_see_the_downloaded_file_of_special_circumstances_for_Minimum_Indoor_Air_Quality() {

		new projectKeywords().verifyDownloadedFiles()
	}
}