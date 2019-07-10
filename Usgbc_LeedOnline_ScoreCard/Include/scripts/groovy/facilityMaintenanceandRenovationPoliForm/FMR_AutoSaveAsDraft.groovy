package facilityMaintenanceandRenovationPoliForm
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

class FMR_AutoSaveAsDraft {
	
	 String iframe='Object Repository/FacilityMaintenanceandRenovationPoli/iframe'
	
	@Given("User is on the Formv01 of Facility Maintenance and Renovation Policy Form")
	public void user_is_on_the_Formv_of_Facility_Maintenance_and_Renovation_Policy_Form() {
		
		WebUI.callTestCase(findTestCase('Test Cases/FacilityMaintenanceandRenovationPolicy/TC_FMR_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User will not modify any field on the Facility Maintenance and Renovation Policy Form")
	public void user_will_not_modify_any_field_on_the_Facility_Maintenance_and_Renovation_Policy_Form() {
		WebUI.delay(10)
	}
	
	@Then("User should not see saving of draft even after 10 seconds in Facility Maintenance and Renovation Policy Form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Facility_Maintenance_and_Renovation_Policy_Form() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/span_Last draft saved on'),2)
	}
	
	@Given("User should be able to see Upload file on Facility Maintenance and Renovation Policy Form")
	public void user_should_be_able_to_see_Upload_file_on_Facility_Maintenance_and_Renovation_Policy_Form() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/input'), 0)
		
	}
	
	@When("User uploads any files on Facility Maintenance and Renovation Policy Form")
	public void user_uploads_any_files_on_Facility_Maintenance_and_Renovation_Policy_Form() {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		
		println myPdffilePath

		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/input'), myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/p_Upload the Information'), 0)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/input'), myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/p_Upload the Recommended design'), 0)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/input'), myPdffilePath)
		WebUI.delay(15)
	}
	
	
	static String txt_Narrativedata = "Test Data for Narrative"
	String narrative_draft
	@Given("User should be able to see the Special Circumstances narrative in Facility Maintenance and Renovation Policy Form")
	public void user_should_be_able_to_see_the_Special_Circumstances_narrative_in_Facility_Maintenance_and_Renovation_Policy_Form() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/p_Describe the circumstances'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/p_Describe the circumstances'), 30)
	}
	
	@When("User modifies the Special Circumstances narrative data in the Facility Maintenance and Renovation Policy Form and waits for 10 seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_Facility_Maintenance_and_Renovation_Policy_Form_and_waits_for_seconds() {
		
		
		WebUI.setText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/body_SC_EditorBox'), txt_Narrativedata)
		WebUI.delay(10)
	}
	
	@Then("User can see the draft is saved automatically with date and time for Special Circumstances narrative in Facility Maintenance and Renovation Policy Form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_Special_Circumstances_narrative_in_Facility_Maintenance_and_Renovation_Policy_Form() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/span_Last draft saved on'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/span_Last draft saved on'),30)
		narrative_draft = WebUI.getText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/span_Last draft saved on'))
		println narrative_draft
	}
	
	@Given("User can see the Draft is saved automatically with date and time in FMR form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_FMR_form() {
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/span_Last draft saved on'),2)
	}
	
	@Given("User can see the save button in FMR form")
	public void user_can_see_the_save_button_in_FMR_form() {
	
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/button_Save'), 0)		
	}
	
	@When("User saves the FMR form")
	public void user_saves_the_FMR_form() {
		
		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/button_Save'))
	}
	
	@Then("User verifies the form draft warning message is not retained in FMR form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_FMR_form() {
		
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/FacilityMaintenanceandRenovationPoli/div_Form drafted and not yet saved"), 2)
		
		String tableRow = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/tbody_Table_Basebuilding"
		String tableId = FMR_PageObjectClass.tableId_Xpath_Basebuilding
		String scrollTo = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/p_Upload the Base building element"
		
		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,iframe)
		
		WebUI.delay(5)
		String tableRow1 = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/tbody_Table_InformationWM"
		String tableId1 = FMR_PageObjectClass.tableId_Xpath_InformationWM
		String scrollTo1="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/p_Upload the Information"
		new projectKeywords().deleteUploadedFiles(tableRow1, tableId1, scrollTo1,iframe)
		
		WebUI.delay(5)
		
		String tableRow2 = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/tbody_Table_RecommendedDesign"
		String tableId2 = FMR_PageObjectClass.tableId_Xpath_RecommendedDesign
		String scrollTo2 ="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/p_Upload the Recommended design"
		new projectKeywords().deleteUploadedFiles(tableRow2, tableId2, scrollTo2,iframe)
		
		WebUI.delay(3)
		
	}
	
	@When("User modifies the Special Circumstances narrative data in the FMR Form and waits for 10 seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_FMR_Form_and_waits_for_seconds() {
		
		
		WebUI.setText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/body_SC_EditorBox'), "Test data for save")
		WebUI.delay(10)
	}
	
	@Then("User should clear the draft present in Facility Maintenance and Renovation Policy Form")
	public void user_should_clear_the_draft_present_in_Facility_Maintenance_and_Renovation_Policy_Form() {
		WebUI.delay(10)
		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/span_Last draft saved on'))
	}
	
	//##################Logout and Login##############################
	static String draft_date_beforeLogout
	@Given("User can see the narrative in Facility Maintenance and Renovation Policy Form")
	public void user_can_see_the_narrative_in_Facility_Maintenance_and_Renovation_Policy_Form() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/p_Describe the circumstances'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/p_Describe the circumstances'), 5)
	}
	
	@When("User modifies narrative data in Facility Maintenance and Renovation Policy Form")
	public void user_modifies_narrative_data_in_Facility_Maintenance_and_Renovation_Policy_Form() {
		
		WebUI.setText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/body_SC_EditorBox'),"Testing for Logout and Login")
		WebUI.delay(10)
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/FacilityMaintenanceandRenovationPoli/span_Last draft saved on"))
		println draft_date_beforeLogout
	}
	
	@When("User will logout from the Facility Maintenance and Renovation Policy Form")
	public void user_will_logout_from_the_Facility_Maintenance_and_Renovation_Policy_Form() {
		
		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/div_Signout'))
		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/a_Sign out'))
		WebUI.delay(2)

	}
	
	@Then("User logs in again to Facility Maintenance and Renovation Policy Form")
	public void user_logs_in_again_to_Facility_Maintenance_and_Renovation_Policy_Form() {
	
		String formName = "Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/div_Facility Maintenance and Renovation Poli"
		
		String formv01 = "Object Repository/FacilityMaintenanceandRenovationPoli/span_(V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
	}
	
	@Then("User should see the warning message is displayed with date and time at the top of the Facility Maintenance and Renovation Policy Form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Facility_Maintenance_and_Renovation_Policy_Form() {
		
		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}
	
	@Then("User verifies draft version is not changed after logout and login in Facility Maintenance and Renovation Policy Form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Facility_Maintenance_and_Renovation_Policy_Form() {
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/Last draft saved dateTime_warningDiv'), 2)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now"+draft_date_afterLogin

	}
	
	@Then("User click on clear draft on the Facility Maintenance and Renovation Policy Form")
	public void user_click_on_clear_draft_on_the_Facility_Maintenance_and_Renovation_Policy_Form(){

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/FacilityMaintenanceandRenovationPoli/button_Yes"))
	}
}