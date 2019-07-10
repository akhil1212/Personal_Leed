package rainwaterManagementForm
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


class RainwaterManagement_Form {
	/**
	 * The navigation to Rainwater Management form -- Started
	 */


	@And("User can see Rainwater Management under Sustainable Sites section")
	public void user_can_see_Rainwater_Management_under_Sustainable_Sites_section() {

		WebUI.scrollToElement(findTestObject("Object Repository/RainwaterManagement/Navigation/div_Rainwater Management"), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject("Object Repository/RainwaterManagement/Navigation/div_Rainwater Management"), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}


	@And("User has to select the status to Attempted for Rainwater Management")
	public void user_has_to_select_the_status_to_Attempted_for_Rainwater_Management() {

		String status =	WebUI.getText(findTestObject("Object Repository/RainwaterManagement/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "READY FOR REVIEW"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/RainwaterManagement/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)
		}

		String changedStatus =	WebUI.getText(findTestObject("Object Repository/RainwaterManagement/Navigation/h3_Status"))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Rainwater Management")
	public void user_clicks_on_Rainwater_Management() {

		WebUI.click(findTestObject("Object Repository/RainwaterManagement/Navigation/div_Rainwater Management"))
	}

	@And("User has to click on FormV01 button of Rainwater Management")
	public void user_has_to_click_on_FormV_button_of_Rainwater_Management() {

		WebUI.click(findTestObject("Object Repository/RainwaterManagement/Navigation/a_Form (V01)"))
	}

	@Then("User should be able to see the Rainwater Management form")
	public void user_should_be_able_to_see_the_Rainwater_Management_form() {

		//println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject("Object Repository/RainwaterManagement/Navigation/div_RM_Form"), 30)
		if (insideForm == true){
			println "Inside the IPM form"
		}
		else {
			println "Not inside the IPM form"
		}
	}


	/**
	 * The navigation to Rainwater Management form -- Ended
	 */


	/**
	 *  Filling the data in the Rainwater Management form , saving the form , downloading the Pdf and verifying -- Started
	 */


	@Given("User should be able to see the Add File button for rainfall events calculator")
	public void user_should_be_able_to_see_the_Add_File_button_for_rainfall_events_calculator() {

		WebUI.callTestCase(findTestCase('Test Cases/RainwaterManagement/TC_NavigateToRM'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_EventsCalculator/p_AddFile_EventsCalc'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_EventsCalculator/p_AddFile_EventsCalc'), 30)
	}

	@Then("User uploads file for rainfall events calculator")
	public void user_uploads_file_for_rainfall_events_calculator() {

		String uploadButton 	= "Object Repository/RainwaterManagement/AddFile_EventsCalculator/btn_AddFile"
		String inputUploadFile 	= "Object Repository/RainwaterManagement/AddFile_EventsCalculator/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for calculations that demonstrate how the volume of runoff from 25% of impervious surfaces")
	public void user_should_be_able_to_see_the_Add_File_button_for_calculations_that_demonstrate_how_the_volume_of_runoff_from_of_impervious_surfaces() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/p_AddFile_Calc_ImperSurfaces'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/p_AddFile_Calc_ImperSurfaces'), 30)
	}

