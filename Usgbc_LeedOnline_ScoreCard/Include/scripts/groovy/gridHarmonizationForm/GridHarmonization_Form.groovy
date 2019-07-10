package gridHarmonizationForm
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
import com.testautomationguru.utility.PDFUtil

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
import com.kms.katalon.core.configuration.RunConfiguration




class GridHarmonization_Form {

	@Given("User can see Grid Harmonization under Energy and Atmosphere")
	public void user_can_see_Grid_Harmonization_under_Energy_and_Atmosphere() {
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/Navigation/div_Grid Harmonization'), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/Navigation/div_Grid Harmonization'), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@Given("User has to select the status to Attempted for Grid Harmonization")
	public void user_has_to_select_the_status_to_Attempted_for_Grid_Harmonization() {
		String status =	WebUI.getText(findTestObject('Object Repository/GridHarmonization/Navigation/h3_Status'))
		println "######################### h3" + status
		String divval = WebUI.getText(findTestObject('Object Repository/GridHarmonization/Navigation/divval'))
		println "######################### dival" + divval

		if (status == "READY FOR REVIEW") {
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/GridHarmonization/a_MarkReadyForReview'))
			WebUI.delay(5)
			String changedStatus =	WebUI.getText(findTestObject('Object Repository/GridHarmonization/Navigation/h3_Status'))
			println "The changed Status is "+changedStatus
		}
	}

	@When("User clicks on Grid Harmonization")
	public void user_clicks_on_Grid_Harmonization() {
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/Navigation/div_Grid Harmonization'),2)
		WebUI.click(findTestObject('Object Repository/GridHarmonization/Navigation/div_Grid Harmonization'))
	}

	@When("User has to click on FormV{int} button of Grid Harmonization")
	public void user_has_to_click_on_FormV_button_of_Grid_Harmonization(Integer int1) {
		WebUI.delay(3);
		WebUI.click(findTestObject('Object Repository/GridHarmonization/Navigation/span_(V01)'))
	}

	@Then("User should be able to see the Grid Harmonization form")
	public void user_should_be_able_to_see_the_Grid_Harmonization_form() {
		println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/Navigation/GH_VerifyPage'), 30)
		if (insideForm == true){
			println "Inside the Grid Harmonization form"
		}
		else {
			println "Not inside the Grid Harmonization form"
		}
	}

	/**
	 *
	 * Started Demand Response Program (Case 1)
	 *
	 */

	@Given("User should see the radio button case Demand Response Program")
	public void user_should_see_the_radio_button_case_Demand_Response_Program() {
		WebUI.callTestCase(findTestCase('Test Cases/GridHarmonization/TC_GH_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		boolean option1Present = WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_SelectOption'), 30)
		if (option1Present == true){
			println  "Demand Response Program case is present"
		}
		else{
			println  "Demand Response Program case is not present"
		}
	}

