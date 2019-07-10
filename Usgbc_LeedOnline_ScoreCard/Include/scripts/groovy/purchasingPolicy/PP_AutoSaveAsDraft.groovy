package purchasingPolicy
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
import purchasingPolicy.PP_Entities
class PP_AutoSaveAsDraft {
	/**
	 * Verifying the functionalities of the AutoSaveAsDraft in the Purchasing Policy Form --- Started
	 */


	@Given("User is on the Formv01 of Purchasing Policy form")
	public void user_is_on_the_Formv_of_Purchasing_Policy_form() {

		WebUI.callTestCase(findTestCase('Test Cases/PurchasingPolicy/TC_NavigateToPP'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Purchasing Policy form")
	public void user_will_not_modify_any_field_on_the_Purchasing_Policy_form() {

		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Purchasing Policy form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Purchasing_Policy_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/PurchasingPolicy/Autosave/span_Last draft saved on"),5)
	}


	@Given("User should be able to see Add files on Purchasing Policy form")
	public void user_should_be_able_to_see_Add_files_on_Purchasing_Policy_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/p_AddFile_EPP_Purchased'), 30)
	}

	@When("User uploads any file on Purchasing Policy form")
	public void user_uploads_any_file_on_Purchasing_Policy_form() {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'

		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/input_AddFile'), myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/p_AddFile_SWM_Purchased'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/input_AddFile'), myPdffilePath)
	}
	
	
	@Then("User should not see saving of draft even after 10 seconds in purchasing policy form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_purchasing_policy_form() {

		WebUI.delay(10)
		boolean isNotPresent = WebUI.verifyElementNotPresent(findTestObject("Object Repository/PurchasingPolicy/Autosave/span_Last draft saved on"),5)
		println "No draft "+isNotPresent
	}
	
	static String txt_Narrative = "Test Data 1 for Narrative for AutoSaveAsDraft functionatlity"
	static String txt_Spl_narrative = "Test Data for Narrative for AutoSaveAsDraft functionatlity"
	@Given("User should be able to see the narrative in Purchasing Policy form")
	public void user_should_be_able_to_see_the_narrative_in_Purchasing_Policy_form() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/p_Editor_SplCircum'), 5)
	}
	
	@When("User modifies the narrative data in the Purchasing Policy form and waits for {int} seconds")
	public void user_modifies_the_narrative_data_in_the_Purchasing_Policy_form_and_waits_for_seconds(Integer int1) {
		
		WebUI.setText(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/body_Editor_SplCircum'),txt_Narrative)
		WebUI.delay(10)
	}
	
	static String narrative_draft_time
	@Then("User can see the draft is saved automatically with date and time for narrative in Purchasing Policy form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_narrative_in_Purchasing_Policy_form() {
		
		WebUI.verifyElementPresent(findTestObject("Object Repository/PurchasingPolicy/Autosave/span_Last draft saved on"),2)
		narrative_draft_time = WebUI.getText(findTestObject("Object Repository/PurchasingPolicy/Autosave/span_Last draft saved on"))
		println "Cuurent Time Narrative "+ narrative_draft_time
	}
	
	
	@Given("User can see the Draft is saved automatically with date and time in Purchasing Policy form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Purchasing_Policy_form() {
		
		WebUI.verifyElementPresent(findTestObject("Object Repository/PurchasingPolicy/Autosave/span_Last draft saved on"),2)
	}
	
	@When("User saves the Purchasing Policy form")
	public void user_saves_the_Purchasing_Policy_form() {
		
		WebUI.click(findTestObject("Object Repository/PurchasingPolicy/btn_Save"))
		WebUI.delay(10)
	}
	
	@Then("User verifies the form draft warning message is not retained in Purchasing Policy form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Purchasing_Policy_form() {
		
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/PurchasingPolicy/Autosave/span_Last draft saved on"), 5)
		
		// For deleting the uploaded files
		
		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/tbody_Table_EPP_Purchased'
		String tableId = PP_Entities.tableId_EPP_Purchased
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/p_AddFile_EPP_Purchased"
		
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
		
		
		String tableRow1 = 'Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/tbody_Table_SWM_Purchased'
		String tableId1 = PP_Entities.tableId_SWM_Purchased
		String scrollTo1 = "Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/p_AddFile_SWM_Purchased"
		
		new projectKeywords().deleteUploadedFiles(tableRow1,tableId1,scrollTo1,PP_Entities.iframe)
	}
	
	@Given("User can see the narrative in Purchasing Policy form")
	public void user_can_see_the_narrative_in_Purchasing_Policy_form() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/p_Editor_SplCircum'), 5)
	}
	
	@When("User modifies the narrative data in Purchasing Policy form and waits for 10 seconds")
	public void user_modifies_the_narrative_data_in_Purchasing_Policy_form_and_waits_for_seconds() {
		
		WebUI.setText(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/body_Editor_SplCircum'),txt_Spl_narrative)
		
		WebUI.delay(10)
	}
	
	static String narrative_spl_draft_time
	@And("User can see the Clear draft in Purchasing Policy form")
	public void user_can_see_the_Clear_draft_in_Purchasing_Policy_form() {
		
		WebUI.verifyElementPresent(findTestObject("Object Repository/PurchasingPolicy/Autosave/span_Last draft saved on"),2)
		narrative_spl_draft_time = WebUI.getText(findTestObject("Object Repository/PurchasingPolicy/Autosave/span_Last draft saved on"))
		println "Cuurent Time Narrative "+ narrative_spl_draft_time
	}
	
	@And("User clicks on Clear draft in Purchasing Policy form")
	public void user_clicks_on_Clear_draft_in_Purchasing_Policy_form() {
		
		WebUI.click(findTestObject('Object Repository/PurchasingPolicy/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/PurchasingPolicy/Autosave/button_Yes"))
		WebUI.delay(5)
	}
	
	@Then("User can see the draft is cleared in Purchasing Policy form")
	public void user_can_see_the_draft_is_cleared_in_Purchasing_Policy_form() {
		
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/PurchasingPolicy/Autosave/span_Last draft saved on"), 2)
	}
	

	//##################Logout and Login##############################
	
	static String draft_date_beforeLogout
	@When("User modifies the narrative data in Purchasing Policy form")
	public void user_modifies_the_narrative_data_in_Purchasing_Policy_form() {
		
		WebUI.setText(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/body_Editor_SplCircum'),txt_Spl_narrative)
		WebUI.delay(10)
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/PurchasingPolicy/Autosave/span_Last draft saved on"))
		println draft_date_beforeLogout
	}
	
	@And("User will logout from the Purchasing Policy form")
	public void user_will_logout_from_the_Purchasing_Policy_form() {
		
		WebUI.click(findTestObject('Object Repository/PurchasingPolicy/Autosave/div_Signout'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/PurchasingPolicy/Autosave/a_Sign out'))
		WebUI.delay(2)
		WebUI.closeBrowser()
	}
	
	@And("User logs in again to Purchasing Policy form")
	public void user_logs_in_again_to_Purchasing_Policy_form() {
		
		String formName = "Object Repository/PurchasingPolicy/Navigation/div_PurchasingPolicy"
		String formv01 = "Object Repository/PurchasingPolicy/Navigation/a_Form (V01)"

		new projectKeywords().callNavigationTestCase(formName,formv01)
	}
	
	@Then("User should see the warning message is displayed with date and time at the top of the Purchasing Policy form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Purchasing_Policy_form() {
		
		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}
	
	@And("User verifies draft version is not changed after logout and login in Purchasing Policy form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Purchasing_Policy_form() {
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/PurchasingPolicy/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now "+draft_date_afterLogin

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/PurchasingPolicy/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/PurchasingPolicy/Autosave/button_Yes"))
	}
	/**
	 * Verifying the functionalities of the AutoSaveAsDraft in the Purchasing Policy Form --- Ended
	 */
}