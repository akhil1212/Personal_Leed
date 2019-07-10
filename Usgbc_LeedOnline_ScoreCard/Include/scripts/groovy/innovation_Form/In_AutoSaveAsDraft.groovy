package innovation_Form
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

class In_AutoSaveAsDraft {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User is on the Formv01 of Innovation Form")
	public void user_is_on_the_Formv_of_Innovation_Form() {

		WebUI.callTestCase(findTestCase('Test Cases/Innovation/TC_In_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Innovation Form")
	public void user_will_not_modify_any_field_on_the_Innovation_Form() {

		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Innovation Form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Innovation_Form() {

		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Innovation/Autosave/span_Last draft saved on'), 0)
	}

	@Given("User should be able to see Upload file on Innovation Form")
	public void user_should_be_able_to_see_Upload_file_on_Innovation_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/p_LEED_Accredited'), 2)
	}

	@When("User uploads any files on Innovation Form")
	public void user_uploads_any_files_on_Innovation_Form() {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		WebUI.uploadFile(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/input_LEED_Accredited'),myPdffilePath )
		WebUI.uploadFile(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/input_required_doc'), myPdffilePath)

		WebUI.delay(15)
	}


	String name_pilot="Credit_AutoSave"
	@When("User changes name of the pilot credit textbox on Innovation Form")
	public void user_changes_name_of_the_pilot_credit_textbox_on_Innovation_Form() {

		WebUI.setText(findTestObject("Object Repository/Innovation/Pilot_Credit_Opt2/input_nameOfPilot"), name_pilot)
	}

	String textBox_draft
	@Then("User should see saving of draft after 10 seconds in Innovation Form")
	public void user_should_see_saving_of_draft_after_seconds_in_Innovation_Form() {

		WebUI.delay(10)
		boolean isPresent = WebUI.verifyElementPresent(findTestObject("Object Repository/Innovation/Autosave/span_Last draft saved on"), 2)
		println "draft Present "+isPresent

		textBox_draft = WebUI.getText(findTestObject("Object Repository/Innovation/Autosave/span_Last draft saved on"))
		println textBox_draft
	}


	String number_pilot="100"
	@When("User changes number of the pilot credit on Innovation Form")
	public void user_changes_number_of_the_pilot_credit_on_Innovation_Form() {

		WebUI.setText(findTestObject("Object Repository/Innovation/Pilot_Credit_Opt2/input_numberOfPilot"), number_pilot)
	}

	String number_textBox_draft
	@Then("User should see the draft is saved automatically with date and time for Innovation Form")
	public void user_should_see_the_draft_is_saved_automatically_with_date_and_time_for_Innovation_Form() {

		WebUI.delay(10)

		boolean isPresent = WebUI.verifyElementPresent(findTestObject("Object Repository/Innovation/Autosave/span_Last draft saved on"), 2)
		println "draft Present "+isPresent

		number_textBox_draft = WebUI.getText(findTestObject("Object Repository/Innovation/Autosave/span_Last draft saved on"))
		println number_textBox_draft

		WebUI.verifyNotMatch(number_textBox_draft, textBox_draft, false)
	}

	@Given("User should be able to see the LEED Accredited Professional narrative in Innovation Form")
	public void user_should_be_able_to_see_the_LEED_Accredited_Professional_narrative_in_Innovation_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Editor_LEED_Accredited/p_LEED_Accredited_Editorbox'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Editor_LEED_Accredited/p_LEED_Accredited_Editorbox'), 5)
	}

	static String txt_Accredited_Professional = "Test Data for Narrative"
	@When("User modifies the LEED Accredited Professional data in the Innovation Form and waits for 10 seconds")
	public void user_modifies_the_LEED_Accredited_Professional_data_in_the_Innovation_Form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/Innovation/Editor_LEED_Accredited/body_LEED_Accredited'),txt_Accredited_Professional)

		WebUI.delay(3)
	}

	String narrative_draft_time
	@Then("User can see the draft is saved automatically with date and time for LEED Accredited Professional in Innovation Form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_LEED_Accredited_Professional_in_Innovation_Form() {

		WebUI.delay(10)

		boolean isPresent = WebUI.verifyElementPresent(findTestObject("Object Repository/Innovation/Autosave/span_Last draft saved on"), 2)
		println "draft Present "+isPresent

		narrative_draft_time = WebUI.getText(findTestObject("Object Repository/Innovation/Autosave/span_Last draft saved on"))
		println narrative_draft_time

		WebUI.verifyNotMatch(narrative_draft_time, number_textBox_draft, false)
	}

	@Given("User can see the Draft is saved automatically with date and time in Innovation form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Innovation_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/Innovation/Autosave/span_Last draft saved on"), 2)
	}

	String iframe="Object Repository/Innovation/iframe"

	@Then("User verifies the form draft warning message is not retained in Innovation form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Innovation_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/Innovation/Autosave/span_Last draft saved on"), 2)

		String tableRow = "Object Repository/Innovation/AddFile_LEED_Accredited/tbody_Table_LEED_Accredited"
		String tableId = Innovation_Entities.tableId_Xpath_leedApDocs_files
		String scrollTo = "Object Repository/Innovation/AddFile_LEED_Accredited/p_LEED_Accredited"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,iframe)

		String tableRow1 = "Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/tbody_Table_required_doc"
		String tableId1 = Innovation_Entities.tableId_Xpath_RequiredDocs_files
		String scrollTo1="Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/p_required_doc"
		new projectKeywords().deleteUploadedFiles(tableRow1, tableId1, scrollTo1,iframe)
	}


	@When("User clicks on the radio button of Innovation Strategy and waits for 10 seconds")
	public void user_clicks_on_the_radio_button_of_Innovation_Strategy_and_waits_for_seconds() {
		WebUI.delay(2)
		WebUI.check(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/radio_innovation_Strategy'))
		WebUI.delay(10);
	}

	@When("User can see the Clear draft in Innovation form")
	public void user_can_see_the_Clear_draft_in_Innovation_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Autosave/span_Last draft saved on'), 0)
	}

	@Then("User can see the draft is cleared in Innovation form")
	public void user_can_see_the_draft_is_cleared_in_Innovation_form() {

		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Innovation/Autosave/span_Last draft saved on'), 0)
	}

	static String txt_SpecialCircumstances = "Test Data for Narrative"
	@When("User modifies the Special Circumstances narrative data in the Innovation Form and waits for 10 seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_Innovation_Form_and_waits_for_seconds() {

		println "##############"+ txt_SpecialCircumstances
		WebUI.setText(findTestObject('Object Repository/Innovation/Special Circumstances/EditorBox_splCircum/body_splCircum'),txt_SpecialCircumstances)

		WebUI.delay(10)
	}

	@Then("User can see the draft is saved for Special Circumstances narrative in Innovation Form")
	public void user_can_see_the_draft_is_saved_for_Special_Circumstances_narrative_in_Innovation_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Autosave/a_Clear draft'), 30)
	}

	@Then("User should clear the draft present in Innovation Form")
	public void user_should_clear_the_draft_present_in_Innovation_Form() {

		WebUI.click(findTestObject('Object Repository/Innovation/Autosave/a_Clear draft'))
		WebUI.click(findTestObject('Object Repository/Innovation/Autosave/button_Yes'))
	}

	static String txt_SpecialCircum = "Test Logout and Login"
	String draft_date_beforeLogout
	@When("User modifies narrative data in Innovation Form")
	public void user_modifies_narrative_data_in_Innovation_Form() {

		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/Innovation/Editor_LEED_Accredited/body_LEED_Accredited'),txt_SpecialCircum)
		WebUI.delay(10)
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/Innovation/Autosave/span_Last draft saved on"))
		println draft_date_beforeLogout
		WebUI.delay(3)
	}

	@When("User will logout from the Innovation Form")
	public void user_will_logout_from_the_Innovation_Form() {


		WebUI.click(findTestObject('Object Repository/Innovation/Autosave/div_Signout'))
		WebUI.click(findTestObject('Object Repository/Innovation/Autosave/a_Sign out'))
		WebUI.delay(2)
	}

	@Then("User logs in again to Innovation Form")
	public void user_logs_in_again_to_Innovation_Form() {

		String formName = "Object Repository/Innovation/In_Navigation/div_Innovation"

		String formv01 = "Object Repository/Innovation/In_Navigation/span_(V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
	}

	@Then("User should see the warning message is displayed with date and time at the top of the Innovation Form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Innovation_Form() {

		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}

	@Then("User verifies draft version is not changed after logout and login in Innovation Form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Innovation_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/Innovation/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now"+draft_date_afterLogin
	}
}