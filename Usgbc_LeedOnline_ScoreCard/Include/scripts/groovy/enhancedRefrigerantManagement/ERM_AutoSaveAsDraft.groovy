package enhancedRefrigerantManagement
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

class ERM_AutoSaveAsDraft {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User is on the Formv01 of ERM Form")
	public void user_is_on_the_Formv_of_ERM_Form() {
	     
		WebUI.callTestCase(findTestCase('Test Cases/EnhancedRefrigerantManagement/TC_ERM_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User will not modify any field on the ERM Form")
	public void user_will_not_modify_any_field_on_the_ERM_Form() {
	     
		WebUI.delay(10)
	}
	
	@Then("User should not see saving of draft even after 10 seconds in ERM Form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_ERM_Form() {
	     
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/EnhancedRefrigerantManagement/Autosave/span_Last draft saved on"),2)
	}
	
	@Given("User should be able to see Upload file on ERM Form")
	public void user_should_be_able_to_see_Upload_file_on_ERM_Form() {
		 
		WebUI.delay(10)
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/input_refrigerant_equi'), 0)
	}
	
	@When("User uploads a file on ERM Form")
	public void user_uploads_a_file_on_ERM_Form() {
		 
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		println myPdffilePath

		WebUI.uploadFile(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/input_refrigerant_equi'), myPdffilePath)
		WebUI.delay(15)
	}
	
	String Radio_draft
	@Then("User can see the draft is saved automatically with date and time for radio button in ERM Form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_radio_button_in_ERM_Form() {
		 
		WebUI.delay(10)
		Radio_draft = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/span_Last draft saved on'))
		println "Radio draft Before:"+Radio_draft
	}
	
	@Given("User should be able to see the narrative in ERM Form")
	public void user_should_be_able_to_see_the_narrative_in_ERM_Form() {
		 
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/p_EditorBox'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/p_EditorBox'), 5)
	}
	
	@When("User modifies the narrative data in the ERM Form form and waits for 10 seconds")
	public void user_modifies_the_narrative_data_in_the_ERM_Form_form_and_waits_for_seconds() {
		 
		WebUI.setText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/body_splCircum'),ERM_Entities.txt_narrativeText)
		WebUI.delay(10)
	}
	
	String narrative_draft
	@Then("User can see the draft is saved automatically with date and time for narrative in ERM Form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_narrative_in_ERM_Form() {
		 
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/span_Last draft saved on'),2)
		narrative_draft = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/span_Last draft saved on'))
		println narrative_draft

		WebUI.verifyNotMatch(Radio_draft, narrative_draft, false)

	}
	
	@Given("User should see the radio button option No Refrigerants")
	public void user_should_see_the_radio_button_option_No_Refrigerants() {

		boolean chk_project = WebUI.verifyElementPresent(findTestObject("Object Repository/EnhancedRefrigerantManagement/No_Refrigerants_Opt1/input_No_Refrigerants"), 30)
		if (chk_project == true){
			println "option for the project team in ERM is present"
		}
		else{
			println "option for the project team in ERM is not present"
		}
	}
	
	String option_draft
	@Then("User can see the draft is saved automatically with date and time for option in ERM Form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_option_in_ERM_Form() {
	
		WebUI.delay(10)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/span_Last draft saved on'),2)
		option_draft = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/span_Last draft saved on'))
		println option_draft

		WebUI.verifyNotMatch(narrative_draft,option_draft, false)
			 
	}
	
	@Then("User clicks on clear draft in ERM Form")
	public void user_clicks_on_clear_draft_in_ERM_Form() {
		 
		WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/a_Clear draft'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/button_Yes'))
	}
	
	@Given("User can see the Draft is saved automatically with date and time in ERM Form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_ERM_Form() {
		 
		WebUI.verifyElementPresent(findTestObject("Object Repository/EnhancedRefrigerantManagement/Autosave/span_Last draft saved on"), 2)
	}
	
	@Then("User verifies the form draft warning message is not retained in ERM Form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_ERM_Form() {
		 
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/EnhancedRefrigerantManagement/Autosave/div_Form drafted and not yet saved"), 2)
		
		String tableRow = "Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/tbody_Table_refrigerant_equi"
		String tableId = ERM_Entities.tableId_Xpath_commercial_RefrigUpload
		String scrollTo = "Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/p_refrigerant_equi"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,ERM_Entities.iframe)
	}
	
	@Given("User can see the narrative in ERM Form")
	public void user_can_see_the_narrative_in_ERM_Form() {
		 
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/body_splCircum'), 0)
	}
	
	String draft_before
	@When("User modifies the narrative data in ERM Form form and waits for 10 seconds")
	public void user_modifies_the_narrative_data_in_ERM_Form_form_and_waits_for_seconds() {
		 
		WebUI.setText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/body_splCircum'),"Testing Narrative")
		WebUI.delay(10)
		draft_before = WebUI.getText(findTestObject("Object Repository/EnhancedRefrigerantManagement/Autosave/span_Last draft saved on"))
		println draft_before
	}
	
	@When("User can see the Clear draft in ERM Form")
	public void user_can_see_the_Clear_draft_in_ERM_Form() {
	
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/a_Clear draft'), 30)		 
	}	
	
	@Then("User can see the draft is cleared in ERM Form")
	public void user_can_see_the_draft_is_cleared_in_ERM_Form() {
		 
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/a_Clear draft'), 0)
	}
	
	String draft_beforeLogout
	@When("User modifies narrative data in ERM Form")
	public void user_modifies_narrative_data_in_ERM_Form() {
		 
		WebUI.setText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/body_splCircum'),"Test Logout and Login")
		WebUI.delay(10)
		draft_beforeLogout = WebUI.getText(findTestObject("Object Repository/EnhancedRefrigerantManagement/Autosave/span_Last draft saved on"))
		println draft_beforeLogout
	}
	
	@When("User will logout from the ERM Form")
	public void user_will_logout_from_the_ERM_Form() {
		
		WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/div_Signout'))
		WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/a_Sign out'))
		WebUI.delay(2)
	}
	
	@When("User logs in again to ERM Form")
	public void user_logs_in_again_to_ERM_Form() {
		 
		String formName = "Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/div_Enhanced Refrigerant Management"
		
		String formv01 = "Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/span_(V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
	}
	
	@Then("User should see the warning message is displayed with date and time at the top of the ERM Form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_ERM_Form() {
		
		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}
	
	@Then("User verifies draft version is not changed after logout and login in ERM Form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_ERM_Form() {
		 
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_afterLogin = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_beforeLogout,draft_afterLogin,false)

		println "Before Logout "+draft_beforeLogout
		println "Now"+draft_afterLogin

		WebUI.delay(2)
	}
	
	
	
	
	
	
	
	
	
	
}