package projectInformation
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
import projectInformation.PI_Entities

class PI_AutoSaveAsDraft {
	/**
	 * Verifying the functionalities of the AutoSaveAsDraft in the Project Information Form --- Started
	 */

	@Given("User is on the Formv01 of Project Information form")
	public void user_is_on_the_Formv_of_Project_Information_form() {

		WebUI.callTestCase(findTestCase('Test Cases/ProjectInformation/TC_NavigateToPI'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Project Information form")
	public void user_will_not_modify_any_field_on_the_Project_Information_form() {

		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Project Information form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Project_Information_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/ProjectInformation/Autosave/span_Last draft saved on"),5)
	}



	@Given("User should be able to see Add files on Project Information form")
	public void user_should_be_able_to_see_Add_files_on_Project_Information_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_MechanicalPlans/p_AddFile_MechanicalPlans'), 30)
	}

	@When("User uploads any file on Project Information form")
	public void user_uploads_any_file_on_Project_Information_form() {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'

		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_MechanicalPlans/input_AddFile'), myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_ProjectGraphics/p_AddFile_ProjectGraphics'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_ProjectGraphics/input_AddFile'), myPdffilePath)
	}


	@Then("User should not see saving of draft even after 10 seconds in project information form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_project_information_form() {

		WebUI.delay(10)
		boolean isNotPresent = WebUI.verifyElementNotPresent(findTestObject("Object Repository/ProjectInformation/Autosave/span_Last draft saved on"),5)
		println "No draft "+isNotPresent
	}


	static String txt_Narrative = "Test Data 1 for Narrative for AutoSaveAsDraft functionatlity"
	@Given("User should be able to see the narrative in Project Information form")
	public void user_should_be_able_to_see_the_narrative_in_Project_Information_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/EditorBox_ProjectGeneral/p_Editor_PrjGeneral'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/EditorBox_ProjectGeneral/p_Editor_PrjGeneral'), 5)
	}


	@When("User modifies the narrative data in the Project Information form and waits for 10 seconds")
	public void user_modifies_the_narrative_data_in_the_Project_Information_form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_DescribeMethod/body_Editor_DescrMethod'),txt_Narrative)
		WebUI.delay(10)
	}

	static String narrative_draft_time
	@Then("User can see the draft is saved automatically with date and time for narrative in Project Information form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_narrative_in_Project_Information_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/ProjectInformation/Autosave/span_Last draft saved on"),2)
		narrative_draft_time = WebUI.getText(findTestObject("Object Repository/ProjectInformation/Autosave/span_Last draft saved on"))
		println "Cuurent Time Narrative "+ narrative_draft_time
	}


	@Given("User can see the Draft is saved automatically with date and time in Project Information form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Project_Information_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/ProjectInformation/Autosave/span_Last draft saved on"),2)
	}

	@When("User saves the Project Information form")
	public void user_saves_the_Project_Information_form() {

		WebUI.click(findTestObject("Object Repository/ProjectInformation/btn_Save"))
		WebUI.delay(10)
	}

	@Then("User verifies the form draft warning message is not retained in Project Information form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Project_Information_form() {

		//WebUI.verifyElementNotPresent(findTestObject("Object Repository/ProjectInformation/Autosave/div_Form drafted and not yet saved"), 2)
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/ProjectInformation/Autosave/span_Last draft saved on"), 5)

		// For deleting the uploaded files

		String tableRow = 'Object Repository/ProjectInformation/AddFile_MechanicalPlans/tbody_Table_MechanicalPlans'
		String tableId = PI_Entities.tableId_MechanicalPlans
		String scrollTo = "Object Repository/ProjectInformation/AddFile_MechanicalPlans/p_AddFile_MechanicalPlans"

		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PI_Entities.iframe)


		String tableRow1 = 'Object Repository/ProjectInformation/AddFile_ProjectGraphics/tbody_Table_ProjectGraphics'
		String tableId1 = PI_Entities.tableId_Projectgraphics
		String scrollTo1 = "Object Repository/ProjectInformation/AddFile_ProjectGraphics/p_AddFile_ProjectGraphics"

		new projectKeywords().deleteUploadedFiles(tableRow1,tableId1,scrollTo1,PI_Entities.iframe)

	}

	@Given("User can see the narrative in Project Information form")
	public void user_can_see_the_narrative_in_Project_Information_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/EditorBox_SplCircumstances/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/EditorBox_SplCircumstances/p_Editor_SplCircum'), 5)
	}

	@When("User modifies the narrative data in Project Information form and waits for 10 seconds")
	public void user_modifies_the_narrative_data_in_Project_Information_form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/ProjectInformation/EditorBox_SplCircumstances/body_Editor_SplCircum'),txt_Narrative)

		WebUI.delay(10)
	}

	static String narrative_spl_draft_time
	@And("User can see the Clear draft in Project Information form")
	public void user_can_see_the_Clear_draft_in_Project_Information_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/ProjectInformation/Autosave/span_Last draft saved on"),2)
		narrative_spl_draft_time = WebUI.getText(findTestObject("Object Repository/ProjectInformation/Autosave/span_Last draft saved on"))
		println "Cuurent Time Narrative "+ narrative_spl_draft_time
	}

	@And("User clicks on Clear draft in Project Information form")
	public void user_clicks_on_Clear_draft_in_Project_Information_form() {

		WebUI.click(findTestObject('Object Repository/ProjectInformation/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/ProjectInformation/Autosave/button_Yes"))
		WebUI.delay(5)
	}

	@Then("User can see the draft is cleared in Project Information form")
	public void user_can_see_the_draft_is_cleared_in_Project_Information_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/ProjectInformation/Autosave/span_Last draft saved on"), 2)
	}


	//##################Logout and Login##############################
	static String draft_date_beforeLogout
	@When("User modifies the narrative data in Project Information form")
	public void user_modifies_the_narrative_data_in_Project_Information_form() {

		WebUI.setText(findTestObject('Object Repository/ProjectInformation/EditorBox_SplCircumstances/body_Editor_SplCircum'),txt_Narrative)
		WebUI.delay(10)
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/ProjectInformation/Autosave/span_Last draft saved on"))
		println draft_date_beforeLogout
	}

	@And("User will logout from the Project Information form")
	public void user_will_logout_from_the_Project_Information_form() {

		WebUI.click(findTestObject('Object Repository/ProjectInformation/Autosave/div_Signout'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/ProjectInformation/Autosave/a_Sign out'))
		WebUI.delay(2)
		WebUI.closeBrowser()
	}

	@And("User logs in again to Project Information form")
	public void user_logs_in_again_to_Project_Information_form() {

		String formName = "Object Repository/ProjectInformation/Navigation/div_Project Information"
		String formv01 = "Object Repository/ProjectInformation/Navigation/a_Form (V01)"

		new projectKeywords().callNavigationTestCase(formName,formv01)
	}

	@Then("User should see the warning message is displayed with date and time at the top of the Project Information form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Project_Information_form() {

		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}

	@And("User verifies draft version is not changed after logout and login in Project Information form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Project_Information_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/ProjectInformation/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now "+draft_date_afterLogin

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/MinimumIndoorAirQuality/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/Autosave/button_Yes"))
	}




	/**
	 * Verifying the functionalities of the AutoSaveAsDraft in the Project Information Form --- Ended
	 */
}