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

class SiteManageMnt {
	/**
	 *Navigation 
	 */

	@Given("User can see Site Management under Sustainable Sites")
	public void user_can_see_Site_Management_under_Sustainable_Sites() {


		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/Navigation/div_Site Management'), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/Navigation/div_Site Management'), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@Given("User has to select the status to Attempted for Site Management")
	public void user_has_to_select_the_status_to_Attempted_for_Site_Management() {

		String status =	WebUI.getText(findTestObject('Object Repository/Site_Management/Navigation/h3_Status'))
		println "######################### h3" + status
		String divval = WebUI.getText(findTestObject('Object Repository/Site_Management/Navigation/divval'))
		println "######################### dival" + divval

		if (status == "READY FOR REVIEW") {
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/Site_Management/a_MarkReadyForReview'))
			WebUI.delay(5)
		}
		String changedStatus =	WebUI.getText(findTestObject('Object Repository/Site_Management/Navigation/h3_Status'))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Site Management")
	public void user_clicks_on_Site_Management() {

		WebUI.click(findTestObject('Object Repository/Site_Management/Navigation/div_Site Management'))
	}

	@When("User has to click on FormV{int} button of Site Management")
	public void user_has_to_click_on_FormV_button_of_Site_Management(Integer int1) {

		WebUI.click(findTestObject('Object Repository/Site_Management/Navigation/span_(V01)'))
	}

	@Then("User should be able to see the Site Management form")
	public void user_should_be_able_to_see_the_Site_Management_form() {

		println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/Navigation/sitemanagement_Credit'), 30)
		if (insideForm == true){
			println "Inside the GCP form"
		}
		else {
			println "Not inside the GCP form"
		}
	}

	/**
	 * Site management
	 */

	@Given("User should be able to see the Add File button for Site Assessment in Site Management Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_Site_Assessment_in_Site_Management_Form() {

		WebUI.callTestCase(findTestCase('Test Cases/SiteManagement/TC_SM_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/p_Upload_SA'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/AddFile_SiteAssessment/p_Upload_SA'), 30)
	}

	@Then("User uploads file for Site Assessment in Site Management Form")
	public void user_uploads_file_for_Site_Assessment_in_Site_Management_Form() {

		String uploadButton = "Object Repository/Site_Management/AddFile_SiteAssessment/btn_AddFile_SA"
		String inputUploadFile = "Object Repository/Site_Management/AddFile_SiteAssessment/input_AddFile_SA"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for Documentation demonstrating in Site Management Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_Documentation_demonstrating_in_Site_Management_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/p_Upload_DD'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/AddFile_DocumentationDemonstrating/p_Upload_DD'), 30)
	}

	@Then("User uploads file for Documentation demonstrating in Site Management Form")
	public void user_uploads_file_for_Documentation_demonstrating_in_Site_Management_Form() {

		String uploadButton = "Object Repository/Site_Management/AddFile_DocumentationDemonstrating/btn_AddFile_DD"
		String inputUploadFile = "Object Repository/Site_Management/AddFile_DocumentationDemonstrating/input_AddFile_DD"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for additional documentation in Site Management Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_additional_documentation_in_Site_Management_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/p_Upload_SC'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/p_Upload_SC'), 30)
	}

	@Then("User uploads file for additional documentation in Site Management Form")
	public void user_uploads_file_for_additional_documentation_in_Site_Management_Form() {

		String uploadButton = "Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/btn_AddFile_SC"
		String inputUploadFile = "Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/input_AddFile_SC"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_SC = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for Special Circumstances for Site Management Form")
	public void user_should_see_the_editor_for_Special_Circumstances_for_Site_Management_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/p_Describe the circumstances'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/p_Describe the circumstances'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances text box for Site Management Form")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_text_box_for_Site_Management_Form() {

		println "##############"+ txt_SC
		WebUI.setText(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/body_SC_EditorBox'),txt_SC )

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances text box for Site Management Form")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_text_box_for_Site_Management_Form() {

		String cleaningService = WebUI.getText(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/body_SC_EditorBox'))
		println "##############"+ cleaningService
		WebUI.verifyMatch(cleaningService, txt_SC , false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User can see the save button in Site Management Form")
	public void user_can_see_the_save_button_in_Site_Management_Form() {

		WebUI.delay(10)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Site_Management/button_Save'))
	}

	@When("User clicks on save button Site Management Form")
	public void user_clicks_on_save_button_Site_Management_Form() {

		WebUI.click(findTestObject('Object Repository/Site_Management/button_Save'))
	}

	@Then("User should see Form data saved successfully message in Site Management Form")
	public void user_should_see_Form_data_saved_successfully_message_in_Site_Management_Form() {

		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Form data saved successfully.", false)
		println "###########" + str
	}

	@Given("User can see the generate pdf icon on the top of the Site Management Form")
	public void user_can_see_the_generate_pdf_icon_on_the_top_of_the_Site_Management_Form() {

		//WebUI.switchToFrame(findTestObject('Object Repository/Site_Management/iframe'), 5)
		//WebUI.scrollToElement(findTestObject('Object Repository/Site_Management/icon_pdf'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Management/icon_pdf'), 30)
		//WebUI.switchToDefaultContent()
	}

	@When("User clicks on generate pdf icon to download the file in Site Management Form")
	public void user_clicks_on_generate_pdf_icon_to_download_the_file_in_Site_Management_Form() {

		//WebUI.switchToFrame(findTestObject('Object Repository/Site_Management/iframe'), 5)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Site_Management/icon_pdf'))
		WebUI.delay(10)
		//WebUI.switchToDefaultContent()
	}

	@Then("User has to verify Uploaded Site Assessment with downloaded pdf file in Site Management Form")
	public void user_has_to_verify_Uploaded_Site_Assessment_with_downloaded_pdf_file_in_Site_Management_Form() {

		String xpathid="Object Repository/Site_Management/AddFile_SiteAssessment/tbody_AddFile_SA"
		String scroll1='Object Repository/Site_Management/AddFile_SiteAssessment/p_Upload_SA'
		String iframe='Object Repository/Site_Management/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded Documentation demonstarting with downloaded pdf file in Site Management Form")
	public void user_has_to_verify_Uploaded_Documentation_demonstarting_with_downloaded_pdf_file_in_Site_Management_Form() {

		String xpathid="Object Repository/Site_Management/AddFile_DocumentationDemonstrating/tbody_AddFile_DD"
		String scroll1='Object Repository/Site_Management/AddFile_DocumentationDemonstrating/p_Upload_DD'
		String iframe='Object Repository/Site_Management/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify the Special Circumstances html editor with downloaded pdf file in Site Management Form")
	public void user_has_to_verify_the_Special_Circumstances_html_editor_with_downloaded_pdf_file_in_Site_Management_Form() {

		String Editorpath='Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/body_SC_EditorBox'
		String scroll='Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/p_Describe the circumstances'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded additional documentation with downloaded pdf file in Site Management Form")
	public void user_has_to_verify_Uploaded_additional_documentation_with_downloaded_pdf_file_in_Site_Management_Form() {

		String xpathid="Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/tbody_AddFile_SC"
		String scroll1='Object Repository/Site_Management/SpecialCircumstances/AddFile_SC/p_Upload_SC'
		String iframe='Object Repository/Site_Management/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}


	@Then("User verifies the narrative text of Special Circumstances html editor box for Site Management Form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_Site_Management_Form() {

		String enteredValue = WebUI.getText(findTestObject('Object Repository/Site_Management/SpecialCircumstances/EditorBox_SC/body_SC_EditorBox'))
		println "################# Enteredvalue" + enteredValue
		println "################# txt_SC" + txt_SC
		WebUI.verifyMatch(txt_SC, enteredValue, false)
	}
	
	@And("User changes the status to ready for review for SM form")
	public void user_changes_the_status_to_ready_for_review_for_SM_form(){

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/Site_Management/Navigation/h3_Status"))
		println "The status is "+ status
		if (status == "ATTEMPTED"){
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/Site_Management/a_MarkReadyForReview'))
			//	WebUI.click(findTestObject("Object Repository/Page_LEED Online/a_Submit"))
			WebUI.delay(5)
		}

		String changed_Status =	WebUI.getText(findTestObject("Object Repository/Site_Management/Navigation/h3_Status"))
		println "######################### changed_Status " + changed_Status
		
	}
}