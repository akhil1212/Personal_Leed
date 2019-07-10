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

class MIAQ_AutoSaveAsDraft {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	String iframe = MIAQ_Entities.iframe
	@Given("User is on the Formv01 of Minimum Indoor Air Quality form")
	public void user_is_on_the_Formv_of_Minimum_Indoor_Air_Quality_form() {

		WebUI.callTestCase(findTestCase('Test Cases/MinimumIndoorAirQuality/TC_NavigateToMIAQ'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Minimum Indoor Air Quality form")
	public void user_will_not_modify_any_field_on_the_Minimum_Indoor_Air_Quality_form() {

		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Minimum Indoor Air Quality form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"),2)
	}

	@Given("User should be able to see Add files on Minimum Indoor Air Quality form")
	public void user_should_be_able_to_see_Add_files_on_Minimum_Indoor_Air_Quality_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/p_AddFile_CalcUpload'), 30)
	}

	@When("User uploads any file on Minimum Indoor Air Quality form")
	public void user_uploads_any_file_on_Minimum_Indoor_Air_Quality_form() {


		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'

		WebUI.uploadFile(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/input_AddFile'),myPdffilePath )

		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/p_AddFile_SplCircum'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/input_AddFile'), myPdffilePath)
	}


	@Then("User should not see saving of draft even after 10 seconds in minimum indoor air quality form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_minimum_indoor_air_quality_form() {
		WebUI.delay(10)
		boolean isNotPresent = WebUI.verifyElementNotPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"),2)
		println "No draft "+isNotPresent
	}


	@Given("User should be able to see the checkbox for EA prerequisite in Minimum Indoor Air Quality form")
	public void user_should_be_able_to_see_the_checkbox_for_EA_prerequisite_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/input_Chk_energyEfficientPractices'), 20)
		WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_energyEfficientPractices"), 5)
	}

	@When("User modifies the checkbox in the EA prerequisite for Minimum Indoor Air Quality form and waits for 10 seconds")
	public void user_modifies_the_checkbox_in_the_EA_prerequisite_for_Minimum_Indoor_Air_Quality_form_and_waits_for_seconds() {

		WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_energyEfficientPractices"))
		WebUI.delay(12)
	}

