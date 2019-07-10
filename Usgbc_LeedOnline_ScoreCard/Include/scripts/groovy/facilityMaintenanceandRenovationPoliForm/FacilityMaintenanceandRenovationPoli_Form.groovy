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

class FacilityMaintenanceandRenovationPoli_Form {

	/**
	 * FMR Navigation
	 */


	@Given("User can see Facility Maintenance and Renovation policy under Materials and Resources")
	public void user_can_see_Facility_Maintenance_and_Renovation_policy_under_Materials_and_Resources() {

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/div_Facility Maintenance and Renovation Poli'), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/div_Facility Maintenance and Renovation Poli'), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@Given("User has to select the status to Attempted for Facility Maintenance and Renovation policy")
	public void user_has_to_select_the_status_to_Attempted_for_Facility_Maintenance_and_Renovation_policy() {

		String status =	WebUI.getText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/h3_Status'))
		println "######################### h3" + status
		String divval = WebUI.getText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/divval'))
		println "######################### dival" + divval

		if (status == "READY FOR REVIEW") {
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/a_MarkReadyForReview'))
			WebUI.delay(5)
		}
		String changedStatus =	WebUI.getText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/h3_Status'))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Facility Maintenance and Renovation policy")
	public void user_clicks_on_Facility_Maintenance_and_Renovation_policy() {

		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/div_Facility Maintenance and Renovation Poli'))
	}

	@When("User has to click on FormV01 button of Facility Maintenance and Renovation policy")
	public void user_has_to_click_on_FormV_button_of_Facility_Maintenance_and_Renovation_policy() {

		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/span_(V01)'))
	}

	@Then("User should be able to see the Facility Maintenance and Renovation policy form")
	public void user_should_be_able_to_see_the_Facility_Maintenance_and_Renovation_policy_form() {

		println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/div_Facility Maintenance and Renovation Poli1000160337'), 30)
		if (insideForm == true){
			println "Inside the FMR form"
		}
		else {
			println "Not inside the FMR form"
		}
	}

	/**
	 * FMR FORM
	 */

	String iframe='Object Repository/FacilityMaintenanceandRenovationPoli/iframe'
	@Given("User should be able to see the Add File button for Base building in FMR Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_Base_building_in_FMR_Form() {

		WebUI.callTestCase(findTestCase('Test Cases/FacilityMaintenanceandRenovationPolicy/TC_FMR_Navigation'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/p_Upload the Base building element'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/p_Upload the Base building element'), 30)
	}

	@Then("User uploads file for Base building in FMR Form")
	public void user_uploads_file_for_Base_building_in_FMR_Form() {

		String uploadButton = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/Button_Upload_Base building"
		String inputUploadFile = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/input"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for Furniture and furnishings in FMR Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_Furniture_and_furnishings_in_FMR_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/p_Upload Furniture and furnishings'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/p_Upload Furniture and furnishings'), 30)
	}

	@Then("User uploads file for Furniture and furnishings in FMR Form")
	public void user_uploads_file_for_Furniture_and_furnishings_in_FMR_Form() {

		String uploadButton = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/Button_Furniture"
		String inputUploadFile = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/input"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for MR Credit Purchasing in FMR Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_MR_Credit_Purchasing_in_FMR_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/p_Upload Criteria in MR Credit Purchasing'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/p_Upload Criteria in MR Credit Purchasing'), 30)
	}

	@Then("User uploads file for MR Credit Purchasing in FMR Form")
	public void user_uploads_file_for_MR_Credit_Purchasing_in_FMR_Form() {

		String uploadButton = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/Button_CreditPurchasing"
		String inputUploadFile = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/input"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for Information in Waste Management FMR Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_Information_in_Waste_Management_FMR_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/p_Upload the Information'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/p_Upload the Information'), 30)
	}

	@Then("User uploads file for Information in Waste Management FMR Form")
	public void user_uploads_file_for_Information_in_Waste_Management_FMR_Form() {

		String uploadButton = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/Button_InformationWM"
		String inputUploadFile = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/input"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for diversion strategies in Waste Management FMR Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_diversion_strategies_in_Waste_Management_FMR_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/p_Upload the description of the procedure diversion strategies'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/p_Upload the description of the procedure diversion strategies'), 30)
	}

	@Then("User uploads file for diversion strategies in Waste Management FMR Form")
	public void user_uploads_file_for_diversion_strategies_in_Waste_Management_FMR_Form() {

		String uploadButton = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/Button_diversion strategies"
		String inputUploadFile = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/input"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for Recommended design in Indoor Air Quality FMR Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_Recommended_design_in_Indoor_Air_Quality_FMR_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/p_Upload the Recommended design'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/p_Upload the Recommended design'), 30)
	}

	@Then("User uploads file for Recommended design in Indoor Air Quality FMR Form")
	public void user_uploads_file_for_Recommended_design_in_Indoor_Air_Quality_FMR_Form() {

		String uploadButton = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/Button_Recommended design"
		String inputUploadFile = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/input"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for reoccupying the space in Indoor Air Quality FMR Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_reoccupying_the_space_in_Indoor_Air_Quality_FMR_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/p_Upload the procedure reoccupying the space'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/p_Upload the procedure reoccupying the space'), 30)
	}

	@Then("User uploads file for reoccupying the space in Indoor Air Quality FMR Form")
	public void user_uploads_file_for_reoccupying_the_space_in_Indoor_Air_Quality_FMR_Form() {

		String uploadButton = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/Button_reoccupying"
		String inputUploadFile = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/input"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for construction ends in Indoor Air Quality FMR Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_construction_ends_in_Indoor_Air_Quality_FMR_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/p_Upload constructionends'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/p_Upload constructionends'), 30)
	}

	@Then("User uploads file for construction ends in Indoor Air Quality FMR Form")
	public void user_uploads_file_for_construction_ends_in_Indoor_Air_Quality_FMR_Form() {

		String uploadButton = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/Button_constructionends"
		String inputUploadFile = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/input"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the Add File button for additional documentation in FMR Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_additional_documentation_in_FMR_Form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/p_Upload any additional documentation'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/p_Upload any additional documentation'), 30)
	}

	@Then("User uploads file for additional documentation in FMR Form")
	public void user_uploads_file_for_additional_documentation_in_FMR_Form() {

		String uploadButton = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/Button_additionaldocuments"
		String inputUploadFile = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/input"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile)
	}

	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_SpecialCircum = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for Special Circumstances for Facility Maintenance and Renovation Policy Form")
	public void user_should_see_the_editor_for_Special_Circumstances_for_Facility_Maintenance_and_Renovation_Policy_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/p_Describe the circumstances'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/p_Describe the circumstances'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances text box for Facility Maintenance and Renovation Policy Form")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_text_box_for_Facility_Maintenance_and_Renovation_Policy_Form() {

		println "##############"+ txt_SpecialCircum
		WebUI.setText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/body_SC_EditorBox'),txt_SpecialCircum )

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances text box for Facility Maintenance and Renovation Policy Form")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_text_box_for_Facility_Maintenance_and_Renovation_Policy_Form() {

		String SpecialCircumstance = WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/body_CS_EditorBox'))
		println "##############"+ SpecialCircumstance
		WebUI.verifyMatch(SpecialCircumstance, txt_SpecialCircum , false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User can see the save button in FMR Form")
	public void user_can_see_the_save_button_in_FMR_Form() {

		WebUI.delay(10)
		WebUI.verifyElementVisible(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/button_Save'))
	}

	@When("User clicks on save button in FMR Form")
	public void user_clicks_on_save_button_in_FMR_Form() {

		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/button_Save'))
	}

	@Then("User should see Form data saved successfully message in FMR Form")
	public void user_should_see_Form_data_saved_successfully_message_in_FMR_Form() {

		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Form data saved successfully.", false)
		println "###########" + str
	}

	@Given("User can see the generate pdf icon on the top of the Facility Maintenance and Renovation Policy Form")
	public void user_can_see_the_generate_pdf_icon_on_the_top_of_the_Facility_Maintenance_and_Renovation_Policy_Form() {

		//WebUI.switchToFrame(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/iframe'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/img'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/img'), 30)
		//WebUI.switchToDefaultContent()
	}

	@When("User clicks on generate pdf icon to download the file in Facility Maintenance and Renovation Policy Form")
	public void user_clicks_on_generate_pdf_icon_to_download_the_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		//WebUI.switchToFrame(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/iframe'), 5)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/img'))
		WebUI.delay(10)
		//WebUI.switchToDefaultContent()
	}

	@Then("User has to verify Uploaded Base building with downloaded pdf file in Facility Maintenance and Renovation Policy Form")
	public void user_has_to_verify_Uploaded_Base_building_with_downloaded_pdf_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		String xpathid="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/tbody_Table_Basebuilding"
		String scroll1='Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/p_Upload the Base building element'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded Furniture and furnishings with downloaded pdf file in Facility Maintenance and Renovation Policy Form")
	public void user_has_to_verify_Uploaded_Furniture_and_furnishings_with_downloaded_pdf_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		String xpathid="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/tbody_Table_Furniture"
		String scroll1='Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/p_Upload Furniture and furnishings'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded MR Credit Purchasing with downloaded pdf file in Facility Maintenance and Renovation Policy Form")
	public void user_has_to_verify_Uploaded_MR_Credit_Purchasing_with_downloaded_pdf_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		String xpathid="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/tbody_Table_CreditPurchasing"
		String scroll1='Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/p_Upload Criteria in MR Credit Purchasing'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded Information WM with downloaded pdf file in Facility Maintenance and Renovation Policy Form")
	public void user_has_to_verify_Uploaded_Information_WM_with_downloaded_pdf_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		String xpathid="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/tbody_Table_InformationWM"
		String scroll1='Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/p_Upload the Information'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded diversion strategies WM with downloaded pdf file in Facility Maintenance and Renovation Policy Form")
	public void user_has_to_verify_Uploaded_diversion_strategies_WM_with_downloaded_pdf_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		String xpathid="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/tbody_Table_diversionStrategies"
		String scroll1='Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/p_Upload the description of the procedure diversion strategies'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded Recommended design with downloaded pdf file in Facility Maintenance and Renovation Policy Form")
	public void user_has_to_verify_Uploaded_Recommended_design_with_downloaded_pdf_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		String xpathid="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/tbody_Table_RecommendedDesign"
		String scroll1='Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/p_Upload the Recommended design'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded reoccupying with downloaded pdf file in Facility Maintenance and Renovation Policy Form")
	public void user_has_to_verify_Uploaded_reoccupying_with_downloaded_pdf_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		String xpathid="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/table_Table_Reoccupying"
		String scroll1='Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/p_Upload the procedure reoccupying the space'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded construction ends with downloaded pdf file in Facility Maintenance and Renovation Policy Form")
	public void user_has_to_verify_Uploaded_construction_ends_with_downloaded_pdf_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		String xpathid="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/tbody_Table_ConstructionEnds"
		String scroll1='Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/p_Upload constructionends'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)
		WebUI.delay(2)
	}

