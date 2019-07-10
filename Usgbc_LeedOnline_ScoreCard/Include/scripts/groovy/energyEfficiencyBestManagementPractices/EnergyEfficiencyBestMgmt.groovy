package energyEfficiencyBestManagementPractices
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

class EnergyEfficiencyBestMgmt {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User can see Energy Efficiency Best Management practices under Energy and Atmosphere")
	public void user_can_see_Energy_Efficiency_Best_Management_practices_under_Energy_and_Atmosphere() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/div_Energy Efficiency Best Management Practices'), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/div_Energy Efficiency Best Management Practices'), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@Given("User has to select the status to Attempted for Energy Efficiency Best Management practices")
	public void user_has_to_select_the_status_to_Attempted_for_Energy_Efficiency_Best_Management_practices() {

		String status =	WebUI.getText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/h3_Status'))
		println "######################### h3" + status
		String divval = WebUI.getText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/divval'))
		println "######################### dival" + divval

		if (status == "READY FOR REVIEW") {
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/a_MarkReadyForReview'))
			WebUI.delay(5)
		}
		String changedStatus =	WebUI.getText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/h3_Status'))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Energy Efficiency Best Management practices")
	public void user_clicks_on_Energy_Efficiency_Best_Management_practices() {

		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/div_Energy Efficiency Best Management Practices'))
	}

	@When("User has to click on FormV01 button of Energy Efficiency Best Management practices")
	public void user_has_to_click_on_FormV_button_of_Energy_Efficiency_Best_Management_practices() {

		WebUI.delay(3);
		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/span_(V01)'))
	}

	@Then("User should be able to see the Energy Efficiency Best Management practices form")
	public void user_should_be_able_to_see_the_Energy_Efficiency_Best_Management_practices_form() {

		println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/div_EnergyEfficiencyBestManagement_Credit'), 30)
		if (insideForm == true){
			println "Inside the Energy Efficiency Best Management practices form"
		}
		else {
			println "Not inside the Energy Efficiency Best Management practices form"
		}
	}


	/**
	 * Upload EEBMP
	 */


	@Given("User should be able to see the checkbox for the project team in EEBM")
	public void user_should_be_able_to_see_the_checkbox_for_the_project_team_in_EEBM() {

		WebUI.callTestCase(findTestCase('Test Cases/EnergyEfficiencyBestManagementPractices/TC_EEBM_Navigation'), null, FailureHandling.STOP_ON_FAILURE)

		boolean chk_project = WebUI.verifyElementPresent(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/input"), 30)
		if (chk_project == true){
			println "checkbox for the project team in EEBM is present"
		}
		else{
			println "checkbox for the project team in EEBM is not present"
		}
	}

	@When("User clicks on the check box for the project team in EEBM")
	public void user_clicks_on_the_check_box_for_the_project_team_in_EEBM() {

		WebUI.check(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/input"))
	}

	@Then("User should be able to see the checkbox checked for project team in EEBM")
	public void user_should_be_able_to_see_the_checkbox_checked_for_project_team_in_EEBM() {

		WebUI.delay(2)
		boolean isChecked =	WebUI.verifyElementChecked(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/input"), 30)
		if (isChecked == true){

			println "checkbox is checked"
		}
		else{
			println "checkbox is not checked"
		}
	}


	@Given("User should be able to see the Date audit in EEBM Form")
	public void user_should_be_able_to_see_the_Date_audit_in_EEBM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/div_Date of Audit'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/div_Date of Audit'), 30)
	}

	@When("User enters Date audit in EEBM Form")
	public void user_enters_Date_audit_in_EEBM_Form() {

		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/input_date'))

		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/span_18'))
	}

	String enterdValue
	@Then("User should be able to see the entered value of Date audit in EEBM Form")
	public void user_should_be_able_to_see_the_entered_value_of_Date_audit_in_EEBM_Form() {

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/input_date'), 'value')
		println "The entered Value is "+ enterdValue
	}

	@Given("User should be able to see the Add File button for ASHRAE preliminary energy in EEBM Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_ASHRAE_preliminary_energy_in_EEBM_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/p_Upload the ASHRAE preliminary'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/p_Upload the ASHRAE preliminary'), 30)
	}

	@Then("User uploads file for ASHRAE preliminary energy in EEBM Form")
	public void user_uploads_file_for_ASHRAE_preliminary_energy_in_EEBM_Form() {

		String uploadButton = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/Button_ASHRAE_priliminary"
		String inputUploadFile = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/input_ASHRAE_preliminary"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}


	@Given("User should be able to see the Add File button for current facility requirements in EEBM Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_current_facility_requirements_in_EEBM_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/p_current_facility_requirements'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/p_current_facility_requirements'), 30)
	}

	@Then("User uploads file for current facility requirements in EEBM Form")
	public void user_uploads_file_for_current_facility_requirements_in_EEBM_Form() {

		String uploadButton = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/Button_CFR"
		String inputUploadFile = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/input_current_facility_requirements"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for DC Pro Profiling Tool in EEBM Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_DC_Pro_Profiling_Tool_in_EEBM_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/p_DC_Pro'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/p_DC_Pro'), 30)
	}

	@Then("User uploads file for DC Pro Profiling Tool in EEBM Form")
	public void user_uploads_file_for_DC_Pro_Profiling_Tool_in_EEBM_Form() {

		String uploadButton = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/Button_DC_Pro"
		String inputUploadFile = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/input_DC_Pro"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for additional documentation in EEBM Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_additional_documentation_in_EEBM_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'), 30)
	}

	@Then("User uploads file for additional documentation in EEBM Form")
	public void user_uploads_file_for_additional_documentation_in_EEBM_Form() {

		String uploadButton = "Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/Button_additionalDoc"
		String inputUploadFile = "Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/input_additionalDoc"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}


	@Given("User should see the editor for Special Circumstances for Energy Efficiency Best Management practices Form")
	public void user_should_see_the_editor_for_Special_Circumstances_for_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/p_EditorBox'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/p_EditorBox'), 5)
	}

	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_Special_Circumstances = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt
	@When("User feeds long narrative text for Special Circumstances text box for Energy Efficiency Best Management practices Form")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_text_box_for_Energy_Efficiency_Best_Management_practices_Form() {

		println "##############"+ txt_Special_Circumstances
		WebUI.setText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/body_splCircum'),txt_Special_Circumstances)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances text box for Energy Efficiency Best Management practices Form")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_text_box_for_Energy_Efficiency_Best_Management_practices_Form() {

		String Special_Circumstances = WebUI.getText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/body_splCircum'))
		println "##############"+ Special_Circumstances
		WebUI.verifyMatch(Special_Circumstances, txt_Special_Circumstances , false, FailureHandling.STOP_ON_FAILURE)
	}


	@Given("User can see the save button in EEBM Form")
	public void user_can_see_the_save_button_in_EEBM_Form() {

		WebUI.delay(10)
		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/btn_Save'), 30)
		WebUI.verifyElementVisible(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/btn_Save'))
	}

	@When("User clicks on save button in EEBM Form")
	public void user_clicks_on_save_button_in_EEBM_Form() {

		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/btn_Save'))
	}

	@Then("User should see Form data saved successfully message in EEBM Form")
	public void user_should_see_Form_data_saved_successfully_message_in_EEBM_Form() {

		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Form data saved successfully.", false)
		println "###########" + str
	}



	@Given("User can see the generate pdf icon on the top of the Energy Efficiency Best Management practices Form")
	public void user_can_see_the_generate_pdf_icon_on_the_top_of_the_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/icon_pdf'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/icon_pdf'), 30)
	}

	@When("User clicks on generate pdf icon to download the file in Energy Efficiency Best Management practices Form")
	public void user_clicks_on_generate_pdf_icon_to_download_the_file_in_Energy_Efficiency_Best_Management_practices_Form() {

		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/icon_pdf'))
		WebUI.delay(10)
	}

	@Then("User has to verify the Date audit with downloaded pdf file in Energy Efficiency Best Management practices")
	public void user_has_to_verify_the_Date_audit_with_downloaded_pdf_file_in_Energy_Efficiency_Best_Management_practices() {

		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/checkbox_date_EEBM/input_date'), 'value')
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
	String iframe='Object Repository/EnergyEfficiencyBestManagementpractices/iframe'
	@Then("User has to verify Uploaded ASHRAE preliminary energy with downloaded pdf file in Energy Efficiency Best Management practices Form")
	public void user_has_to_verify_Uploaded_ASHRAE_preliminary_energy_with_downloaded_pdf_file_in_Energy_Efficiency_Best_Management_practices_Form() {

		String xpathid="Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/tbody_Table_ASHRAE_preliminary"
		String scroll1='Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/p_Upload the ASHRAE preliminary'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded current facility requirements with downloaded pdf file in Energy Efficiency Best Management practices Form")
	public void user_has_to_verify_Uploaded_current_facility_requirements_with_downloaded_pdf_file_in_Energy_Efficiency_Best_Management_practices_Form() {

		String xpathid="Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/tbody_Table_CFR"
		String scroll1='Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/p_current_facility_requirements'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded DC Pro Profiling Tool with downloaded pdf file in Energy Efficiency Best Management practices Form")
	public void user_has_to_verify_Uploaded_DC_Pro_Profiling_Tool_with_downloaded_pdf_file_in_Energy_Efficiency_Best_Management_practices_Form() {

		String xpathid="Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/tbody_Table_DC_Pro"
		String scroll1='Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/p_DC_Pro'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded additional documentation with downloaded pdf file in Energy Efficiency Best Management practices Form")
	public void user_has_to_verify_Uploaded_additional_documentation_with_downloaded_pdf_file_in_Energy_Efficiency_Best_Management_practices_Form() {

		String xpathid="Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String scroll1='Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)

		WebUI.delay(2)
	}

	@Then("User has to verify the Special Circumstances html editor with downloaded pdf file in Energy Efficiency Best Management practices Form")
	public void user_has_to_verify_the_Special_Circumstances_html_editor_with_downloaded_pdf_file_in_Energy_Efficiency_Best_Management_practices_Form() {

		String Editorpath='Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/body_splCircum'
		String scroll='Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/p_EditorBox'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User verifies the narrative text of Special Circumstances html editor box for Energy Efficiency Best Management practices Form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_Energy_Efficiency_Best_Management_practices_Form() {

		String Special_Circum = WebUI.getText(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/EditorBox_splCircum/body_splCircum'))
		println "##############"+ Special_Circum
		WebUI.verifyMatch(Special_Circum, txt_Special_Circumstances, false, FailureHandling.STOP_ON_FAILURE)
	}


	/**
	 * Verify EEBM 
	 */

	@Given("User has to see the table of uploaded files on ASHRAE preliminary energy in EEBM Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_ASHRAE_preliminary_energy_in_EEBM_Form() {

		WebUI.callTestCase(findTestCase('Test Cases/EnergyEfficiencyBestManagementPractices/TC_EEBM_Navigation'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/table_ASHRAE_preliminary'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/table_ASHRAE_preliminary'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of ASHRAE preliminary energy in EEBM Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_ASHRAE_preliminary_energy_in_EEBM_Form() {

		String tableRow = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/tbody_Table_ASHRAE_preliminary"
		String tableId = EEBM_Entities.tableId_ASHRAE_preliminary
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on current facility requirements in EEBM Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_current_facility_requirements_in_EEBM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/Table_CFR'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/Table_CFR'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of current facility requirements in EEBM Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_current_facility_requirements_in_EEBM_Form() {

		String tableRow = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/tbody_Table_CFR"
		String tableId = EEBM_Entities.tableId_CFR
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on DC Pro Profiling Tool in EEBM Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_DC_Pro_Profiling_Tool_in_EEBM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/Table_DC_Pro'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/Table_DC_Pro'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of DC Pro Profiling Tool in EEBM Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_DC_Pro_Profiling_Tool_in_EEBM_Form() {

		String tableRow = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/tbody_Table_DC_Pro"
		String tableId = EEBM_Entities.tableId_DC_Pro
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on additional documentation in EEBM Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_additional_documentation_in_EEBM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of additional documentation in EEBM Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_additional_documentation_in_EEBM_Form() {

		String tableRow = "Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String tableId = EEBM_Entities.tableId_additional_doc
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}


	/**
	 * Download EEBM
	 */

	@When("User downloads the uploaded files of ASHRAE preliminary energy in EEBM Form")
	public void user_downloads_the_uploaded_files_of_ASHRAE_preliminary_energy_in_EEBM_Form() {

		String tableRow = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/tbody_Table_ASHRAE_preliminary"
		String tableId = EEBM_Entities.tableId_ASHRAE_preliminary
		String scrollTo = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/p_Upload the ASHRAE preliminary"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see the downloaded file of ASHRAE preliminary energy in EEBM Form successfully")
	public void user_can_see_the_downloaded_file_of_ASHRAE_preliminary_energy_in_EEBM_Form_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of current facility requirements in EEBM Form")
	public void user_downloads_the_uploaded_files_of_current_facility_requirements_in_EEBM_Form() {

		String tableRow = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/tbody_Table_CFR"
		String tableId = EEBM_Entities.tableId_CFR
		String scrollTo = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/p_current_facility_requirements"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see the downloaded file of current facility requirements in EEBM Form successfully")
	public void user_can_see_the_downloaded_file_of_current_facility_requirements_in_EEBM_Form_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of DC Pro Profiling Tool in EEBM Form")
	public void user_downloads_the_uploaded_files_of_DC_Pro_Profiling_Tool_in_EEBM_Form() {

		String tableRow = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/tbody_Table_DC_Pro"
		String tableId = EEBM_Entities.tableId_DC_Pro
		String scrollTo = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/p_DC_Pro"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see the downloaded file of DC Pro Profiling Tool in EEBM Form successfully")
	public void user_can_see_the_downloaded_file_of_DC_Pro_Profiling_Tool_in_EEBM_Form_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of additional documentation in EEBM Form")
	public void user_downloads_the_uploaded_files_of_additional_documentation_in_EEBM_Form() {

		String tableRow = "Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String tableId = EEBM_Entities.tableId_additional_doc
		String scrollTo = "Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}

	@Then("User can see the downloaded file of additional documentation in EEBM Form successfully")
	public void user_can_see_the_downloaded_file_of_additional_documentation_in_EEBM_Form_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}

	/**
	 * Delete EEBM
	 */



	@When("User deletes the uploaded files of ASHRAE preliminary energy in EEBM Form")
	public void user_deletes_the_uploaded_files_of_ASHRAE_preliminary_energy_in_EEBM_Form() {

		String tableRow ="Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/tbody_Table_ASHRAE_preliminary"
		String tableId = EEBM_Entities.tableId_ASHRAE_preliminary
		String scrollTo = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/p_Upload the ASHRAE preliminary"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the ASHRAE preliminary energy in EEBM Form are deleted")
	public void user_can_see_all_the_ASHRAE_preliminary_energy_in_EEBM_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_ASHRAE_preliminary/table_ASHRAE_preliminary'), 30)
	}

	@When("User deletes the uploaded files of current facility requirements in EEBM Form")
	public void user_deletes_the_uploaded_files_of_current_facility_requirements_in_EEBM_Form() {

		String tableRow ="Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/tbody_Table_CFR"
		String tableId = EEBM_Entities.tableId_CFR
		String scrollTo = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/p_current_facility_requirements"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the current facility requirements in EEBM Form are deleted")
	public void user_can_see_all_the_current_facility_requirements_in_EEBM_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_CFR/Table_CFR'), 30)
	}

	@When("User deletes the uploaded files of DC Pro Profiling Tool in EEBM Form")
	public void user_deletes_the_uploaded_files_of_DC_Pro_Profiling_Tool_in_EEBM_Form() {

		String tableRow ="Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/tbody_Table_DC_Pro"
		String tableId = EEBM_Entities.tableId_DC_Pro
		String scrollTo = "Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/p_DC_Pro"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the DC Pro Profiling Tool in EEBM Form are deleted")
	public void user_can_see_all_the_DC_Pro_Profiling_Tool_in_EEBM_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/AddFile_DC_Pro/Table_DC_Pro'), 30)
	}

	@When("User deletes the uploaded files of additional documentation in EEBM Form")
	public void user_deletes_the_uploaded_files_of_additional_documentation_in_EEBM_Form() {

		String tableRow ="Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String tableId = EEBM_Entities.tableId_additional_doc
		String scrollTo = "Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the additional documentation in EEBM Form are deleted")
	public void user_can_see_all_the_additional_documentation_in_EEBM_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/EnergyEfficiencyBestManagementpractices/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
	}
	
	@And("User changes the status to ready for review for EEBM form")
	public void user_changes_the_status_to_ready_for_review_for_EEBM_form(){

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/h3_Status"))

		if (status == "ATTEMPTED"){
			println "Inside the if"
			WebUI.click(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/a_MarkReadyForReview"))
			
			WebUI.delay(5)
		}

		String changed_Status =	WebUI.getText(findTestObject("Object Repository/EnergyEfficiencyBestManagementpractices/EEBM_Navigation/h3_Status"))
		println "######################### changed_Status " + changed_Status
		
	}
}