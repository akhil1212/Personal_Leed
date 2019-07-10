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

import leedOnlineKeywords.projectKeywords
import environmentalTobaccoSmokeControl.ETSC_Entities

class EnvironmentalTobaccoSmokeControl_Form {
	/**
	 * The navigation to Environmental tobacco Smoke Control form -- Started
	 */

	@And("User can see Environmental Tobacco Smoke Control under Indoor Environmental Quality")
	public void user_can_see_Environmental_Tobacco_Smoke_Control_under_Indoor_Environmental_Quality() {

		WebUI.scrollToElement(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/div_ETSC"), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/div_ETSC"), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@And("User has to select the status to Attempted for Environmental Tobacco Smoke Control")
	public void user_has_to_select_the_status_to_Attempted_for_Environmental_Tobacco_Smoke_Control() {

		String status =	WebUI.getText(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "READY FOR REVIEW"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)
		}

		String changedStatus =	WebUI.getText(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/h3_Status"))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Environmental Tobacco Smoke Control")
	public void user_clicks_on_Environmental_Tobacco_Smoke_Control() {

		WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/div_ETSC"))
	}

	@And("User has to click on FormV01 button of Environmental Tobacco Smoke Control")
	public void user_has_to_click_on_FormV_button_of_Environmental_Tobacco_Smoke_Control() {

		WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/a_Form (V01)"))
	}

	@Then("User should be able to see the Environmental Tobacco Smoke Control form")
	public void user_should_be_able_to_see_the_Environmental_Tobacco_Smoke_Control_form() {

		boolean insideForm = WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/div_ETSC_Form"), 30)
		if (insideForm == true){
			println "Inside the IPM form"
		}
		else {
			println "Not inside the IPM form"
		}
	}

	/**
	 * The navigation to Environmental tobacco Smoke Control form -- Ended
	 */



	/**
	 *  Filling the data in the Environmental tobacco Smoke Control form No Smoking , saving the form , downloading the Pdf and verifying -- Started
	 */

	@Given("User should be able to see the Add File button of No-smoking policy document")
	public void user_should_be_able_to_see_the_Add_File_button_of_No_smoking_policy_document() {

		WebUI.callTestCase(findTestCase('Test Cases/EnvironmentalTobaccoSmokeControl/TC_NavigateToETSC'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/p_AddFile_NonSmokePolicy'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/p_AddFile_NonSmokePolicy'), 30)
	}

	@Then("User uploads file of No-smoking policy document")
	public void user_uploads_file_of_No_smoking_policy_document() {

		String uploadButton 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/btn_AddFile"
		String inputUploadFile 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button of scaled site plan")
	public void user_should_be_able_to_see_the_Add_File_button_of_scaled_site_plan() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/p_AddFile_ScaledSite'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/p_AddFile_ScaledSite'), 30)
	}

	@Then("User uploads file for scaled site plan")
	public void user_uploads_file_for_scaled_site_plan() {

		String uploadButton 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/btn_AddFile"
		String inputUploadFile 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_ETSC_Narrative = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for explain how the no-smoking policy is communicated to the building occupants")
	public void user_should_see_the_editor_for_explain_how_the_no_smoking_policy_is_communicated_to_the_building_occupants() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/p_Editor_NoSmokingPolicy'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/p_Editor_NoSmokingPolicy'), 5)
	}

	@When("User feeds long narrative text for explain how the no-smoking policy is communicated to the building occupants")
	public void user_feeds_long_narrative_text_for_explain_how_the_no_smoking_policy_is_communicated_to_the_building_occupants() {

		println "##############"+ txt_ETSC_Narrative
		WebUI.setText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/body_Editor_NoSmokingPolicy'),txt_ETSC_Narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on explain how the no-smoking policy is communicated to the building occupants")
	public void user_should_see_the_narrative_text_persist_on_explain_how_the_no_smoking_policy_is_communicated_to_the_building_occupants() {

		String narrative_NoSmoking = WebUI.getText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/body_Editor_NoSmokingPolicy'))
		println "##############"+ narrative_NoSmoking
		WebUI.verifyMatch(narrative_NoSmoking, txt_ETSC_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}


	@Given("User should be able to see the checkbox for project must comply with a code")
	public void user_should_be_able_to_see_the_checkbox_for_project_must_comply_with_a_code() {

		boolean chk_ProjectCode =WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_Chk_ProjectCode"), 30)
		if (chk_ProjectCode == true){
			println "checkbox for the project must comply with a code is present"
		}
		else{
			println "checkbox for the project must comply with a code is not present"
		}
	}

	@When("User clicks on the check box for project must comply with a code")
	public void user_clicks_on_the_check_box_for_project_must_comply_with_a_code() {

		String chk_Xpath = 'Object Repository/EnvironmentalTobaccoSmokeControl/input_Chk_ProjectCode'
		new projectKeywords().clickCheckbox(chk_Xpath, ETSC_Entities.iframe)
	}

	@Then("User should be able to see the checkbox checked for project must comply with a code")
	public void user_should_be_able_to_see_the_checkbox_checked_for_project_must_comply_with_a_code() {

		WebUI.delay(2)
		boolean isChecked =	WebUI.verifyElementChecked(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_Chk_ProjectCode"), 30)
		if (isChecked == true){

			println "checkbox is checked"
		}
		else{
			println "checkbox is not checked"
		}
	}

	@Given("User should be able to see the Add File button of information about the code")
	public void user_should_be_able_to_see_the_Add_File_button_of_information_about_the_code() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/p_AddFile_InfoCode'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/p_AddFile_InfoCode'), 30)
	}

	@Then("User uploads file of information about the code")
	public void user_uploads_file_of_information_about_the_code() {

		String uploadButton 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/btn_AddFile"
		String inputUploadFile 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should see the editor for explain why the code does not allow smoking to be prohibited")
	public void user_should_see_the_editor_for_explain_why_the_code_does_not_allow_smoking_to_be_prohibited() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_SmokingProhibited/p_Editor_SmokingProhibited'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_SmokingProhibited/p_Editor_SmokingProhibited'), 5)
	}

	@When("User feeds long narrative text for explain why the code does not allow smoking to be prohibited")
	public void user_feeds_long_narrative_text_for_explain_why_the_code_does_not_allow_smoking_to_be_prohibited() {

		println "##############"+ txt_ETSC_Narrative
		WebUI.setText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_SmokingProhibited/body_Editor_SmokingProhibited'),txt_ETSC_Narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on explain why the code does not allow smoking to be prohibited")
	public void user_should_see_the_narrative_text_persist_on_explain_why_the_code_does_not_allow_smoking_to_be_prohibited() {


		String narrative_SmokingProhibited = WebUI.getText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_SmokingProhibited/body_Editor_SmokingProhibited'))
		println "##############"+ narrative_SmokingProhibited
		WebUI.verifyMatch(narrative_SmokingProhibited, txt_ETSC_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User should be able to see the checkbox for project includes residential units")
	public void user_should_be_able_to_see_the_checkbox_for_project_includes_residential_units() {

		boolean chk_ResidentialUnits =WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_Chk_ResidentialUnits"), 30)
		if (chk_ResidentialUnits == true){
			println "checkbox for the project must comply with a code is present"
		}
		else{
			println "checkbox for the project must comply with a code is not present"
		}
	}

	@When("User clicks on the check box for project includes residential units")
	public void user_clicks_on_the_check_box_for_project_includes_residential_units() {

		String chk_Xpath = 'Object Repository/EnvironmentalTobaccoSmokeControl/input_Chk_ResidentialUnits'
		new projectKeywords().clickCheckbox(chk_Xpath, ETSC_Entities.iframe)
	}

	@Then("User should be able to see the checkbox checked for project includes residential units")
	public void user_should_be_able_to_see_the_checkbox_checked_for_project_includes_residential_units() {

		WebUI.delay(2)
		boolean isChecked =	WebUI.verifyElementChecked(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_Chk_ResidentialUnits"), 30)
		if (isChecked == true){

			println "checkbox is checked"
		}
		else{
			println "checkbox is not checked"
		}
	}

	@Given("User should see the radio button option No smoking")
	public void user_should_see_the_radio_button_option_No_smoking() {

		boolean option1Present =	WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_RadioBtn_NoSmoking"), 30)
		if (option1Present == true){
			println  "No Smoking option is present"
		}
		else{
			println  "No Smoking option is not present"
		}
	}

	@When("User clicks on No smoking option")
	public void user_clicks_on_No_smoking_option() {

		WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_RadioBtn_NoSmoking"))
		WebUI.delay(2)
	}

	@Then("User should see the contents for No smoking option")
	public void user_should_see_the_contents_for_No_smoking_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/iframe"), 30)
		WebUI.verifyTextPresent("Option 1. No smoking", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see the Add File button for special circumstances in Environmental Tobacco Smoke Control")
	public void user_should_be_able_to_see_the_Add_File_button_for_special_circumstances_in_Environmental_Tobacco_Smoke_Control() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
	}

	@Then("User uploads file for special circumstances in Environmental Tobacco Smoke Control")
	public void user_uploads_file_for_special_circumstances_in_Environmental_Tobacco_Smoke_Control() {

		String uploadButton 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/btn_AddFile"
		String inputUploadFile 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should see the editor for Special Circumstances for Environmental Tobacco Smoke Control")
	public void user_should_see_the_editor_for_Special_Circumstances_for_Environmental_Tobacco_Smoke_Control() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/EditorBox_SplCircumstances/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/EditorBox_SplCircumstances/p_Editor_SplCircum'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances for Environmental Tobacco Smoke Control")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_for_Environmental_Tobacco_Smoke_Control() {

		println "##############"+ txt_ETSC_Narrative
		WebUI.setText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/EditorBox_SplCircumstances/body_Editor_SplCircum'),txt_ETSC_Narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances for Environmental Tobacco Smoke Control")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_for_Environmental_Tobacco_Smoke_Control() {

		String narrative_SplCircum = WebUI.getText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/EditorBox_SplCircumstances/body_Editor_SplCircum'))
		println "##############"+ narrative_SplCircum
		WebUI.verifyMatch(narrative_SplCircum, txt_ETSC_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User can see the save button in Environmental Tobacco Smoke Control form")
	public void user_can_see_the_save_button_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.verifyElementVisible(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/btn_Save"))
	}

	@When("User clicks on save button in Environmental Tobacco Smoke Control form")
	public void user_clicks_on_save_button_in_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/btn_Save"))
	}

	@Then("User has to verify Uploaded files for No-smoking policy document with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_No_smoking_policy_document_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/tbody_Table_NonSmoke'
		String scrollTo='Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_NonSmokePolicy/p_AddFile_NonSmokePolicy'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,ETSC_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for scaled site plan with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_scaled_site_plan_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/tbody_Table_ScaledSite'
		String scrollTo='Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_ScaledSite/p_AddFile_ScaledSite'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,ETSC_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify the narrative content explain how the no-smoking policy is communicated to the building occupants with downloaded pdf file")
	public void user_has_to_verify_the_narrative_content_explain_how_the_no_smoking_policy_is_communicated_to_the_building_occupants_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/body_Editor_NoSmokingPolicy'
		String scroll='Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/p_Editor_NoSmokingPolicy'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for information about the code with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_information_about_the_code_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/tbody_Table_InfoCode'
		String scrollTo='Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_InformationCode/p_AddFile_InfoCode'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,ETSC_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify the narrative content explain why the code does not allow smoking to be prohibited with downloaded pdf file")
	public void user_has_to_verify_the_narrative_content_explain_why_the_code_does_not_allow_smoking_to_be_prohibited_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/EnvironmentalTobaccoSmokeControl/Editor_SmokingProhibited/body_Editor_SmokingProhibited'
		String scroll='Object Repository/EnvironmentalTobaccoSmokeControl/Editor_SmokingProhibited/p_Editor_SmokingProhibited'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.delay(2)
	}

	@And("User has to verify the special circumstances narrative content for Environmental Tobacco Smoke Control with downloaded pdf file")
	public void user_has_to_verify_the_special_circumstances_narrative_content_for_Environmental_Tobacco_Smoke_Control_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/EnvironmentalTobaccoSmokeControl/EditorBox_SplCircumstances/body_Editor_SplCircum'
		String scroll='Object Repository/EnvironmentalTobaccoSmokeControl/EditorBox_SplCircumstances/p_Editor_SplCircum'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded for special circumstances in Environmental Tobacco Smoke Control with downloaded pdf file")
	public void user_has_to_verify_Uploaded_for_special_circumstances_in_Environmental_Tobacco_Smoke_Control_with_downloaded_pdf_file() {

		String path = RunConfiguration.getProjectDir()+'/Include/TestData/DownloadedFiles'

		String Table_Xpathid= 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String scrollTo='Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_SpecialCircum/p_AddFile_SplCircum'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,ETSC_Entities.iframe)
		WebUI.delay(2)

		new projectKeywords().deleteDownloadedFiles(path)
	}


	@Then("User verifies the narrative text of explain how the no-smoking policy is communicated to the building occupants")
	public void user_verifies_the_narrative_text_of_explain_how_the_no_smoking_policy_is_communicated_to_the_building_occupants() {

		String narrative_NoSmoking = WebUI.getText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/body_Editor_NoSmokingPolicy'))
		println "##############"+ narrative_NoSmoking
		WebUI.verifyMatch(narrative_NoSmoking, txt_ETSC_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User verifies the narrative text of explain why the code does not allow smoking to be prohibited")
	public void user_verifies_the_narrative_text_of_explain_why_the_code_does_not_allow_smoking_to_be_prohibited() {

		String narrative_SmokingProhibited = WebUI.getText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_SmokingProhibited/body_Editor_SmokingProhibited'))
		println "##############"+ narrative_SmokingProhibited
		WebUI.verifyMatch(narrative_SmokingProhibited, txt_ETSC_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User verifies the narrative text of Special Circumstances in Environmental Tobacco Smoke Control")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_in_Environmental_Tobacco_Smoke_Control() {

		String narrative_SplCircum = WebUI.getText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/EditorBox_SplCircumstances/body_Editor_SplCircum'))
		println "##############"+ narrative_SplCircum
		WebUI.verifyMatch(narrative_SplCircum, txt_ETSC_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User changes the status to ready for review for the Environmental Tobacco Smoke Control form")
	public void user_changes_the_status_to_ready_for_review_for_the_Environmental_Tobacco_Smoke_Control_form() {

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "ATTEMPTED"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)
		}

		String changedStatus =	WebUI.getText(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/Navigation/h3_Status"))
		println "The changed Status is "+changedStatus
	}

	/**
	 *  Filling the data in the Environmental tobacco Smoke Control form No Smoking , saving the form , downloading the Pdf and verifying -- Ended
	 */

	/**
	 *  Filling the data in the Environmental tobacco Smoke Control form Compartmentalization of smoking areas , saving the form , downloading the Pdf and verifying -- Started
	 */


	@Given("User should see the radio button option Compartmentalization of smoking areas")
	public void user_should_see_the_radio_button_option_Compartmentalization_of_smoking_areas() {

		WebUI.callTestCase(findTestCase('Test Cases/EnvironmentalTobaccoSmokeControl/TC_NavigateToETSC'), null, FailureHandling.STOP_ON_FAILURE)

		//WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/input_RadioBtn_Compartmentalization'), 10)
		boolean option2Present =	WebUI.verifyElementPresent(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_RadioBtn_Compartmentalization"), 30)
		if (option2Present == true){
			println  "Compartmentalization of smoking areas option is present"
		}
		else{
			println  "Compartmentalization of smoking areas option is not present"
		}

	}

	@When("User clicks on Compartmentalization of smoking areas option")
	public void user_clicks_on_Compartmentalization_of_smoking_areas_option() {

		WebUI.click(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/input_RadioBtn_Compartmentalization"))
		WebUI.delay(2)
	}

	@Then("User should see the contents for Compartmentalization of smoking areas option")
	public void user_should_see_the_contents_for_Compartmentalization_of_smoking_areas_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/EnvironmentalTobaccoSmokeControl/iframe"), 30)
		WebUI.verifyTextPresent("Option 2. Compartmentalization of smoking areas", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see the Add File button of weather stripping and sealing")
	public void user_should_be_able_to_see_the_Add_File_button_of_weather_stripping_and_sealing() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/p_AddFile_WeatherStrip'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/p_AddFile_WeatherStrip'), 30)
	}

	@Then("User uploads file of weather stripping and sealing")
	public void user_uploads_file_of_weather_stripping_and_sealing() {

		String uploadButton 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/btn_AddFile"
		String inputUploadFile 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button of differential air pressure test report")
	public void user_should_be_able_to_see_the_Add_File_button_of_differential_air_pressure_test_report() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/p_AddFile_AirPressure'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/p_AddFile_AirPressure'), 30)
	}

	@Then("User uploads file for differential air pressure test report")
	public void user_uploads_file_for_differential_air_pressure_test_report() {

		String uploadButton 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/btn_AddFile"
		String inputUploadFile 	= "Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@And("User has to verify Uploaded files for weather stripping and sealing with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_weather_stripping_and_sealing_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/tbody_Table_WeatherStrip'
		String scrollTo='Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_WeatherStripping/p_AddFile_WeatherStrip'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,ETSC_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for differential air pressure test report with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_differential_air_pressure_test_report_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/tbody_Table_AirPressure'
		String scrollTo='Object Repository/EnvironmentalTobaccoSmokeControl/AddFile_AirPressure/p_AddFile_AirPressure'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,ETSC_Entities.iframe)
		WebUI.delay(2)
	}


	/**
	 *  Filling the data in the Environmental tobacco Smoke Control form Compartmentalization of smoking areas , saving the form , downloading the Pdf and verifying -- Ended
	 */
}