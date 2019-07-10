package environmentalTobaccoSmokeControl
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
import environmentalTobaccoSmokeControl.ETSC_Entities

class ETSC_NegativeCases {
	/**
	 * Checking the negative test cases for the uploads in Environmental Tobacco Smoke Control ---- Started
	 */

	@When("User uploads a file which is greater than 100mb of No-smoking policy document (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_No_smoking_policy_document_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/input_AddFile'), myPdffilePath)
	}

	@Given("User should be able to see the Add File button in No-smoking policy document")
	public void user_should_be_able_to_see_the_Add_File_button_in_No_smoking_policy_document() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/p_AddFile_NonSmokePolicy'), 30)
	}

	@When("User uploads a file for No-smoking policy document (.*)")
	public void user_uploads_a_file_for_No_smoking_policy_document_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of scaled site plan (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_scaled_site_plan_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file for scaled site plan (.*)")
	public void user_uploads_a_file_for_scaled_site_plan_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of information about the code (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_information_about_the_code_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file for information about the code (.*)")
	public void user_uploads_a_file_for_information_about_the_code_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of weather stripping and sealing (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_weather_stripping_and_sealing_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file for weather stripping and sealing (.*)")
	public void user_uploads_a_file_for_weather_stripping_and_sealing_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of differential air pressure test report (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_differential_air_pressure_test_report_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/input_AddFile'), myPdffilePath)
	}



	@When("User uploads a file for differential air pressure test report (.*)")
	public void user_uploads_a_file_for_differential_air_pressure_test_report_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of special circumstances in Environmental Tobacco Smoke Control (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_special_circumstances_in_Environmental_Tobacco_Smoke_Control_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file for special circumstances in Environmental Tobacco Smoke Control (.*)")
	public void user_uploads_a_file_for_special_circumstances_in_Environmental_Tobacco_Smoke_Control_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/input_AddFile'), myPdffilePath)
	}

	/**
	 * Checking the negative test cases for the uploads in Environmental Tobacco Smoke Control ---- Ended
	 */
}