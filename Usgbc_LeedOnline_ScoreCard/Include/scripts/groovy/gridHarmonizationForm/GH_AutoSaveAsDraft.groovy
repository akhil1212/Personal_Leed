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
import com.kms.katalon.core.configuration.RunConfiguration


class GH_AutoSaveAsDraft {
	String iframe='Object Repository/GridHarmonization/iframe'

	@Given("User is on the Formv{int} of Grid Harmonization")
	public void user_is_on_the_Formv_of_Grid_Harmonization(Integer int1) {
		WebUI.callTestCase(findTestCase('Test Cases/GridHarmonization/TC_GH_Navigate'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Grid Harmonization Form")
	public void user_will_not_modify_any_field_on_the_Grid_Harmonization_Form() {
		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Grid Harmonization Form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Grid_Harmonization_Form() {

		WebUI.verifyElementNotPresent(findTestObject('Object Repository/GridHarmonization/Autosave/span_Last draft saved on'),2)
	}

	@Given("User should be able to see Upload file on Grid Harmonization Form")
	public void user_should_be_able_to_see_Upload_file_on_Grid_Harmonization_Form() {
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/input_AddFile_UploadSummary'), 5)
	}

	@When("User uploads any files on Grid Harmonization Form")
	public void user_uploads_any_files_on_Grid_Harmonization_Form() {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		println myPdffilePath

		WebUI.uploadFile(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/input_AddFile_UploadSummary'), myPdffilePath)

		WebUI.delay(10)
	}

	@Given("User should be able to see the textbox for Peak Electricity in Grid Harmonization")
	public void user_should_be_able_to_see_the_textbox_for_Peak_Electricity_in_Grid_Harmonization() {
	}
	String Peak_Electricity
	@When("User modifies the values in the Peak Electricity in Grid Harmonization")
	public void user_modifies_the_value_in_the_Peak_Electricity_in_Grid_Harmonization() {
		Peak_Electricity=56
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PeakElectricityDemand'), Peak_Electricity)
	}
	String Peak_Electricity_draft
	@Then("User can see saving of draft even after 10 seconds in Grid Harmonization Form")
	public void user_can_see_saving_of_draft_even_after_10_seconds_in_Grid_Harmonization_Form() {
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject("Object Repository/GridHarmonization/Autosave/span_Last draft saved on"),2)

		String cleaning_products_draft = WebUI.getText(findTestObject('Object Repository/GridHarmonization/Autosave/span_Last draft saved on'))
		println "Peak Electricity draft Before:"+Peak_Electricity_draft
	}

	@Given("User should be able to see textbox for Planned demand reduction in Grid Harmonization")
	public void user_should_be_able_to_see_textbox_for_Peak_Electricity_in_Grid_Harmonization() {
	}
	String Planned_demand
	@When("User modifies the values in the Planned demand reduction in Grid Harmonization")
	public void user_modifies_the_value_in_the_Planned_Demand_reduction_in_Grid_Harmonization() {
		Planned_demand=23
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PlannedDemandReduction'), Planned_demand)
	}
	String Planned_demand_draft
	@Then("User should see saving of draft even after 10 seconds in Grid Harmonization Form")
	public void user_should_see_saving_of_draft_even_after_10_seconds_in_Grid_Harmonization_Form() {
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject("Object Repository/GridHarmonization/Autosave/span_Last draft saved on"),2)

		String cleaning_products_draft = WebUI.getText(findTestObject('Object Repository/GridHarmonization/Autosave/span_Last draft saved on'))
		println "Planned demand draft Before:"+Planned_demand_draft
	}

	@Given("User should be able to see the textbox for Percent on peak reduction in Grid Harmonization")
	public void user_should_be_able_to_see_the_textbox_for_Percent_on_peak_reduction_in_Grid_Harmonization() {
	}

	@When("User should click on textbox of Percent in Grid Harmonization")
	public void User_should_click_on_textbox_of_Percent_in_Grid_Harmonization() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PercentOn-peakReduction'))
	}
	String Percent_draft
	@Then("User can see the draft is saved automatically with date and time for change in textbox in Grid Harmonization Form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_change_in_textbox_in_Grid_Harmonization_Form() {
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject("Object Repository/GridHarmonization/Autosave/span_Last draft saved on"),2)

		String Percent_draft = WebUI.getText(findTestObject('Object Repository/GridHarmonization/Autosave/span_Last draft saved on'))
	}
	static String txt_Narrativedata = "Test Data for Narrative"
	@Given("User should be able to see the Special Circumstances narrative in Grid Harmonization Form")
	public void user_should_be_able_to_see_the_Special_Circumstances_narrative_in_Grid_Harmonization_Form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/p_SC_EditorBox'), 5)
	}

