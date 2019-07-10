package innovation_Form
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

class Innovation_Form {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User can see Innovation Form under Innovation")
	public void user_can_see_Innovation_Form_under_Innovation() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/In_Navigation/div_Innovation'), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/In_Navigation/div_Innovation'), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@Given("User has to select the status to Attempted for Innovation")
	public void user_has_to_select_the_status_to_Attempted_for_Innovation() {

		String status =	WebUI.getText(findTestObject('Object Repository/Innovation/In_Navigation/h3_Status'))
		println "######################### h3" + status
		String divval = WebUI.getText(findTestObject('Object Repository/Innovation/In_Navigation/divval'))
		println "######################### dival" + divval

		if (status == "READY FOR REVIEW") {
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/Innovation/In_Navigation/a_MarkReadyForReview'))
			WebUI.delay(5)
		}
		String changedStatus =	WebUI.getText(findTestObject('Object Repository/Innovation/In_Navigation/h3_Status'))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Innovation")
	public void user_clicks_on_Innovation() {

		WebUI.click(findTestObject('Object Repository/Innovation/In_Navigation/div_Innovation'))
	}

	@When("User has to click on FormV01 button of Innovation")
	public void user_has_to_click_on_FormV_button_of_Innovation() {

		WebUI.delay(3);
		WebUI.click(findTestObject('Object Repository/Innovation/In_Navigation/span_(V01)'))
	}

	@Then("User should be able to see the Innovation form")
	public void user_should_be_able_to_see_the_Innovation_form() {

		println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/In_Navigation/div_InnovationCredit'), 30)
		if (insideForm == true){
			println "Inside the Innovation form"
		}
		else {
			println "Not inside the Innovation form"
		}
	}

	/////////////////////////innovation Strategy//////////////////////////


	@Given("User should see the editor for LEED Accredited Professional for Innovation")
	public void user_should_see_the_editor_for_LEED_Accredited_Professional_for_Innovation() {

		WebUI.callTestCase(findTestCase('Test Cases/Innovation/TC_In_Navigation'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Editor_LEED_Accredited/p_LEED_Accredited_Editorbox'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Editor_LEED_Accredited/p_LEED_Accredited_Editorbox'), 5)
	}

	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_narrative = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@When("User feeds long narrative text for LEED Accredited Professional text box for Innovation")
	public void user_feeds_long_narrative_text_for_LEED_Accredited_Professional_text_box_for_Innovation() {

		println "##############"+ txt_narrative
		WebUI.setText(findTestObject('Object Repository/Innovation/Editor_LEED_Accredited/body_LEED_Accredited'),txt_narrative)

		WebUI.delay(3)

	}

	@Then("User should see the narrative text persist on LEED Accredited Professional text box for Innovation")
	public void user_should_see_the_narrative_text_persist_on_LEED_Accredited_Professional_text_box_for_Innovation() {

		String narrative = WebUI.getText(findTestObject('Object Repository/Innovation/Editor_LEED_Accredited/body_LEED_Accredited'))
		println "##############"+ narrative
		WebUI.verifyMatch(narrative, txt_narrative , false, FailureHandling.STOP_ON_FAILURE)

	}

	@Given("User should be able to see the Add File button for a project team member’s LEED Accredited in Innovation")
	public void user_should_be_able_to_see_the_Add_File_button_for_a_project_team_member_s_LEED_Accredited_in_Innovation() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/p_LEED_Accredited'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/p_LEED_Accredited'), 30)
	}

	@Then("User uploads file for project team member’s LEED Accredited in Innovation")
	public void user_uploads_file_for_project_team_member_s_LEED_Accredited_in_Innovation() {

		String uploadButton = "Object Repository/Innovation/AddFile_LEED_Accredited/Button_LEED_Accredited"
		String inputUploadFile = "Object Repository/Innovation/AddFile_LEED_Accredited/input_LEED_Accredited"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}


	@Given("User should see the radio button option Innovation Strategy")
	public void user_should_see_the_radio_button_option_Innovation_Strategy() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/radio_innovation_Strategy'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/radio_innovation_Strategy'), 30)

	}

	@When("User clicks on Innovation Strategy")
	public void user_clicks_on_Innovation_Strategy() {

		WebUI.delay(3);
		WebUI.check(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/radio_innovation_Strategy'))

	}

	@Then("User should see the contents for Innovation Strategy")
	public void user_should_see_the_contents_for_Innovation_Strategy() {
		WebUI.delay(3)
		WebUI.switchToFrame(findTestObject("Object Repository/Innovation/iframe"), 30)
		WebUI.verifyTextPresent("Option 1. Innovation Strategy", false)
		WebUI.switchToDefaultContent()

	}

	@Given("User should see the editor for proposed requirements for Innovation Strategy in Innovation")
	public void user_should_see_the_editor_for_proposed_requirements_for_Innovation_Strategy_in_Innovation() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/Editor_Innovation_Strategy/p_Innovation_Strategy_Editorbox'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/Editor_Innovation_Strategy/p_Innovation_Strategy_Editorbox'), 5)

	}

	@When("User feeds long narrative text for proposed requirements for Innovation Strategy in Innovation")
	public void user_feeds_long_narrative_text_for_proposed_requirements_for_Innovation_Strategy_in_Innovation() {

		println "##############"+ txt_narrative
		WebUI.setText(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/Editor_Innovation_Strategy/body_Innovation_Strategy'),txt_narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on proposed requirements for Innovation Strategy in Innovation")
	public void user_should_see_the_narrative_text_persist_on_proposed_requirements_for_Innovation_Strategy_in_Innovation() {

		String narrative = WebUI.getText(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/Editor_Innovation_Strategy/body_Innovation_Strategy'))
		println "##############"+ narrative
		WebUI.verifyMatch(narrative, txt_narrative , false, FailureHandling.STOP_ON_FAILURE)
	}


	@Given("User should be able to see the Add File button for a supporting documentation for Innovation Strategy in Innovation")
	public void user_should_be_able_to_see_the_Add_File_button_for_a_supporting_documentation_for_Innovation_Strategy_in_Innovation() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/p_supporting_doc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/p_supporting_doc'), 30)
	}

	@Then("User uploads file for supporting documentation for Innovation Strategy in Innovation")
	public void user_uploads_file_for_supporting_documentation_for_Innovation_Strategy_in_Innovation() {

		String uploadButton = "Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/Button_supporting_doc"
		String inputUploadFile = "Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/input_supporting_doc"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for a additional documentation in Innovation")
	public void user_should_be_able_to_see_the_Add_File_button_for_a_additional_documentation_in_Innovation() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'), 30)
	}

	@Then("User uploads file for additional documentation in Innovation")
	public void user_uploads_file_for_additional_documentation_in_Innovation() {

		String uploadButton = "Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/Button_additionalDoc"
		String inputUploadFile = "Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/input_additionalDoc"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should see the editor for Special Circumstances in Innovation")
	public void user_should_see_the_editor_for_Special_Circumstances_in_Innovation() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Special Circumstances/EditorBox_splCircum/p_EditorBox'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Special Circumstances/EditorBox_splCircum/p_EditorBox'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances in Innovation")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_in_Innovation() {

		println "##############"+ txt_narrative
		WebUI.setText(findTestObject('Object Repository/Innovation/Special Circumstances/EditorBox_splCircum/body_splCircum'),txt_narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances in Innovation")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_in_Innovation() {
		String narrative = WebUI.getText(findTestObject('Object Repository/Innovation/Editor_LEED_Accredited/body_LEED_Accredited'))

		println "##############"+ narrative
		WebUI.verifyMatch(narrative, txt_narrative , false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User can see the save button in Innovation")
	public void user_can_see_the_save_button_in_Innovation() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/btn_Save'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/btn_Save'), 5)
	}

	@When("User clicks on save button in Innovation")
	public void user_clicks_on_save_button_in_Innovation() {

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Innovation/btn_Save'))
	}

	@Then("User should see Form data saved successfully message in Innovation")
	public void user_should_see_Form_data_saved_successfully_message_in_Innovation() {

		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Form data saved successfully.", false)
		println "###########" + str
	}

	@Given("User can see the generate pdf icon on the top of the Innovation Form")
	public void user_can_see_the_generate_pdf_icon_on_the_top_of_the_Innovation_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/icon_pdf'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/icon_pdf'), 30)

	}

	@When("User clicks on generate pdf icon to download the file in Innovation Form")
	public void user_clicks_on_generate_pdf_icon_to_download_the_file_in_Innovation_Form() {

		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Innovation/icon_pdf'))
		WebUI.delay(10)
	}

	@Then("User has to verify the LEED Accredited Professional html editor with downloaded pdf file in Innovation Form")
	public void user_has_to_verify_the_LEED_Accredited_Professional_html_editor_with_downloaded_pdf_file_in_Innovation_Form() {

		String Editorpath='Object Repository/Innovation/Editor_LEED_Accredited/body_LEED_Accredited'
		String scroll='Object Repository/Innovation/Editor_LEED_Accredited/p_LEED_Accredited_Editorbox'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)

	}

	String iframe ="Object Repository/Innovation/iframe"
	@Then("User has to verify Uploaded project team member’s LEED Accredited with downloaded pdf file in Innovation Form")
	public void user_has_to_verify_Uploaded_project_team_member_s_LEED_Accredited_with_downloaded_pdf_file_in_Innovation_Form() {

		String xpathid="Object Repository/Innovation/AddFile_LEED_Accredited/tbody_Table_LEED_Accredited"
		String scroll='Object Repository/Innovation/AddFile_LEED_Accredited/p_LEED_Accredited'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify the Innovation Strategy html editor with downloaded pdf file in Innovation Form")
	public void user_has_to_verify_the_Innovation_Strategy_html_editor_with_downloaded_pdf_file_in_Innovation_Form() {

		String Editorpath='Object Repository/Innovation/Innovation_Strategy_Opt1/Editor_Innovation_Strategy/body_Innovation_Strategy'
		String scroll='Object Repository/Innovation/Innovation_Strategy_Opt1/Editor_Innovation_Strategy/p_Innovation_Strategy_Editorbox'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)

	}

	@Then("User has to verify Uploaded supporting documentation with downloaded pdf file in Innovation Form")
	public void user_has_to_verify_Uploaded_supporting_documentation_with_downloaded_pdf_file_in_Innovation_Form() {

		String xpathid="Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/tbody_Table_supporting_doc"
		String scroll1='Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/p_supporting_doc'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)

	}

	@Then("User has to verify the Special Circumstances html editor with downloaded pdf file in Innovation Form")
	public void user_has_to_verify_the_Special_Circumstances_html_editor_with_downloaded_pdf_file_in_Innovation_Form() {

		String Editorpath='Object Repository/Innovation/Special Circumstances/EditorBox_splCircum/body_splCircum'
		String scroll='Object Repository/Innovation/Special Circumstances/EditorBox_splCircum/p_EditorBox'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded additional documentation with downloaded pdf file in Innovation Form")
	public void user_has_to_verify_Uploaded_additional_documentation_with_downloaded_pdf_file_in_Innovation_Form() {

		String xpathid="Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String scroll1='Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)

	}

	@Then("User verifies the narrative text of LEED Accredited Professional html editor box for Innovation form")
	public void user_verifies_the_narrative_text_of_LEED_Accredited_Professional_html_editor_box_for_Innovation_form() {

		String Special_Circum = WebUI.getText(findTestObject('Object Repository/Innovation/Editor_LEED_Accredited/body_LEED_Accredited'))
		println "##############"+ Special_Circum
		WebUI.verifyMatch(Special_Circum, txt_narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User verifies the narrative text of innovation strategy html editor box for Innovation form")
	public void user_verifies_the_narrative_text_of_innovation_strategy_html_editor_box_for_Innovation_form() {

		String Special_Circum = WebUI.getText(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/Editor_Innovation_Strategy/body_Innovation_Strategy'))
		println "##############"+ Special_Circum
		WebUI.verifyMatch(Special_Circum, txt_narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User verifies the narrative text of Special Circumstances html editor box for Innovation form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_Innovation_form() {

		String Special_Circum = WebUI.getText(findTestObject('Object Repository/Innovation/Special Circumstances/EditorBox_splCircum/body_splCircum'))
		println "##############"+ Special_Circum
		WebUI.verifyMatch(Special_Circum, txt_narrative, false, FailureHandling.STOP_ON_FAILURE)
	}


	//////////////////////////// Pilot Credit/////////////////////////////////


	@Given("User should see the radio button option Pilot Credit")
	public void user_should_see_the_radio_button_option_Pilot_Credit() {

		WebUI.callTestCase(findTestCase('Test Cases/Innovation/TC_In_Navigation'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/radio_Pilot_Credit'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/radio_Pilot_Credit'), 30)
	}

	@When("User clicks on Pilot Credit")
	public void user_clicks_on_Pilot_Credit() {

		WebUI.delay(3);
		WebUI.check(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/radio_Pilot_Credit'))
	}

	@Then("User should see the contents for Pilot Credit")
	public void user_should_see_the_contents_for_Pilot_Credit() {

		WebUI.delay(3)
		WebUI.switchToFrame(findTestObject("Object Repository/Innovation/iframe"), 30)
		WebUI.verifyTextPresent("Option 1. Innovation Strategy", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see the textbox for name of the pilot credit in Innovation")
	public void user_should_be_able_to_see_the_textbox_for_name_of_the_pilot_credit_in_Innovation() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/div_nameOfPilot'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/div_nameOfPilot'), 30)
	}

	String name_pilot="credits"
	@When("User enters name of the pilot credit in Innovation")
	public void user_enters_name_of_the_pilot_credit_in_Innovation() {

		//name_pilot="credits"
		WebUI.setText(findTestObject("Object Repository/Innovation/Pilot_Credit_Opt2/input_nameOfPilot"), name_pilot)
	}

	String enterdValue
	@Then("User should be able to see the entered value in name of the pilot credit in Innovation")
	public void user_should_be_able_to_see_the_entered_value_in_name_of_the_pilot_credit_in_Innovation() {

		WebUI.delay(3)

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/input_nameOfPilot'), 'value')
		println "The entered Value is "+ enterdValue
		println "The name pilot is " + name_pilot
		WebUI.verifyMatch(name_pilot, enterdValue, false)
	}



	@Given("User should be able to see the textbox for number of the pilot credit in Innovation")
	public void user_should_be_able_to_see_the_textbox_for_number_of_the_pilot_credit_in_Innovation() {

		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/div_numberOfPilot'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/div_numberOfPilot'), 30)
	}

	String number_pilot="111"
	@When("User enters number of the pilot credit in Innovation")
	public void user_enters_number_of_the_pilot_credit_in_Innovation() {

		//number_pilot="111"
		WebUI.setText(findTestObject("Object Repository/Innovation/Pilot_Credit_Opt2/input_numberOfPilot"), number_pilot)
	}

	@Then("User should be able to see the entered value in number of the pilot credit in Innovation")
	public void user_should_be_able_to_see_the_entered_value_in_number_of_the_pilot_credit_in_Innovation() {


		WebUI.delay(3)

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/input_numberOfPilot'), 'value')
		println "The entered Value is "+ enterdValue
		println "The number pilot is " + number_pilot
		WebUI.verifyMatch(number_pilot, enterdValue, false)
	}



	@Given("User should be able to see the Add File button for a required documentation for pilot credit in Innovation")
	public void user_should_be_able_to_see_the_Add_File_button_for_a_required_documentation_for_pilot_credit_in_Innovation() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/p_required_doc'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/p_required_doc'), 30)
	}

	@Then("User uploads file for required documentation for pilot credit in Innovation")
	public void user_uploads_file_for_required_documentation_for_pilot_credit_in_Innovation() {

		String uploadButton = "Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/Button_required_doc"
		String inputUploadFile = "Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/input_required_doc"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}


	@Then("User verifies the textbox of name of the pilot credit for Innovation form")
	public void user_verifies_the_textbox_of_name_of_the_pilot_credit_for_Innovation_form() {

		WebUI.delay(3)

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/input_nameOfPilot'), 'value')
		println "The entered Value is "+ enterdValue
		println "The name pilot is " + name_pilot
		WebUI.verifyMatch(name_pilot, enterdValue, false)
	}

	@Then("User verifies the textbox of number of the pilot credit for Innovation form")
	public void user_verifies_the_textbox_of_number_of_the_pilot_credit_for_Innovation_form() {

		WebUI.delay(3)

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/input_numberOfPilot'), 'value')
		println "The entered Value is "+ enterdValue
		println "The number pilot is " + number_pilot
		WebUI.verifyMatch(number_pilot, enterdValue, false)
	}
	@Then("User changes the status to ready for review for the Innovation form")
	public void user_changes_the_status_to_ready_for_review_for_the_Innovation_form() {

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/Innovation/In_Navigation/h3_Status"))

		if (status == "ATTEMPTED"){
			println "Inside the if"
			WebUI.click(findTestObject("Object Repository/Innovation/In_Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)
		}

		String changed_Status =	WebUI.getText(findTestObject("Object Repository/Innovation/In_Navigation/h3_Status"))
		println "######################### changed_Status " + changed_Status
	}

}