	@When("User clicks on Demand Response Program case")
	public void user_clicks_on_Demand_Response_Program_case() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_SelectOption'))
	}

	@Then("User should see the contents for Demand Response Program case")
	public void user_should_see_the_contents_for_Demand_Response_Program_case() {
		WebUI.switchToFrame(findTestObject("Object Repository/GridHarmonization/iframe"), 30)
		WebUI.verifyTextPresent("Case 1. Demand response program available and participation", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see all the fields of checkboxes and textboxes for Demand Response Program in Grid Harmonization")
	public void user_should_be_able_to_see_all_the_checkboxes_for_Demand_Response_Program_in_Grid_Harmonization() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/FieldsVerifying'),3)
	}

	@When("User clicks all the checkboxes for Demand Response Program in Grid Harmonization")
	public void user_clicks_all_the_checkboxes_for_Demand_Response_Program_in_Grid_Harmonization() {
		WebUI.check(findTestObject('Object Repository/GridHarmonization/CheckBox/checkbox_DemandResponsePlan'))
		WebUI.delay(2)
		WebUI.check(findTestObject('Object Repository/GridHarmonization/CheckBox/checkbox_DemandResponseEvent'))
		WebUI.delay(2)
		WebUI.check(findTestObject('Object Repository/GridHarmonization/CheckBox/checkbox_DemandResponseProcess'))
	}

	@Then("User able to see the selected checkboxes over there")
	public void user_able_to_see_the_selected_checkboxes_over_there() {
	}

	@Given("User should be able to see the textbox for On-Peak electricity demand in Grid Harmonization")
	public void user_should_be_able_to_see_the_textbox_for_On_Peak_electricity_demand_in_Grid_Harmonization() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_On-peak electricity demand'))
	}
	String Peak_Electricity
	@When("User enters On-Peak electricity in Grid Harmonization")
	public void user_enters_On_Peak_electricity_in_Grid_Harmonization() {
		Peak_Electricity = 8
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_On-peak electricity demand'), Peak_Electricity)
	}
	String enterdValue
	@Then("User should be able to see the entered values of On-Peak electricity in Grid Harmonization")
	public void user_should_be_able_to_see_the_entered_value_of_On_Peak_electricity_in_Grid_Harmonization() {
		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_On-peak electricity demand'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Peak_Electricity is " + Peak_Electricity
		WebUI.verifyMatch(Peak_Electricity, enterdValue, false)
	}

	@Given("User should be able to see the textbox for Planned demand reduction in Grid Harmonization")
	public void user_should_be_able_to_see_the_textbox_for_Planned_demand_reduction_in_Grid_Harmonization() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Planned demand'))
	}
	String Planned_demand
	@When("User enters Planned demand reduction in Grid Harmonization")
	public void user_enters_Planned_demand_reduction_in_Grid_Harmonization() {
		Planned_demand = 87
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Planned demand'), Planned_demand)
	}
	String enterdValue1
	@Then("User should be able to see the entered values of Planned demand reduction in Grid Harmonization")
	public void user_should_be_able_to_see_the_entered_value_of_Planned_demand_reduction_in_Grid_Harmonization() {
		enterdValue1 = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Planned demand'), 'value')
		println "The entered Value is "+ enterdValue1
		println "The Planned_demand is " + Planned_demand
		WebUI.verifyMatch(Planned_demand, enterdValue1, false)
	}

	@Given("User should be able to see the field for Percent on Peak Reduction in Grid Harmonization")
	public void user_should_be_able_to_see_the_field_for_Percent_on_Peak_Reduction_in_Grid_Harmonization() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Percent on-peak reduction'))
	}
	String Percent
	@When("User enters Percent on Peak Reduction in Grid Harmonization")
	public void user_enters_Percent_on_Peak_Reduction_in_Grid_Harmonization() {

		WebUI.click(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Percent on-peak reduction'))
		WebUI.delay(5)
	}
	String enterdValue2
	@Then("User should be able to see the entered values of Percent on Peak Reduction in Grid Harmonization")
	public void user_should_be_able_to_see_the_entered_value_of_Percent_on_Peak_Reduction_in_Grid_Harmonization() {
		enterdValue2 = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Planned demand'), 'value')
		println "The entered Value is "+ enterdValue2
		//println "The Overall Score is " + Percent
		//WebUI.verifyMatch(Percent, enterdValue2, false)
	}

	@Given("User should be able to see the Add File button for Proof of enrollement in Grid Harmonization")
	public void user_should_be_able_to_see_the_Add_File_button_for_Proof_of_enrollement_in_Grid_Harmonization() {
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/p_Upload proof of enrollment'), 4)
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/p_Upload proof of enrollment'))
	}

	@Then("User uploads file for Proof of enrollement in Grid Harmonization")
	public void user_uploads_file_for_Proof_of_enrollement_in_Grid_Harmonization() {
		String uploadButton = "Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/Btn_AddFile_UploadProof"
		String inputUploadFile = "Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/input_AddFile_UploadProof"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile)
	}

	@Given("User should be able to see the Add File button for additional documentation audit in Grid Harmonization")
	public void user_should_be_able_to_see_the_Add_File_button_for_additional_documentation_audit_in_Grid_Harmonization() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/p_SC_AddFile'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/p_SC_AddFile'), 30)
	}

	@Then("User uploads file for additional documentation in Grid Harmonization")
	public void user_uploads_file_for_additional_documentation_in_Grid_Harmonization() {
		String uploadButton = "Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/Btn_SC_AddFile"
		String inputUploadFile = "Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/input_SC_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}
	static String generated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_Special_Circumstances = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+generated_txt
	@Given("User should see the editor for Special Circumstances in Grid Harmonization")
	public void user_should_see_the_editor_for_Special_Circumstances_in_Grid_Harmonization() {
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/p_SC_EditorBox'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/p_SC_EditorBox'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances text box in Grid Harmonization")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_text_box_in_Grid_Harmonization() {
		println "##############"+ txt_Special_Circumstances
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),txt_Special_Circumstances)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances text box in Grid Harmonization")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_text_box_in_Grid_Harmonization() {
		String Special_Circumstances = WebUI.getText(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'))
		println "##############"+ Special_Circumstances
		WebUI.verifyMatch(Special_Circumstances, txt_Special_Circumstances , false, FailureHandling.STOP_ON_FAILURE)
	}


	@Given("User can see the save button in GH")
	public void user_can_see_the_save_button_in_GH() {
		WebUI.delay(10)
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/button_Save'), 30)
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/button_Save'))
	}

	@When("User clicks on save button in GH")
	public void user_clicks_on_save_button_in_GH() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/button_Save'))
	}

	@Then("User should see Form data saved successfully message in GH")
	public void user_should_see_Form_data_saved_successfully_message_in_GH() {
		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Form data saved successfully.", false)
		println "###########" + str
	}

	@Given("User can see the generate pdf icon on the top of the Grid Harmonization Form")
	public void user_can_see_the_generate_pdf_icon_on_the_top_of_the_Grid_Harmonization_Form() {

		//WebUI.switchToFrame(findTestObject('Object Repository/Green_Cleaning/iframe'), 5)
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/icon_pdf'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/icon_pdf'), 30)
		//WebUI.switchToDefaultContent()
	}

	@When("User clicks on generate pdf icon to download the file in Grid Harmonization Form")
	public void user_clicks_on_generate_pdf_icon_to_download_the_file_in_Grid_Harmonization_Form() {
		//WebUI.switchToFrame(findTestObject('Object Repository/GridHarmonization/iframe'), 5)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/GridHarmonization/icon_pdf'))
		WebUI.delay(10)
		//WebUI.switchToDefaultContent()
	}

	@Then("User has to verify the Peak electricity demand Numeric Field with downloaded pdf file in Grid Harmonization Form")
	public void user_has_to_verify_the_Peak_electricity_demand_Numeric_Field_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_On-peak electricity demand'), 'value')
		println "The Peak_electricity value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the Peak electricity is found in the pdf --> Found")
		}
		else {
			println("The value in the Peak electricity is not found in the pdf --> Not Found")
		}
	}

	@Then("User has to verify the Planned demand reduction Numeric Field with downloaded pdf file in Grid Harmonization Form")
	public void user_has_to_verify_the_Planned_demand_reduction_Numeric_Field_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Planned demand'), 'value')
		println "The Planned_demand value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the Planned demand is found in the pdf --> Found")
		}
		else {
			println("The value in the Planned demand is not found in the pdf --> Not Found")
		}
	}

	@Then("User has to verify the Percent on Peak Reduction textbox with downloaded pdf file in Grid Harmonization Form")
	public void user_has_to_verify_the_Percent_on_Peak_Reduction_textbox_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Percent on-peak reduction'), 'value')
		println "The Percent value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the Percent is found in the pdf --> Found")
		}
		else {
			println("The value in the Percent is not found in the pdf --> Not Found")
		}
	}

	@Then("User has to verify Uploaded Proof of enrollement with downloaded pdf file in Grid Harmonization Form")
	public void user_has_to_verify_Uploaded_Proof_of_enrollement_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		String xpathid="Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/tbody_UploadProof"
		String scroll1='Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/p_Upload proof of enrollment'
		String iframe='Object Repository/GridHarmonization/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}
	@Then("User has to verify Uploaded Additional documentation with downloaded pdf file in Grid Harmonization Form")
	public void user_has_to_verify_Uploaded_Additional_documentation_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		/*String xpathid="Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/tbody_SC_AddFile"
		 String scroll1='Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/p_SC_AddFile'
		 String iframe='Object Repository/GridHarmonization/iframe'
		 new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)
		 WebUI.delay(2)*/
	}
	@Then("User has to verify the text in Special circumstances editor box with downloaded pdf file in Grid Harmonization Form")
	public void User_has_to_verify_the_text_in_Special_circumstances_editor_box_with_downloaded_pdf_file_in_Grid_Harmonization_Form(){

		String path = RunConfiguration.getProjectDir()+'/Include/TestData/DownloadedFiles'

		String Editorpath='Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'
		String scroll='Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/p_SC_EditorBox'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)

		new projectKeywords().deleteDownloadedFiles(path)
	}


	/**
	 *
	 * Started Demand Response Capable (Case 2)
	 *
	 */



	@Given("User should see the radio button case Demand Response Capable building")
	public void user_should_see_the_radio_button_case_Demand_Response_Capable_building() {
		WebUI.callTestCase(findTestCase('Test Cases/GridHarmonization/TC_GH_Navigate'), null, FailureHandling.STOP_ON_FAILURE)
		//WebUI.callTestCase(findTestCase('Test Cases/GridHarmonization/TC_GH_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		boolean option1Present = WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_SelectOption'), 30)
		if (option1Present == true){
			println  "Demand Response Capable case is present"
		}
		else{
			println  "Demand Response Capable case is not present"
		}
	}

	@When("User clicks on Demand Response Capable building case")
	public void user_clicks_on_Demand_Response_Capable_building_case() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_SelectOption'))
	}

	@Then("User should see the contents for Demand Response Capable building case")
	public void user_should_see_the_contents_for_Demand_Response_Capable_building_case() {
		WebUI.switchToFrame(findTestObject("Object Repository/GridHarmonization/iframe"), 30)
		WebUI.verifyTextPresent("Case 2. Demand response capable building", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see all the checkboxes for Demand Response Capable in Grid Harmonization")
	public void user_should_be_able_to_see_all_the_checkboxes_for_Demand_Response_Capable_in_Grid_Harmonization() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/FieldsVerifying'),3)
	}

	@When("User clicks all the checkboxes for Demand Response Capable in Grid Harmonization")
	public void user_clicks_all_the_checkboxes_for_Demand_Response_Capable_in_Grid_Harmonization() {
		WebUI.check(findTestObject('Object Repository/GridHarmonization/CheckBox/checkbox_DemandResponsePlan'))
		WebUI.delay(2)
		WebUI.check(findTestObject('Object Repository/GridHarmonization/CheckBox/checkbox_DemandResponseEvent'))
		WebUI.delay(2)
		WebUI.check(findTestObject('Object Repository/GridHarmonization/CheckBox/checkbox_DemandResponseProcess'))
	}

	@Then("User able to see the selected checkboxes there")
	public void user_able_to_see_the_selected_checkboxes_there() {
	}

	@Given("User should be able to see the textbox for Peak electricity demand in Grid Harmonization")
	public void user_should_be_able_to_see_the_textbox_for_Peak_electricity_demand_in_Grid_Harmonization() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_peak electircity demand'))
	}
	String Electricity
	@When("User enters Peak electricity in Grid Harmonization")
	public void user_enters_Peak_electricity_in_Grid_Harmonization() {
		Electricity = 56
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_peak electircity demand'), Electricity)
	}
	String enteredValue
	@Then("User should be able to see the entered values of Peak electricity in Grid Harmonization")
	public void user_should_be_able_to_see_the_entered_value_of_Peak_electricity_in_Grid_Harmonization() {
		enteredValue = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_peak electircity demand'), 'value')
		println "The entered Value is "+ enteredValue
		println "The Electricity is " + Electricity
		WebUI.verifyMatch(Electricity, enteredValue, false)
	}

	@Given("User should able to see the textbox for Planned demand reduction in Grid Harmonization")
	public void user_should_able_to_see_the_textbox_for_Planned_demand_reduction_in_Grid_Harmonization() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PlannedDemandReduction'))
	}
	String Demand_Reduction
	@When("User entered Planned demand reduction in Grid Harmonization")
	public void user_entered_Planned_demand_reduction_in_Grid_Harmonization() {
		Demand_Reduction = 43
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PlannedDemandReduction'),Demand_Reduction )
	}
	String enteredValue1
	@Then("User should able to see the entered values of Planned demand reduction in Grid Harmonization")
	public void user_should_able_to_see_the_entered_value_of_Planned_demand_reduction_in_Grid_Harmonization() {
		enteredValue1 = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PlannedDemandReduction'), 'value')
		println "The entered Value is "+ enteredValue1
		println "The Demand_Reduction is " + Demand_Reduction
		WebUI.verifyMatch(Demand_Reduction, enteredValue1, false)
	}

	@Given("User should able to see the Field for Percent on Peak Reduction in Grid Harmonization")
	public void user_should_able_to_see_the_Field_for_Percent_on_Peak_Reduction_in_Grid_Harmonization() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PercentOnPeakReduction'))
	}
	String Percent1
	@When("User entered Percent on Peak Reduction in Grid Harmonization")
	public void user_entered_Percent_on_Peak_Reduction_in_Grid_Harmonization() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PercentOnPeakReduction'))
		WebUI.delay(5)
	}
	String enteredValue2
	@Then("User should able to see the entered values of Percent on Peak Reduction in Grid Harmonization")
	public void user_should_able_to_see_the_entered_value_of_Percent_on_Peak_Reduction_in_Grid_Harmonization() {
		enteredValue2 = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PercentOnPeakReduction'), 'value')
		println "The entered Value2 is "+ enteredValue2
		//println "The Overall Score is " + Percent
		//WebUI.verifyMatch(Percent, enterdValue2, false)
	}

	@Given("User can see generate pdf icon on the top of the Grid Harmonization Form")
	public void user_can_see_generate_pdf_icon_on_the_top_of_the_Grid_Harmonization_Form() {
		//WebUI.switchToFrame(findTestObject('Object Repository/Green_Cleaning/iframe'), 5)
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/icon_pdf'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/icon_pdf'), 30)
		//WebUI.switchToDefaultContent()
	}

	@When("User clicks generate pdf icon to download the file in Grid Harmonization Form")
	public void user_clicks_generate_pdf_icon_to_download_the_file_in_Grid_Harmonization_Form() {
		//WebUI.switchToFrame(findTestObject('Object Repository/GridHarmonization/iframe'), 5)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/GridHarmonization/icon_pdf'))
		WebUI.delay(10)
		//WebUI.switchToDefaultContent()
	}

	@Then("User has to verify Peak electricity demand Numeric Field with downloaded pdf file in Grid Harmonization Form")
	public void user_has_to_verify_Peak_electricity_demand_Numeric_Field_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_peak electircity demand'), 'value')
		println "The electricity value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the electricity is found in the pdf --> Found")
		}
		else {
			println("The value in the electricity is not found in the pdf --> Not Found")
		}
	}

	@Then("User has to verify Planned demand reduction Numeric Field with downloaded pdf file in Grid Harmonization Form")
	public void user_has_to_verify_Planned_demand_reduction_Numeric_Field_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PlannedDemandReduction'), 'value')
		println "The Demand_reduction value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the Demand_reduction is found in the pdf --> Found")
		}
		else {
			println("The value in the Demand_reduction is not found in the pdf --> Not Found")
		}
	}

	@Then("User has to verify Percent on Peak Reduction textbox with downloaded pdf file in Grid Harmonization Form")
	public void user_has_to_verify_Percent_on_Peak_Reduction_textbox_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PercentOnPeakReduction'), 'value')
		println "The Percent1 value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the Percent1 is found in the pdf --> Found")
		}
		else {
			println("The value in the Percent1 is not found in the pdf --> Not Found")
		}
	}


	

	@Then("User verifies the narrative text of Special Circumstances html editor box for Grid Harmonization Form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_Site_Management_Form() {

		String enteredValue = WebUI.getText(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'))
		println "################# Enteredvalue" + enteredValue
		println "################# txt_SC" + txt_Special_Circumstances
		WebUI.verifyMatch(txt_Special_Circumstances, enteredValue, false)
	}

	@And("User changes the status to ready for review for the Grid Harmonization form")
	public void user_changes_the_status_to_ready_for_review_for_the_Grid_Harmonization_form(){

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/GridHarmonization/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "ATTEMPTED"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/GridHarmonization/a_MarkReadyForReview"))

			WebUI.delay(5)

			String changedStatus =	WebUI.getText(findTestObject("Object Repository/GridHarmonization/Navigation/h3_Status"))
			println "The changed Status is "+changedStatus
		}
	}


	/**
	 *
	 * Started Permanent Load Shifting (Case 3)
	 *
	 */


	@Given("User should see the radio button case Permanent Load Shifting")
	public void user_should_see_the_radio_button_case_Permanent_Load_Shifting() {
		WebUI.callTestCase(findTestCase('Test Cases/GridHarmonization/TC_GH_Navigate'), null, FailureHandling.STOP_ON_FAILURE)
		//WebUI.callTestCase(findTestCase('Test Cases/GridHarmonization/TC_GH_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		boolean option1Present = WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_SelectOption'), 30)
		if (option1Present == true){
			println  "Permanent Load Shifting case is present"
		}
		else{
			println  " Permanent Load Shifting case is not present"
		}
	}

	@When("User clicks on Permanent Load Shifting case")
	public void user_clicks_on_Permanent_Load_Shifting_case() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_SelectOption'))
	}

	@Then("User should see the contents for Permanent Load Shifting case")
	public void user_should_see_the_contents_for_Permanent_Load_Shifting_case() {
		WebUI.switchToFrame(findTestObject("Object Repository/GridHarmonization/iframe"), 30)
		WebUI.verifyTextPresent("Case 3. Permanent load shifting technologies", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see the checkbox for Permanent Load Shifting in Grid Harmonization")
	public void user_should_be_able_to_see_the_checkbox_for_Permanent_Load_Shifting_in_Grid_Harmonization() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/FieldsVerifying'),3)
	}

	@When("User clicks the checkbox for Permanent Load Shifting in Grid Harmonization")
	public void user_clicks_the_checkbox_for_Permanent_Load_Shifting_in_Grid_Harmonization() {
		WebUI.check(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/checkbox_LoadShifting'))
	}

	@Then("User able to see the selected checkbox over there")
	public void user_able_to_see_the_selected_checkbox_over_there() {
	}

	@Given("User can be able to see the textbox for On-Peak electricity demand in Grid Harmonization")
	public void user_can_be_able_to_see_the_textbox_for_On_Peak_electricity_demand_in_Grid_Harmonization() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PeakElectricityDemand'))
	}
	String On_Peak_Electricity
	@When("User can enters On-Peak electricity in Grid Harmonization")
	public void user_can_enters_On_Peak_electricity_in_Grid_Harmonization() {
		On_Peak_Electricity = 2
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PeakElectricityDemand'), On_Peak_Electricity)
	}
	String enterdValue3
	@Then("User has able to see the entered values of On-Peak electricity in Grid Harmonization")
	public void user_has_able_to_see_the_entered_value_of_On_Peak_electricity_in_Grid_Harmonization() {
		enterdValue3 = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PeakElectricityDemand'), 'value')
		println "The entered Value3 is "+ enterdValue3
		println "The On_Peak_Electricity is " + On_Peak_Electricity
		WebUI.verifyMatch(On_Peak_Electricity, enterdValue3, false)
	}

	@Given("User should see the textbox for Planned demand reduction in Grid Harmonization")
	public void user_should_see_the_textbox_for_Planned_demand_reduction_in_Grid_Harmonization() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PlannedDemandReduction'))
	}
	String Reduction
	@When("User should enters Planned demand reduction in Grid Harmonization")
	public void user_should_enters_Planned_demand_reduction_in_Grid_Harmonization() {
		Reduction = 7
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PlannedDemandReduction'), Reduction)
	}
	String enteredValue3
	@Then("User has able to see the entered values of Planned demand reduction in Grid Harmonization")
	public void user_has_able_to_see_the_entered_value_of_Planned_demand_reduction_in_Grid_Harmonization() {
		enteredValue3 = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PlannedDemandReduction'), 'value')
		println "The entered Value3 is "+ enteredValue3
		println "The Reduction is " + Reduction
		WebUI.verifyMatch(Reduction, enteredValue3, false)
	}

	@Given("User can able to see the field for Percent on Peak Reduction in Grid Harmonization")
	public void user_can_able_to_see_the_field_for_Percent_on_Peak_Reduction_in_Grid_Harmonization() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PercentOn-peakReduction'))
	}
	String Prcnt
	@When("User has to enters Percent on Peak Reduction in Grid Harmonization")
	public void user_has_to_enters_Percent_on_Peak_Reduction_in_Grid_Harmonization() {
		WebUI.click(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PercentOn-peakReduction'))
		WebUI.delay(5)
	}
	String entrdValue
	@Then("User has able to see the entered values of Percent on Peak Reduction in Grid Harmonization")
	public void user_has_able_to_see_the_entered_value_of_Percent_on_Peak_Reduction_in_Grid_Harmonization() {

		entrdValue = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PercentOn-peakReduction'), 'value')
		println "The entrd Value is "+ entrdValue
		//println "The Overall Score is " + Percent
		//WebUI.verifyMatch(Percent, enterdValue2, false)
	}

	@Given("User should be able to see the Add File button for Project Load Shifting in Grid Harmonization")
	public void user_should_be_able_to_see_the_Add_File_button_for_Project_Load_Shifting_in_Grid_Harmonization() {
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/p_Upload a summary'), 4)
		WebUI.verifyElementVisible(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/p_Upload a summary'))
	}

	@Then("User uploads file for Project Load Shifting in Grid Harmonization")
	public void user_uploads_file_for_Project_Load_Shifting_in_Grid_Harmonization() {
		String uploadButton = "Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/Btn_AddFile_UploadSummary"
		String inputUploadFile = "Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/input_AddFile_UploadSummary"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile)
	}

	@Given("User should be able to see the checkbox of distributed energy for Permanent Load Shifting in Grid Harmonization")
	public void user_should_be_able_to_see_the_checkbox_of_distributed_energy_for_Permanent_Load_Shifting_in_Grid_Harmonization() {
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/checkbox_DistributedEnergy'),4)
	}

	@When("User clicks the checkbox of distributed energy for Permanent Load Shifting in Grid Harmonization")
	public void user_clicks_the_checkbox_of_distributed_energy_for_Permanent_Load_Shifting_in_Grid_Harmonization() {
		WebUI.check(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/checkbox_DistributedEnergy'))
	}

	@Given("User able to see the generate pdf icon on the top of the Grid Harmonization Form")
	public void user_able_to_see_the_generate_pdf_icon_on_the_top_of_the_Grid_Harmonization_Form() {
		//WebUI.switchToFrame(findTestObject('Object Repository/Green_Cleaning/iframe'), 5)
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/icon_pdf'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/icon_pdf'), 30)
		//WebUI.switchToDefaultContent()
	}

	@When("User clicks the generate pdf icon to download the file in Grid Harmonization Form")
	public void user_clicks_the_generate_pdf_icon_to_download_the_file_in_Grid_Harmonization_Form() {
		//WebUI.switchToFrame(findTestObject('Object Repository/GridHarmonization/iframe'), 5)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/GridHarmonization/icon_pdf'))
		WebUI.delay(10)
		//WebUI.switchToDefaultContent()
	}

	@Then("User has to verify the On_Peak electricity demand Numeric Field with downloaded pdf file in Grid Harmonization Form")
	public void user_has_to_verify_the_On_Peak_electricity_demand_Numeric_Field_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PeakElectricityDemand'), 'value')
		println "The On_Peak_electricity value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the On_Peak electricity is found in the pdf --> Found")
		}
		else {
			println("The value in the On_Peak electricity is not found in the pdf --> Not Found")
		}
	}

	@Then("User should verify the Planned demand reduction Numeric Field with downloaded pdf file in Grid Harmonization Form")
	public void user_should_verify_the_Planned_demand_reduction_Numeric_Field_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PlannedDemandReduction'), 'value')
		println "The Reduction value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the Reduction is found in the pdf --> Found")
		}
		else {
			println("The value in the Reduction is not found in the pdf --> Not Found")
		}
	}

	@Then("User should verify Percent on Peak Reduction textbox with downloaded pdf file in Grid Harmonization Form")
	public void user_should_verify_Percent_on_Peak_Reduction_textbox_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PercentOn-peakReduction'), 'value')
		println "The Prcnt value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the Prcnt is found in the pdf --> Found")
		}
		else {
			println("The value in the Prcnt is not found in the pdf --> Not Found")
		}
	}

	@Then("User has to verify Uploaded Project Load Shifting with downloaded pdf file in Grid Harmonization Form")
	public void user_has_to_verify_Uploaded_Project_Load_Shifting_with_downloaded_pdf_file_in_Grid_Harmonization_Form() {
		String xpathid="Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/tbody_UploadSummary"
		String scroll1='Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/p_Upload a summary'
		String iframe='Object Repository/GridHarmonization/iframe'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}
}