	@When("User modifies the Special Circumstances narrative data in the Grid Harmonization Form and waits for {int} seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_Grid_Harmonization_Form_and_waits_for_seconds(Integer int1) {
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),txt_Narrativedata)
		WebUI.delay(10)
	}
	String narrative_draft
	String textbox_draft
	@Then("User can see the draft is saved automatically with date and time for Special Circumstances narrative in Grid Harmonization Form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_Special_Circumstances_narrative_in_Grid_Harmonization_Form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/Autosave/span_Last draft saved on'),2)
		narrative_draft = WebUI.getText(findTestObject('Object Repository/GridHarmonization/Autosave/span_Last draft saved on'))
		println narrative_draft

		WebUI.verifyNotMatch(textbox_draft, narrative_draft, false)
	}

	@Given("User can see the Draft is saved automatically with date and time in Grid Harmonization Form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Grid_Harmonization_Form() {
		WebUI.verifyElementPresent(findTestObject("Object Repository/GridHarmonization/Autosave/span_Last draft saved on"), 2)
	}

	@Given("User can see the save button in Grid Harmonization Form")
	public void user_can_see_the_save_button_in_Grid_Harmonization_Form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/button_Save'), 2)
	}

	@When("User saves the Grid Harmonization Form")
	public void user_saves_the_Grid_Harmonization_Form() {
		WebUI.delay(10)
		WebUI.click(findTestObject('Object Repository/GridHarmonization/button_Save'))
		WebUI.delay(10)
	}

	@Then("User verifies the form draft warning message is not retained in Grid Harmonization Form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Grid_Harmonization_Form() {
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/GridHarmonization/Autosave/div_Form drafted and not yet saved"), 2)

		String iframe="Object Repository/GridHarmonization/iframe"
		String tableRow = "Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/tbody_UploadSummary"
		String tableId = GH_Entities.tableId_Xpath_Summary
		String scrollTo = "Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/p_Upload a summary"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,iframe)


		WebUI.delay(3)
	}

	@When("User modifies the Special Circumstances narrative data in the GH Form and waits for 10 seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_GH_Form_and_waits_for_seconds() {
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),"Test Data for Special Circumstances")
		WebUI.delay(10)
	}

	@Then("User should clear the draft present in Grid Harmonization Form")
	public void user_should_clear_the_draft_present_in_Grid_Harmonization_Form() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/GridHarmonization/button_Yes"))
		WebUI.delay(5)
	}

	@Given("User can see the radio button in Grid Harmonization form for Demand Response Capable")
	public void user_can_see_the_radio_button_in_Grid_Harmonization_form_for_Demand_Response_Capable() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_SelectOption'), 30)
	}

	@When("User clicks on the radio button of Demand Response Capable and waits for 10 seconds")
	public void user_clicks_on_the_radio_button_of_Demand_Response_Capable_and_waits_for_seconds() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_SelectOption'))
		WebUI.delay(10)
	}

	@When("User can see the Clear draft in Grid Harmonization form")
	public void user_can_see_the_Clear_draft_in_Grid_Harmonization_form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/Autosave/a_Clear draft'), 5)
	}

	@When("User clicks on Clear draft in Grid Harmonization form")
	public void user_clicks_on_Clear_draft_in_Grid_Harmonization_form() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/GridHarmonization/button_Yes"))
	}

	@Then("User can see the draft is cleared in Grid Harmonization form")
	public void user_can_see_the_draft_is_cleared_in_Grid_Harmonization_form() {
		WebUI.delay(5)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/GridHarmonization/Autosave/a_Clear draft'), 5)
	}

	@Given("User can see the narrative in Grid Harmonization Form")
	public void user_can_see_the_narrative_in_Grid_Harmonization_Form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'), 5)
	}
	String draft_beforeLogout
	@When("User modifies narrative data in Grid Harmonization Form")
	public void user_modifies_narrative_data_in_Grid_Harmonization_Form() {

		WebUI.setText(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),"Testing for Logout and Login")
		WebUI.delay(10)
		draft_beforeLogout = WebUI.getText(findTestObject("Object Repository/GridHarmonization/Autosave/span_Last draft saved on"))
		println draft_beforeLogout
	}

	@When("User will logout from the Grid Harmonization Form")
	public void user_will_logout_from_the_Grid_Harmonization_Form() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/Autosave/div_Signout'))
		WebUI.click(findTestObject('Object Repository/GridHarmonization/Autosave/a_Sign out'))
		WebUI.delay(2)
	}

	@Then("User logs in again to Grid Harmonization Form")
	public void user_logs_in_again_to_Grid_Harmonization_Form() {
		String formName = "Object Repository/GridHarmonization/Navigation/div_Grid Harmonization"

		String formv01 = "Object Repository/GridHarmonization/Navigation/span_(V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
	}

	@Then("User should see the warning message is displayed with date and time at the top of the Grid Harmonization Form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Grid_Harmonization_Form() {
		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}

	@Then("User verifies draft version is not changed after logout and login in Grid Harmonization Form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Grid_Harmonization_Form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_afterLogin = WebUI.getText(findTestObject('Object Repository/GridHarmonization/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_beforeLogout,draft_afterLogin,false)

		println "Before Logout "+draft_beforeLogout
		println "Now"+draft_afterLogin

		WebUI.delay(2)
	}

	@Then("User click on clear draft on the Grid Harmonization Form")
	public void user_click_on_clear_draft_on_the_Grid_Harmonization_Form() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/GridHarmonization/button_Yes"))
	}
}