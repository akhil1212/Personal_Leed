package minimumIndoorAirQualityForm
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
import minimumIndoorAirQualityForm.MIAQ_Entities

class MIAQ_NegativeCases {
	/**
	 * Checking the negative test cases for the uploads in Minimum Indoor Air Quality ---- Started
	 */

	@When("User uploads a file which is greater than 100mb of minimum indoor air quality calculator (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_minimum_indoor_air_quality_calculator_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/input_AddFile'), myPdffilePath)
	}


	@Given("User should be able to see the Add File button in minimum indoor air quality calculator")
	public void user_should_be_able_to_see_the_Add_File_button_in_minimum_indoor_air_quality_calculator() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/p_AddFile_CalcUpload'), 30)
	}

	@When("User uploads a file for minimum indoor air quality calculator (.*)")
	public void user_uploads_a_file_for_minimum_indoor_air_quality_calculator_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/input_AddFile'), myPdffilePath)
	}


	@When("User uploads a file which is greater than 100mb of special circumstances in Minimum Indoor Air Quality (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_special_circumstances_in_Minimum_Indoor_Air_Quality_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file for special circumstances in Minimum Indoor Air Quality (.*)")
	public void user_uploads_a_file_for_special_circumstances_in_Minimum_Indoor_Air_Quality_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/input_AddFile'), myPdffilePath)
	}
	
	/**
	 * Checking the negative test cases for the uploads in Minimum Indoor Air Quality ---- Ended
	 */
}