	@Then("User has to verify the Special Circumstances html editor with downloaded pdf file in Facility Maintenance and Renovation Policy Form")
	public void user_has_to_verify_the_Special_Circumstances_html_editor_with_downloaded_pdf_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		String Editorpath='Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/body_SC_EditorBox'
		String scroll='Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/p_Describe the circumstances'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded additional documentation with downloaded pdf file in Facility Maintenance and Renovation Policy Form")
	public void user_has_to_verify_Uploaded_additional_documentation_with_downloaded_pdf_file_in_Facility_Maintenance_and_Renovation_Policy_Form() {

		String xpathid="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/tbody_Table_SC"
		String scroll1='Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/p_Upload any additional documentation'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,iframe)
		WebUI.delay(2)
	}

	@Then("User verifies the narrative text of Special Circumstances html editor box for Facility Maintenance and Renovation Policy Form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_Facility_Maintenance_and_Renovation_Policy_Form() {

		String specialCircum = WebUI.getText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/SC_Editor Box/body_SC_EditorBox'))
		println "##############"+ specialCircum
		WebUI.verifyMatch(specialCircum, txt_SpecialCircum, false, FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("User changes the status to ready for review for FMR form")
	public void user_changes_the_status_to_ready_for_review(){

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/h3_Status'))

		if (status == "ATTEMPTED"){
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/a_MarkReadyForReview'))
			//	WebUI.click(findTestObject("Object Repository/Page_LEED Online/a_Submit"))
			WebUI.delay(5)
		}

		String changed_Status =	WebUI.getText(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/h3_Status'))
		println "######################### changed_Status " + changed_Status
		String path = RunConfiguration.getProjectDir()+ '/Include/TestData/DownloadedFiles'
		new projectKeywords().deleteDownloadedFiles(path)
	
	}
}