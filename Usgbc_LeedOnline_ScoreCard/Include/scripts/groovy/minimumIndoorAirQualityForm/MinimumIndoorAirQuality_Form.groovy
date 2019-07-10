package minimumIndoorAirQualityForm
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
import minimumIndoorAirQualityForm.MIAQ_Entities


class MinimumIndoorAirQuality_Form {
	/**
	 * The navigation to Minimum Indoor Air Quality form -- Started
	 */

	@And("User can see Minimum Indoor Air Quality under Indoor Environmental Quality")
	public void user_can_see_Minimum_Indoor_Air_Quality_under_Indoor_Environmental_Quality() {

		WebUI.scrollToElement(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/div_Minimum Indoor Air Quality"), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/div_Minimum Indoor Air Quality"), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@And("User has to select the status to Attempted for Minimum Indoor Air Quality")
	public void user_has_to_select_the_status_to_Attempted_for_Minimum_Indoor_Air_Quality() {

		String status =	WebUI.getText(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "READY FOR REVIEW"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)
		}

		String changedStatus =	WebUI.getText(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/h3_Status"))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Minimum Indoor Air Quality")
	public void user_clicks_on_Minimum_Indoor_Air_Quality() {

		WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/div_Minimum Indoor Air Quality"))
	}

	@And("User has to click on FormV{int} button of Minimum Indoor Air Quality")
	public void user_has_to_click_on_FormV_button_of_Minimum_Indoor_Air_Quality(Integer int1) {

		WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/a_Form (V01)"))
	}

	@Then("User should be able to see the Minimum Indoor Air Quality form")
	public void user_should_be_able_to_see_the_Minimum_Indoor_Air_Quality_form() {

		boolean insideForm = WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/div_MIAQ_Form"), 30)
		if (insideForm == true){
			println "Inside the IPM form"
		}
		else {
			println "Not inside the IPM form"
		}
	}


	/**
	 * The navigation to Minimum Indoor Air Quality form -- Ended
	 */

	/**
	 *  Filling the data in the Minimum Indoor Air Quality form , saving the form , downloading the Pdf and verifying -- Started
	 */


	@Given("User should be able to see the Add File button for minimum indoor air quality calculator")
	public void user_should_be_able_to_see_the_Add_File_button_for_minimum_indoor_air_quality_calculator() {

		WebUI.callTestCase(findTestCase('Test Cases/MinimumIndoorAirQuality/TC_NavigateToMIAQ'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/p_AddFile_CalcUpload'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/p_AddFile_CalcUpload'), 30)
	}

	@Then("User uploads file for minimum indoor air quality calculator")
	public void user_uploads_file_for_minimum_indoor_air_quality_calculator() {

		String uploadButton 	= "Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/btn_AddFile"
		String inputUploadFile 	= "Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the checkbox for the Energy Efficient Practices")
	public void user_should_be_able_to_see_the_checkbox_for_the_Energy_Efficient_Practices() {

		boolean chk_EnergyEffPrac =	WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_energyEfficientPractices"), 30)
		if (chk_EnergyEffPrac == true){
			println "checkbox for the Energy Efficient Practices is present"
		}
		else{
			println "checkbox for the Energy Efficient Practices is not present"
		}
	}

	@When("User clicks on the check box for the Energy Efficient Practices")
	public void user_clicks_on_the_check_box_for_the_Energy_Efficient_Practices() {

		String chk_Xpath = 'Object Repository/MinimumIndoorAirQuality/input_Chk_energyEfficientPractices'
		new projectKeywords().clickCheckbox(chk_Xpath, MIAQ_Entities.iframe)
	}

	@Then("User should be able to see the checkbox checked for for the Energy Efficient Practices")
	public void user_should_be_able_to_see_the_checkbox_checked_for_for_the_Energy_Efficient_Practices() {

		WebUI.delay(2)
		boolean isChecked =	WebUI.verifyElementChecked(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_energyEfficientPractices"), 30)
		if (isChecked == true){

			println "checkbox is checked"
		}
		else{
			println "checkbox is not checked"
		}
	}

	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_MIAQ_Narrative = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for describing the method or protocol")
	public void user_should_see_the_editor_for_describing_the_method_or_protocol() {

		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_DescribeMethod/p_Editor_DescrMethod'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_DescribeMethod/p_Editor_DescrMethod'), 5)
	}