	@Then("User uploads file for calculations that demonstrate how the volume of runoff from 25% of impervious surfaces")
	public void user_uploads_file_for_calculations_that_demonstrate_how_the_volume_of_runoff_from_of_impervious_surfaces() {

		String uploadButton 	= "Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/btn_AddFile"
		String inputUploadFile 	= "Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for documents that thoroughly depict the green infrastructure techniques")
	public void user_should_be_able_to_see_the_Add_File_button_for_documents_that_thoroughly_depict_the_green_infrastructure_techniques() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/p_AddFile_GreenInfra'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/p_AddFile_GreenInfra'), 30)
	}

	@Then("User uploads file for documents that thoroughly depict the green infrastructure techniques")
	public void user_uploads_file_for_documents_that_thoroughly_depict_the_green_infrastructure_techniques() {

		String uploadButton 	= "Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/btn_AddFile"
		String inputUploadFile 	= "Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}


	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_RainwaterMgmt_Narrative = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for proposed practices for rainwater management")
	public void user_should_see_the_editor_for_proposed_practices_for_rainwater_management() {

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/p_Editor_GreenInfra'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/p_Editor_GreenInfra'), 5)
	}

	@When("User feeds long narrative text for proposed practices for rainwater management")
	public void user_feeds_long_narrative_text_for_proposed_practices_for_rainwater_management() {

		println "##############"+ txt_RainwaterMgmt_Narrative
		WebUI.setText(findTestObject('Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/body_Editor_GreenInfra'),txt_RainwaterMgmt_Narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on proposed practices for rainwater management")
	public void user_should_see_the_narrative_text_persist_on_proposed_practices_for_rainwater_management() {

		String narrative_GreenInfra = WebUI.getText(findTestObject('Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/body_Editor_GreenInfra'))
		println "##############"+ narrative_GreenInfra
		WebUI.verifyMatch(narrative_GreenInfra, txt_RainwaterMgmt_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}



	@Given("User should be able to see the Add File button for document or narrative describing the annual inspection and maintenance program")
	public void user_should_be_able_to_see_the_Add_File_button_for_document_or_narrative_describing_the_annual_inspection_and_maintenance_program() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_AnnualInspection/p_AddFile_AnnualInsp'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_AnnualInspection/p_AddFile_AnnualInsp'), 30)
	}

	@Then("User uploads file for document or narrative describing the annual inspection and maintenance program")
	public void user_uploads_file_for_document_or_narrative_describing_the_annual_inspection_and_maintenance_program() {

		String uploadButton 	= "Object Repository/RainwaterManagement/AddFile_AnnualInspection/btn_AddFile"
		String inputUploadFile 	= "Object Repository/RainwaterManagement/AddFile_AnnualInspection/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for for additional documents in special circumstances in rainwater management")
	public void user_should_be_able_to_see_the_Add_File_button_for_for_additional_documents_in_special_circumstances_in_rainwater_management() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
	}

	@Then("User uploads file for for additional documents in special circumstances in rainwater management")
	public void user_uploads_file_for_for_additional_documents_in_special_circumstances_in_rainwater_management() {

		String uploadButton 	= "Object Repository/RainwaterManagement/AddFile_SpecialCircum/btn_AddFile"
		String inputUploadFile 	= "Object Repository/RainwaterManagement/AddFile_SpecialCircum/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}


	@Given("User should see the editor for Special Circumstances for rainwater management")
	public void user_should_see_the_editor_for_Special_Circumstances_for_rainwater_management() {

		WebUI.scrollToElement(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/p_Editor_SplCircum'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances for rainwater management")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_for_rainwater_management() {

		println "##############"+ txt_RainwaterMgmt_Narrative
		WebUI.setText(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/body_Editor_SplCircum'),txt_RainwaterMgmt_Narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances for rainwater management")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_for_rainwater_management() {

		String narrativeSplCircum = WebUI.getText(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/body_Editor_SplCircum'))
		println "##############"+ narrativeSplCircum
		WebUI.verifyMatch(narrativeSplCircum, txt_RainwaterMgmt_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}


	// Verifying the form details with the download PDF -- Started

	String iframe='Object Repository/RainwaterManagement/iframe'

	@Then("User has to verify Uploaded rainfall events calculator or equivalent documentation with downloaded pdf file")
	public void user_has_to_verify_Uploaded_rainfall_events_calculator_or_equivalent_documentation_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/RainwaterManagement/AddFile_EventsCalculator/tbody_Table_EventsCalc'
		String scrollTo='Object Repository/RainwaterManagement/AddFile_EventsCalculator/p_AddFile_EventsCalc'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)

		WebUI.delay(2)
	}

	@And("User has to verify Uploaded calculations of impervious surfaces with downloaded pdf file")
	public void user_has_to_verify_Uploaded_calculations_of_impervious_surfaces_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/tbody_Table_Calc_ImperSurfaces'
		String scrollTo='Object Repository/RainwaterManagement/AddFile_Calc_ImperviousSurfaces/p_AddFile_Calc_ImperSurfaces'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)

		WebUI.delay(2)
	}

	@And("User has to verify Uploaded documents that thoroughly depict the green infrastructure techniques with downloaded pdf file")
	public void user_has_to_verify_Uploaded_documents_that_thoroughly_depict_the_green_infrastructure_techniques_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/tbody_Table_GreenInfra'
		String scrollTo='Object Repository/RainwaterManagement/AddFile_GreenInfrastructure/p_AddFile_GreenInfra'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)

		WebUI.delay(2)
	}

	@And("User has to verify the proposed practices html editor for rainwater management with downloaded pdf file")
	public void user_has_to_verify_the_proposed_practices_html_editor_for_rainwater_management_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/body_Editor_GreenInfra'
		String scroll='Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/p_Editor_GreenInfra'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		//WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded document or narrative describing the annual inspection and maintenance program with downloaded pdf file")
	public void user_has_to_verify_Uploaded_document_or_narrative_describing_the_annual_inspection_and_maintenance_program_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/RainwaterManagement/AddFile_AnnualInspection/tbody_Table_AnnualInsp'
		String scrollTo='Object Repository/RainwaterManagement/AddFile_AnnualInspection/p_AddFile_AnnualInsp'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)

		WebUI.delay(2)
	}

	@And("User has to verify the special circumstances html editor for rainwater management with downloaded pdf file")
	public void user_has_to_verify_the_special_circumstances_html_editor_for_rainwater_management_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/RainwaterManagement/EditorBox_SpecialCircum/body_Editor_SplCircum'
		String scroll='Object Repository/RainwaterManagement/EditorBox_SpecialCircum/p_Editor_SplCircum'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		//WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded additional documents in special circumstances in rainwater management with downloaded pdf file")
	public void user_has_to_verify_Uploaded_additional_documents_in_special_circumstances_in_rainwater_management_with_downloaded_pdf_file() {

		String path = RunConfiguration.getProjectDir()+'/Include/TestData/DownloadedFiles'

		String Table_Xpathid= 'Object Repository/RainwaterManagement/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String scrollTo='Object Repository/RainwaterManagement/AddFile_SpecialCircum/p_AddFile_SplCircum'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)

		WebUI.delay(2)
		new projectKeywords().deleteDownloadedFiles(path)
	}

	// Verifying the form details with the download PDF -- Ended


	// Verifying the narratives with the data entered after the page refresh -- Started


	@Then("User verifies the narrative text of proposed practices for Rainwater Management")
	public void user_verifies_the_narrative_text_of_proposed_practices_for_Rainwater_Management() {

		String narrative_GreenInfra = WebUI.getText(findTestObject('Object Repository/RainwaterManagement/EditorBox_GreenInfrastructure/body_Editor_GreenInfra'))
		println "##############"+ narrative_GreenInfra
		WebUI.verifyMatch(narrative_GreenInfra, txt_RainwaterMgmt_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User verifies the narrative text of Special Circumstances html editor box for rainwater management Form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_rainwater_management_Form() {

		String narrativeSplCircum = WebUI.getText(findTestObject('Object Repository/RainwaterManagement/EditorBox_SpecialCircum/body_Editor_SplCircum'))
		println "##############"+ narrativeSplCircum
		WebUI.verifyMatch(narrativeSplCircum, txt_RainwaterMgmt_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User changes the status to ready for review for the rainwater management form")
	public void user_changes_the_status_to_ready_for_review_for_the_rainwater_management_form() {

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/RainwaterManagement/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "ATTEMPTED"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/RainwaterManagement/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)
		}

		String changedStatus =	WebUI.getText(findTestObject("Object Repository/RainwaterManagement/Navigation/h3_Status"))
		println "The changed Status is "+changedStatus
	}

	// Verifying the narratives with the data entered after the page refresh -- Ended

	/**
	 *  Filling the data in the Rainwater Management form , saving the form , downloading the Pdf and verifying -- Ended
	 */





}