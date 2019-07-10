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

import environmentalTobaccoSmokeControl.ETSC_Entities
import leedOnlineKeywords.projectKeywords

class ETSC_AutoSaveAsDraft {
	/**
	 * Verifying the functionalities of the AutoSaveAsDraft in the Environmental Tobacco Smoke Control Form --- Started
	 */



	@Given("User is on the Formv01 of Environmental Tobacco Smoke Control form")
	public void user_is_on_the_Formv_of_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.callTestCase(findTestCase('Test Cases/EnvironmentalTobaccoSmokeControl/TC_NavigateToETSC'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Environmental Tobacco Smoke Control form")
	public void user_will_not_modify_any_field_on_the_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Environmental Tobacco Smoke Control form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"),5)
	}


	@Given("User should be able to see the radio button in Environmental Tobacco Smoke Control form")
	public void user_should_be_able_to_see_the_radio_button_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.scrollToElement(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_RadioBtn_NoSmoking"), 10)
		boolean option1Present =	WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_RadioBtn_NoSmoking"), 30)
		if (option1Present == true){
			println  "No Smoking option is present"
		}
		else{
			println  "No Smoking option is not present"
		}
	}

	@When("User modifies the radio button in the Environmental Tobacco Smoke Control form form and waits for 10 seconds")
	public void user_modifies_the_radio_button_in_the_Environmental_Tobacco_Smoke_Control_form_form_and_waits_for_seconds() {

		WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_RadioBtn_NoSmoking"))
		WebUI.delay(10)
	}

	static String radiobtn_draft
	@Then("User can see the draft is saved automatically with date and time after changing radio button in Environmental Tobacco Smoke Control form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_after_chnaging_radio_button_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"),2)
		radiobtn_draft = WebUI.getText(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"))
		println radiobtn_draft
	}