	static String checkbox_draft_EA
	@Then("User can see the draft is saved automatically with date and time for EA prerequisite checkbox in Minimum Indoor Air Quality form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_EA_prerequisite_checkbox_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"),2)
		checkbox_draft_EA = WebUI.getText(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"))
		println checkbox_draft_EA
		//println "Previous Time Option"+ dateTime
		//WebUI.verifyNotMatch(dateTime, checkbox_draft, false)
	}

	@Given("User should be able to see the checkbox for mechanically ventilated spaces in Minimum Indoor Air Quality form")
	public void user_should_be_able_to_see_the_checkbox_for_mechanically_ventilated_spaces_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/input_Chk_mechanicallyVentSpaces'), 20)
		WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_mechanicallyVentSpaces"), 5)
	}

	@When("User modifies the checkbox in the mechanically ventilated spaces for Minimum Indoor Air Quality form and waits for 10 seconds")
	public void user_modifies_the_checkbox_in_the_mechanically_ventilated_spaces_for_Minimum_Indoor_Air_Quality_form_and_waits_for_seconds() {

		WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_mechanicallyVentSpaces"))
		WebUI.delay(12)
	}

	static String checkbox_draft_Mechanically
	@Then("User can see the draft is saved automatically with date and time for mechanically ventilated spaces checkbox in Minimum Indoor Air Quality form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_mechanically_ventilated_spaces_checkbox_in_Minimum_Indoor_Air_Quality_form() {
		WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"),2)
		checkbox_draft_Mechanically = WebUI.getText(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"))
		println checkbox_draft_Mechanically
		println "Previous Time Option"+ checkbox_draft_EA
		WebUI.verifyNotMatch(checkbox_draft_Mechanically, checkbox_draft_EA, false)
	}

	@Given("User should be able to see the checkbox for naturally ventilated spaces in Minimum Indoor Air Quality form")
	public void user_should_be_able_to_see_the_checkbox_for_naturally_ventilated_spaces_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/input_Chk_mechanicallyVentSpaces'), 20)
		WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_mechanicallyVentSpaces"),20)
	}

	@When("User modifies the checkbox in the naturally ventilated spaces for Minimum Indoor Air Quality form and waits for 10 seconds")
	public void user_modifies_the_checkbox_in_the_naturally_ventilated_spaces_for_Minimum_Indoor_Air_Quality_form_and_waits_for_seconds() {

		WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_mechanicallyVentSpaces"))
		WebUI.delay(12)
	}

	static String checkbox_draft_Naturally
	@Then("User can see the draft is saved automatically with date and time for naturally ventilated spaces checkbox in Minimum Indoor Air Quality form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_naturally_ventilated_spaces_checkbox_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"),2)
		checkbox_draft_Naturally = WebUI.getText(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"))
		println checkbox_draft_Naturally
		println "Previous Time Option"+ checkbox_draft_Mechanically
		WebUI.verifyNotMatch(checkbox_draft_Naturally, checkbox_draft_Mechanically, false)
	}


	static String txt_DescribingTheMethod = "Test Data 1 for Narrative for AutoSaveAsDraft functionatlity"
	@Given("User should be able to see the describing the method or protocol narrative in Minimum Indoor Air Quality form")
	public void user_should_be_able_to_see_the_describing_the_method_or_protocol_narrative_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_DescribeMethod/p_Editor_DescrMethod'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_DescribeMethod/p_Editor_DescrMethod'), 5)
	}

	@When("User modifies the describing the method or protocol narrative data in the Minimum Indoor Air Quality form form and waits for 10 seconds")
	public void user_modifies_the_describing_the_method_or_protocol_narrative_data_in_the_Minimum_Indoor_Air_Quality_form_form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_DescribeMethod/body_Editor_DescrMethod'),txt_DescribingTheMethod)
		WebUI.delay(10)
	}

	static String narrative_draft_time
	@Then("User can see the draft is saved automatically with date and time for describing the method or protocol narrative in Minimum Indoor Air Quality form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_describing_the_method_or_protocol_narrative_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"),2)
		narrative_draft_time = WebUI.getText(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"))
		println "Cuurent Time Narrative "+ narrative_draft_time
		println "Previous Time Option"+ checkbox_draft_Naturally
		WebUI.verifyNotMatch(narrative_draft_time, checkbox_draft_Naturally, false)
	}

	@Given("User can see the Draft is saved automatically with date and time in Minimum Indoor Air Quality form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"),2)
	}

	@When("User saves the Minimum Indoor Air Quality form")
	public void user_saves_the_Minimum_Indoor_Air_Quality_form() {

		WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/btn_Save"))
		WebUI.delay(10)
	}

	@Then("User verifies the form draft warning message is not retained in Minimum Indoor Air Quality form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/div_Form drafted and not yet saved"), 2)

		// For deleting the uploaded files

		String tableRow = 'Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/tbody_Table_CalcUpload'
		String tableId = MIAQ_Entities.tableId_CalculatorUpload
		String scrollTo = "Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/p_AddFile_CalcUpload"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,MIAQ_Entities.iframe)

		String tableRow1 = 'Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/tbody_Table_SplCircum'
		String tableId1 =  MIAQ_Entities.tableId_SpecialCircumstances
		String scrollTo1 = "Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/p_AddFile_SplCircum"

		new projectKeywords().deleteUploadedFiles(tableRow1,tableId1,scrollTo1,MIAQ_Entities.iframe)
	}


	@Given("User can see the special circumstances narrative in Minimum Indoor Air Quality form")
	public void user_can_see_the_special_circumstances_narrative_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_SplCircumstances/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_SplCircumstances/p_Editor_SplCircum'), 5)
	}

	@When("User modifies the special circumstances narrative data in Minimum Indoor Air Quality form form and waits for {int} seconds")
	public void user_modifies_the_special_circumstances_narrative_data_in_Minimum_Indoor_Air_Quality_form_form_and_waits_for_seconds(Integer int1) {

		WebUI.setText(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/body_Editor_SplCircum'),txt_DescribingTheMethod)

		WebUI.delay(10)
	}

	static String narrative_spl_draft_time
	@And("User can see the Clear draft in Minimum Indoor Air Quality form")
	public void user_can_see_the_Clear_draft_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"),2)
		narrative_spl_draft_time = WebUI.getText(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"))
		println "Cuurent Time Narrative "+ narrative_spl_draft_time
	}

	@And("User clicks on Clear draft in Minimum Indoor Air Quality form")
	public void user_clicks_on_Clear_draft_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.click(findTestObject('Object Repository/MinimumIndoorAirQuality/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/button_Yes"))
		WebUI.delay(5)
	}

	@Then("User can see the draft is cleared in Minimum Indoor Air Quality form")
	public void user_can_see_the_draft_is_cleared_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"), 2)
	}

	//##################Logout and Login##############################
	static String draft_date_beforeLogout
	@When("User modifies the special circumstances narrative data in Minimum Indoor Air Quality form")
	public void user_modifies_the_special_circumstances_narrative_data_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.setText(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/body_Editor_SplCircum'),txt_DescribingTheMethod)
		WebUI.delay(10)
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/span_Last draft saved on"))
		println draft_date_beforeLogout
	}

	@And("User will logout from the Minimum Indoor Air Quality form")
	public void user_will_logout_from_the_Minimum_Indoor_Air_Quality_form() {

		WebUI.click(findTestObject('Object Repository/MinimumIndoorAirQuality/Autosave/div_Signout'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/MinimumIndoorAirQuality/Autosave/a_Sign out'))
		WebUI.delay(2)
		WebUI.closeBrowser()
	}

	@And("User logs in again to Minimum Indoor Air Quality form")
	public void user_logs_in_again_to_Minimum_Indoor_Air_Quality_form() {

		String formName = "Object Repository/MinimumIndoorAirQuality/Navigation/div_Minimum Indoor Air Quality"

		String formv01 = "Object Repository/MinimumIndoorAirQuality/Navigation/a_Form (V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
	}

	@Then("User should see the warning message is displayed with date and time at the top of the Minimum Indoor Air Quality form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Minimum_Indoor_Air_Quality_form() {

		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg

	}

	@And("User verifies draft version is not changed after logout and login in Minimum Indoor Air Quality form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Minimum_Indoor_Air_Quality_form() {


		WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/MinimumIndoorAirQuality/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now"+draft_date_afterLogin

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/MinimumIndoorAirQuality/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/button_Yes"))
	}
}