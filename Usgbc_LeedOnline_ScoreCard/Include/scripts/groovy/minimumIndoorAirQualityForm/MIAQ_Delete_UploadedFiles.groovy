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


class MIAQ_Delete_UploadedFiles {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */



	@When("User deletes the uploaded files of minimum indoor air quality calculator")
	public void user_deletes_the_uploaded_files_of_minimum_indoor_air_quality_calculator() {

		String tableRow = 'Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/tbody_Table_CalcUpload'
		String tableId = MIAQ_Entities.tableId_CalculatorUpload
		String scrollTo = "Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/p_AddFile_CalcUpload"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,MIAQ_Entities.iframe)
	}

	@Then("User can see all the minimum indoor air quality calculator files are deleted")
	public void user_can_see_all_the_minimum_indoor_air_quality_calculator_files_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/table_CalcUpload'), 30)
	}

	@When("User deletes the uploaded files of special circumstances in Minimum Indoor Air Quality")
	public void user_deletes_the_uploaded_files_of_special_circumstances_in_Minimum_Indoor_Air_Quality() {

		String tableRow = 'Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/tbody_Table_SplCircum'
		String tableId =  MIAQ_Entities.tableId_SpecialCircumstances
		String scrollTo = "Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/p_AddFile_SplCircum"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,MIAQ_Entities.iframe)
	}

	@Then("User can see all the special circumstances files in Minimum Indoor Air Quality are deleted")
	public void user_can_see_all_the_special_circumstances_files_in_Minimum_Indoor_Air_Quality_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/table_SplCircum'), 30)
	}
}