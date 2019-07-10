package energyEfficiencyBestManagementPractices
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

class EEBM_AutoSaveAsDraft {
	/**
	 * EEBM Auto Save As Draft
	 */

	@Given("User is on the Formv01 of Energy Efficiency Best Management practices Form")
	public void user_is_on_the_Formv_of_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.callTestCase(findTestCase('Test Cases/EnergyEfficiencyBestManagementPractices/TC_EEBM_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Energy Efficiency Best Management practices Form")
	public void user_will_not_modify_any_field_on_the_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Energy Efficiency Best Management practices Form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/span_Last draft saved on"),2)
	}

	@Given("User should be able to see Upload file on Energy Efficiency Best Management practices Form")
	public void user_should_be_able_to_see_Upload_file_on_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.delay(10)
		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/input_ASHRAE_preliminary'), 0)
	}

	@When("User uploads any files on Energy Efficiency Best Management practices Form")
	public void user_uploads_any_files_on_Energy_Efficiency_Best_Management_practices_Form() {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		println myPdffilePath

		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/input_ASHRAE_preliminary'), myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/input_current_facility_requirements'), 0)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/input_current_facility_requirements'), myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/input_DC_Pro'), 0)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/input_DC_Pro'), myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/input_additionalDoc'), 0)
		WebUI.uploadFile(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/input_additionalDoc'), myPdffilePath)
		WebUI.delay(15)
	}


	@Given("User should be able to see project team checkbox on Energy Efficiency Best Management practices Form")
	public void user_should_be_able_to_see_project_team_checkbox_on_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/input'), 30)
	}

	@When("User uncheck project team checkbox on Energy Efficiency Best Management practices Form")
	public void user_uncheck_project_team_checkbox_on_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.uncheck(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/input'))
	}

	String chk_prjtteam
	@Then("User should see saving of draft after 10 seconds in Energy Efficiency Best Management practices Form")
	public void user_should_see_saving_of_draft_after_seconds_in_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/span_Last draft saved on"),2)

		chk_prjtteam= WebUI.getText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/span_Last draft saved on'))
		println chk_prjtteam
	}

	@Given("User should be able to see Date Draft on Energy Efficiency Best Management practices Form")
	public void user_should_be_able_to_see_Date_Draft_on_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/input_date"),30)
	}

	@When("User changes Date Draft on Energy Efficiency Best Management practices Form")
	public void user_changes_Date_Draft_on_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.click(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/input_date"))

		WebUI.click(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/span_16"))
	}

	String date_draft
	@Then("User should see the draft is saved automatically with date and time for Energy Efficiency Best Management practices Form")
	public void user_should_see_the_draft_is_saved_automatically_with_date_and_time_for_Energy_Efficiency_Best_Management_practices_Form(){

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/span_Last draft saved on'),2)
		date_draft = WebUI.getText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/span_Last draft saved on'))
		println date_draft

		WebUI.verifyNotMatch(chk_prjtteam, date_draft, false)
	}

	static String txt_Narrativedata = "Test Data for Narrative"
	@Given("User should be able to see the Special Circumstances narrative in Energy Efficiency Best Management practices Form")
	public void user_should_be_able_to_see_the_Special_Circumstances_narrative_in_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/p_EditorBox'), 5)
	}

	@When("User modifies the Special Circumstances narrative data in the  Energy Efficiency Best Management practices Form and waits for 10 seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_Energy_Efficiency_Best_Management_practices_Form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/body_splCircum'),txt_Narrativedata)
		WebUI.delay(10)
	}

	String narrative_draft
	@Then("User can see the draft is saved automatically with date and time for Special Circumstances narrative in Energy Efficiency Best Management practices Form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_Special_Circumstances_narrative_in_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/span_Last draft saved on'),2)
		narrative_draft = WebUI.getText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/span_Last draft saved on'))
		println narrative_draft

		WebUI.verifyNotMatch(date_draft, narrative_draft, false)
	}

	@Given("User can see the Draft is saved automatically with date and time in EEBM form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_EEBM_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/span_Last draft saved on'),2)
	}

	@Given("User can see the save button in EEBM form")
	public void user_can_see_the_save_button_in_EEBM_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/btn_Save'), 2)
	}

	@When("User saves the EEBM form")
	public void user_saves_the_EEBM_form() {

		WebUI.delay(10)
		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/btn_Save'))
		WebUI.delay(10)
	}

	@Then("User verifies the form draft warning message is not retained in EEBM form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_EEBM_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/GreenCleaningPolicy/div_Form drafted and not yet saved"), 2)

		String iframe="Object Repository/EnergyEfficiencyBestManagementpractices/iframe"
		String tableRow = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/tbody_Table_ASHRAE_preliminary"
		String tableId = EEBM_Entities.tableId_ASHRAE_preliminary
		String scrollTo = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/p_Upload the ASHRAE preliminary"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,iframe)

		String tableRow1 = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/tbody_Table_CFR"
		String tableId1 = EEBM_Entities.tableId_CFR
		String scrollTo1="Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/p_current_facility_requirements"
		new projectKeywords().deleteUploadedFiles(tableRow1, tableId1, scrollTo1,iframe)

		String tableRow2 = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/tbody_Table_DC_Pro"
		String tableId2 = EEBM_Entities.tableId_DC_Pro
		String scrollTo2="Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/p_DC_Pro"
		new projectKeywords().deleteUploadedFiles(tableRow2, tableId2, scrollTo2,iframe)

		String tableRow3 = "Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String tableId3 = EEBM_Entities.tableId_additional_doc
		String scrollTo3="Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation"
		new projectKeywords().deleteUploadedFiles(tableRow3, tableId3, scrollTo3,iframe)

		WebUI.delay(3)
	}


	@When("User modifies the Special Circumstances narrative data in the EEBM Form and waits for 10 seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_EEBM_Form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/body_splCircum'),"Test Narrative")
		WebUI.delay(10)
	}

	@When("User can see the draft is saved for Special Circumstances narrative in Energy Efficiency Best Management practices Form")
	public void user_can_see_the_draft_is_saved_for_Special_Circumstances_narrative_in_Energy_Efficiency_Best_Management_practices_Form(){

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/span_Last draft saved on'),2)
	}

	@Then("User should clear the draft present in Energy Efficiency Best Management practices Form")
	public void user_should_clear_the_draft_present_in_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/button_Yes"))
		WebUI.delay(5)
	}

	String draft_beforeLogout
	@When("User modifies narrative data in Energy Efficiency Best Management practices Form")
	public void user_modifies_narrative_data_in_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.setText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/body_splCircum'),"Test Logout and Login")
		WebUI.delay(10)
		draft_beforeLogout = WebUI.getText(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/span_Last draft saved on"))
		println draft_beforeLogout
	}

	@When("User will logout from the Energy Efficiency Best Management practices Form")
	public void user_will_logout_from_the_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/div_Signout'))
		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/a_Sign out'))
		WebUI.delay(2)
	}

	@Then("User logs in again to Energy Efficiency Best Management practices Form")
	public void user_logs_in_again_to_Energy_Efficiency_Best_Management_practices_Form() {

		String formName = "Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/div_Energy Efficiency Best Management Practices"

		String formv01 = "Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/span_(V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
	}

	@Then("User should see the warning message is displayed with date and time at the top of the Energy Efficiency Best Management practices Form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Energy_Efficiency_Best_Management_practices_Form() {

		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}

	@Then("User verifies draft version is not changed after logout and login in Energy Efficiency Best Management practices Form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_afterLogin = WebUI.getText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_beforeLogout,draft_afterLogin,false)

		println "Before Logout "+draft_beforeLogout
		println "Now"+draft_afterLogin

		WebUI.delay(2)
	}

	@Then("User click on clear draft on the Energy Efficiency Best Management practices Form")
	public void user_click_on_clear_draft_on_the_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/Autosave/button_Yes"))
	}
}