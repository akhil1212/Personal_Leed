package environmentalTobaccoSmokeControl
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
import environmentalTobaccoSmokeControl.ETSC_Entities

class ETSC_Download_Files {
	/**
	 * Downloading the uploaded files present in the form and verifying with the files  -- Started
	 */

	@When("User downloads the uploaded files of No-smoking policy document")
	public void user_downloads_the_uploaded_files_of_No_smoking_policy_document() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/tbody_Table_NonSmoke'
		String tableId = ETSC_Entities.tableId_NonSmokePolicy
		String scrollTo = "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/p_AddFile_NonSmokePolicy"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,ETSC_Entities.iframe)
	}

	@Then("User can see the downloaded file of No-smoking policy document")
	public void user_can_see_the_downloaded_file_of_No_smoking_policy_document() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of scaled site plan")
	public void user_downloads_the_uploaded_files_of_scaled_site_plan() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/tbody_Table_ScaledSite'
		String tableId = ETSC_Entities.tableId_ScaledSite
		String scrollTo = "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/p_AddFile_ScaledSite"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,ETSC_Entities.iframe)
	}


	@Then("User can see the downloaded file of scaled site plan")
	public void user_can_see_the_downloaded_file_of_scaled_site_plan() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of information about the code")
	public void user_downloads_the_uploaded_files_of_information_about_the_code() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/tbody_Table_InfoCode'
		String tableId = ETSC_Entities.tableId_InformationCode
		String scrollTo = "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/p_AddFile_InfoCode"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,ETSC_Entities.iframe)
	}

	@Then("User can see the downloaded file of information about the code")
	public void user_can_see_the_downloaded_file_of_information_about_the_code() {

		new projectKeywords().verifyDownloadedFiles()
	}


	@When("User downloads the uploaded files of weather stripping and sealing")
	public void user_downloads_the_uploaded_files_of_weather_stripping_and_sealing() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/tbody_Table_WeatherStrip'
		String tableId = ETSC_Entities.tableId_WeatherStripping
		String scrollTo = "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/p_AddFile_WeatherStrip"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,ETSC_Entities.iframe)
	}

	@Then("User can see the downloaded file of weather stripping and sealing")
	public void user_can_see_the_downloaded_file_of_weather_stripping_and_sealing() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of differential air pressure test report")
	public void user_downloads_the_uploaded_files_of_differential_air_pressure_test_report() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/tbody_Table_AirPressure'
		String tableId = ETSC_Entities.tableId_AirPressure
		String scrollTo = "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/p_AddFile_AirPressure"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,ETSC_Entities.iframe)
	}

	@Then("User can see the downloaded file of differential air pressure test report")
	public void user_can_see_the_downloaded_file_of_differential_air_pressure_test_report() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of special circumstances in Environmental Tobacco Smoke Control")
	public void user_downloads_the_uploaded_files_of_special_circumstances_in_Environmental_Tobacco_Smoke_Control() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String tableId = ETSC_Entities.tableId_SpecialCircumstances
		String scrollTo = "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/p_AddFile_SplCircum"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,ETSC_Entities.iframe)
	}

	@Then("User can see the downloaded file of special circumstances in Environmental Tobacco Smoke Control")
	public void user_can_see_the_downloaded_file_of_special_circumstances_in_Environmental_Tobacco_Smoke_Control() {

		new projectKeywords().verifyDownloadedFiles()
	}

	/**
	 * Downloading the uploaded files present in the form and verifying with the files  -- Ended
	 */
}