	@When("User feeds long narrative text for describing the method or protocol")
	public void user_feeds_long_narrative_text_for_describing_the_method_or_protocol() {

		println "##############"+ txt_MIAQ_Narrative
		WebUI.setText(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_DescribeMethod/body_Editor_DescrMethod'),txt_MIAQ_Narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on for describing the method or protocol")
	public void user_should_see_the_narrative_text_persist_on_for_describing_the_method_or_protocol() {

		String narrative_DescrMethod = WebUI.getText(findTestObject('Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/body_Editor_GreenInfra'))
		println "##############"+ narrative_DescrMethod
		WebUI.verifyMatch(narrative_DescrMethod, txt_MIAQ_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}


	@Given("User should be able to see the checkbox for the Mechanically Ventilated Spaces")
	public void user_should_be_able_to_see_the_checkbox_for_the_Mechanically_Ventilated_Spaces() {

		boolean chk_MechanicallySpaces = WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_mechanicallyVentSpaces"), 30)
		if (chk_MechanicallySpaces == true){
			println "checkbox for the Energy Efficient Practices is present"
		}
		else{
			println "checkbox for the Energy Efficient Practices is not present"
		}
	}

	@When("User clicks on the check box for the Mechanically Ventilated Spaces")
	public void user_clicks_on_the_check_box_for_the_Mechanically_Ventilated_Spaces() {

		String chk_Xpath = 'Object Repository/MinimumIndoorAirQuality/input_Chk_mechanicallyVentSpaces'
		new projectKeywords().clickCheckbox(chk_Xpath, MIAQ_Entities.iframe)
	}

	@Then("User should be able to see the checkbox checked for for the Mechanically Ventilated Spaces")
	public void user_should_be_able_to_see_the_checkbox_checked_for_for_the_Mechanically_Ventilated_Spaces() {

		WebUI.delay(2)
		boolean isChecked =	WebUI.verifyElementChecked(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_mechanicallyVentSpaces"), 30)
		if (isChecked == true){

			println "checkbox is checked"
		}
		else{
			println "checkbox is not checked"
		}
	}


	@Given("User should be able to see the checkbox for the Naturally Ventilated Spaces")
	public void user_should_be_able_to_see_the_checkbox_for_the_Naturally_Ventilated_Spaces() {

		boolean chk_NaturallySpaces = WebUI.verifyElementPresent(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_naturallyVentSpaces"), 30)
		if (chk_NaturallySpaces == true){
			println "checkbox for the Energy Efficient Practices is present"
		}
		else{
			println "checkbox for the Energy Efficient Practices is not present"
		}
	}

	@When("User clicks on the check box for the Naturally Ventilated Spaces")
	public void user_clicks_on_the_check_box_for_the_Naturally_Ventilated_Spaces() {

		String chk_Xpath = 'Object Repository/MinimumIndoorAirQuality/input_Chk_naturallyVentSpaces'
		new projectKeywords().clickCheckbox(chk_Xpath, MIAQ_Entities.iframe)
	}

	@Then("User should be able to see the checkbox checked for for the Naturally Ventilated Spaces")
	public void user_should_be_able_to_see_the_checkbox_checked_for_for_the_Naturally_Ventilated_Spaces() {

		WebUI.delay(2)
		boolean isChecked =	WebUI.verifyElementChecked(findTestObject("Object Repository/MinimumIndoorAirQuality/input_Chk_naturallyVentSpaces"), 30)
		if (isChecked == true){

			println "checkbox is checked"
		}
		else{
			println "checkbox is not checked"
		}
	}

	@Given("User should be able to see the Add File button for special circumstances in Minimum Indoor Air Quality")
	public void user_should_be_able_to_see_the_Add_File_button_for_special_circumstances_in_Minimum_Indoor_Air_Quality() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/p_AddFile_SplCircum'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/p_AddFile_SplCircum'), 30)
	}

	@Then("User uploads file for special circumstances in Minimum Indoor Air Quality")
	public void user_uploads_file_for_special_circumstances_in_Minimum_Indoor_Air_Quality() {

		String uploadButton 	= "Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/btn_AddFile"
		String inputUploadFile 	= "Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}


	@Given("User should see the editor for Special Circumstances for minimum indoor air quality")
	public void user_should_see_the_editor_for_Special_Circumstances_for_minimum_indoor_air_quality() {

		WebUI.scrollToElement(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_SplCircumstances/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_SplCircumstances/p_Editor_SplCircum'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances for minimum indoor air quality")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_for_minimum_indoor_air_quality() {

		println "##############"+ txt_MIAQ_Narrative
		WebUI.setText(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_SplCircumstances/body_Editor_SplCircum'),txt_MIAQ_Narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances for minimum indoor air quality")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_for_minimum_indoor_air_quality() {

		String narrativeSplCircum = WebUI.getText(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_SplCircumstances/body_Editor_SplCircum'))
		println "##############"+ narrativeSplCircum
		WebUI.verifyMatch(narrativeSplCircum, txt_MIAQ_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User can see the save button in Minimum Indoor Air Quality form")
	public void user_can_see_the_save_button_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.verifyElementVisible(findTestObject("Object Repository/MinimumIndoorAirQuality/btn_Save"))
	}

	@When("User clicks on save button in Minimum Indoor Air Quality form")
	public void user_clicks_on_save_button_in_Minimum_Indoor_Air_Quality_form() {

		WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/btn_Save"))
	}

	/*	@Then("User should see Form data saved successfully message")
	 public void user_should_see_Form_data_saved_successfully_message() {
	 WebUI.delay(2)
	 boolean str =	WebUI.verifyTextPresent("Form data saved successfully.", false)
	 println "###########" + str
	 }*/


	@Then("User has to verify Uploaded files for Minimum Indoor Air Quality Calculator with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_Minimum_Indoor_Air_Quality_Calculator_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/tbody_Table_CalcUpload'
		String scrollTo='Object Repository/MinimumIndoorAirQuality/AddFile_CalculatorUpload/p_AddFile_CalcUpload'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,MIAQ_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify describing the method or protocol narrative content with downloaded pdf file")
	public void user_has_to_verify_describing_the_method_or_protocol_narrative_content_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/MinimumIndoorAirQuality/EditorBox_DescribeMethod/body_Editor_DescrMethod'
		String scroll='Object Repository/MinimumIndoorAirQuality/EditorBox_DescribeMethod/p_Editor_DescrMethod'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.delay(2)
	}

	@And("User has to verify the special circumstancesnarrative content for minimum indoor air quality with downloaded pdf file")
	public void user_has_to_verify_the_special_circumstancesnarrative_content_for_minimum_indoor_air_quality_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/MinimumIndoorAirQuality/EditorBox_SplCircumstances/body_Editor_SplCircum'
		String scroll='Object Repository/MinimumIndoorAirQuality/EditorBox_SplCircumstances/p_Editor_SplCircum'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded for special circumstances in minimum indoor air quality with downloaded pdf file")
	public void user_has_to_verify_Uploaded_for_special_circumstances_in_minimum_indoor_air_quality_with_downloaded_pdf_file() {

		String path = RunConfiguration.getProjectDir()+'/Include/TestData/DownloadedFiles'

		String Table_Xpathid= 'Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/tbody_Table_SplCircum'
		String scrollTo='Object Repository/MinimumIndoorAirQuality/AddFile_SplCircumstancesDocs/p_AddFile_SplCircum'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,MIAQ_Entities.iframe)
		WebUI.delay(2)

		new projectKeywords().deleteDownloadedFiles(path)
	}



	@Then("User verifies the narrative text of describing the method or protocol in Minimum Indoor Air Quality")
	public void user_verifies_the_narrative_text_of_describing_the_method_or_protocol_in_Minimum_Indoor_Air_Quality() {

		String narrative_DescrMethod = WebUI.getText(findTestObject('Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/body_Editor_GreenInfra'))
		println "##############"+ narrative_DescrMethod
		WebUI.verifyMatch(narrative_DescrMethod, txt_MIAQ_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User verifies the narrative text of Special Circumstances in Minimum Indoor Air Quality")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_in_Minimum_Indoor_Air_Quality() {

		String narrativeSplCircum = WebUI.getText(findTestObject('Object Repository/MinimumIndoorAirQuality/EditorBox_SplCircumstances/body_Editor_SplCircum'))
		println "##############"+ narrativeSplCircum
		WebUI.verifyMatch(narrativeSplCircum, txt_MIAQ_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User changes the status to ready for review for the minimum indoor air quality form")
	public void user_changes_the_status_to_ready_for_review_for_the_minimum_indoor_air_quality_form() {

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "ATTEMPTED"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)
		}

		String changedStatus =	WebUI.getText(findTestObject("Object Repository/MinimumIndoorAirQuality/Navigation/h3_Status"))
		println "The changed Status is "+changedStatus
	}
	/**
	 *  Filling the data in the Minimum Indoor Air Quality form , saving the form , downloading the Pdf and verifying -- Ended
	 */
}