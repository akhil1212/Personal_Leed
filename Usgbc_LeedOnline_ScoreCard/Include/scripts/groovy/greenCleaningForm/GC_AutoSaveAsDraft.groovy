package greenCleaningForm
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
import org.openqa.selenium.JavascriptExecutor

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

class GC_AutoSaveAsDraft {


	@Given("User is on the Formv01 of Green Cleaning Form")
	public void user_is_on_the_Formv_of_Green_Cleaning_Form() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Green Cleaning Form")
	public void user_will_not_modify_any_field_on_the_Green_Cleaning_Form() {

		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Green Cleaning Form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Green_Cleaning_Form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/Green_Cleaning/Autosave/span_Last draft saved on"),2)
	}

	@Given("User should be able to see Upload file on Green Cleaning Form")
	public void user_should_be_able_to_see_Upload_file_on_Green_Cleaning_Form() {

		WebUI.delay(10)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/input_GC_Calc'), 0)
	}

	@When("User uploads any files on Green Cleaning Form")
	public void user_uploads_any_files_on_Green_Cleaning_Form() {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		println myPdffilePath

		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/input_GC_Calc'), myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/input_executedContract'), 0)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/input_executedContract'), myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/input_MSDS'), 0)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/input_MSDS'), myPdffilePath)
		WebUI.delay(15)
	}

	String cleaning_products
	@When("User modifies the value in the cleaning products in Green cleaning")
	public void user_modifies_the_value_in_the_cleaning_products_in_Green_cleaning() {

		cleaning_products=100
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percentbycost'), cleaning_products)
	}

	String cleaning_products_draft
	@Then("User should see saving of draft even after 10 seconds in Green Cleaning Form")
	public void user_should_see_saving_of_draft_even_after_seconds_in_Green_Cleaning_Form() {
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject("Object Repository/Green_Cleaning/Autosave/span_Last draft saved on"),2)

		String cleaning_products_draft = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Autosave/span_Last draft saved on'))
		println "cleaning products draft Before:"+cleaning_products_draft
	}

	@When("User modifies the textbox value in the Green Cleaning Form and waits for 10 seconds")
	public void user_modifies_the_textbox_value_in_the_Green_Cleaning_Form_and_waits_for_seconds() {

		WebUI.clearText(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percent_cleaning_products'))
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percent_cleaning_products'), "100dd")
	}

	String textbox_draft
	@Then("User can see the draft is saved automatically with date and time for change in textbox in Green Cleaning Form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_change_in_textbox_in_Green_Cleaning_Form() {

		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Autosave/span_Last draft saved on'),2)
		textbox_draft = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Autosave/span_Last draft saved on'))
		println textbox_draft

		WebUI.verifyNotMatch(cleaning_products_draft, textbox_draft, false)
	}

	static String txt_Narrativedata = "Test Data for Narrative"
	@Given("User should be able to see the Special Circumstances narrative in Green Cleaning Form")
	public void user_should_be_able_to_see_the_Special_Circumstances_narrative_in_Green_Cleaning_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/p_SC_Editorbox'), 5)
	}

	@When("User modifies the Special Circumstances narrative data in the Green Cleaning Form and waits for 10 seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_Green_Cleaning_Form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),txt_Narrativedata)
		WebUI.delay(10)
	}

	String narrative_draft
	@Then("User can see the draft is saved automatically with date and time for Special Circumstances narrative in Green Cleaning Form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_Special_Circumstances_narrative_in_Green_Cleaning_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Autosave/span_Last draft saved on'),2)
		narrative_draft = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Autosave/span_Last draft saved on'))
		println narrative_draft

		WebUI.verifyNotMatch(textbox_draft, narrative_draft, false)
	}

	@Given("User can see the Draft is saved automatically with date and time in Green Cleaning Form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Green_Cleaning_Form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/Green_Cleaning/Autosave/span_Last draft saved on"), 2)
	}

	@Given("User can see the save button in Green Cleaning Form")
	public void user_can_see_the_save_button_in_Green_Cleaning_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/button_Save'), 2)
	}

	@When("User saves the Green Cleaning Form")
	public void user_saves_the_Green_Cleaning_Form() {
		WebUI.delay(10)
		WebUI.click(findTestObject('Object Repository/Green_Cleaning/button_Save'))
		WebUI.delay(10)
	}

	@Then("User verifies the form draft warning message is not retained in Green Cleaning Form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Green_Cleaning_Form() {


		WebUI.verifyElementNotPresent(findTestObject("Object Repository/GreenCleaningPolicy/div_Form drafted and not yet saved"), 2)

		String iframe="Object Repository/Green_Cleaning/iframe"
		String tableRow = "Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/tbody_Table_GC_Calc"
		String tableId = GC_Entities.tableId_Xpath_Green_Cleaning_Calc
		String scrollTo = "Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,iframe)

		String tableRow1 = "Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/tbody_Table_executedContract"
		String tableId1 = GC_Entities.tableId_Xpath_executed_contract
		String scrollTo1="Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/p_executedContract"
		new projectKeywords().deleteUploadedFiles(tableRow1, tableId1, scrollTo1,iframe)

		String tableRow2 = "Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/tbody_Table_Msds"
		String tableId2 = GC_Entities.tableId_Xpath_msds_Sheets
		String scrollTo2="Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/p_msds"
		new projectKeywords().deleteUploadedFiles(tableRow2, tableId2, scrollTo2,iframe)

		WebUI.delay(3)
	}

	@When("User modifies the Special Circumstances narrative data in the GC Form and waits for 10 seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_GC_Form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),"Test Data for Special Circumstances")
		WebUI.delay(10)
	}

	@Then("User should clear the draft present in Green Cleaning Form")
	public void user_should_clear_the_draft_present_in_Green_Cleaning_Form() {

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/Green_Cleaning/button_Yes"))
		WebUI.delay(5)
	}

	@Given("User can see the radio button in Green Cleaning form for Powered cleaning")
	public void user_can_see_the_radio_button_in_Green_Cleaning_form_for_Powered_cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_option3'), 30)
	}

	@When("User clicks on the radio button of Powered cleaning and waits for 10 seconds")
	public void user_clicks_on_the_radio_button_of_Powered_cleaning_and_waits_for_seconds() {

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_option3'))
		WebUI.delay(10)
	}

	@When("User can see the Clear draft in Green Cleaning form")
	public void user_can_see_the_Clear_draft_in_Green_Cleaning_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Autosave/a_Clear draft'), 0)
	}

	@When("User clicks on Clear draft in Green Cleaning form")
	public void user_clicks_on_Clear_draft_in_Green_Cleaning_form() {

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/Green_Cleaning/button_Yes"))
	}

	@Then("User can see the draft is cleared in Green Cleaning form")
	public void user_can_see_the_draft_is_cleared_in_Green_Cleaning_form() {
		WebUI.delay(5)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Green_Cleaning/Autosave/a_Clear draft'), 0)
	}

	@Given("User can see the narrative in Green Cleaning Form")
	public void user_can_see_the_narrative_in_Green_Cleaning_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'), 0)
	}

	String draft_beforeLogout
	@Given("User modifies narrative data in Green Cleaning Form")
	public void user_modifies_narrative_data_in_Green_Cleaning_Form(){


		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),"Testing for Logout and Login")
		WebUI.delay(10)
		draft_beforeLogout = WebUI.getText(findTestObject("Object Repository/Green_Cleaning/Autosave/span_Last draft saved on"))
		println draft_beforeLogout
	}

	@When("User will logout from the Green Cleaning Form")
	public void user_will_logout_from_the_Green_Cleaning_Form() {

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Autosave/div_Signout'))
		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Autosave/a_Sign out'))
		WebUI.delay(2)
	}

	@Then("User logs in again to Green Cleaning Form")
	public void user_logs_in_again_to_Green_Cleaning_Form() {

		String formName = "Object Repository/Green_Cleaning/Navigation/div_Green Cleaning"

		String formv01 = "Object Repository/Green_Cleaning/Navigation/span_(V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
	}

	@Then("User should see the warning message is displayed with date and time at the top of the Green Cleaning Form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Green_Cleaning_Form() {

		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}

	@Then("User verifies draft version is not changed after logout and login in Green Cleaning Form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Green_Cleaning_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_afterLogin = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_beforeLogout,draft_afterLogin,false)

		println "Before Logout "+draft_beforeLogout
		println "Now"+draft_afterLogin

		WebUI.delay(2)
	}

	@Then("User click on clear draft on the Green Cleaning Form")
	public void user_click_on_clear_draft_on_the_Green_Cleaning_Form() {

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/Green_Cleaning/button_Yes"))
	}



	@When("User can see Date audit in Green Cleaning form")
	public void user_can_see_Date_audit_in_Green_Cleaning_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'), 30)
	}

	String date
	@When("User enters values for Date audit and waits for 10 sec in Green Cleaning form")
	public void user_enters_values_for_Date_audit_and_waits_for_sec_in_Green_Cleaning_form() {

		//		WebUI.switchToFrame(findTestObject('Object Repository/Green_Cleaning/iframe'), 3)
		//
		//		WebDriver driver = DriverFactory.getWebDriver()
		//		List<WebElement> inputs = driver.findElements(By.xpath("//*[@class='vdp-datepicker dateInputWrapper']/div/input"));
		//
		//		for (WebElement input : inputs) {
		//			((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')",input);
		//		}
		//		WebUI.switchToDefaultContent()
		//
		//		WebUI.clearText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'))
		//		date="24 Jun 2019"
		//		WebUI.sendKeys(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'),date)
		//		WebUI.delay(10)

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'))

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date_Field'))

	}

	@When("User enters all the required fields in Green Cleaning")
	public void user_enters_all_the_required_fields_in_Green_Cleaning() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/ProceduresEditorBox_Custodial/p_procedures and routine Inspection'), 30)
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/ProceduresEditorBox_Custodial/body_custodialText'),txt_Narrativedata)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness'), 0)

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'

		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/input_custodial'), myPdffilePath)

		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), "150")

		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/OpportunitiesEditorBox_Custodial/body_textOpportunities'),txt_Narrativedata )
	}

	@When("User verifies the form draft warning is not retained in Green Cleaning Form")
	public void user_verifies_the_form_draft_warning_is_not_retained_in_Green_Cleaning_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness'), 0)

		String iframe="Object Repository/Green_Cleaning/iframe"
		String tableRow = "Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/tbody_Table_Custodial"
		String tableId = GC_Entities.tableId_Xpath_custodial_effectiveness_audit
		String scrollTo = "Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,iframe)
	}
}