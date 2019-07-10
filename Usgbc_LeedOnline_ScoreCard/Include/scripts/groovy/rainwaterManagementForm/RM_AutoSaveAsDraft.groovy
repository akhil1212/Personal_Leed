package rainwaterManagementForm
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
import rainwaterManagementForm.RM_Entities

class RM_AutoSaveAsDraft {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	String iframe = 'Object Repository/RainwaterManagement/iframe'
	@Given("User is on the Formv01 of Rainwater Management form")
	public void user_is_on_the_Formv_of_Rainwater_Management_form() {

		WebUI.callTestCase(findTestCase('Test Cases/RainwaterManagement/TC_NavigateToRM'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Rainwater Management form")
	public void user_will_not_modify_any_field_on_the_Rainwater_Management_form() {

		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Rainwater Management form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Rainwater_Management_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"),2)
	}


	@Given("User should be able to see Add files on Rainwater Management form")
	public void user_should_be_able_to_see_Add_files_on_Rainwater_Management_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_EventsCalculator/p_AddFile_EventsCalc'), 30)
	}

	@When("User uploads any file on Rainwater Management form")
	public void user_uploads_any_file_on_Rainwater_Management_form() {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'

		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_EventsCalculator/input_AddFile'),myPdffilePath )

		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/input_AddFile'), myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/p_AddFile_GreenInfra'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/input_AddFile'), myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_AnnualInspection/p_AddFile_AnnualInsp'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/RainwaterManagement/AddFile_AnnualInspection/input_AddFile'), myPdffilePath)
	}


	@Then("User should not see saving of draft even after 10 seconds in rainwater management form")
	public void user_should_not_see_savinf_of_draft_even_after_10_seconds_in_rainwater_management_form(){
		WebUI.delay(10)
		boolean isNotPresent = WebUI.verifyElementNotPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
		println "No draft "+isNotPresent
	}


	static String txt_ProposedPractices = "Test Data 1 for Narrative for AutoSaveAsDraft functionatlity"
	@Given("User should be able to see the narrative in Rainwater Management form")
	public void user_should_be_able_to_see_the_narrative_in_Rainwater_Management_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/p_Editor_GreenInfra'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/p_Editor_GreenInfra'), 5)
	}

	@When("User modifies the narrative data in the Rainwater Management form and waits for 10 seconds")
	public void user_modifies_the_narrative_data_in_the_Rainwater_Management_form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/body_Editor_GreenInfra'),txt_ProposedPractices)
		WebUI.delay(10)
	}

	static String narrative_draft_time
	@Then("User can see the draft is saved automatically with date and time for narrative in Rainwater Management form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_narrative_in_Rainwater_Management_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"),2)
		narrative_draft_time = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println "Cuurent Time Narrative "+ narrative_draft_time
	}


	@Given("User can see the Draft is saved automatically with date and time in Rainwater Management form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Rainwater_Management_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
	}

	@And("User can see the save button in Rainwater Management form")
	public void user_can_see_the_save_button_in_Rainwater_Management_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/IntegratedPestMgmt/Save_Btn"), 2)
		WebUI.scrollToElement(findTestObject("Object Repository/IntegratedPestMgmt/Save_Btn"), 30)
	}

	@When("User saves the Rainwater Management form")
	public void user_saves_the_Rainwater_Management_form() {

		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Save_Btn"))
		WebUI.delay(10)
	}

	@Then("User verifies the form draft warning message is not retained in Rainwater Management form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Rainwater_Management_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/div_Form drafted and not yet saved"), 2)

		// For deleting the uploaded files
		String tableRow = 'Object Repository/RainwaterManagement/AddFile_EventsCalculator/tbody_Table_EventsCalc'
		String tableId = RM_Entities.tableId_EventsCalculator
		String scrollTo = "Object Repository/RainwaterManagement/AddFile_EventsCalculator/p_AddFile_EventsCalc"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,iframe)

		String tableRow1 = 'Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/tbody_Table_Calc_ImperSurfaces'
		String tableId1 = RM_Entities.tableId_Calc_ImperviousSurfaces
		String scrollTo1 = "Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/p_AddFile_Calc_ImperSurfaces"

		new projectKeywords().deleteUploadedFiles(tableRow1,tableId1,scrollTo1,iframe)

		String tableRow2 = 'Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/tbody_Table_GreenInfra'
		String tableId2 = RM_Entities.tableId_GreenInfrastructure
		String scrollTo2 = "Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/p_AddFile_GreenInfra"

		new projectKeywords().deleteUploadedFiles(tableRow2,tableId2,scrollTo2,iframe)

		String tableRow3 = 'Object Repository/RainwaterManagement/AddFile_AnnualInspection/tbody_Table_AnnualInsp'
		String tableId3 = RM_Entities.tableId_AnnualInspection
		String scrollTo3 = "Object Repository/RainwaterManagement/AddFile_AnnualInspection/p_AddFile_AnnualInsp"

		new projectKeywords().deleteUploadedFiles(tableRow3,tableId3,scrollTo3,iframe)
	}

	@Given("User can see the narrative in Rainwater Management form")
	public void user_can_see_the_narrative_in_Rainwater_Management_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/p_Editor_SplCircum'), 5)
	}

	@When("User modifies the narrative data in Rainwater Management form and waits for 10 seconds")
	public void user_modifies_the_narrative_data_in_Rainwater_Management_form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/body_Editor_SplCircum'),txt_ProposedPractices)

		WebUI.delay(10)
	}

	static String narrative_spl_draft_time
	@And("User can see the Clear draft in Rainwater Management form")
	public void user_can_see_the_Clear_draft_in_Rainwater_Management_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"),2)
		narrative_spl_draft_time = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println "Cuurent Time Narrative "+ narrative_spl_draft_time
	}

	@And("User clicks on Clear draft in Rainwater Management form")
	public void user_clicks_on_Clear_draft_in_Rainwater_Management_form() {

		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/button_Yes"))
		WebUI.delay(5)
	}

	@Then("User can see the draft is cleared in Rainwater Management form")
	public void user_can_see_the_draft_is_cleared_in_Rainwater_Management_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
	}

	//##################Logout and Login##############################
	static String draft_date_beforeLogout
	@When("User modifies the narrative data in Rainwater Management form")
	public void user_modifies_narrative_data_in_Rainwater_Management_form() {

		WebUI.setText(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/body_Editor_SplCircum'),txt_ProposedPractices)
		WebUI.delay(10)
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println draft_date_beforeLogout
	}


	@And("User will logout from the Rainwater Management form")
	public void user_will_logout_from_the_Rainwater_Management_form() {

		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/div_Signout'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Sign out'))
		WebUI.delay(2)
	}

	@And("User logs in again to Rainwater Management form")
	public void user_logs_in_again_to_Rainwater_Management_form() {

		String formName = "Object Repository/RainwaterManagement/Navigation/div_Rainwater Management"

		String formv01 = "Object Repository/RainwaterManagement/Navigation/a_Form (V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
	}

	@Then("User should see the warning message is displayed with date and time at the top of the Rainwater Management form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Rainwater_Management_form() {

		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}

	@And("User verifies draft version is not changed after logout and login in Rainwater Management form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Rainwater_Management_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/LightPollutionReduction/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now"+draft_date_afterLogin

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/button_Yes"))
	}

}