	@Given("User should be able to see Add files on Environmental Tobacco Smoke Control form")
	public void user_should_be_able_to_see_Add_files_on_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/p_AddFile_NonSmokePolicy'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/p_AddFile_NonSmokePolicy'), 30)
	}

	@When("User uploads any file on Environmental Tobacco Smoke Control form")
	public void user_uploads_any_file_on_Environmental_Tobacco_Smoke_Control_form() {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'

		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/input_AddFile'),myPdffilePath )

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/p_AddFile_ScaledSite'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/input_AddFile'), myPdffilePath)
	}

	static String addfile_draft
	@Then("User should not see any change in saving of draft even after {int} seconds in Environmental Tobacco Smoke Control form")
	public void user_should_not_see_any_change_in_saving_of_draft_even_after_seconds_in_Environmental_Tobacco_Smoke_Control_form(Integer int1) {

		WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"),2)
		addfile_draft = WebUI.getText(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"))
		println addfile_draft
		WebUI.verifyMatch(addfile_draft, radiobtn_draft, false)
	}


	static String txt_NoSmoking = "Test Data 1 for Narrative for AutoSaveAsDraft functionatlity"
	@Given("User should be able to see the no smoking policy narrative in Environmental Tobacco Smoke Control form")
	public void user_should_be_able_to_see_the_no_smoking_policy_narrative_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/p_Editor_NoSmokingPolicy'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/p_Editor_NoSmokingPolicy'), 5)
	}

	@When("User modifies the no smoking policy narrative data in the Environmental Tobacco Smoke Control form form and waits for 10 seconds")
	public void user_modifies_the_no_smoking_policy_narrative_data_in_the_Environmental_Tobacco_Smoke_Control_form_form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/body_Editor_NoSmokingPolicy'),txt_NoSmoking)
		WebUI.delay(10)
	}

	static String narrative_Draft_NoSmoking
	@Then("User can see the draft is saved automatically with date and time for no smoking policy narrative in Environmental Tobacco Smoke Control form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_no_smoking_policy_narrative_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"),2)
		narrative_Draft_NoSmoking = WebUI.getText(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"))
		println narrative_Draft_NoSmoking
		WebUI.verifyNotMatch(narrative_Draft_NoSmoking, addfile_draft, false)
	}


	@Given("User should be able to see the checkbox for project code in Environmental Tobacco Smoke Control form")
	public void user_should_be_able_to_see_the_checkbox_for_project_code_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/input_Chk_ProjectCode'), 20)
		WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_Chk_ProjectCode"), 5)
	}

	@When("User modifies the checkbox in the project code for Environmental Tobacco Smoke Control form and waits for 10 seconds")
	public void user_modifies_the_checkbox_in_the_project_code_for_Environmental_Tobacco_Smoke_Control_form_and_waits_for_seconds() {

		WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_Chk_ProjectCode"))
		WebUI.delay(10)
	}

	static String checkbox_draft_ProjectCode
	@Then("User can see the draft is saved automatically with date and time for project code checkbox in Environmental Tobacco Smoke Control form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_project_code_checkbox_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"),2)
		checkbox_draft_ProjectCode = WebUI.getText(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"))
		println checkbox_draft_ProjectCode
		WebUI.verifyNotMatch(checkbox_draft_ProjectCode, narrative_Draft_NoSmoking, false)
	}

	@Given("User can see the Draft is saved automatically with date and time in Environmental Tobacco Smoke Control form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"),2)
	}

	@When("User saves the Environmental Tobacco Smoke Control form")
	public void user_saves_the_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/btn_Save"))
		WebUI.delay(5)
	}

	@Then("User verifies the form draft warning message is not retained in Environmental Tobacco Smoke Control form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/div_Form drafted and not yet saved"), 2)

		// For deleting the uploaded files

		String tableRow = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/tbody_Table_NonSmoke'
		String tableId = ETSC_Entities.tableId_NonSmokePolicy
		String scrollTo = "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/p_AddFile_NonSmokePolicy"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,ETSC_Entities.iframe)


		String tableRow1 = 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/tbody_Table_ScaledSite'
		String tableId1 = ETSC_Entities.tableId_ScaledSite
		String scrollTo1 = "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/p_AddFile_ScaledSite"

		new projectKeywords().deleteUploadedFiles(tableRow1,tableId1,scrollTo1,ETSC_Entities.iframe)
	}


	@Given("User can see the special circumstances narrative in Environmental Tobacco Smoke Control form")
	public void user_can_see_the_special_circumstances_narrative_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/EditorBox_SplCircumstances/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/EditorBox_SplCircumstances/p_Editor_SplCircum'), 5)
	}

	@When("User modifies the special circumstances narrative data in Environmental Tobacco Smoke Control form and waits for 10 seconds")
	public void user_modifies_the_special_circumstances_narrative_data_in_Environmental_Tobacco_Smoke_Control_form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/body_Editor_SplCircum'),txt_NoSmoking)

		WebUI.delay(10)
	}

	static String narrative_spl_draft_time
	@And("User can see the Clear draft in Environmental Tobacco Smoke Control form")
	public void user_can_see_the_Clear_draft_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"),2)
		narrative_spl_draft_time = WebUI.getText(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"))
		println "Cuurent Time Narrative "+ narrative_spl_draft_time
	}

	@And("User clicks on Clear draft in Environmental Tobacco Smoke Control form")
	public void user_clicks_on_Clear_draft_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.click(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/button_Yes"))
		WebUI.delay(5)
	}

	@Then("User can see the draft is cleared in Environmental Tobacco Smoke Control form")
	public void user_can_see_the_draft_is_cleared_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"), 2)
	}

	//##################Logout and Login##############################

	static String draft_date_beforeLogout
	@When("User modifies the special circumstances narrative data in Environmental Tobacco Smoke Control form")
	public void user_modifies_the_special_circumstances_narrative_data_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.setText(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/body_Editor_SplCircum'),txt_NoSmoking)
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"),2)
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/span_Last draft saved on"))
		println draft_date_beforeLogout

	}


	@And("User will logout from the Environmental Tobacco Smoke Control form")
	public void user_will_logout_from_the_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.click(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/div_Signout'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/a_Sign out'))
		WebUI.delay(2)
		WebUI.closeBrowser()
	}

	@And("User logs in again to Environmental Tobacco Smoke Control form")
	public void user_logs_in_again_to_Environmental_Tobacco_Smoke_Control_form() {

		String formName = "Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/div_ETSC"
		String formv01 = "Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/a_Form (V01)"

		new projectKeywords().callNavigationTestCase(formName,formv01)
	}

	@Then("User should see the warning message is displayed with date and time at the top of the Environmental Tobacco Smoke Control form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Environmental_Tobacco_Smoke_Control_form() {

		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}

	@And("User verifies draft version is not changed after logout and login in Environmental Tobacco Smoke Control form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now"+draft_date_afterLogin

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Autosave/button_Yes"))
		WebUI.delay(2)
	}

	/**
	 * Verifying the functionalities of the AutoSaveAsDraft in the Environmental Tobacco Smoke Control Form --- Ended
	 */
}