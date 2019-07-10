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
import com.testautomationguru.utility.PDFUtil

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

class GreenCleaningForm {

	@Given("User can see Green Cleaning under Indoor Environmental Quality section")
	public void user_can_see_Green_Cleaning_under_Indoor_Environmental_Quality_section() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Navigation/div_Green Cleaning'), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Navigation/div_Green Cleaning'), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@And("User has to select the status to Attempted for Green Cleaning")
	public void user_has_to_select_the_status_to_Attempted_for_Green_Cleaning() {

		String status =	WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Navigation/h3_Status'))
		println "######################### h3" + status
		String divval = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Navigation/divval'))
		println "######################### dival" + divval

		if (status == "READY FOR REVIEW") {
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/Green_Cleaning/a_MarkReadyForReview'))
			WebUI.delay(5)
		}
		String changedStatus =	WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Navigation/h3_Status'))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Green Cleaning")
	public void user_clicks_on_Green_Cleaning() {

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Navigation/div_Green Cleaning'))
	}

	@And("User has to click on FormV01 button of Green Cleaning")
	public void user_has_to_click_on_FormV_button_of_Green_Cleaning() {

		WebUI.delay(3);
		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Navigation/span_(V01)'))
	}

	@Then("User should be able to see the Green Cleaning form")
	public void user_should_be_able_to_see_the_Green_Cleaning_form() {

		println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Navigation/div_GreenCleaningPolicyCreditLib'), 30)
		if (insideForm == true){
			println "Inside the Green Cleaning form"
		}
		else {
			println "Not inside the Green Cleaning form"
		}
	}

	/**
	 *
	 * Started Custodial effectiveness assessment (Option 1)
	 *
	 */

	@Given("User should see the radio button option Custodial effectiveness assessment")
	public void user_should_see_the_radio_button_option_Custodial_effectiveness_assessment() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		boolean option1Present = WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_SelectOption'), 30)
		if (option1Present == true){
			println  "Custodial effectiveness assessment option is present"
		}
		else{
			println  "Custodial effectiveness assessment option is not present"
		}
	}

	@When("User clicks on Custodial effectiveness assessment option")
	public void user_clicks_on_Custodial_effectiveness_assessment_option() {
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_SelectOption'))
		WebUI.delay(3)
	}

	@Then("User should see the contents for Custodial effectiveness assessment option")
	public void user_should_see_the_contents_for_Custodial_effectiveness_assessment_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/Green_Cleaning/iframe"), 30)
		WebUI.verifyTextPresent("Option 1. Custodial effectiveness assessment", false)
		WebUI.switchToDefaultContent()
	}

	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_procedureDetails = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for procedureDetails for Custodial effectiveness assessment in Green Cleaning")
	public void user_should_see_the_editor_for_procedureDetails_for_Custodial_effectiveness_assessment_in_Green_Cleaning() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/ProceduresEditorBox_Custodial/p_procedures and routine Inspection'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/ProceduresEditorBox_Custodial/p_procedures and routine Inspection'), 5)
	}

	@When("User feeds long narrative text for procedureDetails text box for Custodial effectiveness assessment in Green Cleaning")
	public void user_feeds_long_narrative_text_for_procedureDetails_text_box_for_Custodial_effectiveness_assessment_in_Green_Cleaning() {

		println "##############"+ txt_procedureDetails
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/ProceduresEditorBox_Custodial/body_custodialText'),txt_procedureDetails )

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on procedureDetails text box for Custodial effectiveness assessment in Green Cleaning")
	public void user_should_see_the_narrative_text_persist_on_procedureDetails_text_box_for_Custodial_effectiveness_assessment_in_Green_Cleaning() {

		String procedureDetails = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/ProceduresEditorBox_Custodial/body_custodialText'))
		println "##############"+ procedureDetails
		WebUI.verifyMatch(procedureDetails, txt_procedureDetails , false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User should be able to see the Add File button for custodial effectiveness audit in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_for_custodial_effectiveness_audit_in_Green_Cleaning() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness'), 30)
	}

	@Then("User uploads file for custodial effectiveness audit in Green Cleaning")
	public void user_uploads_file_for_custodial_effectiveness_audit_in_Green_Cleaning() {

		String uploadButton = "Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/Button_Custodial"
		String inputUploadFile = "Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/input_custodial"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile)
	}

	@Given("User should be able to see the textbox for Overall score facility in green cleaning")
	public void user_should_be_able_to_see_the_textbox_for_Overall_score_facility_in_green_cleaning() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), 30)
	}

	String Overall_Score
	@When("User enters Overall score facility in green cleaning")
	public void user_enters_Overall_score_facility_in_green_cleaning() {

		Overall_Score = 141
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), Overall_Score)
	}

	String enterdValue
	@Then("User should be able to see the entered value of Overall score facility in green cleaning")
	public void user_should_be_able_to_see_the_entered_value_of_Overall_score_facility_in_green_cleaning() {

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + Overall_Score
		WebUI.verifyMatch(Overall_Score, enterdValue, false)
	}

	@Given("User should be able to see the Date audit in green cleaning")
	public void user_should_be_able_to_see_the_Date_audit_in_green_cleaning() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'), 30)
	}

	String date
	@When("User enters Date audit in green cleaning")
	public void user_enters_Date_audit_in_green_cleaning() {

		//		WebUI.switchToFrame(findTestObject('Object Repository/Green_Cleaning/iframe'), 3)
		//
		//		WebDriver driver = DriverFactory.getWebDriver()
		//		List<WebElement> inputs = driver.findElements(By.xpath("//*[@class='vdp-datepicker dateInputWrapper']/div/input"));
		//
		//		for (WebElement input : inputs) {
		//			((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')",input);
		//		}
		////		WebUI.switchToDefaultContent()
		//
		//		//WebUI.clearText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'))
		//		date="14 Jun 2019"
		//		WebUI.sendKeys(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'),date)
		//
		//		WebUI.switchToDefaultContent()
		//		WebUI.delay(2)


		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'))

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date_Field'))



	}

	@Then("User should be able to see the entered value of Date audit in green cleaning")
	public void user_should_be_able_to_see_the_entered_value_of_Date_audit_in_green_cleaning() {

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'), 'value')
		println "The entered Value is "+ enterdValue
		//		println "The Overall Score is " + date
		//		WebUI.verifyMatch(date, enterdValue, false)
	}


	static String txt_opportunities = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for opportunities for Custodial effectiveness assessment in Green Cleaning")
	public void user_should_see_the_editor_for_opportunities_for_Custodial_effectiveness_assessment_in_Green_Cleaning() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/OpportunitiesEditorBox_Custodial/p_opportunities'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/OpportunitiesEditorBox_Custodial/p_opportunities'), 5)
	}

	@When("User feeds long narrative text for opportunities text box for Custodial effectiveness assessment in Green Cleaning")
	public void user_feeds_long_narrative_text_for_opportunities_text_box_for_Custodial_effectiveness_assessment_in_Green_Cleaning() {

		println "##############"+ txt_opportunities
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/OpportunitiesEditorBox_Custodial/body_textOpportunities'),txt_opportunities )

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on opportunities text box for Custodial effectiveness assessment in Green Cleaning")
	public void user_should_see_the_narrative_text_persist_on_opportunities_text_box_for_Custodial_effectiveness_assessment_in_Green_Cleaning() {

		String opportunities = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/OpportunitiesEditorBox_Custodial/body_textOpportunities'))
		println "##############"+ opportunities
		WebUI.verifyMatch(opportunities, txt_opportunities , false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User should be able to see the Add File button for additional documentation audit in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_for_additional_documentation_audit_in_Green_Cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/p_SC_additionalDoc'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/p_SC_additionalDoc'), 30)
	}

	@Then("User uploads file for additional documentation in Green Cleaning")
	public void user_uploads_file_for_additional_documentation_in_Green_Cleaning() {

		String uploadButton = "Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/Button_SC_AddFile"
		String inputUploadFile = "Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/input_SCAddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	static String txt_Special_Circumstances = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for Special Circumstances for Custodial effectiveness assessment in Green Cleaning")
	public void user_should_see_the_editor_for_Special_Circumstances_for_Custodial_effectiveness_assessment_in_Green_Cleaning() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/p_SC_Editorbox'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/p_SC_Editorbox'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances text box for Custodial effectiveness assessment in Green Cleaning")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_text_box_for_Custodial_effectiveness_assessment_in_Green_Cleaning() {


		println "##############"+ txt_Special_Circumstances
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),txt_Special_Circumstances )

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances text box for Custodial effectiveness assessment in Green Cleaning")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_text_box_for_Custodial_effectiveness_assessment_in_Green_Cleaning() {

		String Special_Circumstances = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'))
		println "##############"+ Special_Circumstances
		WebUI.verifyMatch(Special_Circumstances, txt_Special_Circumstances , false, FailureHandling.STOP_ON_FAILURE)
	}



	@Given("User can see the save button in GC")
	public void user_can_see_the_save_button_in_GC() {

		WebUI.delay(10)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/button_Save'), 30)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Green_Cleaning/button_Save'))
	}

	@When("User clicks on save button in GC")
	public void user_clicks_on_save_button_in_GC() {


		WebUI.click(findTestObject('Object Repository/Green_Cleaning/button_Save'))
	}

	@Then("User should see Form data saved successfully message in GC")
	public void user_should_see_Form_data_saved_successfully_message_in_GC() {

		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Form data saved successfully.", false)
		println "###########" + str
	}

	@Given("User can see the generate pdf icon on the top of the Green Cleaning Form")
	public void user_can_see_the_generate_pdf_icon_on_the_top_of_the_Green_Cleaning_Form() {

		//WebUI.switchToFrame(findTestObject('Object Repository/Green_Cleaning/iframe'), 5)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/icon_pdf'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/icon_pdf'), 30)
		//WebUI.switchToDefaultContent()
	}

	@When("User clicks on generate pdf icon to download the file in Green Cleaning Form")
	public void user_clicks_on_generate_pdf_icon_to_download_the_file_in_Green_Cleaning_Form() {

		//WebUI.switchToFrame(findTestObject('Object Repository/Green_Cleaning/iframe'), 5)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Green_Cleaning/icon_pdf'))
		WebUI.delay(10)
		//WebUI.switchToDefaultContent()
	}

	@Then("User has to verify the procedureDetails html editor with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_the_procedureDetails_html_editor_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		String Editorpath='Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/ProceduresEditorBox_Custodial/body_custodialText'
		String scroll='Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/ProceduresEditorBox_Custodial/p_procedures and routine Inspection'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded custodial effectiveness audit with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_Uploaded_custodial_effectiveness_audit_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		String xpathid="Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/tbody_Table_Custodial"
		String scroll1='Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness'
		String iframe='Object Repository/Green_Cleaning/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify the Overall score facility Numeric field with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_the_Overall_score_facility_Numeric_field_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), 'value')
		println "The Percenatge value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the Overall score facility is found in the pdf --> Found")
		}
		else {
			println("The value in the Overall score facility is not found in the pdf --> Not Found")
		}
	}

	@Then("User has to verify the Date audit with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_the_Date_audit_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_date'), 'value')
		println "The Percenatge value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the Date audit is found in the pdf --> Found")
		}
		else {
			println("The value in the Date audit is not found in the pdf --> Not Found")
		}
	}

	@Then("User has to verify the opportunities html editor with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_the_opportunities_html_editor_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		String Editorpath='Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/OpportunitiesEditorBox_Custodial/body_textOpportunities'
		String scroll='Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/OpportunitiesEditorBox_Custodial/p_opportunities'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User has to verify the Special Circumstances html editor with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_the_Special_Circumstances_html_editor_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		String Editorpath='Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'
		String scroll='Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/p_SC_Editorbox'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded additional documentation with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_Uploaded_additional_documentation_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		String xpathid="Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/tbody_Table_SC"
		String scroll1='Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/p_SC_additionalDoc'
		String iframe='Object Repository/Green_Cleaning/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User verifies the narrative text of procedureDetails html editor box for Green Cleaning form")
	public void user_verifies_the_narrative_text_of_procedureDetails_html_editor_box_for_Green_Cleaning_form() {

		String procedureDetails = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/ProceduresEditorBox_Custodial/body_custodialText'))
		println "##############"+ procedureDetails
		WebUI.verifyMatch(procedureDetails, txt_procedureDetails, false, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User verifies the narrative text of Special Circumstances html editor box for Green Cleaning form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_Green_Cleaning_form() {

		String Special_Circum = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'))
		println "##############"+ Special_Circum
		WebUI.verifyMatch(Special_Circum, txt_Special_Circumstances, false, FailureHandling.STOP_ON_FAILURE)
	}

	
	//////////////////////////////GC_Entryway Systems///////////////////////////////////////

	/**
	 *
	 * Started Entryway Systems (Option 2)
	 *
	 */

	@Given("User should see the radio button option Entryway systems")
	public void user_should_see_the_radio_button_option_Entryway_systems() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		boolean option1Present = WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/input_option2'), 30)
		if (option1Present == true){
			println  "Entryway systems option is present"
		}
		else{
			println  "Entryway systems option is not present"
		}
	}

	@When("User clicks on Entryway systems option")
	public void user_clicks_on_Entryway_systems_option() {

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/input_option2'))
		WebUI.delay(2)
	}

	@Then("User should see the contents for Entryway systems option")
	public void user_should_see_the_contents_for_Entryway_systems_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/Green_Cleaning/iframe"), 30)
		WebUI.verifyTextPresent("Option 2: Entryway systems", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see the Add File button for photos, drawings in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_for_photos_drawings_in_Green_Cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/p_Upload photos'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/p_Upload photos'), 30)
	}

	@Then("User uploads file for photos, drawings in Green Cleaning")
	public void user_uploads_file_for_photos_drawings_in_Green_Cleaning() {

		String uploadButton = "Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/Button_EWS_AddFile"
		String inputUploadFile = "Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/input_permanent"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}


	static String txt_weekly_basis = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for weekly basis for Entryway systems in Green Cleaning")
	public void user_should_see_the_editor_for_weekly_basis_for_Entryway_systems_in_Green_Cleaning() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/WeeklyBasis_EditorBox/p_weekly basis'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/WeeklyBasis_EditorBox/p_weekly basis'), 5)
	}

	@When("User feeds long narrative text for weekly basis text box for Entryway systems in Green Cleaning")
	public void user_feeds_long_narrative_text_for_weekly_basis_text_box_for_Entryway_systems_in_Green_Cleaning() {

		println "##############"+ txt_weekly_basis
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/WeeklyBasis_EditorBox/body_EntrywaySys'),txt_weekly_basis )

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on weekly basis text box for Entryway systems in Green Cleaning")
	public void user_should_see_the_narrative_text_persist_on_weekly_basis_text_box_for_Entryway_systems_in_Green_Cleaning() {

		String weekly_basis = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/WeeklyBasis_EditorBox/body_EntrywaySys'))
		println "##############"+ weekly_basis
		WebUI.verifyMatch(weekly_basis, txt_weekly_basis , false, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User has to verify Uploaded  photos, drawings with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_Uploaded_photos_drawings_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		String xpathid="Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/tbody_Table_photos"
		String scroll1='Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/p_Upload photos'
		String iframe='Object Repository/GreenCleaningPolicy/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify the weekly basis html editor with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_the_weekly_basis_html_editor_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		String Editorpath='Object Repository/Green_Cleaning/Entryway_systems_Opt2/WeeklyBasis_EditorBox/body_EntrywaySys'
		String scroll='Object Repository/Green_Cleaning/Entryway_systems_Opt2/WeeklyBasis_EditorBox/p_weekly basis'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User verifies the narrative text of weekly basis html editor box for Green Cleaning form")
	public void user_verifies_the_narrative_text_of_weekly_basis_html_editor_box_for_Green_Cleaning_form() {

		String weekly_basis = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/WeeklyBasis_EditorBox/body_EntrywaySys'))
		println "##############"+ weekly_basis
		WebUI.verifyMatch(weekly_basis, txt_weekly_basis, false, FailureHandling.STOP_ON_FAILURE)

		
	}

	/**
	 * 
	 * Started Powered cleaning equipment (Option 3)
	 * 
	 */


	@Given("User should see the radio button option Powered cleaning equipment")
	public void user_should_see_the_radio_button_option_Powered_cleaning_equipment() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		boolean option1Present = WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_option3'), 30)
		if (option1Present == true){
			println  "Powered cleaning equipment option is present"
		}
		else{
			println  "Powered cleaning equipment option is not present"
		}
	}

	@When("User clicks on Powered cleaning equipment option")
	public void user_clicks_on_Powered_cleaning_equipment_option() {

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_option3'))
		WebUI.delay(2)
	}

	@Then("User should see the contents for Powered cleaning equipment option")
	public void user_should_see_the_contents_for_Powered_cleaning_equipment_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/Green_Cleaning/iframe"), 30)
		WebUI.verifyTextPresent("Option 3. Powered cleaning equipment", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see the Add File button for Green Cleaning Calculator in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_for_Green_Cleaning_Calculator_in_Green_Cleaning() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'), 30)
	}

	@Then("User uploads file for Green Cleaning Calculator in Green Cleaning")
	public void user_uploads_file_for_Green_Cleaning_Calculator_in_Green_Cleaning() {

		String uploadButton = "Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/btn_GC_calculator"
		String inputUploadFile = "Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/input_GC_Calc"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the textbox for powered janitorial equipment in green cleaning")
	public void user_should_be_able_to_see_the_textbox_for_powered_janitorial_equipment_in_green_cleaning() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_Percent by cost'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_Percent by cost'), 30)
	}

	String powered_janitorial
	@When("User enters powered janitorial equipment in green cleaning")
	public void user_enters_powered_janitorial_equipment_in_green_cleaning() {

		powered_janitorial = 141
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_Percent by cost'), powered_janitorial)
	}

	@Then("User should be able to see the entered value of powered janitorial equipment in green cleaning")
	public void user_should_be_able_to_see_the_entered_value_of_powered_janitorial_equipment_in_green_cleaning() {

		WebUI.delay(3)

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_Percent by cost'), 'value')
		println "The entered Value is "+ enterdValue
		println "The powered_janitorial is " + powered_janitorial
		WebUI.verifyMatch(powered_janitorial, enterdValue, false)
	}

	@Then("User has to verify Uploaded Green Cleaning Calculator with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_Uploaded_Green_Cleaning_Calculator_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		String xpathid="Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/tbody_Table_GC_Calc"
		String scroll1='Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'
		String iframe='Object Repository/GreenCleaningPolicy/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)

	}

	@Then("User has to verify the powered janitorial equipment Numeric Field with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_the_powered_janitorial_equipment_Numeric_Field_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_Percent by cost'), 'value')
		println "The Percenatge value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the powered janitorial equipment is found in the pdf --> Found")
		}
		else {
			println("The value in the powered janitorial equipment is not found in the pdf --> Not Found")
		}
	}


	/**
	 *
	 * Started Cleaning products and materials (Option 4)
	 *
	 */


	@Given("User should see the radio button option Cleaning products and materials")
	public void user_should_see_the_radio_button_option_Cleaning_products_and_materials() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(10)
		boolean CertifiedCleaning =	WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_option4'), 30)
		if (CertifiedCleaning == true){
			println  "Certified Cleaning option is present"
		}
		else{
			println  "Certified Cleaning option is not present"
		}
	}

	@When("User clicks on Cleaning products and materials option")
	public void user_clicks_on_Cleaning_products_and_materials_option() {

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_option4'))
		WebUI.delay(2)
	}

	@Then("User should see the contents for Cleaning products and materials option")
	public void user_should_see_the_contents_for_Cleaning_products_and_materials_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/GreenCleaningPolicy/iframe"), 30)
		WebUI.verifyTextPresent("Option 4: Cleaning products and materials", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see the Add File button for executed contract in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_for_executed_contract_in_Green_Cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/p_executedContract'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/p_executedContract'), 30)
	}

	@Then("User uploads file for executed contract in Green Cleaning")
	public void user_uploads_file_for_executed_contract_in_Green_Cleaning() {

		String uploadButton = "Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/Button_executedContract"
		String inputUploadFile = "Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/input_executedContract"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for MSDS sheets in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_for_MSDS_sheets_in_Green_Cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/p_msds'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/p_msds'), 30)
	}

	@Then("User uploads file for MSDS sheets in Green Cleaning")
	public void user_uploads_file_for_MSDS_sheets_in_Green_Cleaning() {

		String uploadButton = "Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/Button_msds"
		String inputUploadFile = "Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/input_MSDS"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the textbox for cleaning products in green cleaning")
	public void user_should_be_able_to_see_the_textbox_for_cleaning_products_in_green_cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percentbycost'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percentbycost'), 30)
	}

	String cleaning_products
	@When("User enters cleaning products in green cleaning")
	public void user_enters_cleaning_products_in_green_cleaning() {

		cleaning_products=141
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percentbycost'), cleaning_products)
	}


	@Then("User should be able to see the entered value of cleaning products in green cleaning")
	public void user_should_be_able_to_see_the_entered_value_of_cleaning_products_in_green_cleaning() {

		WebUI.delay(3)

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percentbycost'), 'value')
		println "The entered Value is "+ enterdValue
		println "The cleaning_products is " + cleaning_products
		WebUI.verifyMatch(cleaning_products, enterdValue, false)
	}

	@Given("User should be able to see the textbox for Percent of cleaning products in green cleaning")
	public void user_should_be_able_to_see_the_textbox_for_Percent_of_cleaning_products_in_green_cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percent_cleaning_products'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percent_cleaning_products'), 30)
	}

	String percent_clng_prdts
	@When("User enters Percent of cleaning products in green cleaning")
	public void user_enters_Percent_of_cleaning_products_in_green_cleaning() {

		percent_clng_prdts=141
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percent_cleaning_products'), percent_clng_prdts)
	}

	@Then("User should be able to see the entered value of Percent of cleaning products in green cleaning")
	public void user_should_be_able_to_see_the_entered_value_of_Percent_of_cleaning_products_in_green_cleaning() {

		WebUI.delay(3)

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percent_cleaning_products'), 'value')
		println "The entered Value is "+ enterdValue
		println "The cleaning_products is " + percent_clng_prdts
		WebUI.verifyMatch(percent_clng_prdts, enterdValue, false)
	}

	@Then("User has to verify Uploaded executed contract with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_Uploaded_executed_contract_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		String xpathid="Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/tbody_Table_executedContract"
		String scroll1='Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/p_executedContract'
		String iframe='Object Repository/Green_Cleaning/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded MSDS sheets with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_Uploaded_MSDS_sheets_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		String xpathid="Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/tbody_Table_Msds"
		String scroll1='Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/p_msds'
		String iframe='Object Repository/Green_Cleaning/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify the cleaning products Numeric Field with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_the_cleaning_products_Numeric_Field_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percentbycost'), 'value')
		println "The Percenatge value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the cleaning products is found in the pdf --> Found")
		}
		else {
			println("The value in the cleaning products is not found in the pdf --> Not Found")
		}
	}

	@Then("User has to verify the Percent of cleaning products textbox with downloaded pdf file in Green Cleaning Form")
	public void user_has_to_verify_the_Percent_of_cleaning_products_textbox_with_downloaded_pdf_file_in_Green_Cleaning_Form() {

		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percent_cleaning_products'), 'value')
		println "The Percenatge value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the Percent of cleaning products is found in the pdf --> Found")
		}
		else {
			println("The value in the Percent of cleaning products is not found in the pdf --> Not Found")
		}
	}

	@And("User changes the status to ready for review for GC form")
	public void user_changes_the_status_to_ready_for_review_for_GC_form(){

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/Green_Cleaning/Navigation/h3_Status"))
		println "The status is "+ status
		if (status == "ATTEMPTED"){
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/Green_Cleaning/a_MarkReadyForReview'))
			//	WebUI.click(findTestObject("Object Repository/Page_LEED Online/a_Submit"))
			WebUI.delay(5)
		}

		String changed_Status =	WebUI.getText(findTestObject("Object Repository/Green_Cleaning/Navigation/h3_Status"))
		println "######################### changed_Status " + changed_Status
		
	}


}