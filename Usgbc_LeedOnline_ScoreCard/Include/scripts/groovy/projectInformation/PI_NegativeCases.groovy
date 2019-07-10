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

class PI_NegativeCases {
	/**
	 * Checking the negative test cases for the uploads in Project Information and saving the form without any data ---- Started
	 */

	@Given("User should be on Project Information form")
	public void user_should_be_on_Project_Information_form() {

		WebUI.callTestCase(findTestCase('Test Cases/ProjectInformation/TC_NavigateToPI'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)

		boolean insideForm = WebUI.verifyElementPresent(findTestObject("Object Repository/ProjectInformation/Navigation/div_Project Information_Form"), 30)
		if (insideForm == true){
			println "Inside the Project Information form"
		}
		else {
			println "Not inside the Project Information form"
		}
	}

	@When("User clicks on save button without entering any data in Project Information form")
	public void user_clicks_on_save_button_without_entering_any_data_in_Project_Information_form() {

		WebUI.scrollToElement(findTestObject("Object Repository/ProjectInformation/btn_Save"), 30)
		WebUI.click(findTestObject("Object Repository/ProjectInformation/btn_Save"))
	}



	@When("User uploads a file which is greater than 100mb of a site plan identifying the LEED project boundary (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_a_site_plan_identifying_the_LEED_project_boundary_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_SitePlan/input_AddFile'), myPdffilePath)
	}

	@Given("User should be able to see the Add File button in a site plan identifying the LEED project boundary")
	public void user_should_be_able_to_see_the_Add_File_button_in_a_site_plan_identifying_the_LEED_project_boundary() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_SitePlan/p_AddFile_SitePlan'), 30)
	}

	@When("User uploads a file for a site plan identifying the LEED project boundary (.*)")
	public void user_uploads_a_file_for_a_site_plan_identifying_the_LEED_project_boundary_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_SitePlan/input_AddFile'), myPdffilePath)
	}


	@When("User uploads a file which is greater than 100mb of representative floor plans for the project (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_representative_floor_plans_for_the_project_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_FloorPlans/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file for representative floor plans for the project (.*)")
	public void user_uploads_a_file_for_representative_floor_plans_for_the_project_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_FloorPlans/input_AddFile'), myPdffilePath)
	}


	@When("User uploads a file which is greater than 100mb of mechanical schedules and plans and or drawings (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_mechanical_schedules_and_plans_and_or_drawings_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_MechanicalPlans/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file for mechanical schedules and plans and or drawings (.*)")
	public void user_uploads_a_file_for_mechanical_schedules_and_plans_and_or_drawings_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_MechanicalPlans/input_AddFile'), myPdffilePath)
	}


	@When("User uploads a file which is greater than 100mb of photos or a video walkthrough of the project (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_photos_or_a_video_walkthrough_of_the_project_FileName(String FileName) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_ProjectGraphics/input_AddFile'), myPdffilePath)
	}


	@When("User uploads a file for photos or a video walkthrough of the project (.*)")
	public void user_uploads_a_file_for_photos_or_a_video_walkthrough_of_the_project_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_ProjectGraphics/input_AddFile'), myPdffilePath)
	}




	@When("User uploads a file which is greater than 100mb of completed Performance Periods Table (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_completed_Performance_Periods_Table_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_PerformancePeriods/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file for completed Performance Periods Table (.*)")
	public void user_uploads_a_file_for_completed_Performance_Periods_Table_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_PerformancePeriods/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of special circumstances in Project Information (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_special_circumstances_in_Project_Information_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_SpecialCircum/input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file for special circumstances in Project Information (.*)")
	public void user_uploads_a_file_for_special_circumstances_in_Project_Information_FileName(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/ProjectInformation/AddFile_SpecialCircum/input_AddFile'), myPdffilePath)
	}

	/**
	 * Checking the negative test cases for the uploads in Project Information and saving the form without any data ---- Entered
	 */
}