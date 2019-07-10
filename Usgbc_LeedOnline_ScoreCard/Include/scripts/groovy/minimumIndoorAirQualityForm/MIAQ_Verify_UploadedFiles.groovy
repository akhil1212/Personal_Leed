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

class MIAQ_Verify_UploadedFiles {
	/**
	 * Verifying the uploaded files present in the form with the files uploaded -- Started
	 */


	@Given("User has to see the table of uploaded files on minimum indoor air quality calculator")
	public void user_has_to_see_the_table_of_uploaded_files_on_minimum_indoor_air_quality_calculator() {

		WebUI.callTestCase(findTestCase('Test Cases/MinimumIndoorAirQuality/TC_NavigateToMIAQ'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/p_AddFile_CalcUpload'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/table_CalcUpload'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of minimum indoor air quality calculator")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_minimum_indoor_air_quality_calculator() {

		String tableRow = 'Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/tbody_Table_CalcUpload'
		String tableId = MIAQ_Entities.tableId_CalculatorUpload
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,MIAQ_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on special circumstances for Minimum Indoor Air Quality")
	public void user_has_to_see_the_table_of_uploaded_files_on_special_circumstances_for_Minimum_Indoor_Air_Quality() {

		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/p_AddFile_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/table_SplCircum'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of special circumstances for Minimum Indoor Air Quality")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_special_circumstances_for_Minimum_Indoor_Air_Quality() {

		String tableRow = 'Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/tbody_Table_SplCircum'
		String tableId = MIAQ_Entities.tableId_SpecialCircumstances
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,MIAQ_Entities.iframe)
	}


	/**
	 * Verifying the uploaded files present in the form with the files uploaded -- Started
	 */
}