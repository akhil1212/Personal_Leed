package projectInformation
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
import projectInformation.PI_Entities

class ProjectInformation_Form {
	/**
	 * The navigation to Project Information form -- Started
	 */

	@And("User can see Project Information under Project Information")
	public void user_can_see_Project_Information_under_Project_Information() {

		WebUI.scrollToElement(findTestObject("Object Repository/ProjectInformation/Navigation/div_Project Information"), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject("Object Repository/ProjectInformation/Navigation/div_Project Information"), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}


	@And("User has to select the status to Attempted for Project Information")
	public void user_has_to_select_the_status_to_Attempted_for_Project_Information() {

		String status =	WebUI.getText(findTestObject("Object Repository/ProjectInformation/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "READY FOR REVIEW"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/ProjectInformation/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)

			String changedStatus =	WebUI.getText(findTestObject("Object Repository/ProjectInformation/Navigation/h3_Status"))
			println "The changed Status is "+changedStatus
		}
	}


	@When("User clicks on Project Information")
	public void user_clicks_on_Project_Information() {

		WebUI.click(findTestObject("Object Repository/ProjectInformation/Navigation/div_Project Information"))
	}

	@And("User has to click on FormV01 button of Project Information")
	public void user_has_to_click_on_FormV_button_of_Project_Information() {

		WebUI.click(findTestObject("Object Repository/ProjectInformation/Navigation/a_Form (V01)"))
	}

	@Then("User should be able to see the Project Information form")
	public void user_should_be_able_to_see_the_Project_Information_form() {

		boolean insideForm = WebUI.verifyElementPresent(findTestObject("Object Repository/ProjectInformation/Navigation/div_Project Information_Form"), 30)
		if (insideForm == true){
			println "Inside the IPM form"
		}
		else {
			println "Not inside the IPM form"
		}
	}

	/**
	 * The navigation to Project Information form -- Ended
	 */


	/**
	 *  Filling the data in the Project Information - saving the form  -- Started
	 */


	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_PI_Narrative = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for describing the project in general")
	public void user_should_see_the_editor_for_describing_the_project_in_general() {

		WebUI.callTestCase(findTestCase('Test Cases/ProjectInformation/TC_NavigateToPI'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/EditorBox_ProjectGeneral/p_Editor_PrjGeneral'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/EditorBox_ProjectGeneral/p_Editor_PrjGeneral'), 5)
	}

	@When("User feeds long narrative text for describing the project in general")
	public void user_feeds_long_narrative_text_for_describing_the_project_in_general() {

		println "##############"+ txt_PI_Narrative
		WebUI.setText(findTestObject('Object Repository/ProjectInformation/EditorBox_ProjectGeneral/body_Editor_PrjGeneral'),txt_PI_Narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on for describing the project in general")
	public void user_should_see_the_narrative_text_persist_on_for_describing_the_project_in_general() {

		String narrative_ProjectGeneral = WebUI.getText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/body_Editor_NoSmokingPolicy'))
		println "##############"+ narrative_ProjectGeneral
		WebUI.verifyMatch(narrative_ProjectGeneral, txt_PI_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}


	@Given("User should be able to see the Add File button for a site plan identifying the LEED project boundary")
	public void user_should_be_able_to_see_the_Add_File_button_for_a_site_plan_identifying_the_LEED_project_boundary() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_SitePlan/p_AddFile_SitePlan'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_SitePlan/p_AddFile_SitePlan'), 30)
	}

	@Then("User uploads file for a site plan identifying the LEED project boundary")
	public void user_uploads_file_for_a_site_plan_identifying_the_LEED_project_boundary() {

		String uploadButton 	= "Object Repository/ProjectInformation/AddFile_SitePlan/btn_AddFile"
		String inputUploadFile 	= "Object Repository/ProjectInformation/AddFile_SitePlan/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for representative floor plans for the project")
	public void user_should_be_able_to_see_the_Add_File_button_for_representative_floor_plans_for_the_project() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_FloorPlans/p_AddFile_FloorPlans'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_FloorPlans/p_AddFile_FloorPlans'), 30)
	}

	@Then("User uploads file for representative floor plans for the project")
	public void user_uploads_file_for_representative_floor_plans_for_the_project() {

		String uploadButton 	= "Object Repository/ProjectInformation/AddFile_FloorPlans/btn_AddFile"
		String inputUploadFile 	= "Object Repository/ProjectInformation/AddFile_FloorPlans/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for mechanical schedules and plans and or drawings")
	public void user_should_be_able_to_see_the_Add_File_button_for_mechanical_schedules_and_plans_and_or_drawings() {


		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_MechanicalPlans/p_AddFile_MechanicalPlans'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_MechanicalPlans/p_AddFile_MechanicalPlans'), 30)
	}

	@Then("User uploads file for mechanical schedules and plans and or drawings")
	public void user_uploads_file_for_mechanical_schedules_and_plans_and_or_drawings() {

		String uploadButton 	= "Object Repository/ProjectInformation/AddFile_MechanicalPlans/btn_AddFile"
		String inputUploadFile 	= "Object Repository/ProjectInformation/AddFile_MechanicalPlans/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for photos or a video walkthrough of the project")
	public void user_should_be_able_to_see_the_Add_File_button_for_photos_or_a_video_walkthrough_of_the_project() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_ProjectGraphics/p_AddFile_ProjectGraphics'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_ProjectGraphics/p_AddFile_ProjectGraphics'), 30)
	}

	@Then("User uploads file for photos or a video walkthrough of the project")
	public void user_uploads_file_for_photos_or_a_video_walkthrough_of_the_project() {

		String uploadButton 	= "Object Repository/ProjectInformation/AddFile_ProjectGraphics/btn_AddFile"
		String inputUploadFile 	= "Object Repository/ProjectInformation/AddFile_ProjectGraphics/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}


	@Given("User should be able to see the Add File button for completed Performance Periods Table")
	public void user_should_be_able_to_see_the_Add_File_button_for_completed_Performance_Periods_Table() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_PerformancePeriods/p_AddFile_PerformancePeriods'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_PerformancePeriods/p_AddFile_PerformancePeriods'), 30)
	}

	@Then("User uploads file for completed Performance Periods Table")
	public void user_uploads_file_for_completed_Performance_Periods_Table() {

		String uploadButton 	= "Object Repository/ProjectInformation/AddFile_PerformancePeriods/btn_AddFile"
		String inputUploadFile 	= "Object Repository/ProjectInformation/AddFile_PerformancePeriods/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button for special circumstances in Project Information")
	public void user_should_be_able_to_see_the_Add_File_button_for_special_circumstances_in_Project_Information() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
	}

	@Then("User uploads file for special circumstances in Project Information")
	public void user_uploads_file_for_special_circumstances_in_Project_Information() {

		String uploadButton 	= "Object Repository/ProjectInformation/AddFile_SpecialCircum/btn_AddFile"
		String inputUploadFile 	= "Object Repository/ProjectInformation/AddFile_SpecialCircum/input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}


	@Given("User should see the editor for Special Circumstances for Project Information")
	public void user_should_see_the_editor_for_Special_Circumstances_for_Project_Information() {

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/EditorBox_SplCircumstances/p_Editor_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/EditorBox_SplCircumstances/p_Editor_SplCircum'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances for Project Information")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_for_Project_Information() {

		println "##############"+ txt_PI_Narrative
		WebUI.setText(findTestObject('Object Repository/ProjectInformation/EditorBox_SplCircumstances/body_Editor_SplCircum'),txt_PI_Narrative)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances for Project Information")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_for() {

		String narrative_SplCircum = WebUI.getText(findTestObject('Object Repository/ProjectInformation/EditorBox_SplCircumstances/body_Editor_SplCircum'))
		println "##############"+ narrative_SplCircum
		WebUI.verifyMatch(narrative_SplCircum, txt_PI_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User can see the save button in Project Information form")
	public void user_can_see_the_save_button_in_Project_Information_form() {

		WebUI.verifyElementVisible(findTestObject("Object Repository/ProjectInformation/btn_Save"))
	}

	@When("User clicks on save button in Project Information form")
	public void user_clicks_on_save_button_in_Project_Information_form() {

		WebUI.click(findTestObject("Object Repository/ProjectInformation/btn_Save"))
	}


	/**
	 *  Filling the data in the Project Information - saving the form  -- Ended
	 */

	/**
	 *  Project Information - downloading the Pdf and verifying -- Started
	 */


	@Then("User has to verify describing the project in general narrative content with downloaded pdf file")
	public void user_has_to_verify_describing_the_project_in_general_narrative_content_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/ProjectInformation/EditorBox_ProjectGeneral/body_Editor_PrjGeneral'
		String scroll='Object Repository/ProjectInformation/EditorBox_ProjectGeneral/p_Editor_PrjGeneral'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for a site plan identifying the LEED project boundary with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_a_site_plan_identifying_the_LEED_project_boundary_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/ProjectInformation/AddFile_SitePlan/tbody_Table_SitePlan'
		String scrollTo='Object Repository/ProjectInformation/AddFile_SitePlan/p_AddFile_SitePlan'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PI_Entities.iframe)
		WebUI.delay(2)
	}


	@And("User has to verify Uploaded files for representative floor plans for the project with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_representative_floor_plans_for_the_project_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/ProjectInformation/AddFile_FloorPlans/tbody_Table_FloorPlans'
		String scrollTo='Object Repository/ProjectInformation/AddFile_FloorPlans/p_AddFile_FloorPlans'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PI_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for mechanical schedules and plans and or drawings with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_mechanical_schedules_and_plans_and_or_drawings_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/ProjectInformation/AddFile_MechanicalPlans/tbody_Table_MechanicalPlans'
		String scrollTo='Object Repository/ProjectInformation/AddFile_MechanicalPlans/p_AddFile_MechanicalPlans'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PI_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for photos or a video walkthrough of the project with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_photos_or_a_video_walkthrough_of_the_project_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/ProjectInformation/AddFile_ProjectGraphics/tbody_Table_ProjectGraphics'
		String scrollTo='Object Repository/ProjectInformation/AddFile_ProjectGraphics/p_AddFile_ProjectGraphics'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PI_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded files for completed Performance Periods Table with downloaded pdf file")
	public void user_has_to_verify_Uploaded_files_for_completed_Performance_Periods_Table_with_downloaded_pdf_file() {

		String Table_Xpathid= 'Object Repository/ProjectInformation/AddFile_PerformancePeriods/tbody_Table_PerformancePeriods'
		String scrollTo='Object Repository/ProjectInformation/AddFile_PerformancePeriods/p_AddFile_PerformancePeriods'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PI_Entities.iframe)
		WebUI.delay(2)
	}

	@And("User has to verify the special circumstances narrative content for Project Information with downloaded pdf file")
	public void user_has_to_verify_the_special_circumstances_narrative_content_for_Project_Information_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/ProjectInformation/EditorBox_SplCircumstances/body_Editor_SplCircum'
		String scroll='Object Repository/ProjectInformation/EditorBox_SplCircumstances/p_Editor_SplCircum'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded for special circumstances in Project Information with downloaded pdf file")
	public void user_has_to_verify_Uploaded_for_special_circumstances_in_Project_Information_with_downloaded_pdf_file() {

		String path = RunConfiguration.getProjectDir()+'/Include/TestData/DownloadedFiles'

		String Table_Xpathid= 'Object Repository/ProjectInformation/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String scrollTo='Object Repository/ProjectInformation/AddFile_SpecialCircum/p_AddFile_SplCircum'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,PI_Entities.iframe)
		WebUI.delay(2)

		new projectKeywords().deleteDownloadedFiles(path)
	}
	/**
	 *  Project Information - downloading the Pdf and verifying -- Ended
	 */


	/**
	 *  Project Information - Verifying the Narrative content after refresh -- Started
	 */

	@Then("User verifies the narrative text of describing the project in general")
	public void user_verifies_the_narrative_text_of_describing_the_project_in_general() {

		String narrative_ProjectGeneral = WebUI.getText(findTestObject('Object Repository/EnvironmentalTobaccoSmokeControl/Editor_NoSmokingPolicy/body_Editor_NoSmokingPolicy'))
		println "##############"+ narrative_ProjectGeneral
		WebUI.verifyMatch(narrative_ProjectGeneral, txt_PI_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User verifies the narrative text of Special Circumstances in Project Information")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_in_Project_Information() {

		String narrative_SplCircum = WebUI.getText(findTestObject('Object Repository/ProjectInformation/EditorBox_SplCircumstances/body_Editor_SplCircum'))
		println "##############"+ narrative_SplCircum
		WebUI.verifyMatch(narrative_SplCircum, txt_PI_Narrative, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User changes the status to ready for review for the Project Information form")
	public void user_changes_the_status_to_ready_for_review_for_the_Project_Information_form() {

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/ProjectInformation/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "ATTEMPTED"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/ProjectInformation/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)

			String changedStatus =	WebUI.getText(findTestObject("Object Repository/ProjectInformation/Navigation/h3_Status"))
			println "The changed Status is "+changedStatus
		}
	}

	/**
	 *  Project Information - Verifying the Narrative content after refresh -- Ended
	 */
}