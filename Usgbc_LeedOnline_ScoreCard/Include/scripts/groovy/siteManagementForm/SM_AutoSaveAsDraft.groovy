package siteManagementForm
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



class SM_AutoSaveAsDraft {
	String iframe='Object Repository/Site_Management/iframe'

	@Given("User is on the Formv01 of Site Management Form")
	public void User_is_on_the_Formv01_of_Site_Management_Form() {
		WebUI.callTestCase(findTestCase('Test Cases/SiteManagement/TC_SM_Navigate'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Site Management Form")
	public void User_will_not_modify_any_field_on_the_Site_Management_Form() {
		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Site Management Form")
	public void User_should_not_see_saving_of_draft_even_after_10_seconds_in_Site_Management_Form() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Site_Management/span_Last draft saved on'),30)
	}
	//////////////////////////////////
	@Given("User should be able to see Upload file on Site Management Form")
	public void User_should_be_able_to_see_Upload_file_on_Site_Management_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/input_AddFile_SA'), 30)
	}

	@When("User uploads any files on Site Management Form")
	public void User_uploads_any_files_on_Site_Management_Form() {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'

		println myPdffilePath

		WebUI.uploadFile(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/input_AddFile_SA'), myPdffilePath)
		WebUI.delay(5)
		WebUI.uploadFile(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/input_AddFile_DD'),myPdffilePath)

		WebUI.delay(15)
	}


	static String txt_Narrativedata = "Test Data for Narrative"
	String narrative_draft
	/////////////////////////////////////////
	@Given("User able to see the Special Circumstances narrative in Site Management Form")
	public void User_able_to_see_the_Special_Circumstances_narrative_in_Site_Management_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/p_Describe the circumstances'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/p_Describe the circumstances'), 30)
	}

	@When("User modifies the Special Circumstances narrative data in the Site Management Form and waits for 10 seconds")
	public void User_modifies_the_Special_Circumstances_narrative_data_in_the_Site_Management_Form_and_waits_for_10_seconds() {


		WebUI.setText(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/body_SC_EditorBox'), txt_Narrativedata)
		WebUI.delay(10)
	}

	@Then("User can see the draft is saved automatically with date and time for Special Circumstances narrative in Site Management Form")
	public void User_can_see_the_draft_is_saved_automatically_with_date_and_time_for_Special_Circumstances_narrative_in_Site_Management_Form() {

		//WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/span_Last draft saved on'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/span_Last draft saved on'),30)
		narrative_draft = WebUI.getText(findTestObject('Object Repository/Site_Management/span_Last draft saved on'))
		println narrative_draft
	}
	///////////////////////////////////////////
	@Given("User can see the Draft is saved automatically with date and time in SM form")
	public void User_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_SM_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/span_Last draft saved on'),2)
	}

	@Given("User can see the save button in SM form")
	public void User_can_see_the_save_button_in_SM_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/button_Save'), 30)
	}

	@When("User saves the SM form")
	public void User_saves_the_SM_form() {

		WebUI.click(findTestObject('Object Repository/Site_Management/button_Save'))
	}

	@Then("User verifies the form draft warning message is not retained in SM form")
	public void User_verifies_the_form_draft_warning_message_is_not_retained_in_SM_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/Site_Management/div_Form drafted and not yet saved"), 2)

		String tableRow = "Object Repository/Site_Management/AddFile_SiteAssessment/tbody_AddFile_SA"
		String tableId = SM_Entities.tableId_Xpath_SiteAssessment
		String scrollTo = "Object Repository/Site_Management/AddFile_SiteAssessment/p_Upload_SA"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,iframe)

		WebUI.delay(5)
		String tableRow1 = "Object Repository/Site_Management/AddFile_DocumentationDemonstrating/tbody_AddFile_DD"
		String tableId1 = SM_Entities.tableId_Xpath_Docs
		String scrollTo1="Object Repository/Site_Management/AddFile_DocumentationDemonstrating/p_Upload_DD"
		new projectKeywords().deleteUploadedFiles(tableRow1, tableId1, scrollTo1,iframe)



		WebUI.delay(3)
	}
	//////////////////////////
	@Given("User should be able to see the Special Circumstances narrative in Site Management Form")
	public void User_should_be_able_to_see_the_Special_Circumstances_narrative_in_Site_Management_Form(){

		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/p_Describe the circumstances'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/p_Describe the circumstances'), 5)
	}

	@When("User modifies the Special Circumstances narrative data in the SM Form and waits for 10 seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_SM_Form_and_waits_for_seconds() {


		WebUI.setText(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/body_SC_EditorBox'), "Test data for save")
		WebUI.delay(10)
	}

	@Then("User should clear the draft present in Site Management Form")
	public void user_should_clear_the_draft_present_in_Site_Management_Form() {
		WebUI.delay(10)
		WebUI.click(findTestObject('Object Repository/Site_Management/a_Clear draft'))
		WebUI.click(findTestObject('Object Repository/Site_Management/Btn_Yes'))

	}

	//##################Logout and Login##############################
	static String draft_date_beforeLogout
	@Given("User can see the narrative in Site Management Form")
	public void User_can_see_the_narrative_in_Site_Management_Form() {
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/p_Describe the circumstances'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/p_Describe the circumstances'), 5)
	}

	@When("User modifies narrative data in Site Management Form")
	public void User_modifies_narrative_data_in_Site_Management_Form() {
		println "Before ******************"
		WebUI.setText(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/body_SC_EditorBox'),"Testing for Logout and Login")
		WebUI.delay(10)
		println "After ******************"
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/Site_Management/span_Last draft saved on"))
		println draft_date_beforeLogout
	}

	@When("User will logout from the Site Management Form")
	public void User_will_logout_from_the_Site_Management_Form() {
		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/div_dropdown_Automation_User'),5)
		WebUI.click(findTestObject('Object Repository/Site_Management/div_dropdown_Automation_User'))
		WebUI.click(findTestObject('Object Repository/Site_Management/a_SignOut'))
		WebUI.delay(2)

	}

	@Then("User logs in again to Site Management Form")
	public void User_logs_in_again_to_Site_Management_Form() {

		String formName = "Object Repository/Site_Management/Navigation/div_Site Management"

		String formv01 = "Object Repository/Site_Management/Navigation/span_(V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
	}

	@Then("User should see the warning message is displayed with date and time at the top of the Site Management Form")
	public void User_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Site_Management_Form() {

		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}

	@Then("User verifies draft version is not changed after logout and login in Site Management Form")
	public void User_verifies_draft_version_is_not_changed_after_logout_and_login_in_Site_Management_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/Last draft saved dateTime_warningDiv'), 2)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/Site_Management/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now"+draft_date_afterLogin

	}

	@Then("User click on clear draft on the Site Management Form")
	public void User_click_on_clear_draft_on_the_Site_Management_Form(){

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Site_Management/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/Site_Management/Btn_Yes"))
	}
}