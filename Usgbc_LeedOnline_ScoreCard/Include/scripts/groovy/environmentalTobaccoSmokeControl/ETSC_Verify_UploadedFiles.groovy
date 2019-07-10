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

class ETSC_Verify_UploadedFiles {
	/**
	 *  Verifying the uploaded files present in the form with the files uploaded -- Started
	 */

	@Given("User has to see the table of uploaded files on No-smoking policy document")
	public void user_has_to_see_the_table_of_uploaded_files_on_No_smoking_policy_document() {

		WebUI.callTestCase(findTestCase('Test Cases/EnvironmentalTobaccoSmokeControl/TC_NavigateToETSC'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/p_AddFile_NonSmokePolicy'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/p_AddFile_NonSmokePolicy'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of No-smoking policy document")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_No_smoking_policy_document() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/tbody_Table_NonSmoke'
		String tableId = ETSC_Entities.tableId_NonSmokePolicy
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,ETSC_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on scaled site plan")
	public void user_has_to_see_the_table_of_uploaded_files_on_scaled_site_plan() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/p_AddFile_ScaledSite'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/p_AddFile_ScaledSite'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of scaled site plan")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_scaled_site_plan() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/tbody_Table_ScaledSite'
		String tableId = ETSC_Entities.tableId_ScaledSite
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,ETSC_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on information about the code")
	public void user_has_to_see_the_table_of_uploaded_files_on_information_about_the_code() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/p_AddFile_InfoCode'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/p_AddFile_InfoCode'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of information about the code")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_information_about_the_code() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/tbody_Table_InfoCode'
		String tableId = ETSC_Entities.tableId_InformationCode
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,ETSC_Entities.iframe)
	}

	@Given("User has to see the table of uploaded files on weather stripping and sealing")
	public void user_has_to_see_the_table_of_uploaded_files_on_weather_stripping_and_sealing() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/p_AddFile_WeatherStrip'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/p_AddFile_WeatherStrip'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of weather stripping and sealing")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_weather_stripping_and_sealing() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/tbody_Table_WeatherStrip'
		String tableId = ETSC_Entities.tableId_WeatherStripping
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,ETSC_Entities.iframe)
	}

	@Given("User has to see the table of uploaded files on differential air pressure test report")
	public void user_has_to_see_the_table_of_uploaded_files_on_differential_air_pressure_test_report() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/p_AddFile_AirPressure'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/p_AddFile_AirPressure'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of differential air pressure test report")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_differential_air_pressure_test_report() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/tbody_Table_AirPressure'
		String tableId = ETSC_Entities.tableId_AirPressure
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,ETSC_Entities.iframe)
	}

	@Given("User has to see the table of uploaded files on special circumstances in Environmental Tobacco Smoke Control")
	public void user_has_to_see_the_table_of_uploaded_files_on_special_circumstances_in_Environmental_Tobacco_Smoke_Control() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of special circumstances in Environmental Tobacco Smoke Control")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_special_circumstances_in_Environmental_Tobacco_Smoke_Control() {

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String tableId = ETSC_Entities.tableId_SpecialCircumstances
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,ETSC_Entities.iframe)
	}

	/**
	 *  Verifying the uploaded files present in the form with the files uploaded -- Ended
	 */
}