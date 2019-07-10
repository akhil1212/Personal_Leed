package purchasingPolicy
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
import purchasingPolicy.PP_Entities

class PurchasingPolicy_Form {
	/**
	 * The navigation to Purchasing Policy form -- Started
	 */

	@And("User can see Purchasing Policy under Materials And Resources")
	public void user_can_see_Project_Information_under_Purchasing_Policy() {

		WebUI.scrollToElement(findTestObject("Object Repository/PurchasingPolicy/Navigation/div_PurchasingPolicy"), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject("Object Repository/PurchasingPolicy/Navigation/div_PurchasingPolicy"), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@And("User has to select the status to Attempted for Purchasing Policy")
	public void user_has_to_select_the_status_to_Attempted_for_Purchasing_Policy() {

		String status =	WebUI.getText(findTestObject("Object Repository/PurchasingPolicy/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "READY FOR REVIEW"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/PurchasingPolicy/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)

			String changedStatus =	WebUI.getText(findTestObject("Object Repository/PurchasingPolicy/Navigation/h3_Status"))
			println "The changed Status is "+changedStatus
		}
	}

	@When("User clicks on Purchasing Policy")
	public void user_clicks_on_Purchasing_Policy() {

		WebUI.click(findTestObject("Object Repository/PurchasingPolicy/Navigation/div_PurchasingPolicy"))
	}

	@When("User has to click on FormV{int} button of Purchasing Policy")
	public void user_has_to_click_on_FormV_button_of_Purchasing_Policy(Integer int1) {

		WebUI.click(findTestObject("Object Repository/PurchasingPolicy/Navigation/a_Form (V01)"))
	}

	@Then("User should be able to see the Purchasing Policy form")
	public void user_should_be_able_to_see_the_Purchasing_Policy_form() {

		boolean insideForm = WebUI.verifyElementPresent(findTestObject("Object Repository/PurchasingPolicy/Navigation/div_PurchasingPolicy_Form"), 30)
		if (insideForm == true){
			println "Inside the Purchasing Policy form"
		}
		else {
			println "Not inside the Purchasing Policy form"
		}
	}


	/**
	 * The navigation to Purchasing Policy form -- Ended
	 */


	/**
	 *  Filling the data in the Purchasing Policy - saving the form  -- Started
	 */


	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_PI_Narrative = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should be able to see the Add File button for five most purchased product categories in EPP")
	public void user_should_be_able_to_see_the_Add_File_button_for_five_most_purchased_product_categories_in_EPP() {

		WebUI.callTestCase(findTestCase('Test Cases/PurchasingPolicy/TC_NavigateToPP'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/p_AddFile_EPP_Purchased'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/p_AddFile_EPP_Purchased'), 5)
	}

	@Then("User uploads file for five most purchased product categories in EPP")
	public void user_uploads_file_for_five_most_purchased_product_categories_in_EPP() {

		String uploadButton 	= "Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/btn_AddFile"
		String inputUploadFile 	= "Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}


	@Given("User should be able to see the Add File button for Paper, toner cartridges and desk accessories in EPP")
	public void user_should_be_able_to_see_the_Add_File_button_for_Paper_toner_cartridges_and_desk_accessories_in_EPP() {


		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Desk/p_AddFile_EPP_Desk'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Desk/p_AddFile_EPP_Desk'), 5)
	}

	@Then("User uploads file for Paper, toner cartridges and desk accessories in EPP")
	public void user_uploads_file_for_Paper_toner_cartridges_and_desk_accessories_in_EPP() {

		String uploadButton 	= "Object Repository/PurchasingPolicy/AddFile_EPP_Desk/btn_AddFile"
		String inputUploadFile 	= "Object Repository/PurchasingPolicy/AddFile_EPP_Desk/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for Lamps in EPP")
	public void user_should_be_able_to_see_the_Add_File_button_for_Lamps_in_EPP() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/p_AddFile_EPP_Lamps'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/p_AddFile_EPP_Lamps'), 5)
	}


	@Then("User uploads file for Lamps in EPP")
	public void user_uploads_file_for_Lamps_in_EPP() {

		String uploadButton 	= "Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/btn_AddFile"
		String inputUploadFile 	= "Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for Office equipment, appliances and audiovisual equipment in EPP")
	public void user_should_be_able_to_see_the_Add_File_button_for_Office_equipment_appliances_and_audiovisual_equipment_in_EPP() {


		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Office/p_AddFile_EPP_Office'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Office/p_AddFile_EPP_Office'), 5)
	}

	@Then("User uploads file for Office equipment, appliances and audiovisual equipment in EPP")
	public void user_uploads_file_for_Office_equipment_appliances_and_audiovisual_equipment_in_EPP() {


		String uploadButton 	= "Object Repository/PurchasingPolicy/AddFile_EPP_Office/btn_AddFile"
		String inputUploadFile 	= "Object Repository/PurchasingPolicy/AddFile_EPP_Office/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for Electric powered equipment in EPP")
	public void user_should_be_able_to_see_the_Add_File_button_for_Electric_powered_equipment_in_EPP() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Electric/p_AddFile_EPP_Electric'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Electric/p_AddFile_EPP_Electric'), 5)
	}

	@Then("User uploads file for Electric powered equipment in EPP")
	public void user_uploads_file_for_Electric_powered_equipment_in_EPP() {


		String uploadButton 	= "Object Repository/PurchasingPolicy/AddFile_EPP_Electric/btn_AddFile"
		String inputUploadFile 	= "Object Repository/PurchasingPolicy/AddFile_EPP_Electric/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for five most purchased product categories in SWM")
	public void user_should_be_able_to_see_the_Add_File_button_for_five_most_purchased_product_categories_in_SWM() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/p_AddFile_SWM_Purchased'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/p_AddFile_SWM_Purchased'), 5)
	}

	@Then("User uploads file for five most purchased product categories in SWM")
	public void user_uploads_file_for_five_most_purchased_product_categories_in_SWM() {

		String uploadButton 	= "Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/btn_AddFile"
		String inputUploadFile 	= "Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for Office equipment, appliances and audiovisual equipment in SWM")
	public void user_should_be_able_to_see_the_Add_File_button_for_Office_equipment_appliances_and_audiovisual_equipment_in_SWM() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Office/p_AddFile_SWM_Office'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Office/p_AddFile_SWM_Office'), 5)
	}

	@Then("User uploads file for Office equipment, appliances and audiovisual equipment in SWM")
	public void user_uploads_file_for_Office_equipment_appliances_and_audiovisual_equipment_in_SWM() {

		String uploadButton 	= "Object Repository/PurchasingPolicy/AddFile_SWM_Office/btn_AddFile"
		String inputUploadFile 	= "Object Repository/PurchasingPolicy/AddFile_SWM_Office/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}


	@Given("User should be able to see the Add File button for Electric powered equipment in SWM")
	public void user_should_be_able_to_see_the_Add_File_button_for_Electric_powered_equipment_in_SWM() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Electric/p_AddFile_SWM_Electric'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Electric/p_AddFile_SWM_Electric'), 5)
	}

	@Then("User uploads file for Electric powered equipment in SWM")
	public void user_uploads_file_for_Electric_powered_equipment_in_SWM() {

		String uploadButton 	= "Object Repository/PurchasingPolicy/AddFile_SWM_Electric/btn_AddFile"
		String inputUploadFile 	= "Object Repository/PurchasingPolicy/AddFile_SWM_Electric/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for Safe disposal of batteries and lamps in SWM")
	public void user_should_be_able_to_see_the_Add_File_button_for_Safe_disposal_of_batteries_and_lamps_in_SWM() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/p_AddFile_SWM_Lamps'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/p_AddFile_SWM_Lamps'), 5)
	}

	@Then("User uploads file for Safe disposal of batteries and lamps in SWM")
	public void user_uploads_file_for_Safe_disposal_of_batteries_and_lamps_in_SWM() {

		String uploadButton 	= "Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/btn_AddFile"
		String inputUploadFile 	= "Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for special circumstances in Purchasing Policy")
	public void user_should_be_able_to_see_the_Add_File_button_for_special_circumstances_in_Purchasing_Policy() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SpecialCircum/p_AddFile_SplCircum'), 5)
	}

	@Then("User uploads file for special circumstances in Purchasing Policy")
	public void user_uploads_file_for_special_circumstances_in_Purchasing_Policy() {

		String uploadButton 	= "Object Repository/PurchasingPolicy/AddFile_SpecialCircum/btn_AddFile"
		String inputUploadFile 	= "Object Repository/PurchasingPolicy/AddFile_SpecialCircum/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should see the editor for Special Circumstances for Purchasing Policy")
	public void user_should_see_the_editor_for_Special_Circumstances_for_Purchasing_Policy() {


		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/p_Editor_SplCircum'), 30)
	}

	@When("User feeds long narrative text for Special Circumstances for Purchasing Policy")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_for_Purchasing_Policy() {

		println "##############"+ txt_PI_Narrative
		WebUI.setText(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/body_Editor_SplCircum'),txt_PI_Narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances for Purchasing Policy")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_for_Purchasing_Policy() {

		String narrative_SplCircum = WebUI.getText(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/body_Editor_SplCircum'))
		println "##############"+ narrative_SplCircum
		WebUI.verifyMatch(narrative_SplCircum, txt_PI_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User can see the save button in Purchasing Policy form")
	public void user_can_see_the_save_button_in_Purchasing_Policy_form() {

		WebUI.verifyElementVisible(findTestObject("Object Repository/PurchasingPolicy/btn_Save"))
	}

	@When("User clicks on save button in Purchasing Policy form")
	public void user_clicks_on_save_button_in_Purchasing_Policy_form() {

		WebUI.click(findTestObject("Object Repository/PurchasingPolicy/btn_Save"))
	}



	/**
	 *  Filling the data in the Purchasing Policy - saving the form  -- Ended
	 */


	/**
	 *  Purchasing Policy - downloading the Pdf and verifying -- Started
	 */

	@Then("User has to verify Uploaded files for five most purchased product categories in EPP with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_five_most_purchased_product_categories_in_EPP_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/tbody_Table_EPP_Purchased'
		String scrollTo='Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/p_AddFile_EPP_Purchased'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PP_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for Paper, toner cartridges and desk accessories in EPP with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_Paper_toner_cartridges_and_desk_accessories_in_EPP_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/PurchasingPolicy/AddFile_EPP_Desk/tbody_Table_EPP_Desk'
		String scrollTo='Object Repository/PurchasingPolicy/AddFile_EPP_Desk/p_AddFile_EPP_Desk'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PP_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for Lamps in EPP with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_Lamps_in_EPP_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/tbody_Table_EPP_Lamps'
		String scrollTo='Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/p_AddFile_EPP_Lamps'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PP_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for Office equipment, appliances and audiovisual equipment in EPP with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_Office_equipment_appliances_and_audiovisual_equipment_in_EPP_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/PurchasingPolicy/AddFile_EPP_Office/tbody_Table_EPP_Office'
		String scrollTo='Object Repository/PurchasingPolicy/AddFile_EPP_Office/p_AddFile_EPP_Office'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PP_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for Electric powered equipment in EPP with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_Electric_powered_equipment_in_EPP_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/PurchasingPolicy/AddFile_EPP_Electric/tbody_Table_EPP_Electric'
		String scrollTo='Object Repository/PurchasingPolicy/AddFile_EPP_Electric/p_AddFile_EPP_Electric'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PP_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for five most purchased product categories in SWM with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_five_most_purchased_product_categories_in_SWM_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/tbody_Table_SWM_Purchased'
		String scrollTo='Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/p_AddFile_SWM_Purchased'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PP_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for Office equipment, appliances and audiovisual equipment in SWM with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_Office_equipment_appliances_and_audiovisual_equipment_in_SWM_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/PurchasingPolicy/AddFile_SWM_Office/tbody_Table_SWM_Office'
		String scrollTo='Object Repository/PurchasingPolicy/AddFile_SWM_Office/p_AddFile_SWM_Office'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PP_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for Electric powered equipment in SWM with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_Electric_powered_equipment_in_SWM_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/PurchasingPolicy/AddFile_SWM_Electric/tbody_Table_SWM_Electric'
		String scrollTo='Object Repository/PurchasingPolicy/AddFile_SWM_Electric/p_AddFile_SWM_Electric'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PP_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for Safe disposal of batteries and lamps in SWM with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_Safe_disposal_of_batteries_and_lamps_in_SWM_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/tbody_Table_SWM_Lamps'
		String scrollTo='Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/p_AddFile_SWM_Lamps'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PP_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify the special circumstances narrative content for Purchasing Policy with downloaded pdf file")
	public void user_has_to_verify_the_special_circumstances_narrative_content_for_Purchasing_Policy_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/body_Editor_SplCircum'
		String scroll='Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/p_Editor_SplCircum'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded for special circumstances in Purchasing Policy with downloaded pdf file")
	public void user_has_to_verify_Uploaded_for_special_circumstances_in_Purchasing_Policy_with_downloaded_pdf_file() {

		String path = RunConfiguration.getProjectDir()+'/Include/TestData/DownloadedFiles'

		String Table_Xpathid= 'Object Repository/PurchasingPolicy/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String scrollTo='Object Repository/PurchasingPolicy/AddFile_SpecialCircum/p_AddFile_SplCircum'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PP_Entities.iframe)
		WebUI.delay(2)

		new projectKeywords().deleteDownloadedFiles(path)
	}


	/**
	 *  Purchasing Policy - Verifying the Narrative content after refresh -- Started
	 */


	/**
	 *  Purchasing Policy - Verifying the Narrative content after refresh -- Ended
	 */


	@Then("User verifies the narrative text of Special Circumstances in Purchasing Policy")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_in_Purchasing_Policy() {

		String narrative_SplCircum = WebUI.getText(findTestObject('Object Repository/PurchasingPolicy/EditorBox_SplCircumstances/body_Editor_SplCircum'))
		println "##############"+ narrative_SplCircum
		WebUI.verifyMatch(narrative_SplCircum, txt_PI_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User changes the status to ready for review for the Purchasing Policy form")
	public void user_changes_the_status_to_ready_for_review_for_the_Purchasing_Policy_form() {

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/PurchasingPolicy/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "ATTEMPTED"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/PurchasingPolicy/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)

			String changedStatus =	WebUI.getText(findTestObject("Object Repository/PurchasingPolicy/Navigation/h3_Status"))
			println "The changed Status is "+changedStatus
		}
	}



	/**
	 *  Purchasing Policy - downloading the Pdf and verifying -- Ended
	 */
}